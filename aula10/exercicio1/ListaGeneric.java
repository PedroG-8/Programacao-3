package aula10.exercicio1;
import java.util.*;

public class ListaGeneric<T>
{
	
	private List<T> elements = new LinkedList<>();
	
	public boolean addElem(T elem) {
		return elements.add(elem);
	}
	
	public boolean removeElem(T elem) {
		return elements.remove(elem);
	}
	
	public int totalElem() {
		return elements.size();
	}
	
	public Iterator<T> iterator() {
		return elements.iterator();
	}
	
}