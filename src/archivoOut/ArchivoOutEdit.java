package archivoOut;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoOutEdit {	
	log.LogClass log = new log.LogClass();
	parametros.Parametros parametros = new parametros.Parametros();	
	archivoInt.ArchivoInt renglonesMatirz = new archivoInt.ArchivoInt();
	public void cdrSalidaEditmobil() throws IOException {
        String ruta = parametros.variablePropertis("ruta.cdrSalidaEditMobil"); // "C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditMobil.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
    
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()]; //archivoInt.tamanoArchiuvoEdit()
        File archivo = new File(ruta);
		BufferedWriter bw;
		mobil.EditMobilClass mobilE = new mobil.EditMobilClass();
		consumoCdrModificado = mobilE.mobilEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR MOBIL"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR MOBIL"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }
	
	
	public void cdrSalidaEditGprsO() throws IOException {
        String ruta = parametros.variablePropertis("ruta.cdrSalidaEditGprsO"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditGprsO.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		gprsO.GprsOEdit gprsO = new gprsO.GprsOEdit();
		consumoCdrModificado = gprsO.gprsOEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSO"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSO"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }

	public void cdrSalidaEditGprs() throws IOException {
        String ruta = parametros.variablePropertis("ruta.cdrSalidaEditGprs"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditGprs.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		gprs.EditGprs gprsE = new gprs.EditGprs(); 
		consumoCdrModificado = gprsE.gprsEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }

	public void cdrSalidaEditGprsCm() throws IOException {
        String ruta = parametros.variablePropertis("ruta.cdrSalidaEditGprsCm"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditGprsCm.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		gprsCm.EditGprsCm gprsCME = new gprsCm.EditGprsCm(); 
		consumoCdrModificado = gprsCME.gprsCmEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSCM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSCM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }

	public void cdrSalidaEditGprsOm() throws IOException {
        String ruta =  parametros.variablePropertis("ruta.cdrSalidaEditGprsOm");  //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditGprsOm.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		gprsOM.EditGprsOm gprsOm = new gprsOM.EditGprsOm(); 
		consumoCdrModificado = gprsOm.gprsOmEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSOM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR GPRSOM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }
	

	public void cdrSalidaEditMms() throws IOException {
		String ruta =  parametros.variablePropertis("ruta.cdrSalidaEditGprsMms"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditGprsMms.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		mms.EditMms mmsEdit = new mms.EditMms(); 
		consumoCdrModificado = mmsEdit.mmsEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR MMS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR MMS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }


	public void cdrSalidaEditOroamEnt() throws IOException {
		String ruta =  parametros.variablePropertis("ruta.cdrSalidaEditOroamEnt"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditOroamEnt.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		oroamEntrante.EditOroamEntrante EditOroamEnt = new oroamEntrante.EditOroamEntrante();
		consumoCdrModificado = EditOroamEnt.oroamEntEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR OROAM_ENTRANTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR OROAM_ENTRANTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }


	public void cdrSalidaEditOroam() throws IOException {
		String ruta =  parametros.variablePropertis("ruta.cdrSalidaEditOroam"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaEditOroam.txt";
        mobil.MobilClass renglonesParametros = new mobil.MobilClass(); 
        String[][] consumoCdrModificado = new String[renglonesParametros.filasFunc()][renglonesMatirz.sumaParametros()];
        File archivo = new File(ruta);
		BufferedWriter bw;
		archivoOroam.EditOroam oroamEdir = new archivoOroam.EditOroam();
		consumoCdrModificado = oroamEdir.oroamEdit();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR OROAM_SALIENTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<renglonesParametros.filasFunc(); i++) {
            	for(int j=0; j<renglonesMatirz.sumaParametros(); j++) {
            		if(consumoCdrModificado[i][j] != null) {
            			bw.write(consumoCdrModificado[i][j] + "\n");
                		String infoLog = "EDITANDO CDR OROAM_SALIENTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
            		}
            	}
            }
        }
        bw.close();
    }

}
