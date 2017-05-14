package pfb.austen

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Reads a book from a text file and produces word usage information.
 */
class Book(bookFile: Path) {
    val histogram = Histogram()

    init {
        val lines = Files.readAllLines(bookFile)
        for (str in lines) {
            val line = Line(str)
            for (word in line.words()) {
                histogram.record(word)
            }
        }

    }
}
