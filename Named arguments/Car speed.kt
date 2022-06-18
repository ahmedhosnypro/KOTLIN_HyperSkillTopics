fun main() {
    val speed = readln().toInt()
    val limit = readln()

    if (limit == "no limit") {
        police(speed)
    } else {
        police(speed, limit.toInt())
    }
}

fun police(speed: Int, limit: Int = 60) {
    println(
        when {
            speed > limit -> "Exceeds the limit by ${speed - limit} kilometers per hour"
            else -> "Within the limit"
        }
    )
}