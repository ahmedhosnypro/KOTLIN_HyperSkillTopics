const val A_DEGREES = 5
const val B_DEGREES = 4
const val C_DEGREES = 3
const val D_DEGREES = 2
fun main() {
    val studentNum = readln().toInt()
    var (degreeA, degreeB, degreeC, degreeD) = "0 0 0 0".split(" ").map { it.toInt() }

    repeat(studentNum) {
        val degree = readln().toInt()
        if (degree == A_DEGREES) {
            degreeA++
        } else if (degree == B_DEGREES) {
            degreeB++
        } else if (degree == C_DEGREES) {
            degreeC++
        } else if (degree == D_DEGREES) {
            degreeD++
        }
    }
    print("$degreeD $degreeC $degreeB $degreeA")
}