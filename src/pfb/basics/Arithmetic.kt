package pfb.basics

fun main(args: Array<String>) {
    var current = 1
    var previous = 1
    for (i in 1..10) {
        println(previous)
        val next = current + previous
        previous = current
        current = next
    }
}