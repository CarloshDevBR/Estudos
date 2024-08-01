package exercicios

data class City(
    val name: String,
    val cep: String
)

fun main() {
    val listCitys = mutableSetOf<City>()

    listCitys.add(City("Fortaleza", "61599-999"))
    listCitys.add(City("Tabuleiro do Norte", "62960-000"))
    listCitys.add(City("Limoeiro do Norte", "62930-000"))
    listCitys.add(City("Tabuleiro do Norte", "62960-000"))
    listCitys.add(City("Limoeiro do Norte", "62930-000"))

    listCitys.forEach { city -> println("${city.name} - ${city.cep}") }
}