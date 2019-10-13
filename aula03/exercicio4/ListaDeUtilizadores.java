package aula03.exercicio4;
import java.util.*;
import aula03.exercicio4.utilizadores.*;

public class ListaDeUtilizadores {

	private List<Utilizador> users = new ArrayList<>();
	
	public void addUser(Utilizador user) {
		users.add(user);
	}
	
	public void removeUser(Utilizador user) {
		users.remove(user);
	}
	
	public Utilizador getUser(int cc) {
		for(Utilizador user : usersToArray()) {
			if(user.cc() == cc) {
				return user;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public int size() { 
		return users.size(); 
	}
	
	private Utilizador[] usersToArray() { 
		return users.toArray(new Utilizador[0]); 
	}
}