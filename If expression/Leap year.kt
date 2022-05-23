const val DIVISIBLE_BY = 4
const val NOT_DIVISIBLE_BY = 100
const val OR_DIVISIBLE_BY = 400
const val FROM_YEAR = 1990
const val TO_YEAR = 3000
fun main() {
    val year = readln().toInt()
    if (year in FROM_YEAR..TO_YEAR &&
        (year % DIVISIBLE_BY == 0 && year % NOT_DIVISIBLE_BY != 0 || year % OR_DIVISIBLE_BY == 0)
    ) {
        print("Leap")
    } else {
        print("Regular")
    }
}