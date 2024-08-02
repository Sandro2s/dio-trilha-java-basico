
import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
			try {
				System.out.println("Digite o primeiro parâmetro");
				int parametroUm = terminal.nextInt();
				
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = terminal.nextInt();
				terminal.close();

				contar(parametroUm,parametroDois);
				
			} catch (ParametrosInvalidosException e){
				System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
				
			} 
		}	
		static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
			if(parametroUm >= parametroDois){
				throw new ParametrosInvalidosException();
			}    
			    //For para impressão com base nos parametros.
				for (int i = parametroUm; i < parametroDois; i++){
					System.out.println(i);
		        }
	    }		
	}