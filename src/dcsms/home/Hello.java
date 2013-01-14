package dcsms.home;

import java.util.ArrayList;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Hello extends Activity {
	private InfoAplikasi cInfo;
	private ArrayList<PInfo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        cInfo = new InfoAplikasi(this);
        list = cInfo.getPackages();
        for (int i = 0; i < list.size(); i++) {
			Log.d("INSTALLED APP", list.get(i).appname);
		}
        
    }
    
}
