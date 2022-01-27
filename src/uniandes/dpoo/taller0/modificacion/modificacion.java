package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class modificacion {
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		try {
			String nombreArchivo="atletas.csv";
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo(nombreArchivo);
			System.out.println(calc.paisConMasMedallistas());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
