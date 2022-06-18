class Application(val name: String) {
    fun run(s1: String, s2: String, s3: String) {
        println(
            """
            $name
            $s1
            $s2
            $s3
        """.trimIndent()
        )
    }
}