import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		while(opcao != 2) {
			float peso;
			 float altura;
				System.out.print(" Informe seu peso: ");
				peso = scanner.nextFloat();
				System.out.print(" Informe sua altura:");
				altura = scanner.nextFloat();
				
				float imc;
				imc =  peso/(altura * altura);
					System.out.println(" Seu imc é: " + imc);
				
				if(imc < 18.5){
					System.out.println("Você está abaixo do peso ");
				} 
					else if (imc >= 18.5 && imc <= 24.9) {
					System.out.println("Seu peso está normal !!");
				}
					else if (imc >= 25 && imc <= 29.9) {
					System.out.println("Você está com excesso de peso!");
				}
					else if (imc >=30 && imc <= 34.9) {
					System.out.println("Você está com obesidade Grau 1!");
				}
					else if (imc >=35 && imc <= 39.9) {
					System.out.println("Você está com obesidade Grau 2!");
				
				}
					else if (imc >= 40) {
					System.out.println("Você está com obesidade Grau 3!");
										
				}
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("|        MENU          |");
   	   			System.out.println("|OPÇÕES:               |");
   	   			System.out.println("|1. Executar novamente |");
   	   			System.out.println("|2. Sair          ");
   	   			System.out.print  ("Selecione uma opção:");
   	   			opcao = scanner.nextInt();
   	   		
   	   			if (opcao <2) {
   		    	switch (opcao) {
   		   		case 1:
   		   			System.out.println("Opção 1 selecionada");
   		   			break;
   		   		case 2:
   		   			System.out.println("Opação 2 Selecionada");
   		   			break;
   		       } 
   		    }         
   		}
	}	
}