package cuentaclicks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaPrincipal implements ActionListener {
	JLabel lValor;
	int contador;
	
	public PantallaPrincipal(){
		JFrame pantalla = new JFrame("Cuenta Clicks"); //Creas la pantalla
		contador = 0;
		pantalla.setSize(300, 400);
		pantalla.setLocation(480, 100);
		
		pantalla.setContentPane(crearPanelVentana());//Coloca como panel el panel que te voy a pasar(colocar algo en la zona gris)
		pantalla.setVisible(true);//La haces visible
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//El programa se termina
	}
	
	private Container crearPanelVentana() {
		JPanel panel = new JPanel(new BorderLayout());
		lValor = new JLabel(String.valueOf(contador));
		
		lValor.setFont(new Font("Arial",Font.BOLD,250));
		lValor.setForeground(Color.CYAN);
		
		lValor.setHorizontalAlignment(JLabel.CENTER);//centrar cero
		JButton boton = new JButton("Click me");
		
		boton.addActionListener(this);
		
		panel.add(lValor, BorderLayout.CENTER);
		panel.add(boton, BorderLayout.SOUTH);
		return panel;
	}

	public static void main(String[] args) {
		PantallaPrincipal programa = new PantallaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		contador++;
		lValor.setText(String.valueOf(contador));
		
	}

}
