package exercicios

/*
    1. Escreva um programa para ser usado na de portaria de um evento.
        a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
        permitidos.”.
        b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
        destes. Mensagem: “Negado. Convite inválido.”.
        c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
        Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
        d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
*/

fun main() {
    val res1 = Party.entryParty("Carlos", 22, "luxo", "XT")
    val res2 = Party.entryParty("Carlos", 17, "luxo", "XT")
    val res3 = Party.entryParty("Carlos", 18, "luxo", "ads")
    val res4 = Party.entryParty("Carlos", 20, "ad", "XT")

    println(res1)
    println(res2)
    println(res3)
    println(res4)

    println(Party.people)
}

object Party {
    val people = mutableListOf<String>()

    fun entryParty(name: String, age: Int, invitation: String, code: String): String {
        return when {
            age < 18 -> "Menores não são permitidos."
            invitation != "luxo" && invitation != "premium" -> "Negado. Convite inválido."
            code != "XL" && code != "XT" -> "Negado. Convite inválido"
            else -> {
                people.add(name)

                return "Bem vindo, $name!"
            }
        }
    }
}