package creational.AbstractFactory._01;

public class FlasticFactory extends FurnitureAbsFactory {

	@Override
	public Chair createChair() {
		return new FlasticChair();
	}

	@Override
	public Table createtaTable() {
		return new FlasticTable();
	}

}
