public class App {

    public static void main(String[] args) {

        char miLetra = 0x0021;
        byte bInf = 127;

        int miNumero = 1;

        System.out.println(miLetra);
        System.out.println(miNumero);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println( (int) Character.MAX_VALUE );

        String miString = new String(", en la clase de PrograII \"Esto esta genial\" ");

        System.out.println( "Hola este es un ejemplo de una cadena de caracteres concatenadas de manera automatica" +  miString );
        System.out.println( 6+3 );
	    System.out.println( 6+6 );

        //el metodo println o print, como funcion opera mediante algo q se llama sobrecarga o abstraccion.


    }

}
