package domain.service

interface Coach {
    fun getDailyWorkout(): String
    fun getDailyFortune(): String
}