package org.gentilei.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.gentilei.array.metodiStaticiArray;


public class ShiftArray {

	
	public static int[] string2array(String s) {
		int dim = s.length()/2 + 1;
		int a[] = new int[dim];
		
		// Riempimento
		int j = 0; // indice dell'array a
		
		/*
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				a[j] = Integer.parseInt(s.charAt(i)+"");
				j++;
			}
		}
		*/
		
		s = s.replace(" ", "");
		for(int i = 0; i < s.length(); i++) {
			a[i] = Integer.parseInt(s.charAt(i)+"");
		}
		
		return a;
		
	}
	
	
	public static String array2string(int a[]) {
		String s="[";
		
		for(int i = 0; i< a.length-1; i++) {
			s += a[i] +", ";
		}
		s+=a[a.length-1] + "]";
		
		return s;
		
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader fileBuff = new BufferedReader(new FileReader("array.txt"));
		
		int dim = Integer.parseInt(fileBuff.readLine());
		
		int v[] = new int[dim];
		
		v = string2array(fileBuff.readLine());
		
		//metodiStaticiArray.stampaArray(v);
		
		// Shift a sinistra
		v = metodiStaticiArray.shifL(v, 0);
		System.out.println();
		//metodiStaticiArray.stampaArray(v); // Stampa su schermo
		
		PrintWriter file = new PrintWriter(new FileWriter("arrayOut.txt"));
		
		file.println(array2string(v));
		
		file.close();
		
	}

}
