package exercicios.exercicio_16

fun main() {
    val combustionEngine = CombustionEngine(fuel = 100)
    val combustionCar = Car(combustionEngine)

    combustionCar.startEngine()
    println("O motor está ${combustionCar.status()}")

    combustionCar.move()
    combustionCar.horn()
    combustionCar.move()
    combustionCar.stopEngine()
    println("O motor está ${combustionCar.status()}")

    val electricEngine = ElectricEngine(battery = 100)
    val electricCar = Car(electricEngine)

    electricCar.startEngine()
    println("O motor está ${electricCar.status()}")

    electricCar.move()
    electricCar.horn()
    electricCar.move()
    electricCar.stopEngine()
    println("O motor está ${electricCar.status()}")
}