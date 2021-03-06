package oroamEntrante;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EditOroamEntrante {
	log.LogClass log = new log.LogClass();
	archivoInt.ArchivoIntEdit archivoInt = new archivoInt.ArchivoIntEdit();
	archivoInt.ArchivoInt parametrosObjeto = new archivoInt.ArchivoInt();
	cuentas.CuetasClass divicion = new cuentas.CuetasClass(); 
	tiempo.Tiempo tiempoo = new tiempo.Tiempo(); 
	mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
    archivoInt.ArchivoInt renglonesMatirz = new archivoInt.ArchivoInt();
	
	public String[][] oroamEntEdit() throws FileNotFoundException, IOException {
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
						consumoContador = tope;
					}
					consumoCdrModificado[i][j] = 
							consumoCdr[consumoContador-1].substring(0,90) + fecha1[j] + 
							consumoCdr[consumoContador-1].substring(104,171) + parametrosSplit[1] + parametrosSplit[0] + 
							consumoCdr[consumoContador-1].substring(198,307);
					String infoLog = "Editando.." + "[" + i +"]" + "[" + j +"]";
					log.logInfo(infoLog);
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
