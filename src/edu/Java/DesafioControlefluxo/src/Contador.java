import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
		
		try {
        	if(parametroDois<parametroUm){
                terminal.close();
                throw new ParametrosInvalidosException();   
            }
			contar(parametroUm, parametroDois);
            
		
		}catch (ParametrosInvalidosException e) {
			
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        int contagem = parametroDois - parametroUm;

        try {
            for(int n=1; n<=contagem; n++){
                System.out.println("imprimindo o número: "+ n);
            }
        } catch (Exception ParametrosInvalidosException) {
            
        }
		
	}
    static class ParametrosInvalidosException extends Exception{

        public ParametrosInvalidosException(){            
           super("o segundo parametro deve ser maior que o primeiro!");
        }
    }
}

