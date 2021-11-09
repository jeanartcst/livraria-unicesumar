package unicesumar.ae1;

import java.util.Random;
public class Utils {
        public static int codigoCliente;
    
    public static int gerarCodigo(){
        if(codigoCliente != 0){
            System.out.println("Ocorreu um erro no cadastro. \nContate o admin do sistema");
        
        }
        else {
            Random aleatorio = new Random();
            codigoCliente = aleatorio.nextInt((999999 - 00000) + 1) + 11111;
        }
               
        return codigoCliente;
    }

    public static String markLine(){
        int x;
        String line = "=";
        for(x = 0; x < 100; x++){
            line = (line + "=");
        }
        return line;
    } 
}
