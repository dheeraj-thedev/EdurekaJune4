package co.edureka;


interface State{
	void showState();
}

class InitialState implements State{
	
	public void showState() {
		System.out.println("InitialState of Order");
	}
}

class FinalState implements State{

	public void showState() {
		System.out.println("FinalState of Order");
	}
}

class Order{
	
	State state;
	
	void changeState(State s){
		state = s;
	}
	
	void checkState(){
		state.showState();
	}
	
}


public class StateClient {

	public static void main(String[] args) {
		
		InitialState iState = new InitialState();
		FinalState fState = new FinalState();
		
		Order order = new Order();
		order.changeState(iState);
		
		order.checkState();
		//..
		//...
		System.out.println("==Order in Processing==");
		
		order.changeState(fState);
		order.checkState();
	}

}
