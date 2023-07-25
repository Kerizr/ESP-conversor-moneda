package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	// Convertir pesos a dólares
	public void ConvertirPesosADolares(double valor) {
		// Tasa de conversión de pesos a dólares
		double monedaDolar = valor / 3739.00;
		// Redondear el resultado a dos decimales
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	// Convertir pesos a euros
	public void ConvertirPesosAEuros(double valor) {
		// Tasa de conversión de pesos a euros
		double monedaEuro = valor / 4050.48;
		// Redondear el resultado a dos decimales
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		// Mostrar el monto convertido en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	// Convertir pesos a libras esterlinas
	public void ConvertirPesosALibras(double valor) {
		// Tasa de conversión de pesos a libras esterlinas
		double monedaLibra = valor / 4890.52;
		// Redondear el resultado a dos decimales
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	
	// Convertir pesos a yenes
	public void ConvertirPesosAYen(double valor) {
		// Tasa de conversión de pesos a yenes
		double monedaYen = valor / 29.68;
		// Redondear el resultado a dos decimales
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yuanes");
	}
	
	// Convertir pesos a wons
	public void ConvertirPesosAWon(double valor) {
		// Tasa de conversión de pesos a wons
		double monedaWon = valor / 3.04;
		// Redondear el resultado a dos decimales
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wons");
	}
}
