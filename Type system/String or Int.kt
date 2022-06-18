fun isNumber(input: String): Any = try {
    input.toInt()
} catch (e: NumberFormatException) {
    input
}