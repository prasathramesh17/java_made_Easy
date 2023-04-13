package section32_annotations;
public class MyChild extends MyParent {
//to ensure that we override things based on parent class
	//(string name in parent class/ same datatype can be overriden by child)
	@Override
	public String greet(String name) {
		return "Hi " + name;
	}
}
