/*Diseño de un cajero automatico en JAVA
 * Funciones 
 * 1.- Consulta saldo
 * 2.- Retiro de efectivo
 * 3.- Deposito de efectivo
 * 4.- Salir*/

package cajero_automatico;

public class Consulta extends CajeroAutomatico {
	
	@Override
	//metodo de transacciones
	public void transacciones() {
		
		System.out.println("---------------------------------------");
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("---------------------------------------");
		
	}
}