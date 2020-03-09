package principal;

import java.util.Scanner;

public class Presentacion {
	Scanner entradaTeclado = new Scanner(System.in);
	public int inicio() {
		// TODO Auto-generated method stub
		int opcion=0;
		System.out.print("\n\t+--------------------------------------+");
		System.out.print("\n\t|          AREA DE PRUEBAS             |");
		System.out.print("\n\t|       MODIFICACION INSUMOS           |");
		System.out.print("\n\t|            Folio 360429              |");
		System.out.print("\n\t|          1.- Construir CDR           |");
		System.out.print("\n\t|          2.- Modificar CDR           |");
		System.out.print("\n\t|          0.- Salir                   |");
		System.out.print("\n\t+--------------------------------------+\n");
		System.out.print("\tOpcion: ");
		opcion = entradaTeclado.nextInt();
		return opcion;
	}
	
	public void salida() {

		System.out.print("\n\t+--------------------------------------+");
		System.out.print("\n\t|          AREA DE PRUEBAS             |");
		System.out.print("\n\t|            Folio 360429              |");
		System.out.print("\n\t|       MODIFICACION INSUMOS           |");
		System.out.print("\n\t|                                      |");
		System.out.print("\n\t|        EJECUCION TERMINADA           |");
		System.out.print("\n\t+--------------------------------------+\n");
	}
	
	public int submenu1() {
		int opcion=0;
		System.out.print("\n\t+--------------------------------------+");
		System.out.print("\n\t|          AREA DE PRUEBAS             |");
		System.out.print("\n\t|            Folio 360429              |");
		System.out.print("\n\t|       MODIFICACION INSUMOS           |");
		System.out.print("\n\t|         CREACION DE CDR'S            |");
		System.out.print("\n\t|           1.- MOBILE                 |");
		System.out.print("\n\t|           2.- GPRS                   |");
		System.out.print("\n\t|           3.- GPRSCM                 |");
		System.out.print("\n\t|           4.- GPRSO                  |");
		System.out.print("\n\t|           5.- GPRSOM                 |");
		System.out.print("\n\t|           6.- MMS                    |");
		System.out.print("\n\t|           7.- OROAM_SALIENTE         |");
		System.out.print("\n\t|           8.- OROAM_ENTRANTE         |");
		System.out.print("\n\t+--------------------------------------+\n");
		System.out.print("\tOpcion: ");
		opcion = entradaTeclado.nextInt();		
		return opcion;
	}
	public int submenu2() {
		int opcion=0;
		System.out.print("\n\t+--------------------------------------+");
		System.out.print("\n\t|          AREA DE PRUEBAS             |");
		System.out.print("\n\t|            Folio 360429              |");
		System.out.print("\n\t|       MODIFICACION INSUMOS           |");
		System.out.print("\n\t|           EDITAR  CDR'S              |");
		System.out.print("\n\t|           1.- MOBILE                 |");
		System.out.print("\n\t|           2.- GPRS                   |");
		System.out.print("\n\t|           3.- GPRSCM                 |");
		System.out.print("\n\t|           4.- GPRSO                  |");
		System.out.print("\n\t|           5.- GPRSOM                 |");
		System.out.print("\n\t|           6.- MMS                    |");
		System.out.print("\n\t|           7.- OROAM_SALIENTE         |");
		System.out.print("\n\t|           8.- OROAM_ENTRANTE         |");
		System.out.print("\n\t+--------------------------------------+\n");
		System.out.print("\tOpcion: ");
		opcion = entradaTeclado.nextInt();		
		return opcion;
	}
}
