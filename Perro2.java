public class Perro2{
    public static void main (String args[]){

        Perro objetoPerro=new Perro("David",9,'M');
        int edadPerro;
        String nombrePerro;
        char sexoPerro;
        edadPerro=objetoPerro.retonarEdad();
        System.out.println("La edad del perro es "+edadPerro);
        nombrePerro=objetoPerro.retonarNombre();
        System.out.println("El nombre del perro es "+nombrePerro);
        sexoPerro=objetoPerro.retonarSexo();
        System.out.println("El sexo del perro es "+sexoPerro);
        objetoPerro.ladrar();
        System.out.println("Segundo perro");
        Perro objetoPerro2=new Perro("Fabian",2, 'H');
        edadPerro=objetoPerro2.retonarEdad();
        System.out.println("La edad del perro es "+edadPerro);
        nombrePerro=objetoPerro2.retonarNombre();
        System.out.println("El nombre del perro es "+nombrePerro);
        sexoPerro=objetoPerro2.retonarSexo();
        System.out.println("El sexo del perro es "+sexoPerro);
        objetoPerro.ladrar();
        System.out.println("Tercer perro");
        Perro objetoPerro3=new Perro("Juanca",8, 'M');
        edadPerro=objetoPerro3.retonarEdad();
        System.out.println("La edad del perro es "+edadPerro);
        nombrePerro=objetoPerro3.retonarNombre();
        System.out.println("El nombre del perro es "+nombrePerro);
        sexoPerro=objetoPerro3.retonarSexo();
        System.out.println("El sexo del perro es "+sexoPerro);
        objetoPerro.dormir();
        System.out.println("Cuarto perro");
        Perro objetoPerro4=new Perro("Eldrick",2, 'H');
        edadPerro=objetoPerro4.retonarEdad();
        System.out.println("La edad del perro es "+edadPerro);
        nombrePerro=objetoPerro4.retonarNombre();
        System.out.println("El nombre del perro es "+nombrePerro);
        sexoPerro=objetoPerro4.retonarSexo();
        System.out.println("El sexo del perro es "+sexoPerro);
        objetoPerro.comer();
    }

    
}