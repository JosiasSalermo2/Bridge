import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgenteSocioeducativoTest {

    @Test
    void deveRetornarSalarioAgenteComNivelMedio(){
        Formacao nivelMedio = new NivelMedio();
        AgenteSocioeducativo agente = new AgenteSocioeducativo(3000.0f);
        agente.setFormacao(nivelMedio);
        agente.setHorasPlantaoNoturno(10);

        float salario = agente.calcularSalarioFinal();
        assertEquals(3150.0f, salario, 0.01f);

    }

    @Test
    void deveRetornarSalarioAgenteComEspecializacao(){
        Formacao especializacao = new EspecializacaoSeguranca();
        AgenteSocioeducativo agente = new AgenteSocioeducativo(3000.0f);
        agente.setFormacao(especializacao);
        agente.setHorasPlantaoNoturno(20);

        float salario = agente.calcularSalarioFinal();
        assertEquals(4200.0f, salario, 0.01f);
    }
}
