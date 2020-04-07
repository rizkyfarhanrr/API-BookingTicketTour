package id.mpeinc.parawisataapps.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import id.mpeinc.parawisataapps.R;
import id.mpeinc.parawisataapps.adapter.SliderPagerAdapter;
import id.mpeinc.parawisataapps.dashboard.DashbaordActivity;
import id.mpeinc.parawisataapps.function.PreferenceSliderManager;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Button buttonNext, buttonGetStarted;
    private SliderPagerAdapter sliderPagerAdapter;
    private PreferenceSliderManager preferenceSliderManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferenceSliderManager = new PreferenceSliderManager(this);
        if (!preferenceSliderManager.isFirstTimeLaunch()) {
            launchToDashboard();
            finish();
        }

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_welcome);

        getSupportActionBar().hide();

        viewPager = findViewById(R.id.pagerIntroSlider);
        TabLayout tabLayout = findViewById(R.id.tabs);
        buttonNext = findViewById(R.id.buttonNext);
        buttonGetStarted = findViewById(R.id.buttonGetStarted);

        sliderPagerAdapter = new SliderPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager.setAdapter(sliderPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        changeStatusBarColor();

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() < sliderPagerAdapter.getCount()) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                }
            }
        });

        buttonGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToDashboard();
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == sliderPagerAdapter.getCount() - 1) {
                    buttonNext.setVisibility(View.GONE);
                    buttonGetStarted.setVisibility(View.VISIBLE);
                } else {
                    buttonNext.setVisibility(View.VISIBLE);
                    buttonGetStarted.setVisibility(View.GONE);
                    buttonNext.setText("Next");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void launchToDashboard() {
        preferenceSliderManager.setFirstTimeLaunch(false);
        startActivity(new Intent(WelcomeActivity.this, DashbaordActivity.class));
        finish();
    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
