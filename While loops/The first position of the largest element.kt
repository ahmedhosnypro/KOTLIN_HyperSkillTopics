import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var maxVal = Int.MIN_VALUE
    var maxValIndex = -1
    var i = 1
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        if (num > maxVal) {
            maxVal = num
            maxValIndex = i
        }
        i++
    }
    print("$maxVal $maxValIndex")
}