fun main() {
    val ch1 = readln().first()
    val ch2 = readln().first()
    val ch3 = readln().first()
    print(ch2.code - ch1.code == 1 && ch3.code - ch2.code == 1)
}