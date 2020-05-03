package domain


import domain.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {

    // load the spring configuration file
    val context = ClassPathXmlApplicationContext("context/applicationContext.xml")


    // retrieve bean from spring container
    //call class with Coach Interface methods only
    val trackCoach = context.getBean("trackCoach", Coach::class.java)
    val baseballCoach = context.getBean("baseballCoach", Coach::class.java)
    val footballCoach = context.getBean("footballCoach", Coach::class.java)
    val cricketCoach = context.getBean("cricketCoach", Coach::class.java)

    //Call class with all methods
    val cricketCoachSecond = context.getBean("cricketCoach", CricketCoach::class.java)

    // call methods on the bean
    println(trackCoach.getDailyWorkout())
    println(baseballCoach.getDailyWorkout())
    println(footballCoach.getDailyWorkout())
    println(cricketCoach.getDailyWorkout())

    println("==========================")

    println(trackCoach.getDailyFortune())
    println(baseballCoach.getDailyFortune())
    println(footballCoach.getDailyFortune())
    println(cricketCoach.getDailyFortune())

    println("==========================")

    // Call fun with private vars -  email and team
    println(cricketCoachSecond.getEmail())
    println(cricketCoachSecond.getTeam())

    // close the context

    context.close()
}