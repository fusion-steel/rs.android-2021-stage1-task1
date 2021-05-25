package subtask3

class StringParser {
    /**
     * This function returns parsed substrings from given string,
     * which lies between these brackets (*), <*>, [*]
     */
    fun getResult(inputString: String): Array<String> {
        val bracket = mapOf(
            '(' to ')',
            '<' to '>',
            '[' to ']')

        val resultArray = ArrayList<String>()
        var index = 0

        while (index < inputString.length) {
            val currentChar = inputString[index]
            if (currentChar in bracket.keys) {
                val begin = index + 1
                var end: Int
                var countOpenBracket = 1
                val closeTag = bracket[currentChar]

                for (i in begin..inputString.length) {
                    if (inputString[i] == currentChar) ++countOpenBracket
                    if (inputString[i] == closeTag && countOpenBracket == 1) {
                        end = i
                        index = begin - 1
                        resultArray.add(inputString.substring(begin, end))
                        break
                    }

                    if (inputString[i] == closeTag && countOpenBracket != 1) --countOpenBracket
                }
            }
            index++
        }
        return resultArray.toTypedArray()
    }
}
