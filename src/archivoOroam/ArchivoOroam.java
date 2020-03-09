package archivoOroam;

import java.io.IOException;

/*
 * HOROAM SALIENTE
 * 
 * 
 */

public class ArchivoOroam {
	
	private String pos_1_91 = "MO0.05849         1.36774     CDCANCANRW0.00000         0.0             0.0799991126000011";
	private String pos105__208 = "2155740004 527393951246            TEPOZTLAN, MOR      353895100792020         0    5849            01 ";
	private String pos_235_405 = "            429       D           26          16405ON OTTAWA                                                          429                +527393951246     2  0 1    43815";

	public String[][] construcionDeParametrosOroam() throws IOException {
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
				datos[i][j] = pos_1_91 + fecha1[j] + pos105__208 + parametrosSplit[1] + parametrosSplit[0] + pos_235_405;						
			}
		}
		return datos;
	}
	
}
