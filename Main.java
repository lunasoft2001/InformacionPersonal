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
        String nombre = IntroducirDatos.ValorIntroducido("Introduzca su nombre: ");
        String apellido = IntroducirDatos.ValorIntroducido("Introduzca su apellido: ");
        String sexo = IntroducirDatos.ValorIntroducido("Es usted hombre o mujer?: ");
        String direccion = IntroducirDatos.ValorIntroducido("Introduzca su direccion: ");
        String telefono = IntroducirDatos.ValorIntroducido("Intruduzca su número de teléfono: ");
        String edadString = IntroducirDatos.ValorIntroducido("Intruduzca su edad: ");
        String estadoCivil = IntroducirDatos.ValorIntroducido("Está usted casado? ");


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
        System.out.println("Casado? : " + estadoCivil);

        System.out.println("------------------\n");



    }
}
