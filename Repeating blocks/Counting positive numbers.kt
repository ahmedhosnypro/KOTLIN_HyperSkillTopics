fun main() {
    val sequenceNUm = readln().toInt()
    var positives = 0
    repeat(sequenceNUm) {
        if (readln().toInt() > 0) {
            positives++
        }
    }
    print(positives)
}