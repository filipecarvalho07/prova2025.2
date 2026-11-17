public class Q4{
public static int filtraOperacoes(
            Operacao[] vOp, int tamOp,
            Operacao[] vOpFiltrado, int x) {

        int cont = 0;

        for (int i = 0; i < tamOp; i++) {

            if (vOp[i].idConta == x) {
                vOpFiltrado[cont] = vOp[i];
                cont++;
            }
        }

        return cont;
    }
}    
