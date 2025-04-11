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

    public int cuentaDescendente(int n){
        if (n == 1){
            return n;
        }

        System.out.print(n + " ");
        int valores = cuentaDescendente(n-1);
        return valores ;
    }

    public int invertirNumero(int n){
        if (n < 10){
            return n;
        }

        int ultimodigito = n % 10;
        System.out.print( ultimodigito);
        int digitos = invertirNumero(n/10);
        return digitos;
    }
}
