package domain

import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
    // load the spring configuration file
    val context = ClassPathXmlApplicationContext("context/beanLifeCycle-applicationContext.xml")

    //retrieve bean from spring container
    val coach = context.getBean("trackCoach", TrackCoach::class.java)
    val coachAlpha = context.getBean("trackCoach", TrackCoach::class.java)

    coach.name = "Rick"
    coachAlpha.name = "Morty"
    println("${coach.getDailyWorkout()} ${coach.name}")
    println("${coachAlpha.getDailyWorkout()} ${coachAlpha.name}")
    //close the context
    context.close()


}