package pfb.files

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val helloWorld = Paths.get("files/HelloWorldTwice.txt")
    val strings = Files.readAllLines(helloWorld)
    println("strings = $strings")
}
