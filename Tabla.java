public class Tabla{
    public static void main(String args[]){
       int tabla=2;
       int limite=10;
       int contador=1;
       int total=0;
       while(contador<=limite){
           total=tabla*contador;
           System.out.println(tabla+"*"+contador+ "=" +total);
           contador++;
       }
    }

}