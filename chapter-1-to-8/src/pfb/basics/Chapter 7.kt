package pfb.basics

fun main(args: Array<String>) {
    val str = "back"
    var result = ""
    for (c in str) {
        result = c + result
    }
    print(result)
}
