package domain

import domain.service.Coach
import domain.service.FortuneService

class TrackCoach(private val fortuneService: FortuneService) : Coach {
    override fun getDailyWorkout(): String {
        return "Run a hard 5k"
    }

    override fun getDailyFortune(): String {
        return "Track coach, ${fortuneService.getFortune()}"
    }
}