/* Ejercicio para Rosina de introducción de datos personales
    con comprobación de los datos.
    Datos a introducir:
    - Nombre
    - Apellidos
    - Dirección
    - Teléfono
    - Edad
    - Estado civil
    -------------------------
    Autor: JUAN JOSE LUNA
    -------------------------
 */


public class Main {

    public static void main(String[] args) {

        //Cabecera de prerentación
        System.out.println("------------------\n------------------");
        System.out.println(" INTRODUCIR DATOS");
        System.out.println("------------------\n");

        //Declaramos las variables

        String nombre = IntroducirDatos.ValorConCorreccion("Introduzca su nombre: ");
        String apellido = IntroducirDatos.ValorConCorreccion("Introduzca su apellido: ");
        String sexo = IntroducirDatos.ValorConCorreccion("Es usted hombre o mujer?: ");

        //Diferencia el sexo para que se escriba correctamente en etado Civil
        String sufSexo = "a";
        if (sexo.equals("Hombre") || sexo.equals("HOMBRE") || sexo.equals("hombre")){
            sufSexo = "o";
        }


        String direccion = IntroducirDatos.ValorConCorreccion("Introduzca su direccion: ");
        String telefono = IntroducirDatos.ValorConCorreccion("Introduzca su número de teléfono: ");
        String edadString = IntroducirDatos.ValorConCorreccion("Introduzca su edad: ");
        String estadoCivil = IntroducirDatos.ValorConCorreccion("Está usted casad" + sufSexo +"? ");


        //Comprobación de la edad

        int edadInt = 0;

        try {
            edadInt = Integer.parseInt(edadString);

            if (edadInt <= 0) {
                edadString = "DEMASIADO JOVEN";
            } else if (edadInt>=100){
                edadString = "DEMASIADO VIEJO";
            }


        } catch (NumberFormatException e) {
            edadString = "DATO INCORRECTO";
        }

        //Mostrar resultados

        System.out.println("------------------\n------------------");
        System.out.println(" DATOS PERSONALES");
        System.out.println("------------------\n");

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edadString);
        System.out.println("Casad" + sufSexo +": " + estadoCivil);

        System.out.println("------------------\n");



    }
}
