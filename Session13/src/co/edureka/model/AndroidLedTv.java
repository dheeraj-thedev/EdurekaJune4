package co.edureka.model;

public class AndroidLedTv extends LedTv{

	Integer androidVersion;
	Integer numOfdefaultApps;
	
	public AndroidLedTv(){
		
	}
	
	public AndroidLedTv(Integer androidVersion, Integer numOfdefaultApps) {
		this.androidVersion = androidVersion;
		this.numOfdefaultApps = numOfdefaultApps;
	}

	public Integer getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(Integer androidVersion) {
		this.androidVersion = androidVersion;
	}

	public Integer getNumOfdefaultApps() {
		return numOfdefaultApps;
	}

	public void setNumOfdefaultApps(Integer numOfdefaultApps) {
		this.numOfdefaultApps = numOfdefaultApps;
	}

	@Override
	public String toString() {
		return "AndroidLedTv [androidVersion=" + androidVersion + ", numOfdefaultApps=" + numOfdefaultApps + "]";
	}
}
