package archivoOut;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ArchivoOut {
	log.LogClass log = new log.LogClass();
	parametros.Parametros parametros = new parametros.Parametros();	
	public void cdrMobilArchivo() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaMobil"); // "C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaMobil.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass();
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = mobil.construcionDeParametrosMobil();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR MOBIL"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR MOBIL"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }
	

	public void cdrGprsArchivo() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaGprs"); // "C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaGprs.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		gprs.GprsClass gprs = new gprs.GprsClass(); 
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = gprs.construcionDeParametrosGprs();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }
	

	public void cdrGprsCmArchivo() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaGprsCm"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaGprsCm.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		gprsCm.GprsCm gprsCm = new gprsCm.GprsCm(); 
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = gprsCm.construcionDeParametrosGprsCM();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSCM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSCM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }
	
	public void cdrOroamArchivo() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaOroam"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaOroam.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		archivoOroam.ArchivoOroam oroam = new archivoOroam.ArchivoOroam();
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = oroam.construcionDeParametrosOroam();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR OROAM_SALIENTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR OROAM_SALIENTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                		
                	}
                }            	
            }
        }
        bw.close();
    }


	public void cdrOroamEntranteArchivo() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaOroamEntrante"); // "C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaOroamEntrante.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		oroamEntrante.OroamEntrante ororamEntrante = new  oroamEntrante.OroamEntrante(); 
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = ororamEntrante.construcionDeParametrosOroamEntrante();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR OROAM_ENTRANTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR OROAM_ENTRANTE"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }

	public void cdrGprsOm() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaGprsOm"); //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaGprsOm.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		gprsOM.GprsOm gprsOm = new gprsOM.GprsOm(); 
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = gprsOm.construcionDeParametrosGprsOm();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSOM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSOM"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }

	public void cdrGprsO() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaGprsO");  //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaGprsO.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		gprsO.GprsO gprsO = new gprsO.GprsO(); 
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = gprsO.construcionDeParametrosGprsO();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSO"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR GPRSO"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }
	

	public void cdrMms() throws IOException {
		String ruta = parametros.variablePropertis("ruta.cdrSalidaMms");  //"C:\\Users\\VI1XXWG\\Downloads\\cdrSalidaMms.txt";
        File archivo = new File(ruta);
		mobil.MobilClass mobil = new mobil.MobilClass(); 
		mms.mmsArchivo mms = new mms.mmsArchivo();
		String[][] cdr = new String[mobil.filasFunc()][mobil.sumaParametrosF()];
		cdr = mms.construcionDeParametrosMms();
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR MMS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<mobil.filasFunc(); i++) {
                for(int j=0; j<mobil.sumaParametrosF(); j++) {
                	if(cdr[i][j] != null) {
                		bw.write(cdr[i][j] + "\n");
                		String infoLog = "CREACION CDR MMS"+"[" + i +"]" + "[" + j +"]";
                		log.logInfo(infoLog);
                	} else {
                		//System.out.println(cdr[i][j]);
                	}
                }            	
            }
        }
        bw.close();
    }
}
