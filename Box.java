import java.util.ArrayList;
import java.util.List;

class Thing {
	String name;

	public Thing(String name) {
		this.name = name;
	}
}

class Box {

	List<Thing> contents;

	public Box() {
		contents = new ArrayList<Thing>();
	}

	public void add(String truc) {
		Thing nouveau = new Thing(truc);
		this.contents.add(nouveau);
	}
}
