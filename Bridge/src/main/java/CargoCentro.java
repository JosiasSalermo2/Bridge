public abstract class CargoCentro {

    protected Formacao formacao;
    protected float salarioBase;

    public CargoCentro(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public void setFormacao(Formacao formacao){
        this.formacao = formacao;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalarioFinal();
}
