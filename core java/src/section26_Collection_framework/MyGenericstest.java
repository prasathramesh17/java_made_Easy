package section26_Collection_framework;

class  MyGenericstest<T> {

	T obj;
	
	MyGenericstest(T obj){
		this.obj = obj;
	}
	public void displayobjDetails() {
		System.out.println("type of object:"+ obj.getClass().getName());
	}
	public T getobj() {
		return obj;
	}
	}

