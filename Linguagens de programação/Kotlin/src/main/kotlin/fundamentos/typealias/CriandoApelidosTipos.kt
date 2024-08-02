package fundamentos.`typealias`

/*
    typealias - cria um apelido pra um tipo específico
*/

typealias ExecuteID = String

typealias CodeToExecute = (ExecuteID) -> String

fun main() {
    val id = "231dsa12"

    val code = Executer(id)

    code.execute { id }
}

class Executer(private val id: ExecuteID) {
    fun execute(code: CodeToExecute): String {
        return code(id)
    }
}