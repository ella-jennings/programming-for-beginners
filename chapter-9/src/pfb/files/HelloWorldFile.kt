package pfb.files

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val helloWorld = Paths.get("files/BirdListWithGapsAndCaps.txt")
    val sightings = Files.readAllLines(helloWorld)

    val noGaps = mutableListOf<String>()
    for (sighting in sightings) {
        if (sighting != "") {
            noGaps.add(sighting)
        }
    }

    val reformatted = Paths.get("files/Reformatted.txt")
    Files.write(reformatted, noGaps)
}