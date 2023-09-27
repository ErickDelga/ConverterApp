package ConversorDeMedida.metodo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorDeMedidaG extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;
	private JMenuItem opcion6;
	private JMenuItem opcion7;

	MetodosDeMedida misMetodos = new MetodosDeMedida();

	public ConversorDeMedidaG() {
		
		setSize(500, 100);
		setTitle("Conversor De Unidades De Medida");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);;

		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);
	}

	private void mostrarMenu() {
		// Inicializacion de los atributos
		menuBar = new JMenuBar();
		menu = new JMenu("Elija Una Opcion Valida");
		opcion1 = new JMenuItem("Centimetros para metros");
		opcion2 = new JMenuItem("Metros para Centimetros");
		opcion3 = new JMenuItem("Centimetros para Pulgadas");
		opcion4 = new JMenuItem("Pulgadas para Centimetros");
		opcion5 = new JMenuItem("kilometros para Millas");
		opcion6 = new JMenuItem("Millas para kilometros");
		opcion7 = new JMenuItem("Salir");

		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menu.add(opcion4);
		menu.add(opcion5);
		menu.add(opcion6);
		menu.add(opcion7);

		menuBar.add(menu);

		opcion1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Centimetros: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.deCentimetrosAMetros(cantidad) + " Metros!");
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					
				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});
		opcion2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Metros: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.deMetrosACentimetros(cantidad) + " Centimetros!");

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});
		opcion3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Centimetros: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.deCentimetrosAPulgadas(cantidad) + " Pulgadas!");

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});
		opcion4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Pulgadas: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.dePulgadasACentimetros(cantidad) + " Centimetros!");

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});
		opcion5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Kilometros: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.deKilometrosAMillas(cantidad) + " Millas!");

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});
		opcion6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de Millas: ");
				double cantidad = Double.parseDouble(input);
				JOptionPane.showMessageDialog(null, misMetodos.deMillasAKilometros(cantidad) + " Kilometros!");

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado Elija la Opcion Salir, Gracias!!!");
				}
			}
		});

		opcion7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saliendo del programa");
				System.exit(0);
			}
		});
	}

	/*public static void main(String[] args) {
		ConversorDeMedidaG miVentana = new ConversorDeMedidaG();
		miVentana.setVisible(true);
		miVentana.setLocationRelativeTo(null);
	}*/

}