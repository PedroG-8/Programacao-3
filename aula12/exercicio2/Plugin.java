package aula12.exercicio2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

abstract class PluginManager
{
	public static IPlugin load(String name) throws Exception
	{
		Class<?> c = Class.forName(name);
		return (IPlugin)c.newInstance();
	}
}

public class Plugin
{
	public static void main(String[] args) throws Exception
	{	
		File proxyList = new File("reflection/plugins");
		ArrayList<IPlugin> plgs = new ArrayList<IPlugin>();
		for(String f: proxyList.list())
		{
			try
			{
				plgs.add(PluginManager.load("reflection." + f.substring(0, f.lastIndexOf('.'))));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		Iterator<IPlugin> it = plgs.iterator();
		while(it.hasNext())
		{
			it.next().fazQualquerCoisa();
		}
	}
}
