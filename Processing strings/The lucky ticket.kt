import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val str = scanner.nextLine()
    val chNums = str.toCharArray()
    var fstSum = 0
    var lstSum = 0
    for (i in 0..5) {
        if (i < 3) {
            fstSum += chNums[i].code
        } else {
            lstSum += chNums[i].code
        }
    }

    if (fstSum == lstSum) {
        println("Lucky")
    } else {
        println("Regular")
    }
}