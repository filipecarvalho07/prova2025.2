import java.util.Scanner;
 
public class Q5 {
    static Scanner sc = new Scanner(System.in);

public static void extrato(
            Conta[] vContas, int tamConta,
            Operacao[] vOp, int tamOp) {

        System.out.print("ID da conta: ");
        int id = sc.nextInt();
        int TAM_OP = 1000; 
        int p = Q1.buscaId(vContas, tamConta, id);

        if (p == -1)
            return;

        Operacao[] filtrado = new Operacao[TAM_OP];

        int qtd = Q4.filtraOperacoes(vOp, tamOp, filtrado, id);

        int ini = qtd - 5;

        if (ini < 0)
            ini = 0;

        double saldo = vContas[p].saldo;

        for (int i = 0; i < qtd; i++)
            saldo += filtrado[i].valor;
        // O -= estava errado pois não precisa subtrair os valores, precisa somar as operações anteriores. Foi substituido por +=.
        // ini estava errado pois o laço precisa percorrer todas as operaçõesdesde a primeira. Foi substituido por 0.
        

        System.out.println("\nCONTA N. " + id);
        System.out.println("CLIENTE: " + vContas[p].cliente);
        System.out.println("--------------------------------");

        System.out.printf("Saldo Anterior: %.2f%n", saldo);

        for (int i = ini; i < qtd; i++) {

            Operacao op = filtrado[i];

            String nome = "";

            if (op.tipo == 'D')
                nome = "Deposito";
            else if (op.tipo == 'S')
                nome = "Saque";
            else if (op.tipo == 'T')
                nome = "Transferencia";

            saldo += op.valor;

            System.out.printf("%04d | %-13s | %.2f | %.2f%n",
                    op.id, nome, Math.abs(op.valor), saldo);
        }

        System.out.println("--------------------------------");
        System.out.printf("Saldo Atual: %.2f%n", saldo);
        //no papel escrevi println mas o certo é printf.
    }
}    
