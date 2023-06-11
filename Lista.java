package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());
		list.remove(0);
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Comando removeIf = 'M'");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Comando indexOf = ''Bob'' " + list.indexOf("Bob"));
		System.out.println("Comando indexOf = ''Bob'' " + list.indexOf("Marco"));

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Comando stream().filter = ");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Nova lista list2 para filtrar nova lista através de: stream().filter = charAt(2)=='l'");
		List<String> list2 = new ArrayList<>();

		list2.add("Salame");
		list2.add("Salsicha");
		list2.add("Sanduiche");
		list2.add("Salamiinho");
		list2.add("Pão");
		list2.add("Tomate");
		list2.add("Cebola");
		list2.add("Mostarda");
		list2.add(1, "torresmo");

		List<String> result2 = list2.stream().filter(x -> x.charAt(2) == 'l').collect(Collectors.toList());

		for (String string : result2) {

			System.out.println(string);
		}

		System.out.println();
		System.out.println("Usando o stream().filter = charAt(0)=='T' para encontrar o primeiro elemento da lista com T" );
	
		String name = list2.stream().filter(x->x.charAt(0)=='t').findFirst().orElse(null);
		
		System.out.println(name);
	
	
	
	
	
	
	
	
	}

}
