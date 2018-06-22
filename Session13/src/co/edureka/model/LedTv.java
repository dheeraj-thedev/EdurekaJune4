package co.edureka.model;

public class LedTv extends Product{ // IS-A Relation

	Integer screenSize;
	Integer smartTv; //1/0
	
	public LedTv(){
		
	}
	
	public LedTv(Integer screenSize, Integer smartTv) {
		this.screenSize = screenSize;
		this.smartTv = smartTv;
	}
	
	public Integer getScreenSize() {
		return screenSize;
	}
	
	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}
	
	public Integer getSmartTv() {
		return smartTv;
	}
	
	public void setSmartTv(Integer smartTv) {
		this.smartTv = smartTv;
	}

	@Override
	public String toString() {
		return "LedTv [screenSize=" + screenSize + ", smartTv=" + smartTv + "]";
	}
	
}
