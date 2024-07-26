package exercicios

// Solução - 01
/*
    fun main() {
        val w = HourlyWorker(160.0, 100)
        val f = Freelancer(5000.0)

        println("Total a pagar WorkerHours: " + w.pay())
        println("Total a pagar Freelancer: " + f.pay())
    }

    abstract class Worker {
        abstract fun pay(): Double
    }

    class HourlyWorker(
        private val baseSalary: Double = 0.0,
        private val hours: Int
    ) : Worker() {
        override fun pay(): Double = hours * baseSalary
    }

    class Freelancer(
        private val salary: Double
    ) : Worker() {
        override fun pay(): Double = salary
    }
*/

var totalPay: Double = 0.0

fun main() {
    val w1 = HourlyWork(160.0, 100)
    val w2 = FreelancerWorker(5000.0)

    pay(w1)
    pay(w2)

    println("Total pago aos funcionários: $totalPay")
}

fun pay(worker: Worker) {
    totalPay += worker.pay()
}

abstract class Worker(val baseSalary: Double) {
    fun pay(): Double {
        return baseSalary * multiplier()
    }

    abstract fun multiplier(): Double
}

class HourlyWork(
    hoursPrice: Double,
    val hoursWorked: Int
) : Worker(hoursPrice) {
    override fun multiplier(): Double {
        return hoursWorked.toDouble()
    }
}

class FreelancerWorker(val totalSalary: Double) : Worker(totalSalary) {
    override fun multiplier(): Double {
        return 1.0
    }
}
