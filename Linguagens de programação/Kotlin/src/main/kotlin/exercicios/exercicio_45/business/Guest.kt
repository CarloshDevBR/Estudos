package exercicios.exercicio_45.business

import exercicios.exercicio_45.entity.Person

class Guest {
    fun invitationTypeValidate(type: String): Boolean = (type == "comum" || type == "premium" || type == "luxo")

    fun ageValidate(age: Int): Boolean = age >= 18

    fun invitationValidate(invitation: Person): Boolean = when (invitation.type) {
        "comum" -> invitation.code.lowercase().startsWith("xt")
        "premium", "luxo" -> invitation.code.lowercase().startsWith("xl")
        else -> false
    }
}