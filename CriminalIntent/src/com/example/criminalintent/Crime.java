package com.example.criminalintent;

import java.util.UUID;

public class Crime {
	
private UUID mId;
public String getmTitle() {
	return mTitle;
}



public void setmTitle(String mTitle) {
	this.mTitle = mTitle;
}



public UUID getmId() {
	return mId;
}



private String mTitle;



public Crime(){
	mId = UUID.randomUUID();
}
}
