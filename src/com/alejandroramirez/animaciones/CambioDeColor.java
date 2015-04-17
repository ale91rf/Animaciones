package com.alejandroramirez.animaciones;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class CambioDeColor extends Activity {
	
	final private static int RED = Color.RED;
	final private static int BLUE = Color.BLUE;
	private ImageView imgCambio;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cambio_de_color);
		
		startAnimation();
	}
	
public void startAnimation() {
		
		imgCambio = (ImageView) findViewById(R.id.imgCambio);
		
		ValueAnimator anim = ValueAnimator.ofObject(new ArgbEvaluator(), RED,
				BLUE);

		anim.addUpdateListener(new AnimatorUpdateListener() {

			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				imgCambio.setBackgroundColor((Integer) animation
						.getAnimatedValue());
			}
		});
		
		anim.setDuration(10000);
		anim.start();
	}

}
