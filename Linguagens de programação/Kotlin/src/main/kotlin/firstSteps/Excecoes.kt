package firstSteps

/*
    try - executa o conteúdo do bloco
    catch - executa quando o try falha
    finally - independente se falhar ou não irá executar o conteúdo do finally
    throw - retorna um erro
*/

fun main() {
    try {
        println("Passou!")
    } catch (err: Error) {
        throw Exception("Hi There!", err)
    } finally {
        println("Finalizou")
    }
}