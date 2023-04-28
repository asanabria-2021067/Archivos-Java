public class Buscador{
	public static void main(String args[]){
		int arregloentero []={100,200,300,400,500};
        int buscado=400;
        for (int i:arregloentero){
            System.out.println(i);
            if (buscado==i){
                System.out.println ("El dato fue encontrado");
                break;
            }
        }

	}

}