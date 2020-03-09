package cuentas;

import java.io.IOException;

public class CuetasClass {
	archivoInt.ArchivoInt archivoParametros = new archivoInt.ArchivoInt();
	//archivoInt.ArchivoIntEdit archivoEdit = new archivoInt.ArchivoIntEdit(); 
	archivoInt.ArchivoInt renglonesMatirz = new archivoInt.ArchivoInt();
	
	public int divicionCdr() throws IOException {
		int divicionCdr=0;
		int numeroDeRenglonesCdr  = archivoParametros.renglonesArchivoParametros();
		int numeroDeRenglonesPrametors  = renglonesMatirz.sumaParametros(); //archivoEdit.tamanoArchiuvoEdit();
		//System.out.println("numerador"+numeroDeRenglonesCdr);
		//System.out.println("denominador"+numeroDeRenglonesPrametors);
		divicionCdr = numeroDeRenglonesPrametors/numeroDeRenglonesCdr;
		Math.floor(divicionCdr);
		//System.out.println("-divicopon->"+Math.floor(divicionCdr));
		if(divicionCdr < 1 ) {
			divicionCdr = 1;
		}
		return divicionCdr;
	}
}
