package InicializadorDeApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ConversorDeMedida.metodo.ConversorDeMedidaG;
import ConvertidorDeMoneda.Aplicacion;

public class InicializadorDeAplicacion extends JFrame{
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	
	public InicializadorDeAplicacion() {

		setSize(500, 100);
		setTitle("Conversor De Unidades De Medida");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);
	}
	
	
	private void mostrarMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("Elije Que Tipo De Conversor Deseas Usar");
		opcion1 = new JMenuItem("Convertidor De Monedas");
		opcion2 = new JMenuItem("Convertidor De Unidades De Medida");
		
		menu.add(opcion1);
		menu.add(opcion2);
		
		menuBar.add(menu);
		
		opcion1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getClass(new Aplicacion());
			}
			private void getClass(Aplicacion aplicacion) {
				// TODO Auto-generated method stub
				
			}
		});
		opcion2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getClass(new ConversorDeMedidaG());
				ConversorDeMedidaG conversorDeMedidaG = new ConversorDeMedidaG();
				conversorDeMedidaG.setVisible(true);
				conversorDeMedidaG.setLocationRelativeTo(null);
			}
			private void getClass(ConversorDeMedidaG conversorDeMedidaG) {
				// TODO Auto-generated method stub	
			}
		});
		
	}


	public static void main(String[] args) {
		InicializadorDeAplicacion misAplicaciones = new InicializadorDeAplicacion();
		misAplicaciones.setVisible(true);
		misAplicaciones.setLocationRelativeTo(null);
	}
}
