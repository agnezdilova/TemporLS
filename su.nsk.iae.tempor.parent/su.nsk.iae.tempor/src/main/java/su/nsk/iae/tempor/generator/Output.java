package su.nsk.iae.tempor.generator;


public class Output {
	StringBuilder EDTLcsv;
	StringBuilder ltl;
	
	public Output() {
		EDTLcsv = new StringBuilder();
		EDTLcsv.append(", Trigger, Invariant, Release, Reaction, Delay, Final\n");
		ltl = new StringBuilder();
	}
	
	public void addEDTLtuple(EDTLtuple t, int num) {
		EDTLcsv.append(num+", "+t.getTrigger()+", "+t.getInvariant()+", "+t.getRelease()+", "+t.getReaction()+", "+t.getDelay()+", "+t.getFinale()+"\n");
	}
	
	public void addLtl(String ltl) {
		this.ltl.append(ltl+"\n");
	}
	
	public String getEDTLcsv() {
		return EDTLcsv.toString();
	}
	
	public String getLtl() {
		return ltl.toString();
	}
}
