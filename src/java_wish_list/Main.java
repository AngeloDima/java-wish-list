package java_wish_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> elencoDesideri = new ArrayList<>();
		Scanner s= new Scanner (System.in);
		String input;
		
		
		while (true) {
			System.out.print("Inserisci desiderio: ");
			input= s.nextLine();
			
			if(input.equals("stop")) {
				break;
			}
			
			elencoDesideri.add(input);
			System.out.println("Hai attualmente: " + elencoDesideri.size());

		}
		System.out.println("La tua lista contiene: " + elencoDesideri);
		s.close();
	}

}
