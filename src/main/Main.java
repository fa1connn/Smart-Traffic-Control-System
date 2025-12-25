package main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import GUI.SmartCityTraffic;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> new SmartCityTraffic().setVisible(true));
    }
}