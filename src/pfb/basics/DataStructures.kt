package pfb.basics

fun main(args: Array<String>) {
    val nameToAge = mutableMapOf<String, Int>()
    nameToAge.put("Harry", 15)
    nameToAge.put("Luna", 16)
    nameToAge.put("Snape", 36)

    nameToAge.put("Luna", 17)
    nameToAge.remove("Snape")

    for (name in nameToAge.keys) {
        val age = nameToAge[name]
        println("$name is $age years old")
    }
}
