
package com.orin.ashiq.yify;

import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class M
    extends SherlockActivity
    implements TabListener
{

    @ViewById
    TextView hello;
    private String[] locations;

    @AfterViews
    void afterViews() {
        locations = getResources().getStringArray(R.array.locations);
        configureActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

    private void configureActionBar() {
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String location: locations) {
            Tab tab = getSupportActionBar().newTab();
            tab.setText(location);
            tab.setTabListener(this);
            getSupportActionBar().addTab(tab);
        }
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
    }
    @Override
 public void onTabUnselected(Tab tab, FragmentTransaction ft) {}@Override
public void onTabReselected(Tab tab, FragmentTransaction ft) {}
}
