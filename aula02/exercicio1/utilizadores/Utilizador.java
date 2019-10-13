package aula02.exercicio1.utilizadores;
import aula02.exercicio1.*;
import java.util.*;

public class Utilizador {

	protected final String name;
	protected final int cc;
	protected final Data birthDate;
	protected List<Video> watchedVideos;
	protected List<Video> videoHistory;
	
	public Utilizador(String name, int cc, Data birthDate){
		this.name = name;
		this.cc = cc;
		this.birthDate = birthDate;
		watchedVideos = new ArrayList<>();
		videoHistory = new ArrayList<>();
	}
	
	public void lendVideoToUser(Video video) {
		watchedVideos.add(video);
		videoHistory.add(video);
	}
	public void returnVideoFromUser(Video video) { 
		watchedVideos.remove(video);
	}
	
	public Data dataNascimento() { 
		return birthDate; 
	}
	
	public String nome() {
		return name;	
	}
	
	public int cc() { 
		return cc; 
	}
	
	public int numberOfVideosOwned() {
		return watchedVideos.size(); 
	}
	
	public String toString() { 
		return toString(" | "); 
	
	}
	public String toString(String mid) { 
		return name + mid + cc + mid + birthDate; 
	}
	
	public Video[] watchedVideosToArray() { 
		return watchedVideos.toArray(new Video[0]); 
	}
	
	public Video[] historyVideosToArray() { 
		return videoHistory.toArray(new Video[0]); 
	}
}