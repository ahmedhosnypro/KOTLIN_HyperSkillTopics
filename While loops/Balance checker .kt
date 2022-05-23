import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val cost = scanner.nextInt()
        if (cost <= balance) {
            balance -= cost
        } else {
            print("Error, insufficient funds for the purchase. Your balance is $balance, but you need $cost.")
            exitProcess(0)
        }
    }
    print("Thank you for choosing us to manage your account! Your balance is $balance.")
}