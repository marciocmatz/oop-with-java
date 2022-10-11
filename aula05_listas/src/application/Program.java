package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// Adicionar elementos
		list.add("Maria");
		list.add("Ana");
		list.add("Lucia");
		list.add("Marcio");
		
		// Adicionar elemnto em posição
		list.add(2, "Lucas");
		
		// Tamanho da lista
		System.out.println(list.size());
		
		// Remover da lista - as duas formas são válidas
		list.remove(1);
		list.remove("Maria");
		
		
		// Remover com predicato
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		// Index
		System.out.println(list.indexOf("Lucas"));
		
		
		for (String x: list) {
			System.out.println(x);
		}

	}

}
