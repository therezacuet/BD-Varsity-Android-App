package com.thereza.varsity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class DetectConnection {             
	  public static boolean checkInternetConnection(Context context) {   

	    ConnectivityManager con_manager = (ConnectivityManager) 
	      context.getSystemService(Context.CONNECTIVITY_SERVICE);

	    if (con_manager.getActiveNetworkInfo() != null
	        && con_manager.getActiveNetworkInfo().isAvailable()
	        && con_manager.getActiveNetworkInfo().isConnected()) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	}