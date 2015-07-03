package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayToastMessage(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayMsgButton1(View view) {

        CharSequence text = "This button will launch my spotify streamer app!";
        displayToastMessage(text);

    }
    public void displayMsgButton2(View view) {

        CharSequence text = "This button will launch my scores app!";
        displayToastMessage(text);

    }
    public void displayMsgButton3(View view) {

        CharSequence text = "This button will launch my library app!";
        displayToastMessage(text);

    }
    public void displayMsgButton4(View view) {

        CharSequence text = "This button will launch my build it bigger app!";
        displayToastMessage(text);

    }
    public void displayMsgButton5(View view) {

        CharSequence text = "This button will launch my bacon reader app!";
        displayToastMessage(text);

    }
    public void displayMsgButton6(View view) {

        CharSequence text = "This button will launch my capstone app!";
        displayToastMessage(text);

    }

}
