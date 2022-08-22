import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountInversionAlgorithmTest {

    @Test
    fun `Should count inversion with inversion algorithm using brute force`() {
        Assertions.assertEquals(5, CountInversionAlgorithmBruteForce.count(arrayOf(1, 20, 6, 4, 5)))
    }

    @Test
    fun `Should count inversion with inversion algorithm divide and conquer`() {
        Assertions.assertEquals(5, CountInversionAlgorithm.count(arrayOf(1, 20, 6, 4, 5)))
    }
}