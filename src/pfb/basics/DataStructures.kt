package pfb.basics

fun main(args: Array<String>) {
    val nameToAge = mutableMapOf<String, Int>()
    nameToAge.put("Harry", 15)
    nameToAge.put("Luna", 16)
    nameToAge.put("Snape", 36)

    println("Harry's age: " + nameToAge["Harry"])
    println("Luna's age: " + nameToAge["Luna"])
    println("Snape's age: " + nameToAge["Snape"])
}
