package Colecciones;
import java.util.Set; //papa
import java.util.HashSet; //hijo
public class Colecciones {
	public static void main(String []arg) {
	
		//Declarando mi primer arreglo de java []
		//Primero el tipode dato que voy a almacenar. le ponog los corchetes cadrados, despues el nombre de mi areglo y por ultimo instancio mi arreglo
		

		
		String[]listaCompras =new String[] {"leche", "pan","Frutas"};
		
		
		//Impresion de mi array
		System.out.println(listaCompras); //Solo nos va a imprimir el string 
		
		//forEach par aimprimir cada elemento de mi lista de compras 
		//Para nuestros datos delt ipo String que se almacenan en una varuable temporal llamada productoTemporal que se esta llenando de una arreglo llamado lista de compras vas a imprimir ese produdctoTemporal
		
		for (String productoTemporal1 :listaCompras) {
			System.out.println(productoTemporal1);
		}
		
		//Arreglo de habitaicones de un hotel
		String[] habitaciones =new String[10];
		//Inicializo o asigno valores  a cada indice
		habitaciones [0]="101";
		habitaciones [1]="102";
		habitaciones [2]="103";
		habitaciones [3]="104";
		habitaciones [4]="105";
		habitaciones [5]="106";
		habitaciones [6]="107";
//		habitaciones [7]="108";
	//	habitaciones [8]="109";
		//	habitaciones [9]="110";
		/* Habitaciones [10] ="101"; si tratamos de acceder a un elemento mas alla de los elementos declarados al pricipio, tendremos una excpecion que solo veremos cuando se ejecuta el programa 	 */
		
		//Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemnto nulo a uno indefinido.
		System.out.println(habitaciones [8]);
		
		//En caso de querer usar un foreach para imprimir los elemntos, solo se imprimiran 7 elemtos.(so,lo itera sobtre los elementos existentes)
	}
}//Cierre de la class colecciones












/*

 Colecciones
 
 
-Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

	1.Tamanio fijo
	2.Acesso rapido.
	3.Coste elevado para insertar o eliminar elementos.	


  
  
  */
