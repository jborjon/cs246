package com.josephborjon.favoritescripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayScriptureActivity extends AppCompatActivity {

    // Constant fields
    public final static int TEXT_SIZE = 36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        // Get the intent that created this activity
        Intent intent = getIntent();

        // Extract the messages from the intent
        String bookName = intent.getStringExtra(MainActivity.BOOK_NAME);
        String chapter = intent.getStringExtra(MainActivity.CHAPTER);
        String verse = intent.getStringExtra(MainActivity.VERSE);

        // Create the text view
        TextView textView = new TextView(this);

        // Set the text
        textView.setTextSize(TEXT_SIZE);
        textView.setText("Your favorite scripture is: " + bookName + ' ' + chapter + ':' + verse);

        // Add the text view to the layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.scripture_display);
        layout.addView(textView);

        // Announce a toast!
        displaySharedToast();
    }

    // Display a toast when the scripture is shared
    protected void displaySharedToast() {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Scripture shared successfully",
                Toast.LENGTH_LONG);

        myToast.show();
    }
}
