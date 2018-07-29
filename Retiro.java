/*Diseño de un cajero automatico en JAVA
 * Funciones 
 * 1.- Consulta saldo
 * 2.- Retiro de efectivo
 * 3.- Deposito de efectivo
 * 4.- Salir*/

package cajero_automatico;

public class Retiro extends CajeroAutomatico {
	
	@Override
	//metodo abstracto
	public void transacciones() {
		
		System.out.print("¿Cuanto deseas retirar?: ");
		retiroSaldo();
		
		//validacion
		if (retiro <= getSaldo()) {
			
			//envia la variable a transacciones
			transacciones = getSaldo();
			
			//invoca al metodo establecer saldo
			setSaldo(transacciones - retiro);
			
			//mensaje al usuario
			System.out.println("---------------------------------------");
			System.out.println("Retiraste: " + retiro);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("---------------------------------------");
			
		}
		
		else {
			
			//mensaje al usuario
			System.out.println("---------------------------------------");
			System.out.println("Saldo insuficiente");
			System.out.println("---------------------------------------");
		}
	}
}