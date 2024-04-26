//calculo de valor futuro (matematica financeira)

package br.edu.senaisp;

import java.util.Scanner;

public class MatFin {

	public static void main(String[] args) {
		
		  try (Scanner leitorzinho = new Scanner(System.in)) {
			System.out.println("Cálculo de valor futuro:");
			  System.out.println("-----------------------------");
			
			  System.out.println("digite o valor presente em UM:");
			  float vp = leitorzinho.nextInt();
			  
			  System.out.println("digite a taxa em porcentagem (%):");
			  float tax = leitorzinho.nextInt();
			  
			  System.out.println("digite o numero de meses:");
			  int mes = leitorzinho.nextInt();
			  
			  double vf = vp*Math.pow(1+(tax/100),mes);
			  

			  System.out.println("O valor futuro é = " + vf + " UM em " +mes +" meses");
		}
	        
	      System.out.println("");
	      System.out.println("-----------------------------");
	      
	    }
	
		// TODO Auto-generated method stub

	}


