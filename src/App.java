public class App {
    public static void main(String[] args) throws Exception {
        
        int n = 1257;
        //int exp = 3;
        /*int resultadoFinal = factorial(n);
        System.out.println("Resultado: "+ resultadoFinal);*/


        EjerciciosRecursivos e = new EjerciciosRecursivos();
        /*int fibo = e.fibonacci(3);
        System.out.println(fibo);*/

        /*int conse = e.sumaConsecutivos(5);
        System.out.println(conse);*/

        /*int pote = e.getPotencial(n, exp);
        System.out.println(n + "^" + exp + " = " + pote);*/

        int sum = e.sumaDeDigitos(n);
        System.out.println(sum);
    }





    //Para poder llamar a este metodo y llamar de esta clase siendo que solo se llamara si lo instanciamos
    public static int factorial(int n){
        if (n == 0){
            System.out.println("Alcanze el caso base");
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("calculando factorial de: "+ n +"* factorial ("+ (n-1) +" -1)");
        return resultado;
    }
}