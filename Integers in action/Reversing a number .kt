fun main() {
    var num = readln().toInt()
    while (num != 0) {
        print(num % 10)
        num /= 10
    }
}