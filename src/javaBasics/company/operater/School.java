package javaBasics.company.operater;

public class School {
	int rollnum;
	String name;
	float fee;
	
	School(int rollnum,String name,float fee){
		this.rollnum = rollnum;
		this.name = name;
		this.fee = fee;
	}
	void display(){
		System.out.println(rollnum+" "+name+" "+fee);
	}
	public static void main(String[]args) {
		School j1 = new School(215,"shaik",8700f);
		School j2 = new School(219,"annu",8900f);
		j1.display();
		j2.display();
	}
}