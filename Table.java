package creational.AbstractFactory._01;

interface Table {
	void create();
}

class FlasticTable implements Table {

	@Override
	public void create() {
		System.out.println("Create flastic table");
	}
}

class WoodTable implements Table {
	@Override
	public void create() {
		System.out.println("Create wood table");
	}
}
