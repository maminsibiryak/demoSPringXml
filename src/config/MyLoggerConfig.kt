package config

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter


class MyLoggerConfig {
    private var rootLoggerLevel: String? = null
    private var printedLoggerLevel: String? = null

    fun setRootLoggerLevel(rootLoggerLevel: String?) {
        this.rootLoggerLevel = rootLoggerLevel
    }

    fun setPrintedLoggerLevel(printedLoggerLevel: String?) {
        this.printedLoggerLevel = printedLoggerLevel
    }

    fun initLogger() {

        // parse levels
        val rootLevel: Level = Level.parse(rootLoggerLevel)
        val printedLevel: Level = Level.parse(printedLoggerLevel)

        // get logger for app context
        val applicationContextLogger: Logger = Logger.getLogger(AnnotationConfigApplicationContext::class.java.name)

        // get parent logger
        val loggerParent: Logger = applicationContextLogger.parent

        // set root logging level
        loggerParent.level = rootLevel

        // set up console handler
        val consoleHandler = ConsoleHandler()
        consoleHandler.level = printedLevel
        consoleHandler.formatter = SimpleFormatter()

        // add handler to the logger
        loggerParent.addHandler(consoleHandler)
    }
}