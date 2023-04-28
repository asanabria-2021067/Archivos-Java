public class Interaciones{
	public static void main(String args[]){
		int num=2;
		int iteraciones=3;
		
		System.out.println("WHILE");
		while(num >= 0){	
			iteraciones++;
			num--;
		}
		System.out.println("Iteraciones: "+iteraciones);
		System.out.println("DO-WHILE");
		do{
			iteraciones++;
			num--;
		}while(num>=0);
		System.out.println("Iteraciones: "+iteraciones);
	}
}