fun main() {
    val smallestH = readln().toInt()
    val biggestH = readln().toInt()
    val sleepHours = readln().toInt()

    if (sleepHours >= biggestH) {
        print("Excess")
    } else if (sleepHours >= smallestH) {
        print("Normal")
    } else {
        print("Deficiency")
    }
}