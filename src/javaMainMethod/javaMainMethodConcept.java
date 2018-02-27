package javaMainMethod;

public class javaMainMethodConcept {

	/*1) Can we overload main() method: yes, We can overload main() method. 
	 *If you do any modification to this main() method signature, compilation will be successful. But, you can’t run the java program.*/
	public static void main(String[] args) {
		System.out.println("Execution start from this method");
	}
	void main(int args){
		System.out.println("Another main method");
	}
	double main(int i, double d){
		System.out.println("Another main method");
		return d;
	}
	
	/*2) Can we declare main() method as private or protected or with no access modifier?
	 * No, main() method must be public. This is because to make the main() method accessible to JVM.
	 * If you define main() method other than public, compilation will be successful but you will get run time error as no main method found.
	 * */
	private static void main(String[] args) {
		//Run time error
	}
	
	/*3)Can We Declare main() Method As Non-Static?
	 * No, main() method must be declared as static so that JVM can call main() method without instantiating it’s class. 
	 * If you remove ‘static’ from main() method signature, compilation will be successful but program fails at run time.
	 */
	public void main(String[] args)
    {
        System.out.println(1);         //Run time error
    }
	
	
	/*4) Why main() method must be static?
	 * Suppose, If main() is allowed to be non-static, then while calling the main method JVM has to instantiate it’s class. 
	 * While instantiating it has to call constructor of that class.
	 * There will be an ambiguity if constructor of that class takes an argument.
	 * For example, In the below program what argument JVM has to pass while instantiating class “MainMethod”?.
	 * That’s why main() method must be static.*/
	public javaMainMethodConcept(int i){
		//constructor taking one argument
	}
	public void main(String[] args)
    {
       //main method as non static
    }
	
	
	/*5) Can we change return type of main() method?
	 * No, the return type of main() method must be void only. Any other type is not acceptable.
	 * */
	public static int main(String[] args)
    {
        return 1;    //run time error : No main method found
    }
	
	/* 6) Can main() method take an argument other than string array?
       No, argument of main() method must be string array. */
	
	/*7) Can we run java class without main() method?
	 * No, you can’t run java class without main method. 
	 * But, there are some scenarios like if super class has main() method, then sub class can be run without defining main() method in it. 
	 * For example, if you run class B in the below program, you will get 1 as output.
	 */
	class A
	{
	    public static void main(String[] args)
	    {
	        System.out.println(1);
	    }
	}
	 
	public class B extends A
	{
	 
	}
	
}	

