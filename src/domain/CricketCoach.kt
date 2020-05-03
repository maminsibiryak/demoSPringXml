package domain

import domain.service.Coach
import domain.service.FortuneService


class CricketCoach : Coach {
    private var fortuneService: FortuneService? = null
    private var email: String? = null
    private var team: String? = null

    // create a no-arg constructor
    init {
        println("CricketCoach: inside no-arg constructor")
    }

    // our setter method
    fun setFortuneService(fortuneService: FortuneService?) {
        println("CricketCoach: inside setter method - setFortuneService")
        this.fortuneService = fortuneService
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun setTeam(team: String) {
        this.team = team
    }

    fun getTeam(): String? {
        return team
    }

    fun getEmail(): String? {
        return email
    }

    override fun getDailyWorkout(): String {
        return "Practice fast bowling for 15 minutes"
    }

    override fun getDailyFortune(): String {
        return "Cricket coach, ${fortuneService!!.getFortune()}"
    }

}