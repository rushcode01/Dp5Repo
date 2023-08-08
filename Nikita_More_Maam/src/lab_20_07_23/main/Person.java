package lab_20_07_23.main;

public class Person {
	protected int id;
	protected String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
     public void setId(int id){
    	 this.id = id;
     }
     public void seName( String name){
    	 this.name = name;
     }
     public int getId(){
    	 return id;
     }
     public String getName(){
    	 return name;
     }
}
