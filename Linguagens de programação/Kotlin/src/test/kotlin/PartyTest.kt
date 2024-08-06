import exercicios.Party

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

private class PartyTest {
    private val name = "Carlos"

    @Test
    @DisplayName("TESTE - Não deve entrar menores")
    fun minorNotAllowed() {
        Assertions.assertEquals("Menores não são permitidos.", Party.entryParty(name, 17, "luxo", "XT"))

        Assertions.assertTrue() { Party.people.isEmpty() }
    }

    @Test
    @DisplayName("TESTE - Não deve entrar com convite inválido")
    fun invalidInvitation() {
        Assertions.assertEquals("Negado. Convite inválido.", Party.entryParty(name, 18, "raro", "XT"))

        Assertions.assertEquals("Negado. Convite inválido.", Party.entryParty(name, 18, "raro", "XT"))

        Assertions.assertTrue() { Party.people.isEmpty() }

        Assertions.assertEquals("Negado. Convite inválido.", Party.entryParty(name, 18, "luxo", "31"))

        Assertions.assertTrue() { Party.people.isEmpty() }
    }

    @Test
    @DisplayName("TESTE - Deve conseguir entrar")
    fun joiningTheParty() {
        Assertions.assertEquals("Bem vindo, $name!", Party.entryParty(name, 18, "luxo", "XT"))

        Assertions.assertEquals("Bem vindo, $name!", Party.entryParty(name, 66, "comum", "XL"))

        Assertions.assertEquals("Bem vindo, $name!", Party.entryParty(name, 80, "premium", "XL"))

        Assertions.assertFalse { Party.people.isEmpty() }
    }
}


