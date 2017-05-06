package pfb.basics

fun main(args: Array<String>) {
    val birds = mutableSetOf<String>()
    birds.add("emu")
    birds.add("magpie")
    birds.add("galah")
    birds.add("emu")

    println("Number of bird species: " + birds.size)
    if (birds.contains("emu")) {
        println("Saw and emu!")
    }
    if (birds.contains("brogla")) {
        println("Saw a brogla!")
    }
}
