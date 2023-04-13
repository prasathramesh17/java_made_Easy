package section14_abstraction_example;
public class Test {
//we cannot create a instance for the abstract class
	//(obj creation is not possible to abstract)
// except for abstract class we can create obj for other class which are extended
	public static void main(String[] args) {
  ThreeSeries threeseries = new ThreeSeries();	
  
  threeseries.accelerate();
  threeseries.commonFunc();
  FiveSeries fiveseries = new FiveSeries();
  fiveseries.accelerate();
  fiveseries.commonFunc();
	}

}
