
import kotlin.system.measureTimeMillis

fun main() {

    val listOfIntegers = readFileAsLinesUsingUseLines("/Users/bastos/Workspace/algorithms-specialization/count-inversion-algorithm/src/main/resources/_bcb5c6658381416d19b01bfc1d3993b5_IntegerArray.txt")
    var totalOfInversions: Long
    var totalOfInversionBruteForce: Long

    val elapsedDivideAndConquerAlgorithm = measureTimeMillis {
        totalOfInversions = CountInversionAlgorithm.count(listOfIntegers.toTypedArray())
    }

    val elapsedBruteForceAlgorithm = measureTimeMillis {
        totalOfInversionBruteForce = CountInversionAlgorithmBruteForce.count(listOfIntegers.toTypedArray())
    }

    "Divide and Conquer".printResults(elapsedDivideAndConquerAlgorithm, totalOfInversions)
    "Brute Force".printResults(elapsedBruteForceAlgorithm, totalOfInversionBruteForce)
}

