const val SIZE = 100
const val COMMON_VALUE = 0
const val FIRST_ELEMENT_VAL = 1
const val TENTH_ELEMENT_VAL = 10
const val HUNDREDTH_ELEMENT_VAL = 100
fun main() {
    val numbers = MutableList(SIZE) { COMMON_VALUE }
    numbers[0] = FIRST_ELEMENT_VAL
    numbers[9] = TENTH_ELEMENT_VAL
    numbers[numbers.lastIndex] = HUNDREDTH_ELEMENT_VAL

    println(numbers.joinToString())
}