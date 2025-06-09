package Practica9.ejercicio_teatro_gui;

import javax.swing.*;
import java.awt.*;

public class TeatroMunicipalGUI extends JFrame {
    private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField txtNumero, txtDias;
    private JTextArea txtResultado;

    public TeatroMunicipalGUI() {
        setTitle("Teatro Municipal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        JPanel panelTipo = new JPanel();
        panelTipo.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));
        rbPalco = new JRadioButton("Palco");
        rbPlatea = new JRadioButton("Platea");
        rbGaleria = new JRadioButton("Galeria");
        ButtonGroup group = new ButtonGroup();
        group.add(rbPalco);
        group.add(rbPlatea);
        group.add(rbGaleria);
        panelTipo.add(rbPalco);
        panelTipo.add(rbPlatea);
        panelTipo.add(rbGaleria);

        JPanel panelInputs = new JPanel();
        panelInputs.add(new JLabel("Número:"));
        txtNumero = new JTextField(5);
        panelInputs.add(txtNumero);
        panelInputs.add(new JLabel("Días:"));
        txtDias = new JTextField(5);
        panelInputs.add(txtDias);

        JPanel panelBotones = new JPanel();
        JButton btnVender = new JButton("Vende");
        JButton btnSalir = new JButton("Salir");
        panelBotones.add(btnVender);
        panelBotones.add(btnSalir);

        txtResultado = new JTextArea(3, 30);
        txtResultado.setEditable(false);

        add(panelTipo);
        add(panelInputs);
        add(panelBotones);
        add(new JScrollPane(txtResultado));

        btnVender.addActionListener(e -> venderBoleto());
        btnSalir.addActionListener(e -> System.exit(0));
    }

    private void venderBoleto() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            int dias = Integer.parseInt(txtDias.getText());
            Boleto boleto = null;

            if (rbPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rbPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else if (rbGaleria.isSelected()) {
                boleto = new Galeria(numero, dias);
            }

            if (boleto != null) {
                txtResultado.setText(boleto.toString());
            } else {
                txtResultado.setText("Seleccione un tipo de boleto.");
            }
        } catch (NumberFormatException ex) {
            txtResultado.setText("Ingrese valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeatroMunicipalGUI().setVisible(true));
    }
}
