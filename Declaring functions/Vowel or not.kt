fun isVowel(ch: Char) = ch.toString().matches(Regex("[aeuoiAEUIO]"))

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}