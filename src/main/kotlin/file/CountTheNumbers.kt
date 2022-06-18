package file

import java.io.File

fun main() {
    println(
        File("src/main/resources/file/words_with_numbers.txt")
            .readLines().count {
                try {
                    it.toInt()
                    true
                } catch (e: NumberFormatException) {
                    false
                }
            }
    )
}