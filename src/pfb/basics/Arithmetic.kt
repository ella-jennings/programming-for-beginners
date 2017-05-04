package pfb.basics

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..5) {
        if (sum == 0) {
            sum += i
        } else {
            sum *= i
        }
    }
    print(sum)
}