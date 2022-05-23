fun main() {
    val sequenceNum = readln().toInt()
    var min = Integer.MAX_VALUE
    repeat(sequenceNum) {
        val num = readln().toInt()
        if (num < min) {
            min = num
        }
    }
    println(min)
}