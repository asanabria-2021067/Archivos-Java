public class Principal2{
    public static void main(String args[]){
  Persona3 persona1=new Persona("Juan", "Ortiz", 18);
  Persona3 persona2=new Persona("Manuel", "Rodriguez", 14);
  Persona3 persona3=new Persona("Angel", "Sanabria", 16);

  String nombre;
  String apellido;
  int edad;
  if (edad>=18){
  System.out.println("Es mayor de edad");
}else{
    System.out.println("Es menor de edad");
}
  nombre=persona1.retornarNombre();
  apellido=persona1.retornarApellido();
  edad=persona1.retornarEdad();
  System.out.println("El nombre de la persona 1 es "+persona1.retornarNombre);
  System.out.println("El apellido de la persona 1 es "+persona1.retornarApellido);
  System.out.println("La edad de la persona 1 es "+persona1.retornarEdad);
  nombre=persona2.retornarNombre();
  apellido=persona2.retornarApellido();
  edad=persona2.retornarEdad();
  System.out.println("El nombre de la persona 2 es "+persona2.retornarNombre);
  System.out.println("El apellido de la persona 2 es "+persona2.retornarApellido);
  System.out.println("La edad de la persona 2 es "+persona2.retornarEdad);
  nombre=persona3.retornarNombre();
  apellido=persona3.retornarApellido();
  edad=persona3.retornarEdad();
  System.out.println("El nombre de la persona 3 es "+persona3.retornarNombre);
  System.out.println("El apellido de la persona 3 es "+persona3.retornarApellido);
  System.out.println("La edad de la persona 3 es "+persona3.retornarEdad);

    }


}


