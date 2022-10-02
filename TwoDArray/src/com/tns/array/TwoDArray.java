package com.tns.array;

import java.util.*;

public class TwoDArray {
	
	public static void main(String[] args) {
		int [][] p= {{1,2,3,4},{12,34,56,}};
		
		/*for(int[] s:p){
			for(int d:s){
			System.out.println(d);
			}
		}*/
		for(int i=0;i<=p.length;i++) {
			for(int j=0;j<=p.length;j++) 
			{
				System.out.println(p[i][j]);
			}
		}

		
			}
}
