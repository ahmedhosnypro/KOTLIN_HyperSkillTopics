fun main() {
    val num = readln().toInt()
    if (num < 0) {
        print("negative")
    } else if (num == 0) {
        print("zero")
    } else {
        print("positive")
    }
}