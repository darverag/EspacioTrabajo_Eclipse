package com.desafiolatam.f20220108Repaso;

import java.util.Scanner;

public class MainPatronesSolucion {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// n ; 
			System.out.println("Ingrese numero");
			int n = sc.nextInt();
			
			//*.*.*.*.*.*.*
			for (int i = 0; i < n; i++) {
				if(i%2==0) {
					System.out.printf("*");
				}else {
					System.out.printf(".");
				}
			}
			System.out.println();
			
			
			//12341234
			for(int i =1; i<=n; i++) {
				//1 2  3  4  -> 0
				//5%4== 1
				//6%4== 2
				//7%4== 3
				//8%4== 0 -> 4
				if(i > 4) {
					if(i%4==1) {
						System.out.print(1);
						}else if(i%4==2) {
							System.out.print(2);
							}else if(i%4==3) {
								System.out.print(3);
								}else if(i%4==0) {
									System.out.print(4);
									}
					}else {
						//1%4==0
						//2%4==0
						//3%4==0
						//4%4==0
						System.out.print(i);
				}
			}
	
			
			System.out.println();
			
			// ||*||*
			for (int i = 1; i <=n; i++) {
				if(i%3==0) {
					System.out.printf("*");
				}else {
					System.out.printf("|");
				}
				
			}
		}

	}
