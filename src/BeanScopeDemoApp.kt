package domain

import domain.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
    // load the spring configuration file
    val context = ClassPathXmlApplicationContext("context/beanScope-applicationContext.xml")

    //retrieve bean from spring container
    val coach = context.getBean("trackCoach", Coach::class.java)
    val alphaCoach = context.getBean("trackCoach", Coach::class.java)

    //check if they are same
    val result = (coach == alphaCoach)

    //print out result
    println("Результат сравнения $result")
    println("\nMemory location for the coach: $coach")
    println("\nMemory location for the alphaCoach: $alphaCoach")

    //close the context
    context.close()


}