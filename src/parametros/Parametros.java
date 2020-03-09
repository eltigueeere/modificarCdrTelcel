package parametros;

import java.io.FileReader;
import java.util.Properties;

public class Parametros extends Object {
	private final static Properties p=new Properties();
	static{
		try {
			//p.load(new FileReader("/u01/Telcel/CFG_CTL/Config/modificacionInsumos.properties")); 
			p.load(new FileReader("C:\\WmodificacionInsumos\\modificacionInsumosWindows.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static String rutaMobil = getParam("ruta.cdrSalidaMobil");
	
	public static String getParam(String param){
		return p.getProperty(param);
	}
	
	public String variablePropertis(String variable) {
		String var = getParam(variable);
		return var;
	}
}



