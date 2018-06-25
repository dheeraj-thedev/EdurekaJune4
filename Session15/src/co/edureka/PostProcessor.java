package co.edureka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanName) throws BeansException {
		
		System.out.println("==postProcessAfterInitialization=="+beanName);
		
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanName) throws BeansException {
		
		System.out.println("==postProcessBeforeInitialization=="+beanName);
		
		return beanRef;
	}

}
