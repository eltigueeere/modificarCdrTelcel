package validacion;

import java.io.IOException;

public class ValidacionClass {
	log.LogClass log = new log.LogClass();
	public boolean validacionArchivoinput() throws IOException {
		boolean correcto = false;
		String[] cadena = new String[5];
		archivoInt.ArchivoInt archivoInt = new archivoInt.ArchivoInt();
		String[] parametros = new String[archivoInt.renglonesArchivoParametros()];
		parametros = archivoInt.parametros();
		if(archivoInt.existeArchivo() == true ) {
			for(int i=0; i<archivoInt.renglonesArchivoParametros(); i++) {
				cadena = parametros[i].split("\\|");
				for(int j=0; j<4; j++) {
					if(esNumerico(cadena[j]) == true && tamanoEntrada(cadena[j]) == true) {
						//System.out.println("Revissar campo " + cadena[j]);
						correcto = true;
					} else {
						log.logInfo("Revisar archivo de entrada en   --> " + cadena[j]);
						correcto = false;
						break;
					}
				}
				if(esNumerico(cadena[4]) != true) {
					correcto = false;
				}
				if(correcto != true) {
					break;
				}
			}
		} else {
			log.logInfo("Error Archivo de Entrada");
			correcto = false;
		}
		
		return correcto;		
	}
	
	public boolean falso() {
		//System.out.println("lalo");
		return false;
	}
	
	public boolean tamanoEntrada(String cadena2) {
		boolean estado = false;
		if( cadena2.length() == 6 || cadena2.length() == 8 || cadena2.length() == 15 || cadena2.length() == 12  ) {
			estado = true;
		} else {
			estado = false;
		}
		return estado;
	}
	
	public boolean esNumerico(String cadena) {
		boolean estado = false;
		try {
			Double.parseDouble(cadena);
			estado = true;
		} catch (NumberFormatException nfe){
			estado = false;
		}
		return estado;
	}
}
