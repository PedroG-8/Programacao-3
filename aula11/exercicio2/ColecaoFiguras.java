package aula11.exercicio2;
import java.util.*;

public class ColecaoFiguras {

	private List<Figura> figuras = new ArrayList<>();
	private double maxArea;
	private double areaTotal;
	
	// �rea m�xima da cole��o de figuras
	public ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
	}
	
	// Verifica se uma figura existe na cole��o
	public boolean exists(Figura f) {
		return figuras.contains(f);
	}
	
	// Adiciona uma figura � cole��o
	public boolean addFigura(Figura f) {
		if(f.area() + areaTotal > maxArea || exists(f)) {
			return false;
		}
		else {
			areaTotal = areaTotal + f.area();
			return figuras.add(f);
		}
	}
	
	// Remove uma figura da cole��o
	public boolean delFigura(Figura f) {
		if(exists(f)) {
			areaTotal = areaTotal - f.area();
			return figuras.remove(f);
		}
		else 
			return false;
	}
	
	// Retorna a �rea total ocupada pelas figuras
	public double areaTotal() {
		return areaTotal;
	}
	
	// Retorna a �rea m�xima da cole��o de figuras
	public double maxArea() {
		return maxArea;
	}
	
	// Retorna uma lista com todas as figuras da cole��o
	public Figura[] getFiguras() {
		return figuras.toArray(new Figura[0]);
	}
	
	// Retorna uma lista com todos os centros das figuras da cole��o
	public Ponto[] getCentros() {
		List<Ponto> pontos = new ArrayList<>();
		for(Figura f : getFiguras()) {
			pontos.add(f.getCentro());
		}
		return pontos.toArray(new Ponto[0]);
	}
	
	// Devolve o n�mero de figuras
	public int numFiguras() {
		return figuras.size();
	}
	
	// Retorna as caracter�sticas da cole��o
	@Override
	public String toString() {
		return String.format("�rea m�xima da cole�ao de figuras: %f, �rea ocupada pelas %d figuras: %f",
				maxArea(), numFiguras(), areaTotal());
	}
}
