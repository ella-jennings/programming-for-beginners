package pfb.austen.test

import org.junit.Assert
import org.junit.Test
import pfb.austen.Histogram

public class HistogramTest {
    @Test
    fun emptyToStartWith() {
        val histogram = Histogram()
        Assert.assertEquals(0, histogram.allWords().size)
    }
}