/*Diseño de un cajero automatico en JAVA
 * Funciones 
 * 1.- Consulta saldo
 * 2.- Retiro de efectivo
 * 3.- Deposito de efectivo
 * 4.- Salir*/

package cajero_automatico;

public class Deposito extends CajeroAutomatico {
	
	//metodo abstracto
	@Override
	public void transacciones() {
		
		//mensaje la usuario
		System.out.print("¿Cuanto deseas depositar?: ");
		depositoSaldo();
		
		//operacion
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		
		//mensaje al usuario
		System.out.println("---------------------------------------");
		System.out.println("Depositaste: " + deposito);
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("---------------------------------------");
		
		
	}
}