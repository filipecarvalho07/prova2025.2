public class Q3{
public static void insertionSortCliente(Conta[] v, int tam) {

        for (int i = 1; i < tam; i++) {

            Conta aux = v[i];
            int j = i - 1;

            while (j >= 0 && v[j].cliente.compareToIgnoreCase(aux.cliente) > 0) {
                //no papel escrevi somente j> 0

                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = aux;
        }
    }
}    