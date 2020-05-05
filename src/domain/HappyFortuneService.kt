package domain

import domain.service.FortuneService

class HappyFortuneService : FortuneService {
    private val randomList = listOf<String>(
        "Good boy",
        "Amazing man",
        "Looser"
    )

    override fun getFortune(): String {
        return "Today is your lucky day!${randomList.random()}"
    }
}