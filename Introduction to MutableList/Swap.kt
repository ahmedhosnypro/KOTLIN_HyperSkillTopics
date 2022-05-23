fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()

    val temp = numbers[0]
    numbers[0] = numbers[numbers.lastIndex]
    numbers[numbers.lastIndex] = temp

    println(numbers.joinToString(separator = " "))
}