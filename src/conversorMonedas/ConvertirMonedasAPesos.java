package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	// Convertir dólares a pesos colombianos
	public void ConvertirDolaresAPesos(double valor) {
		// Tasa de conversión de dólares a pesos colombianos
		double monedaDolar = valor * 3739.00;
		// Redondear el resultado a dos decimales
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		// Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Colombianos");
	}
	
	// Convertir euros a pesos colombianos
	public void ConvertirEurosAPesos(double valor) {
		// Tasa de conversión de euros a pesos colombianos
		double monedaEuro = valor * 4050.48;
		// Redondear el resultado a dos decimales
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		// Mostrar el monto convertido en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Colombianos");
	}
	
	// Convertir libras esterlinas a pesos colombianos
	public void ConvertirLibrasAPesos(double valor) {
		// Tasa de conversión de libras esterlinas a pesos colombianos
		double monedaLibra = valor * 4890.52;
		// Redondear el resultado a dos decimales
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Colombianos");
	}
	
	// Convertir yenes a pesos colombianos
	public void ConvertirYenAPesos(double valor) {
		// Tasa de conversión de yenes a pesos colombianos
		double monedaYen = valor * 29.68;
		// Redondear el resultado a dos decimales
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Colombianos");
	}
	
	// Convertir wons a pesos colombianos
	public void ConvertirWonAPesos(double valor) {
		// Tasa de conversión de wons a pesos colombianos
		double monedaWon = valor * 3.04;
		// Redondear el resultado a dos decimales
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        // Mostrar el monto convertido en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Colombianos");
	}
}
