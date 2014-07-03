package caodinh.inputcontrols;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btn_Checkbox;
	Button btn_Radio, btn_Toggle, btn_Spinner, btn_Picker;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        
        btn_Checkbox.setOnClickListener(new ClickEvent());
        btn_Radio.setOnClickListener(new ClickEvent());
        btn_Toggle.setOnClickListener(new ClickEvent());
        btn_Spinner.setOnClickListener(new ClickEvent());
        btn_Picker.setOnClickListener(new ClickEvent());
    }


	private void init() {
		btn_Checkbox = (Button) findViewById(R.id.btnCheckbox);
		btn_Radio = (Button) findViewById(R.id.btnRadioButton);
		btn_Toggle = (Button) findViewById(R.id.btnToggle);
		btn_Spinner = (Button) findViewById(R.id.btnSpinners);
		btn_Picker = (Button) findViewById(R.id.btnPickers);
	}
	
	
	class ClickEvent implements OnClickListener{

		@Override
		public void onClick(View v) {
			if (v == btn_Checkbox){
				Intent checkbox_intent = new Intent(MainActivity.this,CheckboxActivity.class);
				startActivity(checkbox_intent);
			}
			else if (v == btn_Radio){
				
			}
			else if (v == btn_Toggle){
				
			}
			else if (v == btn_Spinner){
	
			}
			else if (v == btn_Picker){
				
			}
		}
		
	}
}
