package com.alejandroramirez.animaciones;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Animacion extends Activity {

	private ImageView img;
	private Animation mAnim;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animacion);

		img = (ImageView) findViewById(R.id.img);

		mAnim = AnimationUtils.loadAnimation(this, R.anim.view_animation);

	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			img.startAnimation(mAnim);
		}
	}
	
}
