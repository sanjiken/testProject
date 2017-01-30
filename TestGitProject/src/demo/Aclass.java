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
		String k = "kadhé";
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
		
		p.setNom("nader");
		
		
		
		return (b*f);
	}
	public float essai23(){
		List<TestnadGit> tag = new ArrayList<TestnadGit>();
		tag.add(new TestnadGit());
		float b = 478;
		float f = 1545;
		return (b*f);
	}
		
	
}
