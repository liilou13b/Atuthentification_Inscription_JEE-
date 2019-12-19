package metier.entities;

import java.io.Serializable;

public class Utilisateur implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String login;
	private String passWord;
	private String nom;
	private String prenom;
	
	public Utilisateur() {}
	
	public Utilisateur(String login,String password ,String nom,String Prenom)
	{
		this.prenom=Prenom;
		this.login=login;
		this.nom=nom;
		this.passWord=password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
