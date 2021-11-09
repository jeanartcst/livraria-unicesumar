package unicesumar.ae1;

import java.util.Scanner;

public class Cliente {
        public static int codigo;
        public String nome;
        public float telefone;
        public Endereco endereco;
       
    public static Cliente cadastrarCliente(Cliente cliente){
        /* Função para cadastrar cliente*/
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println(Utils.markLine());
        System.out.println("\t\tCADASTRO DO CLIENTE");
        System.out.println(Utils.markLine());
        try{
            
        codigo = Utils.gerarCodigo();
        
        
        
        System.out.println("Insira nome do cliente");
            cliente.nome = input.nextLine();
        System.out.println("Insira o telefone do cliente");
            cliente.telefone = Float.parseFloat(input.nextLine());
           
        System.out.println(Utils.markLine());
        
        Endereco endereco = new Endereco();  
        endereco.codigoCliente = codigo;   
        endereco.cadastrarEndereco(endereco);
            
        System.out.println("Cliente cadastrado com sucesso.\n seu código é: " + codigo);
        System.out.println(Utils.markLine());
        }
        catch (Exception e) {
            System.out.println(e + "\nEntrada invalida. Tente novamente.");

        }
        
        return cliente;
    }
    
    public static void listarCliente(Cliente cliente){
        /* Função para listar clientes cadastrados.*/
    }
}
