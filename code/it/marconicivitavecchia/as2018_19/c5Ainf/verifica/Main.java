//compito feuli
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>SpeedTest</h1>");

		// Create div for table
		sb.append("<div style='display:table'>");

		// create the first row
		sb.append("<div style='display:table-row'>");

		
		sb.append("<div style='display:table-cell'>");
		sb.append("Date");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Up(mbps)");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Down(mbps)");
		sb.append("</div>");

		// close first row
		sb.append("</div>");

		// create the second row
		sb.append("<div style='display:table-row'>");

	
		sb.append("<div style='display:table-cell'>");
		sb.append("1/7/18");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("25.0");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("28.9");
		sb.append("</div>");

		// close third row
		sb.append("</div>");

		// create the second row
		sb.append("<div style='display:table-row'>");

		
		sb.append("<div style='display:table-cell'>");
		sb.append("7/9/18");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("24.6");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("1.99");
		sb.append("</div>");


		// close third row
		sb.append("</div>");

		// close div for table
		sb.append("</div>");

		sb.append("</html>");

		String str = sb.toString();

		super.add(new JLabel(str));

		
		super.setVisible(true);

		
		
		 
		
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

