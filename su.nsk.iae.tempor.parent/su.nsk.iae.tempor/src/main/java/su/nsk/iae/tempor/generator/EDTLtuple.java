package su.nsk.iae.tempor.generator;

public class EDTLtuple {
	String trigger;
	String release;
	String reaction;
	String invariant;
	String delay;
	String finale;
	
	public EDTLtuple() {
		trigger="True";
		release="True";
		reaction="True";
		invariant="True";
		delay="True";
		finale="True";
	}
	
	public String getTrigger() {
		return trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getInvariant() {
		return invariant;
	}
	public void setInvariant(String invariant) {
		this.invariant = invariant;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	public String getFinale() {
		return finale;
	}
	public void setFinale(String finale) {
		this.finale = finale;
	}
	
	
}
