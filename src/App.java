public class App {
    public static void main(String[] args) throws Exception {
        
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Resultado: "+ resultadoFinal);
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
