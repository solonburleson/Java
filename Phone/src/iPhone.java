
public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ring = super.getRing();
        return ring;
    }
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
    	String version = super.getVersion();
    	String carrier = super.getCarrier();
    	System.out.println("iPhone " + version + " from " + carrier);
    }
}