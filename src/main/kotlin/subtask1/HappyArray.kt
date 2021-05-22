package subtask1

class HappyArray {
    /**
     * This function converts sadArray to happyArray.
     * Elements considered 'bad' if the sum of nearest elements is less then its value.
     * Also the first and the last elements of the given array always considered 'happy'
     */
    fun convertToHappy(sadArray: IntArray): IntArray {
        val tempArray = sadArray.filterIndexed { index, item ->
            index == 0 || index == sadArray.lastIndex || (sadArray[index - 1] + sadArray[index + 1] >= item)
        }
        return if (tempArray.size == sadArray.size)
            tempArray.toIntArray()
        else convertToHappy(tempArray.toIntArray())
    }
}
