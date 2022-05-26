package com.institutmvm.controller.ui;

import javax.swing.*;
import java.awt.*;



public class App {
	
	/** 
	 * Crea una finestra per sel·leccionar el formulari específic
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String[] type = { "Cartilaginos", "Alga", "Molusc", "Ocell" };

		JComboBox combo = new JComboBox(type);

		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.add(combo);

		int result = JOptionPane.showConfirmDialog(null, panel, "Tipus",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if (result == JOptionPane.OK_OPTION) {
			System.out.println("OK");
			System.out.println(combo.getSelectedItem());

		} else {
			System.out.println("Cancel");
		}

		if (result == JOptionPane.OK_OPTION) {
			Forms forms = new Forms();

			switch (combo.getSelectedItem().toString()) {
				case "Cartilaginos":
					forms.CartilaginosForm();
					break;
				case "Alga":
					forms.AlgaForm();
					break;
				case "Molusc":
					forms.MoluscForm();
					break;
				case "Ocell":
					forms.OcellForm();
					break;
				default:
					break;
			}
			JOptionPane.showMessageDialog(null, "Accio completada correctament", 
			"Ending", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("Cancelled");
		}
	}
}