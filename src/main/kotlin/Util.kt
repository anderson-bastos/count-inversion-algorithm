import java.io.File

fun readFileAsLinesUsingUseLines(fileName: String): List<Int>
        = File(fileName).useLines {
        line -> line.map { Integer.parseInt(it) }.toList()
}

fun String.printResults(elapsedTime: Long, totalOfInversions: Long) =
    println(
        """
        
        Algorithm: $this
        Elapsed Time: ${elapsedTime}ms
        Total of inversions: $totalOfInversions
        """.trimIndent()
    )