package pfb.basics

fun main(args: Array<String>) {
    val sightings = mutableListOf<String>()
    sightings.add("emu")
    sightings.add("magpie")
    sightings.add("galah")
    sightings.add("emu")

    println("Number of bird sightings: " + sightings.size)
    if(sightings.contains("emu")) {
        println("Saw and emu!")
    }
    if(sightings.contains("brogla")) {
        println("Saw a brogla!")
    }
    println("Third sighting: " + sightings[2])
}
