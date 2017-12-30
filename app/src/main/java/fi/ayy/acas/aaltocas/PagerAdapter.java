package fi.ayy.acas.aaltocas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

/**
 * Created by AlisonBilema on 30.12.2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                HomeTab homeTab = new HomeTab();
                return homeTab;
            case 1:
                PresentationsTab presentationsTab = new PresentationsTab();
                return presentationsTab;
            case 2:
                SpeakersTab speakersTab = new SpeakersTab();
                return speakersTab;
            case 3:
                AboutusTab aboutusTab = new AboutusTab();
                return aboutusTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
