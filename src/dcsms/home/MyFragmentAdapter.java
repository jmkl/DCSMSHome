package dcsms.home;

import com.viewpagerindicator.IconPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
	 protected static final String[] CONTENT = new String[] { "This", "Is", "A", "Test", };
	    protected static final int[] ICONS = new int[] {
	            R.drawable.indic
	    };

	    private int mCount = CONTENT.length;

	    public MyFragmentAdapter(FragmentManager fm) {
	        super(fm);
	    }

	    @Override
	    public Fragment getItem(int position) {
	        return MyFragment.newInstance(CONTENT[position % CONTENT.length]);
	    }

	    @Override
	    public int getCount() {
	        return mCount;
	    }

	    @Override
	    public CharSequence getPageTitle(int position) {
	      return MyFragmentAdapter.CONTENT[position % CONTENT.length];
	    }

	    @Override
	    public int getIconResId(int index) {
	      return ICONS[index % ICONS.length];
	    }

	    public void setCount(int count) {
	        if (count > 0 && count <= 10) {
	            mCount = count;
	            notifyDataSetChanged();
	        }
	    }
	}