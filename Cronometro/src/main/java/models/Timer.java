package models;

import java.util.Date;

	public class Timer {
		
	private Date iniciar;	
	private Date detener;
	private long difference;
	
	public Date getIniciar() {return iniciar;}
	
	public Date getDetener() {return detener;}
	
	public long getDifference() {return difference;}
	
	public Timer() {}
	
	public Timer(Date iniciar, Date detener) {
		this.iniciar = iniciar;
		this.detener = detener;
		this.difference = getDifference(this.detener, this.iniciar);
	}
	
	public static long getDifference(Date endDate, Date startDate) { return endDate.getTime() - startDate.getTime();}
}
