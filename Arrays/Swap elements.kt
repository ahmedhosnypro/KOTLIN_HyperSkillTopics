fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

    val tmp = numbers.last()
    numbers[numbers.lastIndex] = numbers.first()
    numbers[0] = tmp

    println(numbers.joinToString(separator = " "))
}