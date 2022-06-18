fun main() {
    val color = readLine()!!
    println(Rainbow.valueOf(color.uppercase()).ordinal + 1)
}

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    companion object {
        fun findByRgb(rgb: String): Rainbow {
            for (enum in Rainbow.values()) {
                if (rgb == enum.rgb) return enum
            }
            return NULL
        }
    }

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}