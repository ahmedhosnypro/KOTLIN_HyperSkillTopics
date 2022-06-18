class Player(val id: Int, val name: String, val hp: Int = 100) {
    companion object {
        var nextId = 1
        fun create(name: String): Player = Player(nextId++, name)
    }
}