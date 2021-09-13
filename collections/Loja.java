package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque =new ArrayList();
		
		do
		{
			System.out.println("\n\t\tEstoque de Calçados");
			System.out.println("(1) Deseja adicionar modelos novos no estoque");
			System.out.println("(2) Deseja remover modelos novos no estoque");
			System.out.println("(3) Deseja atualizar modelos novos no estoque");
			System.out.println("(4) Mostrar todos os tênis no estoque");
			System.out.println("(0) Deseja encerrar o programa");
			op = leia.nextInt();
		
           
		switch(op)
		{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o Tênis para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o tenis que desejar remover no estoque: ");
				String produtor = leia.nextLine();
				if(estoque.remove(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nEsse tenis não existe!!!");
				
				}
				System.out.println(estoque);

				break;
			case 3:
				leia.nextLine();
			System.out.println("\nDigite o Tênis que quer atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do Tênis que entrará no lugar ");
			String novo = leia.nextLine();
			
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
				
			}
			else
			{
				System.out.println("\nTênis não existe: ");
			}
			System.out.println(estoque);
			break;
			case 4:
				System.out.println("\nOs tênis no estoque");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOpção invalida!!!");
		}

	}while(op!=0);
	}
	
}
