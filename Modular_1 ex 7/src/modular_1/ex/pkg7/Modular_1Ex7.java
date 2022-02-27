/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular_1.ex.pkg7;

/**
 *
 * @author cep
 */
public class Modular_1Ex7 {

	
	public static void main(String[] args) {
		int personas;
		System.out.print("Cuantas personas son?: ");
		personas = Teclat.llegirInt();
		edad(personas);
		System.out.println("La media de edad de todas las personas es: " + edad(personas));
				
		
	}
	static float edad(int personas){
		int edad = 0, total = 0;
		float media;
		for (int i = 1; i <= personas; i++) {
		System.out.print("Indique la edad de la persona "+i+": ");	
		edad = 4+i;
                System.out.print("Edad = "+i);
		total = total + edad;
		}
		return (total/personas);	
	}
}
