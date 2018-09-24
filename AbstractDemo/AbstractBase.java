package AbstractDemo;
abstract class AbstractBase {
	
	public AbstractBase(){};	// it can have a constructor
	abstract void test();	//must be implemented/coded by the child class 
	//abstract void err(){};	////error: Abstract methods do not specify a body
	
	void test2(){		//may or maynot be coded in the child class
		System.out.println("called from Abstract Base Class");
	};
}

/*
 * abstract classes cannot be final, "The class AbstractBase can be either abstract or final, not both"
 * as final restricts it to get inherrited 
 * and abstract method must be implemented by the sub class 
 * ex : public abstract class AbstractEntityODataService<E, J> implements EntityODataService<E> {
 */
