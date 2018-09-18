
public class MyTest {
public static void main(String[] args) {
	//Dog dog = new Dog();
	//Animal anim = (Animal) dog;
	//Animal anim = new Dog();
	//anim.eat();
	//Mammal mam = new Cat();
	//mam.eat();
	Dog dog = new Dog();
	Cat cat = new Cat();
	 
	AnimalTrainer trainer = new AnimalTrainer();
	trainer.teach(dog);
	trainer.teach(cat);
}
}
