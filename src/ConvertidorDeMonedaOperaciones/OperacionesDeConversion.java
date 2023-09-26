package ConvertidorDeMonedaOperaciones;

public class OperacionesDeConversion {
	
	double valorDeMonedaAComvertir;
	
	public double deColonSalvadorehnoADolar(double cantidad) {
		valorDeMonedaAComvertir = 0.11428572;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deDolarAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 8.75;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deDolarAPesoMexicano(double cantidad) {
		valorDeMonedaAComvertir = 17.41;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double dePesoMexicanoADolar(double cantidad) {
		valorDeMonedaAComvertir = 0.057;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deColonSalvadorehnoAEuros(double cantidad) {
		valorDeMonedaAComvertir = 0.109;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deEurosAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 9.259;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deColonSalvadorehnoALibrasEsterlinas(double cantidad) {
		valorDeMonedaAComvertir = 0.094;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deLibrasEsterlinasAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 10.652;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deColonSalvadorehnoAYenJapones(double cantidad) {
		valorDeMonedaAComvertir = 17.03;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deYenJaponesAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 0.059;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deColonSalvadorehnoAWonSulCoriano(double cantidad) {
		valorDeMonedaAComvertir = 154.62;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
	public double deWonSulCorianoAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 0.0065;
		double resultado = cantidad * valorDeMonedaAComvertir;
		
		return resultado;
	}
}
