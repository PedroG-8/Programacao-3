package classes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class IOStream
{
	public static void main(String[] args) throws IOException 
	{
		// Integer Stream
		System.out.println("---> Basic Integer Stream <---");
		IntStream
			.range(1, 10) 	// Numeros de 1 a 10, excluindo o 10
			.forEach(System.out::print);
		System.out.println();
		
		// Integer Stream with skip
		System.out.println("\n---> Skip the first 5 elements <---");
		IntStream
			.range(1, 10)
			.skip(5)	// Ignora os 5 primeiros numeros (1, 2, 3, 4, 5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		
		// Integer Stream with sum
		System.out.println("---> Sum of the elemens <---");
		System.out.println(
		IntStream
			.range(1, 5)
			.sum());
		System.out.println();
			
		// Integer Stream sorted and findFirst
		System.out.println("---> Sorted and findFirst Stream <---");
		Stream.of("Ana", "Amanda", "Albertina")
			.sorted()	// Sorteia por ordem alfabética (l < m < n), logo é Albertina o primeiro elemento
			.findFirst()	// Encontra o primeiro elemento depois de sorteado
			.ifPresent(System.out::println);
		
		// Stream from Array, sort, filter and print
		System.out.println("\n---> Stream from array, prints names started with 'S' sorted <---");
		String[] names = {"Ana", "Bob", "Catarina", "Pedro", "Sara", "Samuel", "Diogo", "Susana"};
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))	// Filtramos items que começem com 'S'
			.sorted()	// Sorteamos
			.forEach(System.out::println);	// For each item that we sorted we print
		
		// Average of squares of an int array
		System.out.println("\n---> Average of squares of the int array <---");
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)	// Mapeamos cada inteiro para o seu quadrado
			.average()	 	// Média de todos os elementos
			.ifPresent(System.out::println);	// Se presente, damos print ao resultado
		
		// Stream from List, filter and print
		System.out.println("\n---> Stream from list, print names started with 'a' sorted <---");
		List<String> people = Arrays.asList("ana", "Bob", "Catarina", "Pedro", "Sara", "Samuel", "Diogo", "amanda");
		people
			.stream()	// Inicia a stream de nomes
			.map(String::toLowerCase)	// Mapeamos tudo para letras minuscualas
			.filter(x -> x.startsWith("a"))	// Filtramos os nomes que começam com 'a'
			.forEach(System.out::println);
		
		// Stream rows from text file, sort, filter and print
		System.out.println("\n---> Stream rows from text files <---");
		Stream<String> bands = Files.lines(Paths.get("src/classes/bands.txt"));
		bands
			.sorted()
			.filter(x -> x.length() > 13) 	// Filtra apenas as bandas com mais de 13 carateres
			.forEach(System.out::println);
		bands.close();
		
		// Stream rows from text file and save to List
		System.out.println("\n---> Stream rows from text files and save to List <---");
		List<String> bands2 = Files.lines(Paths.get("src/classes/bands.txt"))
			.filter(x -> x.contains("ins")) 	// Filtramos as bandas que contêm "ins"
			.collect(Collectors.toList());		// Adicionamos essas bandas a uma lista
		bands2.forEach(x -> System.out.println(x));		// Damos print aos items que contêm "ins"
		
		// Stream rows from CSV file and count
		System.out.println("\n---> Stream rows from CSV files and count good rows <---");
		Stream<String> rows1 = Files.lines(Paths.get("src/classes/data.txt"));	// Stream of rows
		int rowCount = (int)rows1	
			.map(x -> x.split(","))		// Damos split ás virgulas
			.filter(x -> x.length == 3)	// Filtramos as que têm 3 items no array
			.count();					// Contamos as linhas boas
		System.out.println(rowCount + " rows.");
		rows1.close();
		
		// Stream rows from CSV file, parse data from rows
		System.out.println("\n---> Stream rows from CSV files and parse data <---");
		Stream<String> rows2 = Files.lines(Paths.get("src/classes/data.txt"));	// Stream of rows
		rows2
			.map(x -> x.split(","))		// Damos split ás virgulas
			.filter(x -> x.length == 3)	// Filtramos as que têm 3 items no array
			.filter(x -> Integer.parseInt(x[1]) > 15)	// Filtramos as linhas cujo item 1 é maior que 15
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows2.close();
		
		// Stream rows from CSV file, store fields in HashMap
		System.out.println("\n---> Stream rows from CSV files and store them in HashMap <---");
		Stream<String> rows3 = Files.lines(Paths.get("src/classes/data.txt"));	// Stream of rows
		Map<String, Integer> map = new HashMap<>();
		map = rows3
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(		
				x -> x[0],						// Retorna o primeiro item nesse array
				x -> Integer.parseInt(x[1])));	// Retorna o segundo item nesse array
		rows3.close();
		for(String key : map.keySet())
		{
			System.out.println(key + " " + map.get(key));
		}
		
		// Reduction - sum
		System.out.println("\n---> Reduction - sum <---");
		double total = Stream.of(7.3, 1.5, 4.8)				// 0.0 is the starting point
			.reduce(0.0, (Double a, Double b) -> a + b);	// a is the running total
		System.out.println("Total = " + total);				// b is the new item
						
		// Reduction - summary statistics
		System.out.println("\n---> Reduction - summary statistics <---");
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
			.summaryStatistics();
		System.out.println(summary);
	}
}
