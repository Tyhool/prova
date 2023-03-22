public class Local {
    private float metros;
    private float largura;
    private float comprimento;
    private String arLivre = "Ao ar livre";

    public Local() {
    }

    public Local(float metros, float largura, float comprimento, String arLivre) {
        this.metros = metros;
        this.largura = largura;
        this.comprimento = comprimento;
        this.arLivre = arLivre;
    }

    public float getMetros() {
        return this.metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getArLivre() {
        return this.arLivre;
    }

    public void setArLivre(String arLivre) {
        this.arLivre = arLivre;
    }

    public void possivelFesta(Festa fe) {
        // Festa festa = new Festa();
        if (fe.classifica(fe.getQuant(), fe.getCusto()) == "Festa_Junina"
                || fe.classifica(fe.getQuant(), fe.getCusto()) == "Aniversario") {
            System.out.println("É uma " + fe.classifica(fe.getQuant(), fe.getCusto()) + " e é " + getArLivre());
        } else if (fe.classifica(fe.getQuant(), fe.getCusto()) == "Formatura"
                || fe.classifica(fe.getQuant(), fe.getCusto()) == "Casamento") {
            System.out.println("É uma " + fe.classifica(fe.getQuant(), fe.getCusto()) + " e não é " + getArLivre());
        }
    }
}