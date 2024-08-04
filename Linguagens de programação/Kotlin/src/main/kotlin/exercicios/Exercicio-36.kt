package exercicios

enum class Level {
    BASIC,
    MEDIUM,
    HIGH
}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun conDelete(): Boolean = this == ADMIN
}

fun main() {
    println(Role.USER.conDelete())

    println(Role.MODERATOR.conDelete())

    println(Role.ADMIN.conDelete())
}