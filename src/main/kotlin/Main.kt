fun main() {
    val list = mutableListOf<Int>(5,5,5,5)
    val listOfList = mutableListOf<MutableList<Int>>()

    for (i in 1..4) {
        print(list + " ")
        listOfList.add(list.toMutableList())
    }
    println("\n" + listOfList.joinToString())
}