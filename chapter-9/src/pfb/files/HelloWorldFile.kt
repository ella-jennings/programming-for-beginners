package pfb.files

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val helloWorld = Paths.get("files/BirdList.txt")
    val birds = Files.readAllLines(helloWorld)

    // create the list from the file
    val listOfBirds = mutableSetOf<String>()
    for (bird in birds) {
        listOfBirds.add(bird)
    }
    
    // total species
    val totalSpecies = listOfBirds.size
    println()
    println("A total of $totalSpecies species were seen.")
}

