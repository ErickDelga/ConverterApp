package InteracionConElUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InterfasGrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfasGrafica frame = new InterfasGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfasGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JComboBox comboBoxMonedaInicial = new JComboBox();
		comboBoxMonedaInicial.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		comboBoxMonedaInicial.setModel(new DefaultComboBoxModel(new String[] {"-->Selecione Moneda a Convertir<--", "Dolar Estadounidense", "Peso Mexicano"}));
		comboBoxMonedaInicial.setBounds(42, 78, 235, 22);
		contentPane.add(comboBoxMonedaInicial);
		
		JComboBox comboBoxMonedaFinal = new JComboBox();
		comboBoxMonedaFinal.setModel(new DefaultComboBoxModel(new String[] {"-->Selecione Moneda a Convertir<--", "Dolar Estadounidense", "Peso Mexicano"}));
		comboBoxMonedaFinal.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		comboBoxMonedaFinal.setBounds(364, 79, 235, 22);
		contentPane.add(comboBoxMonedaFinal);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBackground(new Color(128, 255, 128));
		btnConvertir.setForeground(new Color(128, 0, 255));
		btnConvertir.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		btnConvertir.setBounds(233, 197, 199, 38);
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
		
		JLabel lblResultado = new JLabel("AutoBorrable");
		lblResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 302, 635, 108);
		contentPane.add(lblResultado);
	}
}
