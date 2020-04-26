package domain

import domain.service.Coach
import domain.service.FortuneService

class BaseballCoach(private val fortuneService: FortuneService) : Coach {
    override fun getDailyWorkout(): String {
        return "Spend 30 minutes on batting practice";
    }

    override fun getDailyFortune(): String {
        return "Baseball coach, ${fortuneService.getFortune()}"
    }
}