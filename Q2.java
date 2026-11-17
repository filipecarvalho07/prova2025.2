public class Q2 {
   
public static int buscaBinariaCliente(
            Conta[] v, int tam, String x) {

        int ini = 0, fim = tam - 1;

        while (ini <= fim) {

            int meio = (ini + fim) / 2;

            int r = v[meio].cliente.compareToIgnoreCase(x);

            if (r == 0)
                return meio;

            if (r < 0)
                ini = meio + 1;
            else
                fim = meio - 1;
        }

        return -1;
    }
}

