import kotlin.random.Random

fun generateTemperature(seed: Int): String {
    val rand = Random(seed)

    val ret = StringBuilder()
    repeat(7) {
        ret.append(rand.nextInt(20, 31))
    }

    return ret.toString()
}