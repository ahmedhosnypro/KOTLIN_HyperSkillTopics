fun main() {
    val readURL = readln()

    val beginOfParam = readURL.indexOf('?')
    val parameters = readURL.substring(beginOfParam + 1, readURL.length)
    val urlSplit = parameters.split("=|&".toRegex())
        .dropLastWhile { it.isEmpty() }.toTypedArray()
    var isPassFound = false
    var passIndex = 0

    var i = 0
    while (i < urlSplit.size) {
        print(urlSplit[i] + " : ")
        if (urlSplit[i] == "pass") {
            isPassFound = true
            passIndex = i
        }
        if (urlSplit[i + 1] != "") {
            println(urlSplit[i + 1])
        } else println("not found")
        i += 2
    }

    if (isPassFound) {
        println("password" + " : " + urlSplit[passIndex + 1])
    }
}