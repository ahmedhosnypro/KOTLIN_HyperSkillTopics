import kotlin.math.sqrt

fun main() {
    val shape = readln().trim()

    var floor = 0.0
    val sideA: Double
    val sideB: Double
    val sideC: Double
    val radius: Double

    when (shape) {
        "rectangle" -> {
            floor = readln().trim().toDouble() * readln().trim().toDouble()
        }
        "triangle" -> {
            sideA = readln().trim().toDouble()
            sideB = readln().trim().toDouble()
            sideC = readln().trim().toDouble()
            val p = (sideA + sideB + sideC) / 2
            floor = sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))
        }
        "circle" -> {
            radius = readln().trim().toDouble()
            floor = 3.14 * radius * radius
        }
        else -> println("check input")
    }
    println(floor)
}