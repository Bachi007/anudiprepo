package com.samplejpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("batsman")
public class batsman extends teamindia {

	private String battingHand;
	private int HighestScore;
	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestScore() {
		return HighestScore;
	}
	public void setHighestScore(int highestScore) {
		HighestScore = highestScore;
	}
	
}
