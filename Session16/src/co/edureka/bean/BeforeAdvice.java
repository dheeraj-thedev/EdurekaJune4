package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// Shall be executed before the business logic of our bean i.e. before allocateSeat
	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		System.out.println("====MethodBeforeAdvice Starts====");
		
		System.out.println("Method is: "+method.getName());
		
		System.out.println("-----------");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("-----------");
		System.out.println("obj is: "+obj);
		
		// Pre-Processing
/*		if(method.getName().equals("allocateSeat")){
			int seat = (int)objArr[2];
			if(seat<0){
				int floor = (int)objArr[1];
				floor++;
				System.out.println("Please Allocate new seat on floor "+floor);
			}
		}*/
		
		System.out.println("====MethodBeforeAdvice Ends====");
	}

}
