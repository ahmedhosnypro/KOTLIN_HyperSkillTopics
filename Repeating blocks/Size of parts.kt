const val LARGER_CODE = 1
const val SMALLER_CODE = -1
const val PERFECT_CODE = 0
fun main() {
    val partsNum = readln().toInt()
    var (larger, smaller, perfect) = "0 0 0".split(" ").map { it.toInt() }
    repeat(partsNum) {
        val partDetectionCode = readln().toInt()
        if (partDetectionCode == LARGER_CODE) {
            larger++
        } else if (partDetectionCode == SMALLER_CODE) {
            smaller++
        } else if (partDetectionCode == PERFECT_CODE) {
            perfect++
        }
    }
    print("$perfect $larger $smaller")
}