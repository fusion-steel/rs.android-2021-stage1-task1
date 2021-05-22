package subtask2

class BillCounter {
    /**
     * This function calculates correctness of given bill, which is IntArray,
     * split between two persons, one person doesn't pay for item with index 'k'.
     * If calculation is correct, returns String "Bon Appetit",
     * otherwise - change that the first person should return to the second.
     */
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        bill[k] = 0
        val charged = bill.sum() / 2
        return if (charged == b) {
            "Bon Appetit"
        } else {
            (b - charged).toString()
        }
    }
}
