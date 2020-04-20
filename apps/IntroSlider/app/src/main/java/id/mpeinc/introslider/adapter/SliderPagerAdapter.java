// TODO 9.1: Add SliderPagerAdapter
package id.mpeinc.introslider.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

// TODO 9.1.1: Extends FragmentPagerAdapter
// TODO 9.1.3: Alt + Enter for Add Override Method getItem and getCount
public class SliderPagerAdapter extends FragmentPagerAdapter {

    // TODO 9.1.2: Add public mehtod
    public SliderPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    // TODO 9.1.4: Set new instance
    @Override
    public Fragment getItem(int position) {
        return SliderItemFragment.newInstance(position);
    }

    // TODO 9.1.5: Set count total slider
    @Override
    public int getCount() {
        return 4;
    }
}
