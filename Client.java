package creational.AbstractFactory._01;

public class Client {
	public static void main(String[] args) {
		FurnitureAbsFactory factory = FurnitureFactory.getFactory(Type.FLASTIC);
		
		Chair chair = factory.createChair();
		chair.create();
		
		Table table = factory.createtaTable();
		table.create();
	}
}
