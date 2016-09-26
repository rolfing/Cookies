package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     *  // TODO: Find a reference to the ImageView in the layout. Change the image.
     *  // TODO: Find a reference to the TextView in the layout. Change the text.
     */
    public void eatCookie(View view) {
        ImageView beforeCookieImageView = (ImageView) findViewById(R.id.before_cookie_image_view);
        beforeCookieImageView.setImageResource(R.drawable.aftercookie);

        TextView statusInitialTextView = (TextView) findViewById(R.id.status_initial_text_view);
        statusInitialTextView.setText("I' am Totally full");
    }




    }
