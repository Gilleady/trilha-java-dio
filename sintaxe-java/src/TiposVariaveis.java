public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /* Tipos de Variáveis em Classes */
        String meuNome = "Gilleady Alves";
        
        /* Tipos Primitivos */
        double salarioMinimo = 2.5;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        /* Variáveis */
        int numero = 1;

        numero = 2;
        System.out.println(numero);

        /* Constantes */
        final double PI = 3.14;
        System.out.println(PI);
    }
}
