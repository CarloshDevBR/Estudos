package exercicios.exercicio_45.control

import exercicios.exercicio_45.business.Guest
import exercicios.exercicio_45.entity.Person

class Port {
    private val guest = Guest()

    init {
        println("Portaria inicilizada.")
    }

    fun control(): String {
        val person = Person(age = Console.readInt("Qual sua idade?"))

        if (!guest.ageValidate(person.age)) return "Negado. Menores não são permitidos"

        person.type = Console.readString("Qual é o tipo de convite?")
        if (!guest.invitationTypeValidate(person.type)) return "Negado. Negado. Convite inválido"

        person.code = Console.readString("Qual o código do convite?")
        if (guest.invitationValidate(person)) return "Negado. Convite inválido"

        return "Welcome!"
    }
}