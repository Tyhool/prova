public class Cargo {
    private int numeroCargo;
    private int valorHora;

    public Cargo() {
    }

    public Cargo(int numeroCargo, int valorHora) {
        this.numeroCargo = numeroCargo;
        this.valorHora = valorHora;
    }

    public int getNumeroCargo() {
        return this.numeroCargo;
    }

    public void setNumeroCargo(int numeroCargo) {
        this.numeroCargo = numeroCargo;
    }

    public int getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "{" +
            " numeroCargo='" + getNumeroCargo() + "'" +
            ", valorHora='" + getValorHora() + "'" +
            "}";
    }

}