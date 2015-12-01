import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by luna-aleixos on 01.12.2015.
 *
 * En esta clase se crea el método de introducción de datos del tipo String
 * Su conversión a otros valores se realiza en la clase de retorno.
 * Solicita un String cadena para utilizarlo comno texto de enunciado
 *
 */
public class IntroducirDatos {

    public static String ValorIntroducido (String cadena) {

        BufferedReader stdint = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(cadena);
        System.out.flush();

        //Controla el error

        try {
            String valorIntroducido = stdint.readLine();

            if (valorIntroducido.isEmpty()) {
                return "DATO INCORRECTO";
            } else {
                return valorIntroducido;
            }

        } catch (Exception e) {
            return "ERROR";
        }
    }

    public static String ValorConCorreccion (String cadena) {
        //Crea un bucle hasta que la información es correcta
        String salida;

        do {
            salida = ValorIntroducido(cadena);
            if (salida.equals("DATO INCORRECTO")){
                System.out.println("El valor introducido no es válido.\nSe le solicitará el valor de nuevo.");
            }
        } while (salida.equals("DATO INCORRECTO"));

        return salida;
    }

}
