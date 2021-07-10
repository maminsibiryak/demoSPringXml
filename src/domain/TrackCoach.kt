package domain

import domain.service.Coach
import domain.service.FortuneService

class TrackCoach(private val fortuneService: FortuneService) : Coach {
    var name: String? = null

    override fun getDailyWorkout(): String {
        return "Run a hard 5k"
    }

    override fun getDailyFortune(): String {
        return "Track coach, ${fortuneService.getFortune()}"
    }

    //add an init method
    fun doMyStartupStuff() {
        println("TrackCoach: inside method doMyStartupStuff")
    }

    //add a destroy method
    fun destroy() {
        println("TrackCoach: inside method destroy")
    }

}