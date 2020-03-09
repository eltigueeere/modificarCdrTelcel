package archivoInt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoInt {

	parametros.Parametros parametros = new parametros.Parametros();
	String rutaArchivoInt = parametros.variablePropertis("ruta.datosEntrada");  // "C:\\Users\\VI1XXWG\\Downloads\\cdrInfo.txt";
	
	public boolean existeArchivo() {
		File archivo = new File(rutaArchivoInt);
		if(archivo.exists()) {
		       //System.out.println("Documento encontrado..");
		       return true;
		} else {
			System.out.println(rutaArchivoInt + "Documento no encontrado..");
			return false;
		}		
	}
	
	public int renglonesArchivoParametros() throws IOException {
		int numeroParametros=0;
		if(existeArchivo() == true) {
			FileReader f = new FileReader(rutaArchivoInt);
		    BufferedReader b = new BufferedReader(f);
		    //numeroParametros = (int) b.lines().count();
		    //b.close();
	        while((b.readLine())!=null) {
	            numeroParametros +=1;
	        }
	        b.close();
		} else {
			numeroParametros = -1;
		}
        //System.out.println("Renglones parametros " + numeroParametros);
		return numeroParametros;
	}
	
	public String[] parametros() throws FileNotFoundException, IOException {
	    int i=0;
		String cadena="";
		String[] parametro = new String[renglonesArchivoParametros()];
		FileReader f = new FileReader(rutaArchivoInt);
	    BufferedReader b = new BufferedReader(f);
	    while((cadena = b.readLine())!=null) {
	    	parametro[i]=cadena;
	        i++;
	    }
	    //System.out.println("Se leyo el archivo. ");
	    b.close();
	    return parametro;
	}
	
	public int sumaParametros() throws FileNotFoundException, IOException {
		String cadena="";
		int sumaparametros=0;
		FileReader f = new FileReader(rutaArchivoInt);
	    BufferedReader b = new BufferedReader(f);
	    while((cadena = b.readLine())!=null) {
	    	String[] parametros = cadena.split("\\|");
	    	sumaparametros = sumaparametros + Integer.parseInt(parametros[4]);
	    }
	    b.close();
		return sumaparametros;
	}
}
	