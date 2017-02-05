package io.github.rakshakhegde.emptyapp;

import android.databinding.ObservableArrayList;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Keep
	ObservableArrayList<String> strings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
