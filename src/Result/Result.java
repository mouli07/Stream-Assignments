package Result;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Result {
	public static void main(String[] args) throws IOException {

		//writes to boy.txt
		write();
		//reads from boy.txt
		read();
	}

	private static void read() throws IOException {

		FileReader file = new FileReader("boy.txt");
		BufferedReader reader = new BufferedReader(file);
		ArrayList<Integer> list = new ArrayList<>();
		//reading each integer
		for (int i = 0; i < 100; i++) {
			list.add(Integer.valueOf(reader.readLine()));
		}
		reader.close();
		//distinct element then sorting
		list.stream().distinct().sorted().forEach(System.out::println);
	}

	private static void write() throws IOException {

		FileWriter file = new FileWriter("boy.txt");
		BufferedWriter writer = new BufferedWriter(file);
		
		//generating random value
		for (int i = 0; i < 100; i++) {
			String x = String.valueOf(((int) ((Math.random() * 1000) % 100) + 1));
			writer.write(x + "\r\n");
		}
		writer.close();
	}
}
