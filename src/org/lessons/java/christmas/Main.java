package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		List<String> listaDesideri = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
        	
            System.out.println("1 - Inserisci un nuovo desiderio");
            System.out.println("2 - Esci e stampa lista");
            
            int userVal = sc.nextInt();
            
            if(userVal < 1 || userVal > 2) {
        		System.err.println("Errore!");
        		continue;
        	}
            
            if (userVal == 2) {
                break;
            }
            
            sc.nextLine();
            System.out.print("Desiderio: ");
            String desiderio = sc.nextLine();
            
            listaDesideri.add(desiderio);

            System.out.println("Lunghezza della lista: " + listaDesideri.size());

        }

        System.out.println("Lista dei desideri:");
        
        for (String desiderio : listaDesideri) {
        	
            System.out.println(desiderio);
        }
	}
}
