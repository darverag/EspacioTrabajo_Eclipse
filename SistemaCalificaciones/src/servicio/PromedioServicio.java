package servicio;

import java.util.List;

public class PromedioServicio {
	
	public double calculadoraPromedio (List<Double>valores) {
		double acumulador=0;
		
		for(Double valor : valores) {
			acumulador += valor;
		}
		
		if(valores.isEmpty()) {
			return 0.0;
		}
		return acumulador/valores.size();
		
	}

}
