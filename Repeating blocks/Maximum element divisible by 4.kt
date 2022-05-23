const val  DIVIDABLE = 4
fun main() {
    val sequenceNUm = readln().toInt()
    var maxDivisibleBy4 = Int.MIN_VALUE
    repeat(sequenceNUm) {
        val input = readln().toInt()
        if (input % DIVIDABLE == 0 && input > maxDivisibleBy4) {
            maxDivisibleBy4 = input
        }
    }
    print(maxDivisibleBy4)
}