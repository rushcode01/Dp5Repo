//WAP to create class Person with method readScript().create class Actor which
//extends Person implement readScript() differently in child.

package com.overrriding;
class Person{
	String script;
	public void readScript(String script) {
		this.script = script;
	}
	public String toString() {
		return " "+ script;
	}
}
class Actor extends Person{
	@Override
public void readScript(String script) {
		this.script = script;
	}
}
public class MovieInfo {
public static void main(String[] args) {
	Actor a1 = new Actor();
	a1.readScript("Mahabharat");
	System.out.println(a1);
}
}
