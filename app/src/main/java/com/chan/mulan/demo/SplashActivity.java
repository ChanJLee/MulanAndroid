package com.chan.mulan.demo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String[] requestPermissions = {
				"android.permission.WRITE_EXTERNAL_STORAGE",
				"android.permission.READ_EXTERNAL_STORAGE"
		};

		for (String permission : requestPermissions) {
			if (ActivityCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
				ActivityCompat.requestPermissions(this, requestPermissions, 1000);
				return;
			}
		}

		startActivity(new Intent(this, MainActivity.class));
		finish();
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		for (int result : grantResults) {
			if (result != PackageManager.PERMISSION_GRANTED) {
				return;
			}
		}

		startActivity(new Intent(this, MainActivity.class));
		finish();
	}
}
