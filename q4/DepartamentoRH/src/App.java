public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario_01 = new Funcionario(9, "M", 4);
        Funcionario funcionario_02 = new Funcionario(10, "F", 4);
        Cargo c1 = new Cargo(21, 600);
        Cargo c2 = new Cargo(19, 800);
        Cargo c3 = new Cargo(05, 200);

        System.out.println(funcionario_01);
        funcionario_01.salarioFinal(c1);
        System.out.println("----------------");

        System.out.println(funcionario_02);
        funcionario_02.salarioFinal(c1);
        System.out.println("----------------");
        System.out.println("----------------");

        System.out.println(funcionario_01);
        funcionario_01.salarioFinal(c2);
        System.out.println("----------------");

        System.out.println(funcionario_02);
        funcionario_02.salarioFinal(c2);
        System.out.println("----------------");
        System.out.println("----------------");

        System.out.println(funcionario_01);
        funcionario_01.salarioFinal(c3);
        System.out.println("----------------");

        System.out.println(funcionario_02);
        funcionario_02.salarioFinal(c3);
        System.out.println("----------------");

    }
}
