class Vehicle(val name: String) {
    inner class Body(val color: String) {
        fun printColor() {
            print("The $name vehicle has a $color body.")
        }
    }
}