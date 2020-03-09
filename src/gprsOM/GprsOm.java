package gprsOM;

import java.io.IOException;

public class GprsOm {
	private String  pos_1_152 = "18                            D4   33011                                                                                                               ";
	private String  pos_166_255 = "        0               1  1733810833 5         1469        1099                         ";
	private String pos_270_276 ="      ";
	private String pos_2_88_92_469 ="                                                                                      1429                       internet.itelcel.com                                                ";

	public String[][] construcionDeParametrosGprsOm() throws IOException {
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
				datos[i][j] = pos_1_152 + fecha1[j] + pos_166_255 + parametrosSplit[1] + pos_270_276 + parametrosSplit[0] + pos_2_88_92_469;					
			}
		}
		return datos;
	}
}
