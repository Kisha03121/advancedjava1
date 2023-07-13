package ineerclasses;

class Robot {

	int id;

	class B {
		void think() {
			System.out.println("Robot " + id + " started thinking");
			// here we have created inner class or we can say nested class of Robot...
			// we can create an object of inner class in the method of other class that we
			// have created it in. class b is member inner class...its created inside of the
			// class but outside of the method.
		}
	}

	static class A {
		void charge() {
			System.out.println("a is charging"); // here we have created static class as an inner class..
													// we cannot use id in this class as it is declared as an instance
													// variable...and we cannot use non static variables in static
													// methods or classes
		}
	}

	public Robot(int id) {
		this.id = id;
		System.out.println("Starting robot " + id); // here is an object of the inner class
		B b = new B();
		b.think();
		class C {
			String name = "Kisha";

			void dosomething() {
				System.out.println("My name is " + name); // here we are creating inner class inside of the constructor
			}
		}

		C c = new C();
		c.dosomething();

	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot(2);

		Robot.B b = r.new B(); // I have created object of nested class using its main class... Here Robot.B
								// refers to B class....and r is instance of robot class..Via r we are accessing
								// the object of the B class.
		b.think();

		Robot.A a = new Robot.A(); // we can easily create an instance of static inner class...static can be used
									// without creating an instance and referring to a class..here static is used as
									// inner class and super class of static is not static...so we will need to call
									// it via object..so its straight that we are creating object of super class and
									// referring it to its inner class which is static
		a.charge();
	}

}

//there are two types of nested class...
//1. Static nested class (A static class was created within the class.)
//2. Non static nested class
//
//There are three categories of non static nested class:
//1. member inner class  (in this program its class B, which is inside of the class and outside of the method)
//2. local inner class   (In this program its class C, which is inside of the constructor/method)
//3. Anonymous inner class  (A class created for implementing an interface or extending class. The java compiler decides its name.)


