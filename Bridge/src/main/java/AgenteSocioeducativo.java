public class AgenteSocioeducativo extends CargoCentro {

    private int horasPlantaoNoturno;

    public AgenteSocioeducativo(float salarioBase){
        super(salarioBase);
    }

    public void setHorasPlantaoNoturno(int horasPlantaoNoturno){
        this.horasPlantaoNoturno = horasPlantaoNoturno;
    }

    @Override
    public float calcularSalarioFinal(){
        float adicionalNoturno = this.horasPlantaoNoturno * 15.0f;
        float salarioComAdicionais = this.salarioBase + adicionalNoturno;

        return salarioComAdicionais + (this.salarioBase * this.formacao.percentualAdicional());
    }
}
