package fundamentos.classes

fun main() {
    var p1 = Point(10, 5)
    var p2 = Point(5, 3)

//  val p3 = p1 + p2
//  val p4 = p1 - p2
//  val p5 = p1 * 2

    // Por trás do operador sempre tem um método
    val p3 = p1.plus(p2)
    val p4 = p1.minus(p2)
    val p5 = p1.times(2)


    println("${p1++} + ${p2++} = $p3")
    println("$p1 - $p2 = $p4")
    println("$p1 * 2 = $p5")
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(multiplier: Int): Point {
        return Point(x =  x * multiplier, y = y * multiplier)
    }

    operator fun inc(): Point {
        return Point(x = x + 1, y = y + 1)
    }
}