public class EjerciciosRecursivos {
    
    public int fibonacci(int n){
        if(n <=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /* Meteodo que devuelve la suma de los numeros que contiene n */
    public int sumaConsecutivos(int n){
        if(n == 1) return 1;
        
        return n + sumaConsecutivos(n-1);
    }
}
