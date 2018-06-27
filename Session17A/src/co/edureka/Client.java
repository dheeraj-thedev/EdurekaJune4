package co.edureka;

import javax.swing.plaf.metal.MetalBorders;

public class Client {

	public static void main(String[] args) {
		
		// More than 1 object constructed
		/*SingleTon sRef1 = new SingleTon();
		SingleTon sRef2 = new SingleTon();

		System.out.println(sRef1);
		System.out.println(sRef2);*/
		
		/*SingleTon sRef1 = SingleTon.getSingleTon();
		SingleTon sRef2 = SingleTon.getSingleTon();

		System.out.println(sRef1);
		System.out.println(sRef2);
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println(con1);
		System.out.println(con2);*/
		
		Plan plan = PlanFactory.getPlan(1);
		plan.showPlan();
		
		// Meal.Builder //..
	}

}
