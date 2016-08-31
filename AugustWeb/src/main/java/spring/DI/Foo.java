package spring.DI;

public class Foo {

	Bar bar;
	Baz baz;


	String str;
	String str1;
	String str2;
	
	
	int i;

	void doFoo() {
		bar.doIt();
	}

	Foo(Bar bar, Baz baz) {
		System.out.println("Bar bar Baz baz");
		this.bar = bar;
		this.baz = baz;
	}

	Foo(String str, int i) {
		this.str = str;
		this.i = i;
		System.out.println("str" + str + " " + i);
	}
	
	
	Foo(String str1,String str2){
		this.str1=str1;
		this.str2=str2;
		System.out.println("String,String :: " + str1+str2);
	}

}
