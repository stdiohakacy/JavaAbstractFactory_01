package creational.AbstractFactory._01;

interface Chair {
	void create();
}

class FlasticChair implements Chair {

	@Override
	public void create() {
		System.out.println("Create flastic chair");

	}

}

class WoodChair implements Chair {

	@Override
	public void create() {
		System.out.println("Create wood chair");

	}

}
