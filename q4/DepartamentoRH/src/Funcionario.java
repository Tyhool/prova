public class Funcionario {
    private int codigoCargo;
    private String sexo;
    private int quantHora;

    public Funcionario(int codigoCargo, String sexo, int quantHora) {
        this.codigoCargo = codigoCargo;
        this.sexo = sexo;
        this.quantHora = quantHora;
    }

    public Funcionario() {

    }

    public int getCodigoCargo() {
        return this.codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getQuantHora() {
        return this.quantHora;
    }

    public void setQuantHora(int quantHora) {
        this.quantHora = quantHora;
    }

    @Override
    public String toString() {
        return "{" +
                " codigoCargo='" + getCodigoCargo() + "'" +
                ", sexo='" + getSexo() + "'" +
                ", quantHora='" + getQuantHora() + "'" +
                "}";
    }

    public void salarioFinal(Cargo g) {
        float salario = 2f;

        System.out.println("Numero do cargo: " + g.getNumeroCargo());
        if (getSexo() == "M") {
            salario = getQuantHora() * g.getValorHora();
            System.out.println("salario final: " + salario);
        } else if (getSexo() == "F") {
            salario = getQuantHora() * g.getValorHora();
            salario = salario + (salario * 0.2f);
            System.out.println("salario final: " + salario);
        }

    }

    // public void mostrar() {
    //     Cargo a = new Cargo();
    //     salarioFinal(a);

    // }

}
