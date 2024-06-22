package exercicios.`exercicios-16`

class CombustionEngine(private var fuel: Int) : Engine {
    private var engineOn: Boolean = false

    override fun start() {
        if (fuel > 0) {
            engineOn = true
        }
    }

    override fun stop() {
        engineOn = false
    }

    override fun move() {
        when {
            fuel == 0 -> println("Está sem combustível")
            engineOn -> {
                consumeFuel()
                println("vrum vrum")
            }
            else -> println("O motor precisa estar ligado!")
        }
    }

    private fun consumeFuel() {
        fuel--
        println("Combustível: $fuel")
    }

    override fun status(): String {
        return if (engineOn) "Ligado" else "Desligado"
    }
}