package pfb.austen.test

import org.junit.Test
import org.junit.Assert
import pfb.austen.Line

class LineTest {
    @Test
    fun testEmpty() {
        val line = Line("")
        // takes two functions and compares for equality
        // check 0 is size of words returned by line
        Assert.assertEquals(0, line.words().size)

    }

    @Test fun oneWord() {
        val line = Line("hello")
        val words = line.words()
        Assert.assertEquals(1, words.size)
        Assert.assertEquals("hello", words[0])
    }

    @Test fun twoWords() {
        val line = Line("hello there")
        val words = line.words()
        Assert.assertEquals(2, words.size)
        Assert.assertEquals("hello", words[0])
        Assert.assertEquals("there", words[1])
    }
}