const val WEEKEND_LOW = 15
const val WEEKEND_HIGH = 25
const val LOW = 10
const val HIGH = 20
fun main() {
    val peanuts = readln().toInt()
    val isWeekend = readln().toBoolean()

    print(isWeekend && peanuts in WEEKEND_LOW..WEEKEND_HIGH || !isWeekend && peanuts in LOW..HIGH)
}