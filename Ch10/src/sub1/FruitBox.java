package sub1;



public class FruitBox<T> { // <T> = generic ¼±¾ð
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
