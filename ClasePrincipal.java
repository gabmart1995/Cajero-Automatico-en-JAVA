/*Diseño de un cajero automatico en JAVA
 * Funciones 
 * 1.- Consulta saldo
 * 2.- Retiro de efectivo
 * 3.- Deposito de efectivo
 * 4.- Salir*/

package cajero_automatico;

public class ClasePrincipal {
	
	//arranca el programa
	public static void main(String[] args) {
		
		CajeroAutomatico mensajeroConsulta = new Consulta();
		
		//establece el sldo inicial en 500
		mensajeroConsulta.setSaldo(500);
		
		//invoca la operacion
		mensajeroConsulta.operaciones();
		
	}
}