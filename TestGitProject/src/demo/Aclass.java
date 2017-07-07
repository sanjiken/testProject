package demo;
//github.com/sanjiken/testProject/
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class Aclass {

	public Test2 essai(){

		String a1 = "just for test";

		int n = 100;
		return new Test2();
	}


	public String essai2(){
		
		String a1 = "just for test";
		String a2 = "just for test 2";
		String a3 = a1+a2;
		if (a1.equals("jjjj")) {
			a1 = "llllll";
		}else{
			a1 = "222222";
		}
		return a3;
	}
		
	
		
		public String essai4(){
			
			String a1 = "just for test";
			String a2 = "just for test 2";
			String a3 = a1+a2;
			if (a1.equals("jjjj")) {
				a1 = "llllll";
			}else{
				a1 = "222222";
			}
			return a3;
		}	
		
		public String essai3(){
			
			String a1 = "just for test";
			String a2 = "just for test 2";
			String a3 = a1+a2;
			if (a1.equals("jjjj")) {
				a1 = "llllll";
			}else{
				a1 = "222222";
			}
			String k = "kadh�";
			return a3;
			

	}
	public float essai22(){
		List<TestnadGit> tag = new ArrayList<TestnadGit>();
		tag.add(new TestnadGit());
		float b = 478;
		float f = 1545;
		
		BigDecimal g = new BigDecimal(15);
		if (g.equals(15)) {
			g.divide(g,5);
			System.out.println("this is your g : " + g);
		}
		
		Person p = new Person();
		// just a comment
		
		p.setNom("nader");
		p.setPrenom("preNader");
		p.setPhone("nad Phone");
		
		toList(p);
		
		return (b*f);
	}
	public float essai23(){
		List<TestnadGit> tag = new ArrayList<TestnadGit>();
		tag.add(new TestnadGit());
		float b = 478;
		float f = 1545;
		return (b*f);
	}

	public List<Person> toList( Person p ){
		
		ArrayList<Person> lp = new ArrayList<Person>();
		
		for (int i = 0; i < 5; i++) {
			lp.add(p);
		}
		
		return lp;
	}
		
	public List<TestnadGit> essai24(){
		List<TestnadGit> tag = new ArrayList<TestnadGit>();
		tag.add(new TestnadGit());
		return tag;
	}
	public float essai235(){
		float b = 478;
		float f = 1545;
		return (b*f);
	}
	
	public Person addPerson(String nom, String prenom, String address){
		return new Person(nom,prenom,address);
	}
 
	public Person addPerson(String nom){
		return new Person(nom);
	}
	
	/*
	 * Arij Comment
	 */
	
	/*
	 * nader Comment
	 */
	
	
}
