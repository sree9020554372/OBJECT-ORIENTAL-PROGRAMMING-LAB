class Student{
	int stid,mark1,mark2,mark3;
	String stname;
	
	Student(){
		stid=15;
		stname="Sreelekshmi A";
		mark1=100;
		mark2=60;
		mark3=25;
	}
	Student(int id,String name,int m1,int m2, int m3){
		stid=id;
		stname=name;
		mark1=m1;
		mark2=m2;
		mark3=m3;
		
	}
	Student(int m1,int m2,int m3){
		stid=33;
		stname="Sruthy";
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void display(){
		int tot;
		double avg;
		tot=mark1+mark2+mark3;
		avg=tot/3;
		
	    System.out.println("student id:" +stid );
        System.out.println("student name:" +stname);
		System.out.println("marks of English:" +mark1);
		System.out.println("marks of Java:" +mark2);
		System.out.println("marks of Python:" +mark3);	
		System.out.println("\n");
	}
}
      
	  
public class StudentDetails{
	public static void main(String args[]){
		
		Student obj1=new Student();
		obj1.display();
		Student obj2=new Student(2,"ammu",60,40,50);
		obj2.display();
		Student obj3=new Student(30,70,90);
		obj3.display();
	    
    }
}	
	
	  
	  
