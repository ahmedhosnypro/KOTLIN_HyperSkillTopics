fun main() {
    val str = readln()
    var fstSum = 0
    var lstSum = 0
    for (i in str.indices) {
        if (i < str.length / 2) {
            fstSum += str[i].code
        } else {
            lstSum += str[i].code
        }
    }

    if (fstSum == lstSum) {
        println("YES")
    } else {
        println("NO")
    }
}