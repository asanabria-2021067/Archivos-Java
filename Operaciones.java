public class Operaciones{
    public static void main (String args[]){
    int totalsuma;
    int totalresta;
    int totalmultiplicacion;
    int totaldivision;
    char simbolo='/';
    Operaciones2 op=new Operaciones2();
System.out.println("1....... Para suma");
System.out.println("2....... Para resta");
System.out.println("3....... Para multiplicacion");
System.out.println("4....... Para division");
switch (simbolo) {
    case '+':
    totalsuma=op.suma(1,5);
    System.out.println("El resultado de la operacion es "+totalsuma);
    break;
    case '-':
    totalresta=op.resta(9,10);
    System.out.println("El resultado de la operacion es "+totalresta);
    break;
    case '*':
    totalmultiplicacion=op.multiplicacion(5,5); 
    System.out.println("El resultado de la operacion es "+totalmultiplicacion);
    break;
    case '/':
    totaldivision=op.division(2,0);
    System.out.println("El resultado de la operacion es "+totaldivision);
    break;
    default:
    System.out.println("Operacion invalida");
        break;
}
    }
}