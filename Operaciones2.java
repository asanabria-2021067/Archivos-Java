public class Operaciones2{
    int total;
    public int suma(int numero, int numero2){
    total=numero+numero2;
    return total;
    }
    public int resta(int numero, int numero2){
    total=numero-numero2;
    return total;
    }
    public int multiplicacion(int numero, int numero2){
    total=numero*numero2;
    return total;
    }
    public int division(int numero, int numero2){
    if (numero2==0){
    System.out.println("Dato ingresado erroneo");
    }else{
    total=numero/numero2;
    }
    return total;
    }

}