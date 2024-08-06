import org.junit.jupiter.api.*

import testes.countXO

class MainTest {
    @Test
    @DisplayName("TESTE - countXO")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertFalse(countXO("xxooo")) },
            { Assertions.assertTrue(countXO("x2xodo")) },
            { Assertions.assertFalse(countXO("xxxaaaooOxXooo")) }
        )
    }

    @Test
    @Disabled
    fun notImplementation() {}

    @Test
    fun wilFail() {
        // Falha o teste
        // fail { "Não posso terminar" }
    }

    @Test
    @DisplayName("TESTE - Assumptions countXO")
    fun assumption() {
        // Assumptions so executará os outros casos se passar nesse
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertFalse(countXO("xxooo"))
    }

    @Test
    @DisplayName("TESTE - Does not throw countXO")
    fun exception() {
        assertDoesNotThrow { Assertions.assertFalse(countXO("xxooo")) }
    }
}