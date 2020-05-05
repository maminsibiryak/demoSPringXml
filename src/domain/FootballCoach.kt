package domain

import domain.domain.Person
import domain.service.Coach
import domain.service.FortuneService


class FootballCoach(private val fortuneService: FortuneService) : Coach, Person() {

    private var email: String? = ""
    private var team: String? = ""

    //define a private field for the dependency

    override fun getDailyWorkout(): String {
        return ("RUN RUN RUN And you will gate a win!")
    }

    override fun getDailyFortune(): String {
        return "Football coach, ${fortuneService.getFortune()}"
    }

    override fun setEmail(email: String) {
        this.email = email
    }

    override fun setTeam(team: String) {
        this.team = team
    }

    override fun getEmail(): String? {
        return this.email
    }

    override fun getTeam(): String? {
        return this.team
    }


}