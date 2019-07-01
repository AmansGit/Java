class A{
	String name;
	int age, roll_no;
	A(int a,String ss){
		name=ss;
		age=a;

	}
	A(String sss,int ag){
		this(ag,sss);
		name=sss;

	}
	A(String s,int agg,int k){
		this(s,agg);
		roll_no=k;
	}
	void show(){
		System.out.println("Name:: " + name+" , "+"Age::"+age+" , " + "Roll_no" + roll_no);
	}

}
public class ConstrChaining{
	public static void main(String[] args) {
		A ob =new A("Aman Sharma ji",22,120);
		ob.show();
	}
}