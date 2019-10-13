package aula12.exercicio1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;


public class ReadClass 
{
	public static void main(String[] args) throws Exception
	{
		try {
			
			Class<?> c1 = Class.forName("aula05.exercicio2.Veiculo");
			Class<?> c2 = Class.forName("aula05.exercicio2.CarroPolicia");
			printMethods(c2);
			dumpConstructor(c1);
		} 
		catch (ClassNotFoundException e) 
		{
			System.err.println("Can't find class");
		}
	}
	
	static void dumpConstructor(Class<?> c) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t\tConstructor of class " + c.getSimpleName());
		System.out.println("-------------------------------------------------------------");
		Class<?>[] paramTypes = { Integer.TYPE, Integer.TYPE };
		Constructor<?> cons = c.getConstructor(paramTypes);
		System.out.println("Create new Vehicle: ");
		System.out.print("Number of wheels: ");
		int wheels = sc.nextInt();
		System.out.print("Number of passengers: ");
		int passengers = sc.nextInt();
		sc.close();
		
		Object ar[] = {wheels, passengers};
		Object theObject = cons.newInstance(ar);
		System.out.println("New Vehicle: " + theObject);
	}
	
	static void printMethods(Class<?> c)
	{
		Method methods[] = c.getMethods();
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t\tMethods of class " + c.getSimpleName() + " (" + methods.length + ")");
		System.out.println("-------------------------------------------------------------");
		for(Method m : methods)
		{
			System.out.println(m.getName());
		}
	}
	
	static void printFields(Class<?> c)
	{
		Field[] flds = c.getClass().getDeclaredFields();
		System.out.println("---------------------------------------------");
		System.out.println("\t\tFields (" + flds.length + ")");
		System.out.println("---------------------------------------------");
		for(Field f : flds)
		{
			System.out.println(f.getName());
		}
	}

}
