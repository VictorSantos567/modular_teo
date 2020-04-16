package main;

import java.time.LocalDateTime;
import java.util.Scanner;

import comprador.Comprador;
import ingresso.Ingresso;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
	public static Ingresso novoEvento = new Ingresso();
	public static Comprador comprador = new Comprador();
    
	public static void main(String[] args) {
		int opcao;

        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1: cadastrarEvento();
                break;
                
            case 2: comprarIngresso();
            break;
            
            case 3: imprimirIngresso();
            break;
                
            
            default:
                System.out.println("Op��o inv�lida.");
            }
        } while(opcao != 0);
        
        
    }
	
    public static void menu(){
        System.out.println("\n ------- Menu de funcionalidades -------");
        System.out.println("1- Criar evento.");
        System.out.println("2- Compra Ingresso.");
        System.out.println("3- Imprimir Ingresso.");
        System.out.println("0- Sair.");
        System.out.println("Opcao:");
    }
    
    public static void cadastrarEvento(){
    	entrada.nextLine();
        System.out.println("Voc� entrou no m�todo Cadastrar Evento.");
        System.out.println("Entre com o nome do evento:");
        novoEvento.setnomeEvento(entrada.nextLine());
        System.out.println("Entre com o valor do evento:");
        novoEvento.setValor(entrada.nextFloat());
        
        System.out.println("Evento criado com sucesso! Nome:" + novoEvento.getnomeEvento() + " Valor: "+ novoEvento.getValor());
        
    }
    
    public static void comprarIngresso(){
    	entrada.nextLine();
        System.out.println("Voc� entrou no m�todo Comprar Ingresso.");
        System.out.println("Voc� deseja comprar ingresso para o evento: "+ novoEvento.getnomeEvento() + " no Valor: "+ novoEvento.getValor());
        System.out.println("Se SIM digite 1, se NAO dige 2.");
        int opc = entrada.nextInt();
        if (opc == 2) {
        	return;
        }
        else {
        	
        	entrada.nextLine();
        	System.out.println("Entre com o nome completo do Comprador:");
        	comprador.setNomeCompleto(entrada.nextLine());
        	System.out.println("Entre com o RG do Comprador:");
        	comprador.setRg(entrada.nextLine());
        	
        }
        
        novoEvento.setData(LocalDateTime.now());
        System.out.println("Ingresso Comprado com sucesso!");
    }
    
    public static void imprimirIngresso(){
    	
    	System.out.println(novoEvento.imprimirIngresso());
    	System.out.println(comprador.imprimirComprador());

    }
  
    
   
}
