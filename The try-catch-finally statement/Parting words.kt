fun pepTalk(name: String): String {
    val array = name.split(" ").toTypedArray()

    var firstName: String
    var secondName: String

    try {
        firstName = array[0]
        secondName = array[1]
    } catch (e: ArrayIndexOutOfBoundsException) {
        firstName = "nameless"
        secondName = "one"
    } finally {
        println("Good luck!")
    }

    return "Don't lose the towel, traveler $firstName $secondName."
}

fun main() {
    val name = readln()
    val advice = pepTalk(name)
    print(advice)
}