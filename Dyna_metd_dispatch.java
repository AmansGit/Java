/*	Author:: Aman Kumar Sharma
 *	Prob::	Dynamic method dispatching using simple programme.
 *	lang_used::	Java
 */

import java.util.*;
abstract class Animal
{
	abstract void type();
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Animal ref;
		System.out.println("enter 1 for Tiger and 2 for Cat");
		int n=in.nextInt();
		if(n==1)
		{
			ref=new Tiger();
			ref.type();
		}
		if(n==2)
		{
			ref=new Cat();
			ref.type();
		}
		
	}
}
class Tiger extends Animal{
	void type(){
		System.out.println("CARNIVOROUS");
	}
}
class Cat extends Animal{
	void type(){
		System.out.println("HERBIVOROUS");
	}
}

