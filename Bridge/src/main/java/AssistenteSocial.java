public class AssistenteSocial extends CargoCentro{

    private int numeroFamiliasAtendidas;

    public AssistenteSocial(float salarioBase){
        super(salarioBase);
    }

    public void setNumeroFamiliasAtendidas(int numeroFamiliasAtendidas){
        this.numeroFamiliasAtendidas = numeroFamiliasAtendidas;
    }

    @Override
    public float calcularSalarioFinal(){
        float bonusProdutividade = this.numeroFamiliasAtendidas * 50.0f;
        float salarioComBonus = this.salarioBase + bonusProdutividade;

        return salarioComBonus + (this.salarioBase * this.formacao.percentualAdicional());
    }
}
