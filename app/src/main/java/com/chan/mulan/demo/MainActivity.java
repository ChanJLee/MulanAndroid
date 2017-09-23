package com.chan.mulan.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.chan.mulan.Mulan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
		InputStream inputStream = getResources().openRawResource(R.raw.etc);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String content = null;
		StringBuilder stringBuilder = new StringBuilder();
		try {
			while ((content = bufferedReader.readLine()) != null) {
				stringBuilder.append(content);
				stringBuilder.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Mulan.render(stringBuilder.toString(), recyclerView);
	}
}
