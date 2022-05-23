const val FROM = 0
const val TO = 1000
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (num in FROM..TO) {
        if (a * num * num * num + b * num * num + c * num + d == 0) {
            println(num)
        }
    }
}