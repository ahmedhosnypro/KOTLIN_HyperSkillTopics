fun main() {
    val army = readln().toInt()

    println(
        when {
            army < 1 -> "no army"
            army <= 4 -> "few"
            army <= 9 -> "several"
            army <= 19 -> "pack"
            army <= 49 -> "lots"
            army <= 99 -> "horde"
            army <= 249 -> "throng"
            army <=  499-> "swarm"
            army <= 999 -> "zounds"
            else -> "legion"
        }
    )
}