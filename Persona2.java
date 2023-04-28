public class Persona2{
   public static void main (String args[]){
    Persona objetoPersona= new Persona ("Angel",16,"Sanabria");
    Persona objetoPersona2= new Persona ("David",16,"Quiñonez");
    Persona objetoPersona3= new Persona ("Jose",16,"Villeda");
    String nombrePersona;
    String apellidoPersona;
    int edadPersona;
    nombrePersona=objetoPersona.retonarNombre();
    System.out.println("+++++++++++++Primera Persona+++++++++++++");
    System.out.println("El nombre de la persona es: "+nombrePersona);
    System.out.println("El numero de letras que tiene el nombre es: "+nombrePersona.length());
    apellidoPersona=objetoPersona.retonarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
    System.out.println("El numero de letras que tiene el apellido es: "+apellidoPersona.length());
    edadPersona=objetoPersona.retonarEdad();
    System.out.println("La edad de la persona es: "+edadPersona);
    System.out.println("+++++++++++++Segunda Persona+++++++++++++");
    nombrePersona=objetoPersona2.retonarNombre();
    System.out.println("El nombre de la persona es: "+nombrePersona);
    System.out.println("El numero de letras que tiene el nombre es: "+nombrePersona.length());
    apellidoPersona=objetoPersona2.retonarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
    System.out.println("El numero de letras que tiene el apellido es: "+apellidoPersona.length());
    edadPersona=objetoPersona2.retonarEdad();
    System.out.println("La edad de la persona es: "+edadPersona);
    System.out.println("+++++++++++++Tercera Persona+++++++++++++");
    nombrePersona=objetoPersona3.retonarNombre();
    System.out.println("El nombre de la persona es: "+nombrePersona);
    System.out.println("El numero de letras que tiene el nombre es: "+nombrePersona.length());
    apellidoPersona=objetoPersona3.retonarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
    System.out.println("El numero de letras que tiene el apellido es: "+apellidoPersona.length());
    edadPersona=objetoPersona3.retonarEdad();
    System.out.println("La edad de la persona es: "+edadPersona);
    objetoPersona3.obtenerNombre("Josue");
    System.out.println("El nombre modificado es: " +objetoPersona3.obtenerNombre);

   }    
    
}