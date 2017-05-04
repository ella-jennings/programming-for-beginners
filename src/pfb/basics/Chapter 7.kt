package pfb.basics

fun main(args: Array<String>) {
    val str = "How long is a piece of string?"
    var spaceCount = 0
    for (c in str) {
        if (c == 'a' || c == 'e') {
            spaceCount = spaceCount + 1
        }
    }
    println("Number of a and e characters: $spaceCount")
}
