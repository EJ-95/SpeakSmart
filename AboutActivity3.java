package com.serc.joh40010740.speaksmart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by emmajohnston on 11/05/2017.
 */

public class AboutActivity3 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about3);
        gestureObject = new GestureDetectorCompat(this, new LearnGesture());
    }

    public boolean onTouchEvent(MotionEvent event) {

        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    // Creating Gesture Class - SimpleOnGestureListener listening to what we want to do and how - swipe?
    class LearnGesture extends GestureDetector.SimpleOnGestureListener {

        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {

            if (event2.getX() > event1.getX()) {
                Intent intent = new Intent(AboutActivity3.this, AboutActivity2.class);
                finish();
                startActivity(intent);
            }
            else
            {
                if(event2.getX() > event1.getX()) {
                    Intent intent = new Intent(AboutActivity3.this, AboutActivity1.class);
                    finish();
                    startActivity(intent);
                }
            }
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(final MenuItem item) {

        //respond to menu item selection
        switch (item.getItemId()) {
            case R.id.id_about:
                startActivity((new Intent(this, AboutActivity1.class)));
                return true;
            case R.id.id_translator:
                startActivity(new Intent(this, TranslatorActivity.class));
                return true;
            case R.id.id_countries:
                startActivity((new Intent(this, WebActivity.class)));
                return true;
            case R.id.id_logout:
                startActivity((new Intent(this, MainActivity.class)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
