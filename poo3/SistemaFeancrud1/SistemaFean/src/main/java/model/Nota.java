package model;

public class Nota {
	private double notaAv1;
	private double notaAv2;
	private double notaAv3;
	
	public Nota(double notaAv1) {
		
		this.notaAv1 = notaAv1;
	}


	public Nota(double notaAv1, double notaAv2) {
		super();
		this.notaAv1 = notaAv1;
		this.notaAv2 = notaAv2;
	}

	public Nota(double notaAv1, double notaAv2, double notaAv3) {
		super();
		this.notaAv1 = notaAv1;
		this.notaAv2 = notaAv2;
		this.notaAv3 = notaAv3;
	}


	public double getNotaAv1() {
		return notaAv1;
	}


	public void setNotaAv1(double notaAv1) {
		this.notaAv1 = notaAv1;
	}


	public double getNotaAv2() {
		return notaAv2;
	}


	public void setNotaAv2(double notaAv2) {
		this.notaAv2 = notaAv2;
	}


	public double getNotaAv3() {
		return notaAv3;
	}


	public void setNotaAv3(double notaAv3) {
		this.notaAv3 = notaAv3;
	}
	
	
}

