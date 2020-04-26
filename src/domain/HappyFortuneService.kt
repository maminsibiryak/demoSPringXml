package domain

import domain.service.FortuneService

class HappyFortuneService : FortuneService {
    override fun getFortune(): String {
        return "Today is your lucky day!"
    }
}