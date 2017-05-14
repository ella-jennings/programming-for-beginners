package pfb.austen.test

import org.junit.Assert
import org.junit.Test
import pfb.austen.Book
import java.nio.file.Paths

class BookTest {
    @Test fun shortStory() {
        val book =
                Book(Paths.get("src/test/resources/books/ShortStory.txt"))
        val allWords = book.histogram.allWords()

        Assert.assertEquals(4, allWords.size)

        Assert.assertTrue(allWords.contains("the"))
        Assert.assertTrue(allWords.contains("beginning"))
        Assert.assertTrue(allWords.contains("middle"))
        Assert.assertTrue(allWords.contains("end"))

        Assert.assertEquals(3, book.histogram.numberOfTimesGiven("the"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("beginning"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("middle"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("end"))
    }
}