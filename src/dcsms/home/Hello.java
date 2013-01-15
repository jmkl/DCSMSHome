package dcsms.home;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import com.viewpagerindicator.IconPageIndicator;
import com.viewpagerindicator.PageIndicator;

public class Hello extends FragmentActivity {
	private InfoAplikasi cInfo;
	private ArrayList<PInfo> list;
	private ViewPager pager;
	private PageIndicator indicator;
	private MyFragmentAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello);
		adapter = new MyFragmentAdapter(getSupportFragmentManager());
		pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(adapter);
		indicator = (IconPageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(pager);

		cInfo = new InfoAplikasi(this);
		list = cInfo.getPackages();
		for (int i = 0; i < list.size(); i++) {
			Log.d("INSTALLED APP", list.get(i).appname);
		}

	}

}
