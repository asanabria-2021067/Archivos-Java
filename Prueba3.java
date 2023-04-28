public class Prueba3{
    public static void main(String args[]){
    System.out.println("Bienvenido a la aplicacion de Calculadora, Tablas, Serie de Fibonacci y Comprobacion de par e impar");
    System.out.println("Menu de operaciones");
    System.out.println("1. Tabla de multiplicacion");
    System.out.println("2. Calculadora");
    System.out.println("3. Serie de Fibonacci");
    System.out.println("4. Comprobacion de par e impar");
    System.out.println("¿Cual opcion desea elegir?");
    char decision=1;
        switch(decision){
        case '1':
        System.out.println("Submenu");
        System.out.println("1. Tabla con While");
        System.out.println("2. Tabla con if");
        char submenu=2;
            switch(submenu)
            {
                case '1':
                System.out.println("Cual es la tabla que desesa visualizar");
                int numero=3;
                int contador=1;
                System.out.println("Ingrese el limite de la tabla");
                int total=7;
                int resultado= numero*contador;
                System.out.println("Aqui esta la tabla");
                while (contador!=total){
                System.out.println(numero+ "*" +contador+ resultado);
                }
                break; 
                case '2':
                System.out.println("Cual es la tabla que desesa visualizar");
                int numero2=3;
                int contador2=1;
                System.out.println("Ingrese el limite de la tabla");
                int total2=7;
                int resultado2= numero2*contador2;
                if (contador2==total2){
                contador2++;
                }else{
                    System.out.println(numero2+ "*" +contador2+ resultado2);
                }
                break;
                default:
                System.out.println("Opcion erronea");
                }
                break;
        case '2':
        System.out.println("Ha elegido calculadora");
        System.out.println("Ingrese el primer valor");
        int numero3=5;
        System.out.println("Ingrese el segundo valor");
        int numero4=6;
        int total3=0;
        System.out.println("Ingrese el signo de la operacion");
        char simbolo='/';
        if (simbolo=='+'){
            System.out.println("El simbolo es igual a suma");
            total3=numero3+numero4;
            System.out.println("El resultado de la suma es: "+total3);
        }else if(simbolo=='-'){
            System.out.println("El simbolo es igual a resta");
            total3=numero3-numero4;
            System.out.println("El resultado de la resta es igual a: "+total3);
        }else if (simbolo=='*'){
            System.out.println("El simbolo es igual a multiplicacion");
            total3=numero3*numero4;
            System.out.println("El resultado de la multiplicacion es igual a: "+total3);
        }else if (simbolo=='/'){
            System.out.println("El simbolo es igual a division");
            if (numero4==0){
                System.out.println("No se puede realizar la operacion");
            }else{
            total3=numero3/numero4;
            System.out.println("El resultado de la division es igual a: "+total3);
            }
        }else{
            System.out.println("El simbolo ingresado fue erroneo");
        }
        break;
        case '3':
        System.out.println("Ha elegido Serie de Fibonacci");
        int interaciones=9;
        int numero5=0;
        int contador3=0;
        int numero6=1;
        int total4=0;
        int total5=0;
        System.out.println(total5);
        System.out.println(numero6);
        while(contador3<=interaciones){
           total5=numero5+numero6;
           contador3=contador3+1;
           numero5=numero6;
           numero6=total5;
           System.out.println(total5);
       }
       break;
       case '4':
       int num=4;
        if (num==0){
            System.out.println("El numero es igual a cero");
        }else if(num%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        break;
        default:
        System.out.println("Opcion ingresada erronea");
        }
    }
}