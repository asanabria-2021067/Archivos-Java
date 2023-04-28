public class Persona{
    String nombre;
    String apellido;
    int edad;
  
    
    public Persona(String n, int e, String a){
    nombre=n;
    edad= e;
    apellido=a;
    
}
    public void obtenerNombre(String n){
        nombre=n;
    }
    public void obtenerApellido(String a){
        apellido=a;
    }
    public void obtenerEdad(int e){
        edad=e;
    }
    


    public int retonarEdad(){
        return edad;

    }
    public String retonarNombre(){
        return nombre;

    }
    public String retonarApellido(){
        return apellido;

    }
}
    

