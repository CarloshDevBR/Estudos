package exercicios.exercicio_16

class Car(private val engine: Engine) {
    fun startEngine() {
        engine.start()
    }

    fun stopEngine() {
        engine.stop()
    }

    fun move() {
        engine.move()
    }

    fun horn() {
        println("bi bi!")
    }

    fun status(): String {
        return engine.status()
    }
}
