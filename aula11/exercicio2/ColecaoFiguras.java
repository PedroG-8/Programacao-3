package aula11.exercicio2;
import java.util.*;

public class ColecaoFiguras {

	private List<Figura> figuras = new ArrayList<>();
	private double maxArea;
	private double areaTotal;
	
	// Área máxima da coleção de figuras
	public ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
	}
	
	// Verifica se uma figura existe na coleção
	public boolean exists(Figura f) {
		return figuras.contains(f);
	}
	
	// Adiciona uma figura à coleção
	public boolean addFigura(Figura f) {
		if(f.area() + areaTotal > maxArea || exists(f)) {
			return false;
		}
		else {
			areaTotal = areaTotal + f.area();
			return figuras.add(f);
		}
	}
	
	// Remove uma figura da coleção
	public boolean delFigura(Figura f) {
		if(exists(f)) {
			areaTotal = areaTotal - f.area();
			return figuras.remove(f);
		}
		else 
			return false;
	}
	
	// Retorna a área total ocupada pelas figuras
	public double areaTotal() {
		return areaTotal;
	}
	
	// Retorna a área máxima da coleção de figuras
	public double maxArea() {
		return maxArea;
	}
	
	// Retorna uma lista com todas as figuras da coleção
	public Figura[] getFiguras() {
		return figuras.toArray(new Figura[0]);
	}
	
	// Retorna uma lista com todos os centros das figuras da coleção
	public Ponto[] getCentros() {
		List<Ponto> pontos = new ArrayList<>();
		for(Figura f : getFiguras()) {
			pontos.add(f.getCentro());
		}
		return pontos.toArray(new Ponto[0]);
	}
	
	// Devolve o número de figuras
	public int numFiguras() {
		return figuras.size();
	}
	
	// Retorna as características da coleção
	@Override
	public String toString() {
		return String.format("Área máxima da coleçao de figuras: %f, área ocupada pelas %d figuras: %f",
				maxArea(), numFiguras(), areaTotal());
	}
}
