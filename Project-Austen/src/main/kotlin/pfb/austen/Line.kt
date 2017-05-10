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
                words.add(currentWord)
                currentWord = ""
            } else {
                currentWord = currentWord + c
            }
        }
        if (currentWord != "") {
            words.add(currentWord)
        }

    }

    fun words(): List<String> {
        return words
    }
}