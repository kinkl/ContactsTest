package com.krld.ContactsTest.activitys;

import android.app.Fragment;
import com.krld.ContactsTest.fragments.TabFragment;

public class TabActivity extends SingleFragmentActivity {
	@Override
	protected Fragment createFragment() {
		return new TabFragment();
	}
}
