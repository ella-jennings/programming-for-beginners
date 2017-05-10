package pfb.austen

/**
 * Represents a line of text read in from a book.
 */
class Line(line : String) {

    val words = mutableListOf<String>()

    /**
     * initialisation block between field
     * values and functions
     */

    init {
        var currentWord = ""
        for (c in line) {
            if (c == ' ') {
                words.add(currentWord)
                currentWord = ""
            } else {
                currentWord = currentWord + c
            }
        }
        words.add(currentWord)
    }
    fun words() : List<String> {
        return words
    }
}

