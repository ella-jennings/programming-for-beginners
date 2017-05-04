package pfb.basics

fun main(args: Array<String>) {
    var sum = 0
    for (i in 0..10) {
        if(i%2 == 0) {
            sum = sum + i
        }
    }
    print(sum)
}