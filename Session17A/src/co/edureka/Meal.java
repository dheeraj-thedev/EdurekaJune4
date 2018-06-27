package co.edureka;

public class Meal {
	
	int burgers;
	boolean coke;
	String feedback;
	
	private Meal() {
		
	}
	
	private Meal(int b, boolean c, String f) {
		burgers = b;
		coke = c;
		feedback = f;
	}
	
	class Builder{
		
		Meal meal = new Meal();
		
		void setBurger(int b){
			meal.burgers = b;
		}
		
		void isCokeRequired(boolean b){
			meal.coke = b;
		}
		
		void anyFeedback(String f){
			meal.feedback = f;
		}
		
		public Meal buildMeal(){
			return meal;
		}
		
	}

}
