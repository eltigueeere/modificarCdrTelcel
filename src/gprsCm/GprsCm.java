package gprsCm;

import java.io.IOException;

public class GprsCm {
	
	private String pos_1_28 = "9485      0 351707084789770";
	private String pos55__156 = "   201.134.179.86                               201.144.195.109                              68      ";
	private String pos_170_431 = "2001               0000 1 891016799 internet.itelcel.com                                           0   CS  76183       76183                      0ANACC1                                                         33  6O30164        143879882                        ";

	public String[][] construcionDeParametrosGprsCM() throws IOException {
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
				datos[i][j] = pos_1_28 + parametrosSplit[1] + parametrosSplit[0] + pos55__156 + fecha1[j] + pos_170_431;						
			}
		}
		return datos;
	}
	

}
