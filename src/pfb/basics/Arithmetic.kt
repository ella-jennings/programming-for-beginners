package pfb.basics

fun main(args: Array<String>) {
    for(s in 1..10) {
        for (i in 1..10) {
            val x = s * i
            print("$s*$i=$x\t")
        }
        println()
    }
}