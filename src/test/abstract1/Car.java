package test.abstract1;

public abstract class Car {
	public String name;
	
	public void showInfo() {
		System.out.println(name + "클래스가 상속 받은 Car는 자식 클래스를 규격화하는 추상 클래스이다.");
	}
	
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLeft();
	public abstract void turnRight();
}
