package backend;
import java.util.HashMap;

public class Disque {
	private String mdisque="F";
	private HashMap<String,String>	listUtilisateurs=new HashMap<String,String>();
	private HashMap<String,String>	listAdmins=new HashMap<String,String>();


	public Disque(String nom){
		mdisque=nom;
	}
	public String getNomDisque(){
		return mdisque;
	}
	public HashMap<String, String> getUsers(){
		return listUtilisateurs;
	}

	public HashMap<String, String> getAdmins() {
		return listAdmins;
	}
	public boolean addAdmin(String name, String motDepasse){
		if(this.getAdmins().get(name)==null){
			listUtilisateurs.put(name,motDepasse);
			return true;
		}
		else;
		{return false;
	    }
	}
	public boolean addUser(String name, String motDepasse){
			if(this.getUsers().get(name)==null){
				listUtilisateurs.put(name,motDepasse);
				return true;
			}else {
				return false;
			}
		}

}
