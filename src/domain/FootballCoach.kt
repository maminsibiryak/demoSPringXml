package domain

import domain.service.Coach
import domain.service.FortuneService


class FootballCoach(private val fortuneService: FortuneService) : Coach {

    //define a private field for the dependency

    override fun getDailyWorkout(): String {
        return ("RUN RUN RUN And you will gate a win!")
    }

    override fun getDailyFortune(): String {
        return "Football coach, ${fortuneService.getFortune()}"
    }
}