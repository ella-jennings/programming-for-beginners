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
}