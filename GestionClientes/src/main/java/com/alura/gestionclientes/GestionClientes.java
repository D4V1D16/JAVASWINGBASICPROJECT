/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alura.gestionclientes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class GestionClientes {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestión de Clientes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            PanelInput panel = new PanelInput();
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    } 
}

