import kotlin.math.pow

fun f(x: Double) = when {
    x <= 0 -> f1(x)
    x < 1 -> f2(x)
    else -> f3(x)
}

fun f1(x: Double) = x.pow(2) + 1

fun f2(x: Double) = 1 / x.pow(2)

fun f3(x: Double) = x.pow(2) - 1