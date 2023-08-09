import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Persona persona = new Persona();
      persona.setNombre("juan");
      persona.setEdad(30);
      System.out.println("Nombre : " + persona.getNombre());
      System.out.println("edad : " + persona.getEdad());
      Perro perro = new Perro();
      perro.setNombre("roky");
      System.out.println("mi perro se llama : " + perro.getNombre());
      int entero = 1245678 ;

      System.out.println("numero entero : "+ entero );

      double decimal = 3.45;
      System.out.println("decimal :"+ decimal);
      
      char caracter ='a';
      System.out.println("caracter : "+ caracter);
      boolean desicion = false ;
      System.out.println("desicion :"+desicion);
      Integer numero = null ;
      System.out.println(numero );
      
      String palabra = "hola que tal ?";
      System.out.println(palabra);

      Scanner entrada = new Scanner(System.in);

      int numero2 ; 

      System.out.println("Digite un numero : ");

      numero2 = entrada.nextInt();

      System.out.println("el numero es :" +numero2);

    } 


}
