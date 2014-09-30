package com.example.buttonexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	//Define the button and text view as b and tv respectively
	Button b;
	TextView tv;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        
        //Refer the button from xml with the id of button b and text view tv which is "button1" & textView1 respectively 
        tv=(TextView)findViewById(R.id.textView1);
        b=(Button)findViewById(R.id.button1);
        
        //Before clicking the button 
        tv.setText("Just Click the Below Button");
        //After clicking the button 
        b.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View arg0)
			{
				tv.setText("You Clicked Button");
				
			}
		});
    }
    
}
