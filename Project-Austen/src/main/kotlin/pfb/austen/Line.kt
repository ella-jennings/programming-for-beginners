package pfb.austen

/**
 * Represents a line of text read in from a book.
 */


class Line(line : String) {
    val words = mutableListOf<String>()

    init {
        var currentWord = ""
        for (c in line) {
            if (c == ' ') {
                addWord(currentWord)
                currentWord = ""
            } else {
                currentWord = currentWord + c
            }
        }
        addWord(currentWord)
    }

    fun words(): List<String> {
        return words
    }

    fun addWord(str: String) {
        if (str != "") {
            words.add(str.toLowerCase())
        }
    }
}