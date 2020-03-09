package oroamEntrante;

import java.io.IOException;

public class OroamEntrante {
	private String pos_1_91 = "MT0.00728         1.37353     CDCANCANTS0.00000         0.009999298400000.0             11";
	private String pos_105_172 ="           525535223177                    21374728             01 ";
	private String pos_211_405 = "            15        D  11658    2           44376KANATASSVL                               15          43775";
	
	public String[][] construcionDeParametrosOroamEntrante() throws IOException {
		archivoInt.ArchivoInt datosString = new archivoInt.ArchivoInt();
		tiempo.Tiempo tiempo = new tiempo.Tiempo(); 
		mobil.MobilClass mobilFunciones = new mobil.MobilClass(); 
		String[] parametros = new String[datosString.renglonesArchivoParametros()];
		String[] parametrosSplit = new String[5];
		String[][] datos = new String[mobilFunciones.filasFunc()][mobilFunciones.sumaParametrosF()];
		parametros = datosString.parametros();
		for(int i=0; i<datosString.renglonesArchivoParametros(); i++) {
			parametrosSplit = parametros[i].split("\\|");
			String[] fecha1 = new String[Integer.parseInt(parametrosSplit[4])];
			fecha1 = tiempo.tiempo1(parametrosSplit[2], parametrosSplit[3], parametrosSplit[4]);
			for(int j=0; j<Integer.parseInt(parametrosSplit[4]); j++) {
				datos[i][j] = pos_1_91 + fecha1[j] + pos_105_172 + parametrosSplit[1] +  parametrosSplit[0] + pos_211_405;					
			}
		}
		return datos;
	}
	
}
