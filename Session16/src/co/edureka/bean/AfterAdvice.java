package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// Shall be executed after the business logic of our bean i.e. before allocateSeat
	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		
		System.out.println("====AfterReturningAdvice Starts====");
		
		System.out.println("Method is: "+method.getName());
		
		System.out.println("-----------");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("-----------");
		System.out.println("obj1 is: "+obj1);
		
		System.out.println("-----------");
		System.out.println("obj2 is: "+obj2);
		
		
		
		System.out.println("====AfterReturningAdvice Ends====");
		
		// Post-Processing
		if(method.getName().equals("allocateSeat")){
			int seat = (int)objArr[2];
			if(seat<0){
				int floor = (int)objArr[1];
				floor++;
				System.out.println("Please Allocate new seat on floor "+floor);
			}
		}
		
	}

}
