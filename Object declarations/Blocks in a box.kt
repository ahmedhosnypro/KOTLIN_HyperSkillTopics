class Block(val color: String) {

    object BlockProperties {
        var length = 3
        var width = 3

        fun blocksInBox(boxLength: Int, boxWidth: Int): Int = (boxLength * boxWidth) / (length * width)
    }
}