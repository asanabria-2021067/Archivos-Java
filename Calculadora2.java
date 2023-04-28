public class Calculadora2{
    public static void main(String args[]){
       int numero=10;
       char signo='/';
       int numero2=2;
       int total=0;
       System.out.println("Ingrese signo + para realizar una suma");
       System.out.println("Ingrese signo - para realizar una resta");
       System.out.println("Ingrese signo * para realizar una multiplicacion");
       System.out.println("Ingrese signo / para realizar una division");
       switch (signo){
            case '+': 
                System.out.println("Ha escogido suma");
                total=numero+numero2;
                System.out.println("El resultado de la suma es: "+total);
                break;
            case '-':
                System.out.println("Ha escogido resta");
                total=numero-numero2;
                System.out.println("El resultado de la resta es: "+total);
                break;
            case '*':
                System.out.println("Ha escogido multiplicacion");
                total=numero*numero2;
                System.out.println("El resultado de la multiplicacion es: "+total);
                break;    
            case '/':
                System.out.println("Ha escogido Division");
                if (numero2==0){
                System.out.println("No se puede realizar la operacion");
                }else{
                total=numero/numero2;
                System.out.println("El resultado de la division es: "+total);
                }
                break;
            default:
                System.out.println("Valor ingresado erroneo");
                
            }
    }
}