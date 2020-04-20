// TODO 9.2: Add SliderItemFragment
package id.mpeinc.introslider.adapter;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import id.mpeinc.introslider.R;

public class SliderItemFragment extends Fragment {

    private static final String ARG_POSITION = "slider-position";

    // TODO 9.2.1: Prepare all tittle ids arrays
    @StringRes
    private static final int[] PAGE_TITLES = new int[] {
            R.string.discover,
            R.string.shop,
            R.string.offers,
            R.string.rewards
    };

    // TODO 9.2.2: Prepare all subtitle ids arrays
    @StringRes
    private static final int[] PAGE_TEXT = new int[] {
            R.string.discover_text,
            R.string.shop_text,
            R.string.offers_text,
            R.string.rewards_text
    };

    // TODO 9.2.3: Prepare all subtitles images arrays
    @StringRes
    private  static final int[] PAGE_IMAGE = new int[] {
            R.drawable.ic_backpack,
            R.drawable.ic_hotel,
            R.drawable.ic_guide,
            R.drawable.ic_mountain
    };

    // TODO 9.2.4: Preapre all background images arrays
    @StringRes
    private static final int[] BG_IMAGE = new int[] {
            R.drawable.ic_bg_blue,
            R.drawable.ic_bg_green,
            R.drawable.ic_bg_red,
            R.drawable.ic_bg_purple
    };

    private int position;

    public SliderItemFragment() {
        // Required empty public constructor
    }

    /**
     *
     * Use this factory method to create a new instance of
     *
     * @return A new instance of fragment SliderItemFragment
     *
     */

    public static SliderItemFragment newInstance(int position) {
        SliderItemFragment fragment = new SliderItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slider_item, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackground(requireActivity().getDrawable(BG_IMAGE[position]));

        TextView tittle = view.findViewById(R.id.textView);
        TextView tittletext = view.findViewById(R.id.textView2);
        ImageView imageView = view.findViewById(R.id.imageView);

        tittle.setText(PAGE_TITLES[position]);
        tittletext.setText(PAGE_TEXT[position]);
        imageView.setImageResource(PAGE_IMAGE[position]);
    }
}
