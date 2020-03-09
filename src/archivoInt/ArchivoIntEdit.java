package archivoInt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoIntEdit {	
	log.LogClass log = new log.LogClass();
	archivoInt.ArchivoInt renglonesMatirz = new archivoInt.ArchivoInt();
	parametros.Parametros parametros = new parametros.Parametros();
	String ruta = parametros.variablePropertis("ruta.cdrOriginalEditar");  // "C:\\Users\\VI1XXWG\\Downloads\\cdrInfo.txt";
	public boolean existeArchivoEdit() {
		File archivo = new File(ruta);
		if(archivo.exists()) {
		       //System.out.println("Documento encontrado..");
		       return true;
		} else {
			//System.out.println("Documento noo encontrado..");
			return false;
		}		
	}
	
	public  String[] leerArchivoIntEdit()throws FileNotFoundException, IOException {
		File archivo = new File(ruta);
		String cadena;
		String[] consumosCdr = new String[renglonesMatirz.sumaParametros()]; 
		int i=0;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		while((cadena = b.readLine())!=null) {
		    consumosCdr[i] = cadena;
		    i++;
		}
		b.close();
		return consumosCdr;				
		}
	
	public int tamanoArchiuvoEdit() throws IOException {
		int numeroRenglones = 0;
		@SuppressWarnings("unused")
		String cadena="";
		File archivo = new File(ruta);
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
	    //numeroRenglones = (int) b.lines().count();
	    //b.close();
		log.logInfo("CDR muestra renglones "+ numeroRenglones);
		//System.out.println("CDR muestra renglones " + numeroRenglones);
        while((cadena = b.readLine())!=null) {
        	numeroRenglones ++;
        	//System.out.println("CDR muestra renglones " + numeroRenglones);
        }
        b.close();
        log.logInfo("CDR muestra renglones "+ numeroRenglones);
	    return numeroRenglones;		
	}	
}


