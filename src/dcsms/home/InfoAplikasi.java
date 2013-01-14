package dcsms.home;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.content.pm.PackageInfo;

public class InfoAplikasi {
	private Context c;

	public InfoAplikasi(Context x) {
		c = x;
	}

	public ArrayList<PInfo> getPackages() {
		return getInstalledApps(false); 
	}

	private ArrayList<PInfo> getInstalledApps(boolean getSysPackages) {
		ArrayList<PInfo> res = new ArrayList<PInfo>();
		List<PackageInfo> packs = c.getPackageManager().getInstalledPackages(0);
		for (int i = 0; i < packs.size(); i++) {
			PackageInfo p = packs.get(i);
			if ((!getSysPackages) && (p.versionName == null)) {
				continue;
			}
			PInfo newInfo = new PInfo();
			newInfo.appname = p.applicationInfo
					.loadLabel(c.getPackageManager()).toString();
			newInfo.pname = p.packageName;
			newInfo.versionName = p.versionName;
			newInfo.versionCode = p.versionCode;
			newInfo.icon = p.applicationInfo.loadIcon(c.getPackageManager());
			res.add(newInfo);
		}
		return res;
	}
}
