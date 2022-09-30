package com.samplejpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bowler")
public class bowler extends teamindia {

	private String bowlingHand;
	private String bestfigures;
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestfigures() {
		return bestfigures;
	}
	public void setBestfigures(String bestfigures) {
		this.bestfigures = bestfigures;
	}
	
}
