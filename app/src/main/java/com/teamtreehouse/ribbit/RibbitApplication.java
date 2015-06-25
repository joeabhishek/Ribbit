package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this,
				"AF22fREUG6WkkBKE3HNivDEUrldT3r6X2GOSy7Zx",
	    		"mIPOwflcGbBNhbkd0E4hteolbIWuCFNZMpLYRcZQ");
	}
}
