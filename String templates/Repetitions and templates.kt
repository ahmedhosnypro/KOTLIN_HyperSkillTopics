fun main() {
    val word = readln()
    print("${word.length} repetitions of the word $word: ")
    repeat(word.length) {
        print(word)
    }
}