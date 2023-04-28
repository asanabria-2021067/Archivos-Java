public class Continuar{
	public static void main(String args[]){
		int buscado=3;
		int veces=0;
		int arr[]={3,276,3,134,3,85,31};
		
		for(int i:arr){
			if(buscado!=i){
				continue;
                System.out.println("es verdadero");
				/*forzamos la siguiente iteracion
				omitiendo el codigo debajo*/
			}
			veces++;
		}
		System.out.println("El numero "+buscado+" se repite "+veces+" vez(ces)");
	}
}
