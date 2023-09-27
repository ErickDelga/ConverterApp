package ConvertidorDeMonedaOperaciones;

public class OperacionesDeConversion {
	
	double valorDeMonedaAComvertir;
	
	public double deColonSalvadorehnoADolar(double cantidad) {
		valorDeMonedaAComvertir = 0.11428572;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deDolarAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 8.75;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deColonSalvadorehnoAPesoMexicano(double cantidad) {
		valorDeMonedaAComvertir = 2.00;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double dePesoMexicanoAColonSalvadorenho(double cantidad) {
		valorDeMonedaAComvertir = 0.50;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deColonSalvadorehnoAEuros(double cantidad) {
		valorDeMonedaAComvertir = 0.109;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deEurosAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 9.259;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deColonSalvadorehnoALibrasEsterlinas(double cantidad) {
		valorDeMonedaAComvertir = 0.094;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deLibrasEsterlinasAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 10.652;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deColonSalvadorehnoAYenJapones(double cantidad) {
		valorDeMonedaAComvertir = 17.03;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deYenJaponesAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 0.059;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deColonSalvadorehnoAWonSurCoriano(double cantidad) {
		valorDeMonedaAComvertir = 154.62;
		return cantidad * valorDeMonedaAComvertir;
	}
	public double deWonSurCorianoAColonSalvadorehno(double cantidad) {
		valorDeMonedaAComvertir = 0.0065;
		return cantidad * valorDeMonedaAComvertir;
	}
}
