fun main() {
    var sum = 0
    for (num in readln().toInt()..readln().toInt()) {
        sum += num
    }
    println(sum)
}