fun main() {
    val num = readln().toInt()
    val range = readln().toInt()..readln().toInt()
    print(num in range)
}