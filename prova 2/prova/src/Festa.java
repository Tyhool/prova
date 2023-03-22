public class Festa {
    private int CPF;
    private int quant;
    private float custo;

    public Festa() {
    }

    public Festa(int CPF, int quant, float custo) {
        this.CPF = CPF;
        this.quant = quant;
        this.custo = custo;
    }

    public int getCPF() {
        return this.CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getQuant() {
        return this.quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getCusto() {
        return this.custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String classifica(int quant, float custa ) {
        setQuant(quant);
        setCusto(custa);
        String criterios = "";
        if (getQuant() < 300) {
            if (getCusto() < 15000) {
                criterios = "Festa_Junina";
            } else if (getCusto() >= 15000) {
                criterios = "Aniversario";
            }
        } else if (getQuant() >= 300) {
            if (getCusto() < 15000) {
                criterios = "Formatura";
            } else if (getCusto() >= 15000) {
                criterios = "Casamento";
            }
        }
    return criterios;
    }

    public void possivelLocal(){
        Local local = new Local();
        if (local.getMetros() > 3){
            System.out.println("Tem espaço suficiente");
        }else{
            System.out.println("Não tem espaço suficiente");
        }
    }
}
