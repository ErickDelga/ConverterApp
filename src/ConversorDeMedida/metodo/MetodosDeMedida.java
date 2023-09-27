package ConversorDeMedida.metodo;

public class MetodosDeMedida {
	private double unidadDeMedida;
	
	public double deCentimetrosAMetros(double cantidad) {
		unidadDeMedida = 0.01;
		return cantidad * unidadDeMedida;
	}
	public double deMetrosACentimetros(double cantidad) {
		unidadDeMedida = 100;
		return cantidad * unidadDeMedida;
	}
	public double deCentimetrosAPulgadas(double cantidad) {
		unidadDeMedida = 0.393701;
		return cantidad * unidadDeMedida;
	}
	public double dePulgadasACentimetros(double cantidad) {
		unidadDeMedida = 2.54;
		return cantidad * unidadDeMedida;
	}
	public double deKilometrosAMillas(double cantidad) {
		unidadDeMedida = 0.621371;
		return cantidad * unidadDeMedida;
	}
	public double deMillasAKilometros(double cantidad) {
		unidadDeMedida = 1.60934;
		return cantidad * unidadDeMedida;
	}
}