package org.gentilei.array;

public class metodiStaticiArray {
	
	public static void stampaArray(int[] v) {
		System.out.print("[");
		for(int i = 0; i < v.length-1; i++) {
			System.out.print(v[i] + ", ");
		}
		
		System.out.print(v[v.length-1]+ "]");
	}
	
	public static int[] shifL(int v[], int bit) {
		/*
		v[0] = v[1];
		v[1] = v[2];
		...
		v[v.length-2]=v[v.length-1]
		*/
		for(int i=0; i < v.length-1;i++) {
			v[i] = v[i+1];
		}
		v[v.length-1] = bit;
		return v;
	}

}
