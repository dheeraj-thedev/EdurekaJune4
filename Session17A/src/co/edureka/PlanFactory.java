package co.edureka;

interface Plan{
	void setDataAndPrice();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 2;
		price = 200;
	}
	
	public void showPlan() {
		System.out.println(data+"GB data of Plan2G is avaialble for \u20b9"+price);
	}
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 3;
		price = 300;
	}
	
	public void showPlan() {
		System.out.println(data+"GB data of Plan3G is avaialble for \u20b9"+price);
	}
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 5;
		price = 400;
	}
	
	public void showPlan() {
		System.out.println(data+"GB data of Plan4G is avaialble for \u20b9"+price);
	}
}

class UnlimitedPlan implements Plan{
	
	int price;
	
	public void setDataAndPrice() {
		price = 1000;
	}
	
	public void showPlan() {
		System.out.println("Unlimited data of Plan4G is avaialble for \u20b9"+price);
	}
}


public class PlanFactory {
	
	public static Plan getPlan(int typeOfPlan){
		
		Plan plan = null;
		
		switch (typeOfPlan) {
		
			case 2:
				plan = new Plan2G();
				break;
	
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
				
			case 1:
				plan = new UnlimitedPlan();
				break;	
		}
		
		plan.setDataAndPrice();
		return plan;
		
	}

}
