package pfb.files

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val helloWorld = Paths.get("files/BirdList.txt")
    val strings = Files.readAllLines(helloWorld)

    // create the list from the file
    val listOfBirds = mutableListOf<String>()
    for (string in strings) {
        listOfBirds.add(string)
    }

    // count the species
    val speciesToCount = mutableMapOf<String, Int>()
    for (sighting in listOfBirds) {
        val countSoFar = speciesToCount[sighting] ?:0
        val updatedCount = countSoFar + 1
        speciesToCount.put(sighting, updatedCount)
    }

    // how many per species?
    for (species in speciesToCount.keys) {
        val count = speciesToCount[species]
        println("Number of $species sightings: $count")

    }

    // total species
    val totalSpecies = speciesToCount.size
    println()
    println("A total of $totalSpecies species were seen.")
}

