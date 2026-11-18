import java.util.Scanner;

public class Q1 {

    static Scanner sc = new Scanner(System.in);

    static final int TAM_CONTAS = 50;

    public static int cadastrarConta(Conta[] v, int tam) {

        if (tam >= TAM_CONTAS)
            return tam;

        Conta c = new Conta();

        System.out.print("ID: ");
        c.id = sc.nextInt();
        sc.nextLine();

        if (buscaId(v, tam, c.id) != -1)
            return tam;

        System.out.print("Cliente: ");
        c.cliente = sc.nextLine();

        System.out.print("Limite: ");
        c.limite = sc.nextDouble();

        if (c.limite < 0)
            return tam;

        c.saldo = 0;
        v[tam] = c;

        return tam + 1;
    }
}    
