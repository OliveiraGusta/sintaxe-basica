package sintaxe_variaveis_e_flux;

public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0, total = 0;
		
		while(contador <= 10) {
			total += contador;			
			contador++;
		}
		
		System.out.println(total);
	}
}
