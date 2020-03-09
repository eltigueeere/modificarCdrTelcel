package mms;

import java.io.IOException;

public class mmsArchivo {
	
	private String pos_1_11 = "00322144433";
	private String pos24_37_72 = "             1720201445               146681    ";
	private String pos_114_119 = "10000";
	private String pos_148_178 =  "0         146681    188AIC0102";

	public String[][] construcionDeParametrosMms() throws IOException {
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
				datos[i][j] = pos_1_11 + parametrosSplit[0] + pos24_37_72 + fecha1[j] +  fecha1[j] + fecha1[j] + 
						pos_114_119 + parametrosSplit[1] + fecha1[j] + pos_148_178;     
				//System.out.println(datos[i][j]);						
			}
		}
		return datos;
	}
	


}
