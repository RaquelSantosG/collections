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
			System.out.println("\n\t\tEstoque de Cal�ados");
			System.out.println("(1) Deseja adicionar modelos novos no estoque");
			System.out.println("(2) Deseja remover modelos novos no estoque");
			System.out.println("(3) Deseja atualizar modelos novos no estoque");
			System.out.println("(4) Mostrar todos os t�nis no estoque");
			System.out.println("(0) Deseja encerrar o programa");
			op = leia.nextInt();
		
           
		switch(op)
		{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o T�nis para adicionar ao estoque: ");
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
					System.out.println("\nEsse tenis n�o existe!!!");
				
				}
				System.out.println(estoque);

				break;
			case 3:
				leia.nextLine();
			System.out.println("\nDigite o T�nis que quer atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do T�nis que entrar� no lugar ");
			String novo = leia.nextLine();
			
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
				
			}
			else
			{
				System.out.println("\nT�nis n�o existe: ");
			}
			System.out.println(estoque);
			break;
			case 4:
				System.out.println("\nOs t�nis no estoque");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOp��o invalida!!!");
		}

	}while(op!=0);
	}
	
}
