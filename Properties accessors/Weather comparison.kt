class City(val name: String) {
    private val defaultTemperature = Temperature.valueOf(name).temp
    var degrees: Int = 0
        set(value) {
            field = when (value) {
                !in -92..57 -> defaultTemperature
                else -> value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third


    val cities = mutableListOf(firstCity, secondCity, thirdCity)

    var maxTemp = Int.MIN_VALUE
    var hottestCit = firstCity
    var neither = false
    for (c in cities) {
        if (c.degrees > maxTemp) {
            maxTemp = c.degrees
            hottestCit = c
        } else if (c.degrees == maxTemp) {
            neither = true
            break
        }
    }

    print(
        if (neither) {
            "neither"
        } else {
            hottestCit.name
        }
    )
}

enum class Temperature(val temp: Int) {
    Dubai(30), Hanoi(20), Moscow(5)
}