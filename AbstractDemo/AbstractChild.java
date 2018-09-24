package AbstractDemo;

public class AbstractChild extends AbstractBase{
	
	void test(){
		System.out.println("abstract method implimented");
	};
	
	public static void main(String Args[]){
		AbstractChild chd = new AbstractChild();
		chd.test();
		chd.test2();	//can have implementations as well.
	}

}
