
public class Puzzle47WellDogMyCats {

	private static int count;
	public static void increment() { count++; }
	public static int getCount() { return count; }
	}
	/*class Dog extends Puzzle47WellDogMyCats {
	public Dog() { }
	public void woof() { increment(); }
	}
	class Cat extends Puzzle47WellDogMyCats {
	public Cat() { }
	public void meow() { increment(); }
	}
	  class Ruckus {
	public static void main(String[] args) {
	Dog[] dogs = { new Dog(), new Dog() };
	for (int i = 0; i < dogs.length; i++)
	dogs[i].woof();
	Cat[] cats = { new Cat(), new Cat(), new Cat() };
	for (int i = 0; i < cats.length; i++)
	cats[i].meow();
	System.out.print(Dog.getCount() + " woofs and ");
	System.out.println(Cat.getCount() + " meows");
	}*/
	/*
	Neither a dog nor a cat is a kind of counter, so it was wrong to use inheritance.
	Instead of extending Counter, Dog and Cat should each have a counter field. One
	counter is required for each kind of pet, rather than for each individual pet, so the
	fields must be static. We needn’t bother with a Counter class; an int will do fine.
	Here is the redesigned program, which prints 2 woofs and 3 meows as expected:*/
	  
	class Dog {
		private static int woofCounter;
		public Dog() { }
		public static int woofCount() { return woofCounter; }
		public void woof() { woofCounter++; }
		}
		class Cat {
		private static int meowCounter;
		public Cat() { }
		public static int meowCount() { return meowCounter; }
		public void meow() { meowCounter++; }
		}  
	
		class Ruckus {
			public static void main(String[] args) {
			Dog[] dogs = { new Dog(), new Dog() };
			for (int i = 0; i < dogs.length; i++)
			dogs[i].woof();
			Cat[] cats = { new Cat(), new Cat(), new Cat() };
			for (int i = 0; i < cats.length; i++)
			cats[i].meow();
			System.out.print(Dog.woofCount() + " woofs, ");
			System.out.println(Cat.meowCount() + " meows");
			}
	
	/*
			In summary, static fields are shared by their declaring class and any subclasses.
			If you need a separate copy of a field for each subclass, you must declare
			a separate static field in each subclass. If you need a separate copy for each
			instance, declare a nonstatic field in the base class.*/
	  
	  
	  
	  }
	
