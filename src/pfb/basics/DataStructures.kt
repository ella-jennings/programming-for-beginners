package pfb.basics

fun main(args: Array<String>) {
    //Record the sightings.
    val sightings = mutableListOf<String>()
    sightings.add("emu")
    sightings.add("magpie")
    sightings.add("galah")
    sightings.add("emu")

    //Count the species.
    val speciesToCount = mutableMapOf<String, Int>()
    for (sighting in sightings) {
        val countSoFar = speciesToCount[sighting] ?:0
        val updatedCount = countSoFar + 1
        speciesToCount.put(sighting, updatedCount)
    }

    //Print the species counts.
    for (species in speciesToCount.keys) {
        val count = speciesToCount[species]
        println("Number of $species sightings: $count")
    }
}
