import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
	        System.out.println(("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"));
	        System.out.print("Digite seu Cpf: ");
	        String cpf = sc.next();
	        Cpf cp = new Cpf(cpf);
	        cp.verificarCpf();
	        if(cpf == "sair") {
	        	sc.close();
	        	break;
	        }
	    }
		
	}

}
