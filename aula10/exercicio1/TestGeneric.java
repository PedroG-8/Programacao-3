package aula10.exercicio1;
import java.util.Iterator;

public abstract class TestGeneric 
	{
	public static void main(String[] args) 
		{
		VectorGeneric<Pessoa> vp = new VectorGeneric<Pessoa>();
		
		for (int i = 0; i < 10; i++)
		{
			vp.addElem(new Pessoa("Bebé no Vector " + i, 1000 + i, Data.today()));	
		}
		
		Iterator<Pessoa> vec = vp.iterator();
		printSet(vp.iterator());
		ListaGeneric<Pessoa> lp = new ListaGeneric<Pessoa>();
		
		while (vec.hasNext())
		{
			lp.addElem(vec.next());
		}
		
		Iterator<Pessoa> lista = lp.iterator();
		while (lista.hasNext())
		{
			System.out.println(lista.next());	
		}
		
		ListaGeneric<Figura> figList = new ListaGeneric<Figura>();
		figList.addElem(new Circulo (1,3, 1));
		figList.addElem(new Quadrado(3,4, 2));
		figList.addElem(new Retangulo(1,2, 2,5));
		
		printSet(figList.iterator());
		System.out.println("Soma da Area de Lista de Figuras: " + sumArea(figList));
		
		// Partindo do principio que Quadrado extends Rectangulo:
		
		ListaGeneric<Retangulo> quadList = new ListaGeneric<Retangulo>();
		quadList.addElem(new Quadrado(3,4, 2));
		quadList.addElem(new Retangulo(1,2, 2,5));
		System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}
	
	public static double sumArea(ListaGeneric<? extends Figura> list)
	{
		double total = 0;
		Iterator<? extends Figura> it = list.iterator();
		while(it.hasNext())
		{
			total = total + ((Figura)it.next()).area();
		}
		return total;
	}
	
	public static void printSet(Iterator<?> iterator)
	{
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}