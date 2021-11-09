package unicesumar.ae1;

import java.util.Scanner;

public class Produto {
    public int codigoProduto;
    public String descricao;
    public double preco;
    public int quantidadeProduto;
    
    public static Produto cadastrarProduto(Produto produto){
        /* Função para cadastrar produto */
       Scanner input = new Scanner(System.in); 
        try{
        System.out.println(Utils.markLine());
        System.out.println("\t\tCADASTRO DO PRODUTO");
        System.out.println(Utils.markLine()); 
        
        System.out.println("Insira o código do produto");
            produto.codigoProduto = Integer.parseInt(input.nextLine());
        System.out.println("Insira a descrição resumida do produto");
            produto.descricao = input.nextLine();
        System.out.println("Insira o preço do produto. Ex.: 51.00 \nObserve que o separador é \".\"");
            produto.preco = Double.parseDouble(input.nextLine());
        } catch(Exception e){
            System.out.println(e + "\nAlgo deu errado, tente novamente.");
        }
        
        return produto;
    }
    
    public static void listarProduto(Produto produto){
        /* Função para listar produtos.*/
        
        System.out.println("os produtos disponiveis são: " + produto.codigoProduto);
    }
    
    public int selecionarProduto(Produto produto){
        /* Função para selecionar produtos.*/
                
        return codigoProduto;
        
    }
}
