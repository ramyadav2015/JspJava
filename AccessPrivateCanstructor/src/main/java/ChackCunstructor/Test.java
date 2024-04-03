package ChackCunstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test  {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		//creat with new
		//Demo demo = new Demo();
	
		//create with restricted api
		Constructor<Demo> constructor = Demo.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Demo demo = constructor.newInstance();
		
		demo.dispaly();
	}
}
