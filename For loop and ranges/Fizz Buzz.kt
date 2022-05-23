fun main() {
    val range = readln().toInt()..readln().toInt()
    for (num in range) {
        if (num % 15 == 0) {
            print("FizzBuzz")
        } else if (num % 5 == 0) {
            print("Buzz")
        } else if (num % 3 == 0) {
            print("Fizz")
        } else {
            print(num)
        }
    }
}