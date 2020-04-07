package id.mpeinc.parawisataapps.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SliderPagerAdapter extends FragmentPagerAdapter {

    public SliderPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        return SliderItemFragment.newIntance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
