package unicesumar.ae1;

public class Venda {
    public static int codigo;
    public static String cliente;
    public static String produto;
    public static double valor;
    public static int desconto;
  
    public static void venda(Venda venda){
        System.out.println("O código da venda é: " + codigo);
        
        System.out.println("O cliente é: " + cliente);
        
        System.out.println("O produto é: " + produto);
        
        System.out.println("O valor é: " + valorTotal(venda));
        
        
    }
    
    public static void listaVendas(Venda venda){
        /* Listar as vendas efetuadas */
    }
    
     public static double valorTotal(Venda venda){
         /* Calcular valor total do produto*/
        
        double totalDesconto = ((valor * desconto) / 100); 
        
        double valorTotal = (valor - totalDesconto);
         return valorTotal;
    } 
}
