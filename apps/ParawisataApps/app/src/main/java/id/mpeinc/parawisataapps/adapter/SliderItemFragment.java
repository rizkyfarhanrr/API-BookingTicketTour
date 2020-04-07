package id.mpeinc.parawisataapps.adapter;

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

import id.mpeinc.parawisataapps.R;

public class SliderItemFragment extends Fragment {

    private static final String ARG_POSITION = "slider-position";

    @StringRes
    private static final int[] PAGE_TITLES = new int[] {
            R.string.tittle_PackageDestinationTour,
            R.string.tittle_PackageGuide,
            R.string.tittle_PackageHotel,
            R.string.tittle_PackageTravel
    };

    @StringRes
    private static final int[] PAGE_TEXT = new int[] {
            R.string.travel_text,
            R.string.guide_text,
            R.string.hotel_text,
            R.string.travel_text
    };

    @StringRes
    private static final int[] PAGE_IMAGE = new int[] {
            R.drawable.ic_destination_intro,
            R.drawable.ic_guide_intro,
            R.drawable.ic_hotel_intro,
            R.drawable.ic_travel_intro
    };

    @StringRes
    private static final int[] BG_IMAGE = new int[] {
            R.drawable.ic_bg_blue,
            R.drawable.ic_bg_purple,
            R.drawable.ic_bg_red,
            R.drawable.ic_bg_green
    };

    private int position;

    public SliderItemFragment() {

    }

    public static SliderItemFragment newIntance(int position) {
        SliderItemFragment fragment = new SliderItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    };

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

        TextView tittle = view.findViewById(R.id.textViewTittle);
        TextView subtittle = view.findViewById(R.id.textViewSubtittle);
        ImageView imageView = view.findViewById(R.id.imageView);

        tittle.setText(PAGE_TITLES[position]);
        subtittle.setText(PAGE_TEXT[position]);
        imageView.setImageResource(PAGE_IMAGE[position]);
    }
}
