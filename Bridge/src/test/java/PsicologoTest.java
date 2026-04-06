import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PsicologoTest {

    @Test
    void deveRetornarSalarioPsicologoComEspecializacaoEInsalubridade(){
        Formacao especializacao = new EspecializacaoSeguranca();
        Psicologo psicologo = new Psicologo(5000.0f);
        psicologo.setFormacao(especializacao);
        psicologo.setPossuiInsalubridade(true);

        float salario = psicologo.calcularSalarioFinal();
        assertEquals(6900.0f, salario, 0.01f);
    }

    @Test
    void deveRetornarSalarioPsicologoComEspecializacaoInsalubridade(){
        Formacao graduacao = new Graduacao();
        Psicologo psicologo = new Psicologo(5000.0f);
        psicologo.setFormacao(graduacao);
        psicologo.setPossuiInsalubridade(false);

        float salario = psicologo.calcularSalarioFinal();
        assertEquals(5750.0f, salario, 0.01f);
    }
}
