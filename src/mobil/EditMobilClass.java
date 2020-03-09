package mobil;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EditMobilClass {
	log.LogClass log = new log.LogClass();
	archivoInt.ArchivoIntEdit archivoInt = new archivoInt.ArchivoIntEdit();
	archivoInt.ArchivoInt parametrosObjeto = new archivoInt.ArchivoInt();
	cuentas.CuetasClass divicion = new cuentas.CuetasClass(); 
	tiempo.Tiempo tiempoo = new tiempo.Tiempo(); 
	mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
	archivoInt.ArchivoInt renglonesMatirz = new archivoInt.ArchivoInt();
	
	public String[][] mobilEdit() throws FileNotFoundException, IOException {
		String[] consumoCdr = new String[renglonesMatirz.sumaParametros()];
		String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
		String[] parametros = new String[parametrosObjeto.renglonesArchivoParametros()];
		String[] parametrosSplit = new String[5];
		int consumoContador=0;
		parametros = parametrosObjeto.parametros();
		if(archivoInt.existeArchivoEdit() == true) {
			consumoCdr = archivoInt.leerArchivoIntEdit();
			int tope = consumoCdr.length;
			for(int i=0; i<parametros.length; i++) {
				parametrosSplit = parametros[i].split("\\|");
				String[] fecha1 = new String[divicion.divicionCdr()]; //Integer.parseInt(parametrosSplit[4])
				fecha1 = tiempoo.tiempo1(parametrosSplit[2], parametrosSplit[3], Integer.toString(divicion.divicionCdr()) );
				for(int j=0; j<divicion.divicionCdr(); j++) {
					if(consumoContador<tope - 1) {
						consumoContador++;
					} else {
						consumoContador = tope ;
					}
					if(Integer.parseInt(consumoCdr[consumoContador-1].substring(1,2)) == 2 || Integer.parseInt(consumoCdr[consumoContador-1].substring(1,2)) == 5 ) {
						consumoCdrModificado[i][j] = consumoCdr[consumoContador-1].substring(0,42) +  parametrosSplit[1] + 
								consumoCdr[consumoContador-1].substring(57,74) + parametrosSplit[0] + "  " + parametrosSplit[0] +
								consumoCdr[consumoContador-1].substring(100,118) + fecha1[j] + consumoCdr[consumoContador-1].substring(132,391);
					} else {
						consumoCdrModificado[i][j] = 
								consumoCdr[consumoContador-1].substring(0,12) + parametrosSplit[0] + consumoCdr[consumoContador-1].substring(24,42) + parametrosSplit[1] + consumoCdr[consumoContador-1].substring(57,118) + 
								fecha1[j] + consumoCdr[consumoContador-1].substring(132,391);
					}
					//String infoLog = "Editando.." + "[" + i +"]" + "[" + j +"]";
					//log.logInfo(infoLog);
				}
			}
			
					
		}else {
			String infoLog = "Error en el archivo a editar";
			log.logInfo(infoLog);
		}
		//System.out.println(consumoContador);
		return consumoCdrModificado;		
	}

}
