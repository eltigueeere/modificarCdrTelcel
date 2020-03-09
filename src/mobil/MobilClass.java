package mobil;

import java.io.IOException;



public class MobilClass {

	private String[] pos_0 = {"01","02","05","06"};
	private String numeroBenA = "525588000001  ";
	private String cas05_pos_1_10 ="11475174  ";
	private String caso05_pos_27_43 = " 355319085281210";
	private String caso05_58_75 = "               11";
	//private String numeroAenB ="  522223242553";
	//private String caso05_elresto="         32       20191031043048T11   00D5                                                      33400252577F9C       5     5     5     TELCEL MEXICALI     BCN TELCEL MEXICALI, BCNBCN R019428 7319 09428073199427 7328 1    TRNCAC2I BSC     NATGRIB INT                          10           T  ";
	private String pos1_13 = "11475174  ";
	private String mcm_imei="   355319085281210";
	private String pos58_118 = "               11525588000001  525588000001         32       ";
	private String pos133_389 = "T11   00D5                                                      33400252577F9C       5     5     5     TELCEL MEXICALI     BCN TELCEL MEXICALI, BCNBCN R019428 7319 09428073199427 7328 1    TRNCAC2I BSC     NATGRIB INT                          10           T  ";
	private String caso02 = "04367124  525522000031   356573082848920";
	private String caso02pos58_75 = "               11";
	private String caso02pos101_119 = "         32       ";
	private String caso02Final = "T11   00D5                                                      33400252577F9C       5     5     5     TELCEL MEXICALI     BCN TELCEL MEXICALI, BCNBCN R019428 7319 09428073199427 7328 1    TRNCAC2I BSC     NATGRIB INT                          10           T  ";
	public String[][] construcionDeParametrosMobil() throws IOException {
		archivoInt.ArchivoInt datosString = new archivoInt.ArchivoInt();
		tiempo.Tiempo tiempo = new tiempo.Tiempo(); 
		String[] parametros = new String[datosString.renglonesArchivoParametros()];
		String[] parametrosSplit = new String[5];
		String[][] datos = new String[filasFunc()][sumaParametrosF()];
		parametros = datosString.parametros();
		int tipoLlamadas[] = new int[4];
		tipoLlamadas[0] = (int) Math.floor(sumaParametrosF()/4);
		tipoLlamadas[1] = (int) Math.floor(sumaParametrosF()/3);
		tipoLlamadas[2] = (int) Math.floor(sumaParametrosF()/2);
		tipoLlamadas[3] = (int) Math.floor(sumaParametrosF()/1);	
		//System.out.println(tipoLlamadas[0]);
		//System.out.println(tipoLlamadas[1]);
		//System.out.println(tipoLlamadas[2]);
		//System.out.println(tipoLlamadas[3]);
		for(int i=0; i<datosString.renglonesArchivoParametros(); i++) {
			parametrosSplit = parametros[i].split("\\|");
			//System.out.println("***********************************************");
			//System.out.println(Integer.parseInt(parametrosSplit[4]));
			//System.out.println("***********************************************");
			String[] fecha1 = new String[Integer.parseInt(parametrosSplit[4])];
			fecha1 = tiempo.tiempo1(parametrosSplit[2], parametrosSplit[3], parametrosSplit[4]);
			for(int j=0; j<Integer.parseInt(parametrosSplit[4]); j++) {
				//System.out.println("--->" + j);
				if(j<= tipoLlamadas[0]) {
					datos[i][j] = pos_0[0] + pos1_13 + parametrosSplit[0] + mcm_imei + parametrosSplit[1] + pos58_118 + fecha1[j]  + pos133_389;
					//System.out.println(datos[i][j]);					
				} else if(j> tipoLlamadas[0] && j<= tipoLlamadas[1]) {
					datos[i][j] = pos_0[1] + caso02 + parametrosSplit[1] + caso02pos58_75 + parametrosSplit[0] + "  " + parametrosSplit[0]  + caso02pos101_119 + fecha1[j] + caso02Final;  
					//System.out.println(datos[i][j]);						
				} else if(j> tipoLlamadas[1] && j<= tipoLlamadas[2]) {
					datos[i][j] = pos_0[2] + cas05_pos_1_10 + numeroBenA + caso05_pos_27_43 + parametrosSplit[1] + caso05_58_75 + parametrosSplit[0] + "  " + parametrosSplit[0]  + caso02pos101_119 + fecha1[j] + caso02Final;
					//System.out.println(datos[i][j]);						
				}  else if(j> tipoLlamadas[2] && j<= tipoLlamadas[3]) {
					datos[i][j] = pos_0[3] + pos1_13 + parametrosSplit[0] + mcm_imei + parametrosSplit[1] + pos58_118 + fecha1[j]  + pos133_389;
					//System.out.println(datos[i][j]);						
				}else {
					datos[i][j] = pos_0[0] + pos1_13 + parametrosSplit[0] + mcm_imei + parametrosSplit[1] + pos58_118 + fecha1[j]  + pos133_389;
					//System.out.println(datos[i][j]);						
				}
			}
		}
		return datos;
	}
	
	public int sumaParametrosF() throws IOException {
		archivoInt.ArchivoInt datosString = new archivoInt.ArchivoInt();
		String[] parametros = new String[datosString.renglonesArchivoParametros()];
		String[] parametrosSplit = new String[5];
		int sumaParametros= 0;
		parametros = datosString.parametros();
		for(int i=0; i<datosString.renglonesArchivoParametros(); i++) {
			parametrosSplit = parametros[i].split("\\|");
			sumaParametros += Integer.parseInt(parametrosSplit[4]);
		}
		return sumaParametros;
	}
	
	public int filasFunc() throws IOException{
		int filas=0;
		archivoInt.ArchivoInt datosString = new archivoInt.ArchivoInt();
		filas = datosString.renglonesArchivoParametros();
		return filas;
	}
}
