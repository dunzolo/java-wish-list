package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Set<Integer> mySet = new HashSet<>();
		
		//continuerà a fare il metodo while finchè non ci saranno 5 numeri diversi
		while (mySet.size() < 5) {
			int num = rnd.nextInt(2, 13);
			mySet.add(num);
        }

        System.out.println("Numeri generati: " + mySet);
	}
}
