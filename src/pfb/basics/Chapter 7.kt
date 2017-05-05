package pfb.basics

fun main(args: Array<String>) {
    val str = "Mind  the    gap"
    var normalSpace = ""
    var wasSpace = false
    for (c in str) {
        if (c == ' ') {
            if (wasSpace == true) {
                normalSpace = normalSpace
            }
            else if(wasSpace == false) {
                normalSpace = normalSpace + c
                wasSpace = true
            }

        } else {
            normalSpace = normalSpace + c
            wasSpace = false
            }
        }
    println(normalSpace)
}
