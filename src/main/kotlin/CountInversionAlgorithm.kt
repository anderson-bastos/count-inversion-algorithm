class CountInversionAlgorithm {
    companion object {
        fun count(arrayOf: Array<Int>): Long {
            return mergeSortAndCount(arrayOf, 0, arrayOf.size-1);
        }

        private fun mergeAndCount(arr: Array<Int>, l: Int, m: Int, r: Int): Long {
            // Left subarray
            val left = arr.copyOfRange(l, m + 1)

            // Right subarray
            val right = arr.copyOfRange(m + 1, r + 1)
            var i = 0
            var j = 0
            var k = l
            var swaps: Long = 0
            while (i < left.size && j < right.size) {
                if (left[i] <= right[j]) arr[k++] = left[i++] else {
                    arr[k++] = right[j++]
                    swaps += m + 1 - (l + i)
                }
            }
            while (i < left.size) arr[k++] = left[i++]
            while (j < right.size) arr[k++] = right[j++]
            return swaps
        }

        private fun mergeSortAndCount(arr: Array<Int>, l: Int, r: Int): Long {

            // Keeps track of the inversion count at a
            // particular node of the recursion tree
            var count: Long = 0
            if (l < r) {
                val m = (l + r) / 2

                // Total inversion count = left subarray count
                // + right subarray count + merge count

                // Left subarray count
                count += mergeSortAndCount(arr, l, m)

                // Right subarray count
                count += mergeSortAndCount(arr, m + 1, r)

                // Merge count
                count += mergeAndCount(arr, l, m, r)
            }
            return count
        }
    }
}