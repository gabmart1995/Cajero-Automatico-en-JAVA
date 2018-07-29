/*Diseño de un cajero automatico en JAVA
 * Funciones 
 * 1.- Consulta saldo
 * 2.- Retiro de efectivo
 * 3.- Deposito de efectivo
 * 4.- Salir*/

package cajero_automatico;

//importamos la clase
import java.util.Scanner;

public abstract class CajeroAutomatico {
	
	//variables globales
	protected int transacciones, retiro, deposito;
	Scanner entrada = new Scanner(System.in);
	
	//variable estatica
	private static int saldo;
	
	//metodo abstracto
	public abstract void transacciones();
	
	//metodo para imprimir el mensaje de bienvenida
	public void operaciones() {
		
		//variables locales
		int bandera = 0; 
		int seleccion = 0;
		
		//ciclo do while
		do {
		
			do {
			
				System.out.println("Cajero Automatico\n");
				System.out.println("\t1.- Consulta saldo\n"
						+ "\t2.- Retiro de efectivo\n" + 
						"\t3.- Deposito de efectivo\n" +
						"\t4.-Salir.\n");
				System.out.print("Ingrese una opción: ");
			
				seleccion = entrada.nextInt();
			
				//estructura condicional
				if (seleccion >= 1 && seleccion <= 4) {
				
					//cambia el valor para salir del bucle
					bandera = 1;
				}
			
				else {
				
					//mensaje de alerta
					System.out.println("---------------------------------------");
					System.out.println("Opción no disponible, vuelva a intentar " +
							"por favor");
					System.out.println("---------------------------------------");
				}
			
			}
		
			//condicion
			while (bandera == 0);
		
			//ejecucion de los metodos
			if (seleccion == 1) {
				
				//instancia de clase
				CajeroAutomatico cliente = new Consulta();
				cliente.transacciones();
			}
			
			else if (seleccion == 2) {
				
				//instancia de clase
				CajeroAutomatico cliente = new Retiro();
				cliente.transacciones();
			}
			
			else if (seleccion == 3) {
				
				//instancia de clase
				CajeroAutomatico cliente = new Deposito();
				cliente.transacciones();
			}
			
			else if (seleccion == 4) {
				
				//mensaje de salida
				System.out.println("---------------------------------------");
				System.out.println("Gracias vuelva pronto.");
				System.out.println("---------------------------------------");
				
				bandera = 2;
			}
			
			
			
		}
		
		//condicion de salida
		while (bandera != 2);
		
	}
	
	//metodo de solicitar cantidad de retiro
	public void retiroSaldo() {
		
		retiro = entrada.nextInt();
	}
	
	//metodo de solicitar deposito
	public void depositoSaldo() {
		
		deposito = entrada.nextInt();
	}
	
	//metodos setter y getter
	public int getSaldo() {
		
		//retorna el valor del saldo
		return saldo;
	}
	
	@SuppressWarnings("static-access")
	public void setSaldo(int saldo) {
		
		//asigna la variable
		this.saldo = saldo;
	}
	
	
}
 