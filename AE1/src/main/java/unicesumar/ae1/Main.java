package unicesumar.ae1;

import java.util.Scanner;

public class Main {
    
    
    
    
    public static void main(String[] args){    
        /* Prototipação */
    Cliente cliente = new Cliente();
    Produto produtos = new Produto();
    Venda vendas = new Venda();
        
    /* Função principal, menu do sistema.*/
    Scanner input = new Scanner(System.in); 
    int escolha;
    do {
        System.out.println("Menu do sistema\n1 - Cadastrar cliente.\n2 - Cadastrar produto. \n3 - Venda. \n4 - Listar produtos \n5 - Sair");
        System.out.println("Escolha: \"1\", \"2\", \"3\" ou \"4\"");
        escolha = input.nextInt();
        
        
        switch (escolha)
        {
            case 1:
                cliente.cadastrarCliente(cliente);
                break;
            case 2:        
                
                produtos.cadastrarProduto(produtos);
                break;
            case 3:
                vendas.venda(vendas);
                break;
            case 4:
                produtos.listarProduto(produtos);
                break;
            case 5: 
                //Sair
                break;    
            default:
                System.out.println("Escolha no menu abaixo e tente novamente...");
        }   
    } while (escolha != 4);
       
    }
}
