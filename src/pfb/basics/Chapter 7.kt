package pfb.basics

fun main(args: Array<String>) {
    val str = "Can you understand this?"
    var noSpaces = ""
    for (c in str) {
        if (c != ' ') {
        noSpaces = noSpaces + c
        }
    }
    println(noSpaces)
}
