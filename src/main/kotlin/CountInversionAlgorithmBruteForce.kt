/**
 * Complexity Analysis:
 *  Time Complexity: O(n^2), Two nested loops are needed to traverse the array from start to end, so the Time complexity is O(n^2)
 *  Space Complexity:O(1), No extra space is required.
 */
class CountInversionAlgorithmBruteForce {
    companion object {
        fun count(arrayOf: Array<Int>): Long {
            var invCount: Long = 0
            for (i in 0 until arrayOf.size - 1)
                for (j in i + 1 until arrayOf.size)
                    if (arrayOf[i] > arrayOf[j])
                        invCount++
            return invCount
        }
    }
}
