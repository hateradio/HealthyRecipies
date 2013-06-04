package co.example.healthyrecipies;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RecipieActivity extends Activity {
	
	protected TextView t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recipe);
		
		t = (TextView) findViewById(R.id.header_recipie);
		t.setText(String.format(getResources().getString(R.string.header_recipie), "Simple Salsa"));
	}
}
