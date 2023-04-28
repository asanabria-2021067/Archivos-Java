public class Fibonacci{
    public static void main(String args[]){
       int interaciones=9;
       int numero=0;
       int contador=0;
       int numero2=1;
       int total=0;
       int total2=0;
       System.out.println(total2);
       System.out.println(numero2);
       while(contador<=interaciones){
           total2=numero+numero2;
           contador=contador+1;
           numero=numero2;
           numero2=total2;
           System.out.println(total2);
       }
    }

}