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

    public int getPotencial(int n, int exp){
        if (n== 0){
            return 0;
        } else if (exp == 0){
            return 1;
        } else if (exp == 1){
            return n;
        }

        int resultadoParcial = getPotencial(n, exp-1);
        int resultado = n * resultadoParcial;
        return resultado;
    }

    public int sumaDeDigitos(int n){
        if (n < 10){
            return n;
        }


        int ultimodigito = n % 10;
        int digitos = sumaDeDigitos(n/10);
        int resultado = ultimodigito + digitos;
        return resultado;
    }
}
