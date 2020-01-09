package creational.AbstractFactory._01;

public class FurnitureFactory {
	private FurnitureFactory() {
		
	}
	
	public static FurnitureAbsFactory getFactory(Type type) {
		switch (type) {
		case FLASTIC:
			return new FlasticFactory();
			
		case WOOD:
			return new WoodFactory();
		default:
			throw new UnsupportedOperationException("This furniture is unsupported ");
        }
	}
}
