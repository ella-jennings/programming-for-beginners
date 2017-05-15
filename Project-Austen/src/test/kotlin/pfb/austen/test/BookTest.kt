package pfb.austen.test

import org.junit.Assert
import org.junit.Test
import pfb.austen.Book
import java.nio.file.Path
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

    @Test fun horrorStory() {
        val book =
                Book(Paths.get("src/test/resources/books/HorrorStory.txt"))
        val allWords = book.histogram.allWords()

        Assert.assertEquals(7, allWords.size)
        Assert.assertTrue(allWords.contains("it"))
        Assert.assertTrue(allWords.contains("was"))
        Assert.assertTrue(allWords.contains("a"))
        Assert.assertTrue(allWords.contains("dark"))
        Assert.assertTrue(allWords.contains("and"))
        Assert.assertTrue(allWords.contains("stormy"))
        Assert.assertTrue(allWords.contains("night"))

        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("it"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("was"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("a"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("dark"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("and"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("stormy"))
        Assert.assertEquals(1, book.histogram.numberOfTimesGiven("night"))
    }

    @Test fun bookOfCalm() {
        val book =
                Book(Paths.get("src/test/resources/books/TheLittleBookOfCalm.txt"))
        val histogram = book.histogram

        print(histogram.allWords())

        Assert.assertEquals(2, histogram.numberOfTimesGiven("this"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("is"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("a"))
        Assert.assertEquals(3, histogram.numberOfTimesGiven("very"))
        Assert.assertEquals(2, histogram.numberOfTimesGiven("short"))
        Assert.assertEquals(2, histogram.numberOfTimesGiven("book"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("we"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("hope"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("that"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("you"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("find"))
        Assert.assertEquals(1, histogram.numberOfTimesGiven("calming"))
    }
}