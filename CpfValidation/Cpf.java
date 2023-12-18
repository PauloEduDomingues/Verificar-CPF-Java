public class Cpf {
	 private String cpf;
	    private int dig1, dig2;
	    public Cpf(String cpf){
	        this.cpf = cpf;
	        dig1 = Integer.parseInt(cpf.substring(9, 10));
	        dig2 = Integer.parseInt(cpf.substring(10, 11));
	    }
	    public String getCpf(){
	        return cpf;
	    }
	    public void verificarCpf(){
	        if(verificarDig1() && verificarDig2())
	            System.out.println("Tudo certo, o CPF tende a ser verdadeiro!!!");
	        else
	            System.out.println("Um dos digitos indentificadores esta errado, portanto CPF FALSO!!!");
	    }
	    private boolean verificarDig1(){
	        int verificador0 = 0;
		    int[] peso = {10, 9, 8, 7, 6, 5, 4, 3, 2};
	        for(int i=0; i<=8; i++){
	            String num = cpf.substring(i, i+1);
	            int valor = peso[i] * Integer.parseInt(num);
	            verificador0 = verificador0 + valor;
	        }
	        int verificador = 11 - verificador0%11;
	        if(verificador == 10 || verificador == 11){
	            verificador = 0;
	            System.out.println("Teste");
	            if(verificador == dig1){
	                System.out.println("CORRETO... O PRIMEIRO DIGITO ESTA CORRETO O CPF PODE SER VERDADEIRO");
	                return true;
	            }
	        }
	        else if(verificador == dig1){
	            System.out.println("CORRETO... O PRIMEIRO DIGITO ESTA CORRETO O CPF PODE SER VERDADEIRO");;
	            return true;
	        }
	        else{
	            System.out.println("CPF FALSO!");
	            return false;
	        }
	        return true;
	    }
	    private boolean verificarDig2(){
	        int verificador0 = 0;
		    int[] peso = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
	        for(int i=0; i<=9; i++){
	            String num = cpf.substring(i, i+1);
	            int valor = peso[i] * Integer.parseInt(num);
	            verificador0 = verificador0 + valor;
	        }
	        int verificador = 11 - verificador0%11;
	        if(verificador == 10 || verificador == 11){
	            verificador = 0;
	            if(verificador == dig2){
	                System.out.println("CORRETO... O SEGUNDO DIGITO ESTA CORRETO O CPF PODE SER VERDADEIRO");
	                return true;
	            }
	        }
	        else if(verificador == dig2){
	            System.out.println("CORRETO... O SEGUNDO DIGITO ESTA CORRETO O CPF PODE SER VERDADEIRO");;
	            return true;
	        }
	        else{
	            System.out.println("CPF FALSO!");
	            return false;
	        }
	        return true;
	    }
}
