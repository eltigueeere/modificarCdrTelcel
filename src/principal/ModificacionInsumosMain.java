package principal;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;

public class ModificacionInsumosMain {

	public static void main(String[] args) throws IOException {
		String log4jConfPath = "C:\\WmodificacionInsumos\\log4j.properties";
		//String log4jConfPath = "/u01/Telcel/CFG_CTL/Config/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		log.LogClass log = new log.LogClass();		
		//TODO Auto-generated method stub	
		
		int opcion = 0;
		int opcionCaso2=0;
		int opcionCaso1=0;
		validacion.ValidacionClass validacion = new validacion.ValidacionClass();
		principal.Presentacion inicioP = new principal.Presentacion();
			
		do {
			opcion = inicioP.inicio();
			switch (opcion) {
			case 0:
				inicioP.salida();
				break;
			case 1:			
				if(validacion.validacionArchivoinput() != true) {
					log.logInfo("\n\tError archivo de entrada");
				} else {
					log.logInfo("\n\tSe valido archivo");
					opcionCaso1 = inicioP.submenu1();
					archivoOut.ArchivoOut cdrCDR = new archivoOut.ArchivoOut();
					switch (opcionCaso1) {
					case 1:
						cdrCDR.cdrMobilArchivo(); 
						log.logInfo("Archivo creado");					
						break;
					case 2:          
						cdrCDR.cdrGprsArchivo();
						log.logInfo("Archivo creado");					
						break;
					case 3:                                  
						cdrCDR.cdrGprsCmArchivo();
						log.logInfo("Archivo creado");					
						break;
					case 4:                                   
						cdrCDR.cdrGprsO(); 	
						log.logInfo("Archivo creado");				
						break;
					case 5:                          
						cdrCDR.cdrGprsOm();	
						log.logInfo("Archivo creado");				
						break;
					case 6:                                       
						cdrCDR.cdrMms();
						log.logInfo("Archivo creado");					
						break;
					case 7:                                         
						cdrCDR.cdrOroamArchivo();
						log.logInfo("Archivo creado"); 					
						break;
					case 8:
						cdrCDR.cdrOroamEntranteArchivo();
						log.logInfo("Archivo creado");
						break;

					default:
						System.out.println("No es opcion ");
						break;
					}             	 
					
				}
				break;
				
			case 2:		
				if(validacion.validacionArchivoinput() != true) {
					log.logInfo("Error archivo de entrada");
				} else {
					log.logInfo("Se valido archivo");
					archivoOut.ArchivoOutEdit cdrEdit = new archivoOut.ArchivoOutEdit();
					opcionCaso2 = inicioP.submenu2();
					switch (opcionCaso2) {
					case 1:
						cdrEdit.cdrSalidaEditmobil();
						log.logInfo("Archivo creado");
						break;
					case 2:
						cdrEdit.cdrSalidaEditGprs();
						log.logInfo("Archivo creado");
						break;
					case 3:
						cdrEdit.cdrSalidaEditGprsCm();
						log.logInfo("Archivo creado");
						break;
					case 4:
						cdrEdit.cdrSalidaEditGprsO();
						log.logInfo("Archivo creado");
						break;
					case 5:
						cdrEdit.cdrSalidaEditGprsOm();
						log.logInfo("Archivo creado");
						break;
					case 6:
						cdrEdit.cdrSalidaEditMms();
						log.logInfo("Archivo creado");
						break;
					case 7:
						cdrEdit.cdrSalidaEditOroam();
						log.logInfo("Archivo creado");
						break;
					case 8:
						cdrEdit.cdrSalidaEditOroamEnt();
						log.logInfo("Archivo creado");
						break;

					default:
						System.out.println("No es opcion");
						break;
					}
				}
				
				break;

			default:
				System.out.println("No es opcion");
				break;
			} 			
		}while(opcion != 0);
		
		
	} 

}
