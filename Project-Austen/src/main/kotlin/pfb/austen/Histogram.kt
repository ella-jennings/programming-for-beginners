package pfb.austen

/**
 * Collects word usage data.
 */
class Histogram {

    fun record(word: String)

    fun allWords(): Set<String> {
        return mutableSetOf()
    }

    fun numberOfTimesGiven(word: String): Int {
        return 0
    }
}
