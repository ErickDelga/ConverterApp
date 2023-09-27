package InteracionConElUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConvertidorDeMonedaOperaciones.OperacionesDeConversion;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InterfasGrafica extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidad;
	private JComboBox comboBoxMonedaInicial;
	private JButton btnConvertir;
	private double cantidad;
	private double operacion;
	
	OperacionesDeConversion misOperaciones = new OperacionesDeConversion();
	JLabel lblResultado;
	
	public InterfasGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarCompientes();
		
		setTitle("Convertidor de Monedas");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarCompientes() {
		
		setBounds(100, 100, 670, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BIENVENIDO AL CONVERTIDOR DE MONEDAS");
		lblTitulo.setBackground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 645, 31);
		contentPane.add(lblTitulo);
		
		JLabel lblTitulo2 = new JLabel("SELECCIONA TU CONVERSION");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblTitulo2.setBackground(Color.BLACK);
		lblTitulo2.setBounds(0, 53, 645, 14);
		contentPane.add(lblTitulo2);
		
		comboBoxMonedaInicial = new JComboBox();
		comboBoxMonedaInicial.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		comboBoxMonedaInicial.setModel(new DefaultComboBoxModel(new String[] {"-->Selecione Moneda a Convertir<--", 
																			"Colon Salvadoreño a Dolar Estadounidense", 
																			"Dolar Estadounidense a Colon Salvadoreño", 
																			"Colon Salvadoreño a Peso Mexicano", 
																			"Peso Mexicano a Colon Salvadoreño", 
																			"Colon Salvadoreño a Euros", 
																			"Euros a Colon Salvadoreño", 
																			"Colon Salvadoreño a Libras Esterlinas", 
																			"Libras Esterlinas a Colon Salvadoreño ", 
																			"Colon Salvadoreño a Yen Japones", 
																			"Yen Japones a Colon Salvadoreño", 
																			"Colon Salvadoreño a Won Sur-Coriano", 
																			"Won Sur-Coriano a Colon Salvadoreño"}));
		comboBoxMonedaInicial.setBounds(110, 78, 435, 22);
		contentPane.add(comboBoxMonedaInicial);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBackground(new Color(128, 255, 128));
		btnConvertir.setForeground(new Color(128, 0, 255));
		btnConvertir.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		btnConvertir.setBounds(233, 197, 199, 38);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		textCantidad = new JTextField();
		textCantidad.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		textCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad.setBounds(346, 134, 136, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Ingresa Una Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblCantidad.setBounds(190, 137, 146, 17);
		contentPane.add(lblCantidad);
		
		lblResultado = new JLabel("AutoBorrable");
		lblResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 302, 635, 108);
		contentPane.add(lblResultado);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int tipoDeConversion = comboBoxMonedaInicial.getSelectedIndex();
		if(btnConvertir == e.getSource() && tipoDeConversion == 1) {
			//double cantidad = (double) Integer.parseInt(textCantidad.getText());
			cantidad = Double.parseDouble(textCantidad.getText());
			//System.out.println(cantidad);
			operacion = misOperaciones.deColonSalvadorehnoADolar(cantidad);
			
			lblResultado.setText("La Cantidad en Dolares Estadounidenses es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 2) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deDolarAColonSalvadorehno(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 3) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deColonSalvadorehnoAPesoMexicano(cantidad);
			lblResultado.setText("La Cantidad en Pesos Mexicanos es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 4) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.dePesoMexicanoAColonSalvadorenho(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 5) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deColonSalvadorehnoAEuros(cantidad);
			lblResultado.setText("La Cantidad en Euro es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 6) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deEurosAColonSalvadorehno(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 7) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deColonSalvadorehnoALibrasEsterlinas(cantidad);
			lblResultado.setText("La Cantidad en Libras Esterlinas es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 8) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deLibrasEsterlinasAColonSalvadorehno(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 9) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deColonSalvadorehnoAYenJapones(cantidad);
			lblResultado.setText("La Cantidad en Yen Japones es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 10) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deYenJaponesAColonSalvadorehno(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 11) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deColonSalvadorehnoAWonSurCoriano(cantidad);
			lblResultado.setText("La Cantidad en Won Sur-Coriano es: "+ operacion);
		}if(btnConvertir == e.getSource() && tipoDeConversion == 12) {
			cantidad = Double.parseDouble(textCantidad.getText());
			operacion = misOperaciones.deWonSurCorianoAColonSalvadorehno(cantidad);
			lblResultado.setText("La Cantidad en Colones Salvadoreños es: "+ operacion);
		}else if(tipoDeConversion == 0){
			
			lblResultado.setText("Debe Selecionar Una Forma De Convercion");
		}
				
	}
	public void asignarOperaciones (OperacionesDeConversion misOperaciones){
		this.misOperaciones = misOperaciones;
	}
}
