package ConvertidorDeMoneda;

import ConvertidorDeMonedaOperaciones.OperacionesDeConversion;
import InteracionConElUsuario.InterfasGrafica;

public class Aplicacion {
	OperacionesDeConversion misOperaciones;
	public Aplicacion() {
		misOperaciones = new OperacionesDeConversion();
		
		interfasGrafica();
	}
	private void interfasGrafica() {
		InterfasGrafica interfasGrafica = new InterfasGrafica();
		interfasGrafica.setVisible(true);
	}
}
