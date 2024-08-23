package principal;

import java.util.ArrayList;
import java.util.List;

import entidade.Conta;
import entidade.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente("Negueba", 157, 0, 300);
		Conta d = new ContaCorrente("Julinho", 171, 0, 100);
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(d);
		lista.add(c);
		
		System.out.println(lista);
		
	}

}
