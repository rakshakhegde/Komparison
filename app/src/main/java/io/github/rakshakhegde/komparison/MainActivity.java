package io.github.rakshakhegde.komparison;

import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;

import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter;

public class MainActivity extends AppCompatActivity {

	@Keep
	LastPagerAdapter pagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pagerAdapter = new LastPagerAdapter(0);
	}
}
