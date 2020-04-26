package domain


import domain.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {

    // load the spring configuration file
    val context = ClassPathXmlApplicationContext("context/applicationContext.xml")


    // retrieve bean from spring container
    val trackCoach = context.getBean("trackCoach", Coach::class.java)
    val baseballCoach = context.getBean("baseballCoach", Coach::class.java)
    val footballCoach = context.getBean("footballCoach", Coach::class.java)


    // call methods on the bean
    println(trackCoach.getDailyWorkout())
    println(baseballCoach.getDailyWorkout())
    println(footballCoach.getDailyWorkout())

    println(trackCoach.getDailyFortune())
    println(baseballCoach.getDailyFortune())
    println(footballCoach.getDailyFortune())


    // close the context


    context.close()
}