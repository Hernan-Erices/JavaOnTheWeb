package com.modelCronometro;

public class Timer {
	
	int inicio;
	int finalizacion;
	
	public Timer() {	
		//this.inicio = inicio;
		//this.finalizacion = finalizacion;
	}

	public int getInicio() { return inicio; }

	public void setInicio(int inicio) { this.inicio = inicio; }

	public int getFinalizacion() { return finalizacion; }

	public void setFinalizacion(int finalizacion) { this.finalizacion = finalizacion; }
	
	
	
	public void cronometro() {
		
		int minutos=0;
		int segundos=0;
		
		for(minutos=0;minutos<60;minutos++) {
			
			for(segundos=0;segundos<60;segundos++) {
				
				System.out.println(minutos+":"+segundos);
			}	
		}
	}
	
	
	private static void delaySegundo() {
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}
	
	
}
