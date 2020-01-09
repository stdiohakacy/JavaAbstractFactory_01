package creational.AbstractFactory._01;

public class WoodFactory extends FurnitureAbsFactory {

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createtaTable() {
		return new WoodTable();
	}

}
