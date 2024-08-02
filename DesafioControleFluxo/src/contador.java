
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

				if(parametroUm >= parametroDois){
					throw new ParametrosInvalidosException();

				}
				System.out.println("######## Incio de impressãao ############################");
				for (int i = parametroUm; i < parametroDois; i++){
					System.out.println(i);
				}
			} catch (ParametrosInvalidosException e){
				System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
				
			} 
		}			
	}