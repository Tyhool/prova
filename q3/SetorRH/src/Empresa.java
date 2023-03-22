public class Empresa {

    public static void main(String[] args) throws Exception {
        FuncionarioEmp funcionario_01 = new FuncionarioEmp();
        funcionario_01.setId(1);
        funcionario_01.setNome("thyago");
        funcionario_01.setIdade(23);
        funcionario_01.setSexo("Masculino");
        funcionario_01.setSalario(1000.00f);
        funcionario_01.setSetor("Programador");
        System.out.println(funcionario_01);

        FuncionarioEmp funcionario_02 = new FuncionarioEmp();
        funcionario_02.setId(2);
        funcionario_02.setNome("Ana");
        funcionario_02.setIdade(29);
        funcionario_02.setSexo("Feminino");
        funcionario_02.setSalario(1500.00f);
        funcionario_02.setSetor("Analista");
        System.out.println(funcionario_02);

        FuncionarioEmp funcionario_03 = new FuncionarioEmp();
        funcionario_03.setId(3);
        funcionario_03.setNome("Vitor");
        funcionario_03.setIdade(30);
        funcionario_03.setSexo("Masculino");
        funcionario_03.setSalario(2000.00f);
        funcionario_03.setSetor("Faxineiro");
        System.out.println(funcionario_03);

        FuncionarioEmp funcionario_04 = new FuncionarioEmp();
        funcionario_04.setId(4);
        funcionario_04.setNome("Rafaela");
        funcionario_04.setIdade(26);
        funcionario_04.setSexo("Feminino");
        funcionario_04.setSalario(1900.00f);
        funcionario_04.setSetor("Cozinheira");
        System.out.println(funcionario_04);

        FuncionarioEmp funcionario_05 = new FuncionarioEmp();
        funcionario_05.setId(5);
        funcionario_05.setNome("Jose");
        funcionario_05.setIdade(20);
        funcionario_05.setSexo("Masculino");
        funcionario_05.setSalario(1000.00f);
        funcionario_05.setSetor("Estagiario");
        System.out.println(funcionario_05);

    }
}
