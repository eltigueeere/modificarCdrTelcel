package tiempo;


public class Tiempo {
	
	public String[] tiempo1(String fecha, String horasP, String tamano){
		String[] fecha1 = new String[Integer.parseInt(tamano)];
		int segundosInt = Integer.parseInt(horasP.substring(4,6));
		int minutosInt = Integer.parseInt(horasP.substring(2,4)); 
		int horasInt =  Integer.parseInt(horasP.substring(0,2));   
		int diasInt =   Integer.parseInt(fecha.substring(6,8));     
		int mesesInt =  Integer.parseInt(fecha.substring(4,6));    
		int anosInt =   Integer.parseInt(fecha.substring(0,4));
		/*String segundosStr =horasP.substring(4,6);
		String minutosStr =horasP.substring(2,4); 
		String horasStr =  horasP.substring(0,2);   
		String diasStr =   fecha.substring(6,8);     
		String mesesStr =  fecha.substring(4,6);    
		String anosStr =   fecha.substring(0,4);*/
		fecha1[0] = fecha + horasP;
		//System.out.println(fecha1[0]);
		for(int i=1; i<Integer.parseInt(tamano); i++) {
			segundosInt += 1;
			if(segundosInt < 10) {
				fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
						paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
			} else if(segundosInt > 9 && segundosInt < 60) {
				fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
						paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);			
			} else if(segundosInt > 59 ) {
				segundosInt = 0;
				minutosInt += 1;
				if(minutosInt < 10 ) {
					fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
							paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
					
				} else if(minutosInt > 9 && minutosInt < 60) {
					fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
							paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
					
				} else if(minutosInt > 59) {
					segundosInt = 0;
					minutosInt = 0;
					horasInt += 1;
					if(horasInt < 10 ) {
						fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
								paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
						
					} else if(horasInt > 9 && horasInt < 24) {
						fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
								paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
						
					} else if(horasInt > 23) {
						segundosInt = 0;
						minutosInt = 0;
						horasInt = 0;
						diasInt += 1;
						if(diasInt < 10 ) {
							fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
									paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
							
						} else if(diasInt > 9 && diasInt < 31) {
							fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
									paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
							
						} else if(diasInt > 29) {
							segundosInt = 0;
							minutosInt = 0;
							horasInt = 0;
							diasInt = 1;
							mesesInt += 1;
							if(mesesInt < 10 ) {
								fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
										paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
								
							} else if(mesesInt > 9 && mesesInt < 13) {
								fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
										paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
								
							} else if(mesesInt > 12 ) {
								segundosInt = 0;
								minutosInt = 0;
								horasInt = 0;
								diasInt = 1;
								mesesInt = 1;
								anosInt +=1;
								fecha1[i] = paraGuardar(anosInt) + paraGuardar(mesesInt) + paraGuardar(diasInt) + 
										paraGuardar(horasInt) + paraGuardar(minutosInt) + paraGuardar(segundosInt);
							}
						}
					}
					
				}
				
			}
			
			//System.out.println(fecha1[i]);
		}
		return fecha1;
	}
	
	public String paraGuardar(int numero) {
		String entrega;
		if(numero < 10) {
			entrega = "0" + numero; 
		} else {
			entrega = Integer.toString(numero);
		}
		return entrega;
	}
}
