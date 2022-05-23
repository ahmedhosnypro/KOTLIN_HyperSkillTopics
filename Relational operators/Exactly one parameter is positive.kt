fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    print(
        num1 > 0 && num2 <= 0 && num3 <= 0 ||
                num1 <= 0 && num2 > 0 && num3 <= 0 ||
                num1 <= 0 && num2 <= 0 && num3 > 0
    )
}