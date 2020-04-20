// TODO 10.1: Setting MainActivity
package id.mpeinc.introslider;

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

import id.mpeinc.introslider.adapter.SliderPagerAdapter;
import id.mpeinc.introslider.preferences.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    // TODO 10.1.1: Adding declaration
    private ViewPager viewPager;
    private Button button, getStarted;
    private SliderPagerAdapter adapter;
    private PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferenceManager = new PreferenceManager(this);
        if (!preferenceManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        // TODO 10.1.2: Set SDK Version 21 for Usability
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_main);

        // TODO 10.1.3: Setup View & Adapter
        getSupportActionBar().hide();

        viewPager = findViewById(R.id.pagerIntroSlider);
        TabLayout tabLayout = findViewById(R.id.tabs);
        button = findViewById(R.id.button);
        getStarted = findViewById(R.id.buttonGetStarted);

        // Initial slider pager adapter
        adapter = new SliderPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        // Set adapter
        viewPager.setAdapter(adapter);

        // Set dot indicators
        tabLayout.setupWithViewPager(viewPager);

        // TODO 10.1.5: Change Status Bar Color
        changeStatusBarColor();

        // TODO 10.1.6: Button and Slider setup
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() < adapter.getCount()) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                }
            }
        });

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchHomeScreen();
            }
        });


        // TODO 10.1.7: Listener for Adapter

        /**
         *
         * Add a listener that will be invoked whenever the page chanages
         * or is incrementally scrolled
         *
         */

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == adapter.getCount() - 1) {
                    button.setVisibility(View.GONE);
                    getStarted.setVisibility(View.VISIBLE);
                } else {
                    button.setVisibility(View.VISIBLE);
                    getStarted.setVisibility(View.GONE);
                    button.setText("Next");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void launchHomeScreen() {
        preferenceManager.setFirstTimeLaunch(false);
        startActivity(new Intent(MainActivity.this, DashboardActivity.class));
        finish();
    }

    // TODO 10.1.4: Set ChangeStatusBarColor
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
