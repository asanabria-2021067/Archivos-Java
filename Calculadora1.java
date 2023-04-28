public class Calculadora1{
    public static void main(String args[]){
        int numero1=10;
        int numero2=0;
        int total=0;
        char simbolo='/';
        if (simbolo=='+'){
            System.out.println("El simbolo es igual a suma");
            total=numero1+numero2;
            System.out.println("El resultado de la suma es: "+total);
        }else if(simbolo=='-'){
            System.out.println("El simbolo es igual a resta");
            total=numero1-numero2;
            System.out.println("El resultado de la resta es igual a: "+total);
        }else if (simbolo=='*'){
            System.out.println("El simbolo es igual a multiplicacion");
            total=numero1/numero2;
            System.out.println("El resultado de la resta es igual a: "+total);
        }else if (simbolo=='/'){
            System.out.println("El simbolo es igual a division");
            if (numero2==0){
                System.out.println("No se puede realizar la operacion");
            }else{
            total=numero1/numero2;
            System.out.println("El resultado de la resta es igual a: "+total);
            }
        }else{
            System.out.println("El simbolo ingresado fue erroneo");
        }


    }




}