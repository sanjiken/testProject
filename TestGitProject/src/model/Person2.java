/**
 * 
 */
package model;

/**
 * @author pc
 *
 */
public class Person2 {

	String nom ;
	String prenom;
	String phone;
	public Person2() {
		super();
	}
	public Person2(String nom, String prenom, String phone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.phone = phone;
	}
	public Person2(String nom) {
		this.nom=nom;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
