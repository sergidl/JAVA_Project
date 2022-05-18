package com.institutmvm.controller.ui;

import javax.swing.*;
import java.awt.*;



public class App {
	
	/** 
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

		// after the user clicks OK, the dialog is hidden and the program continues
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
		} else {
			System.out.println("Cancelled");
		}
	}
}