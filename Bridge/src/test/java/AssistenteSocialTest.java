import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssistenteSocialTest {

    @Test
    void deveRetornarSalarioAssistenteComGraduacao(){
        Formacao graduacao = new Graduacao();
        AssistenteSocial assistente = new AssistenteSocial(4000.0f);
        assistente.setFormacao(graduacao);
        assistente.setNumeroFamiliasAtendidas(5);

        float salario = assistente.calcularSalarioFinal();
        assertEquals(4850.0f, salario, 0.01f);
    }
}
