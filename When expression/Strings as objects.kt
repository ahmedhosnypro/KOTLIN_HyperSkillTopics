fun main() {
    val input = readln()

    if (input.isNotEmpty()) {
        println(
            when {
                input.startsWith("i") -> input.drop(1).toInt() + 1
                input.startsWith("s") -> input.drop(1).reversed()
                else -> input
            }
        )
    }
}