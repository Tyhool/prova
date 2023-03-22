public class FuncionarioEmp {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private float salario;
    private String setor;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public FuncionarioEmp() {
    }

    public FuncionarioEmp(int id, String nome, int idade, String sexo, float salario, String setor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", sexo='" + getSexo() + "'" +
                ", salario='" + getSalario() + "'" +
                ", setor='" + getSetor() + "'" +
                "}";
    }

    public void AumentarSalario() {

    }

    public void Turno() {

    }

    public void MudancaCargo() {

    }

}
