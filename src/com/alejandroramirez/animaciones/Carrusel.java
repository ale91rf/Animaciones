package com.alejandroramirez.animaciones;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Carrusel extends Activity {

	private ImageView imageView;
	private AnimationDrawable mAnim;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carrusel);
		
		getVistas();
	}

	private void getVistas() {
		imageView = (ImageView) findViewById(R.id.img);

		imageView.setBackgroundResource(R.drawable.view_animation);

		mAnim = (AnimationDrawable) imageView.getBackground();
		
	}
	
	@Override
	protected void onPause() {
 		super.onPause();
		if (mAnim.isRunning()) {
			mAnim.stop();
		}
	}


	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			mAnim.start();
		}
	}

}
