public class Psicologo extends CargoCentro{

    private boolean possuiInsalubridade;

    public Psicologo(float salarioBase){
        super(salarioBase);
    }

    public void setPossuiInsalubridade(boolean possuiInsalubridade){
        this.possuiInsalubridade = possuiInsalubridade;
    }

    @Override
    public float calcularSalarioFinal(){
        float insalubridade = this.possuiInsalubridade ? 400.0f : 0.0f;
        float salarioComInsalubridade = this.salarioBase + insalubridade;

        return salarioComInsalubridade + (this.salarioBase * this.formacao.percentualAdicional());
    }
}
