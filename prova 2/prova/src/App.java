    import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Festa festa1 = new Festa();
        Local local1 = new Local();

        festa1.setCPF(5555555);
        System.out.println("CPF: " + festa1.getCPF());

        festa1.setQuant(350);
        System.out.println("Quantidade de pessoa: " + festa1.getQuant());

        festa1.setCusto(10000);
        System.out.println("Custo da festa: " + festa1.getCusto());

        local1.possivelFesta(festa1);

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        Festa festa2 = new Festa();
        Local local2 = new Local();

        festa2.setCPF(11111111);
        System.out.println("CPF: " + festa2.getCPF());

        festa2.setQuant(150);
        System.out.println("Quantidade de pessoa: " + festa2.getQuant());

        festa2.setCusto(18000);
        System.out.println("Custo da festa: " + festa2.getCusto());

        local2.possivelFesta(festa2);
        // -------------------------------------------------------------------
        System.out.println();

    }
}
