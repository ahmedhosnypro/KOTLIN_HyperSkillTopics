fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val c = a
    a = b
    b = c

    print("$a $b")
}