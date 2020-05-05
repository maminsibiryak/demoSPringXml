package domain.domain

abstract class Person {
    abstract fun setEmail(email: String)
    abstract fun setTeam(team: String)
    abstract fun getEmail(): String?
    abstract fun getTeam(): String?

}