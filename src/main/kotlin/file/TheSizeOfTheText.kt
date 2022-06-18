package file

import java.io.File

fun main() {
    println(File("src/main/resources/file/text.txt").readText().split(" ").size)
}