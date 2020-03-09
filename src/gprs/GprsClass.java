package gprs;

import java.io.IOException;

public class GprsClass {
	
	private String pos_1_28 = "9410      0 357957057491656";
	private String pos55__156 = "   201.144.195.116                              201.134.179.83                               137660  ";
	private String pos_170_431 = "025A1          A1010000 1 215602191 internet.itelcel.com                                           021     493040      366930       201712301640110                                                               06 012017123016290310.108.6.193                        ";

	public String[][] construcionDeParametrosGprs() throws IOException {
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
				//System.out.println(datos[i][j]);						
			}
		}
		return datos;
	}
	

}
