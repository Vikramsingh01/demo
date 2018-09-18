public class AnimalTrainer {
    public void teach(Animal anim) {
    	anim.move();
        anim.eat();
    	if (anim instanceof Cat) {
    	    Cat cat = (Cat) anim;
    	    cat.meow();
    	} else if (anim instanceof Dog) {
    	    Dog dog = (Dog) anim;
    	    dog.bark();
    	}
    }
}