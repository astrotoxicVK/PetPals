package com.entity;

import java.text.ParseException;
import java.util.Date;

import com.controller.PetController;

public class CashDonation extends Donation {
	private Date donationDate;
	
	
	public CashDonation(String donorName, double amount, Date donationDate) {
        super(donorName, amount);
        this.donationDate = donationDate;
    }
	

	
	public Date getDonationDate() {
		return donationDate;
	}


	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}



	@Override
	public void recordDonation() {
		// TODO Auto-generated method stub
		
	}

		
	}
	
	


