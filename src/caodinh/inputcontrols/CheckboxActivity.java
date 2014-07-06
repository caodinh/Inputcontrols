package caodinh.inputcontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity extends Activity {
	
	TextView tv_Ketqua;
	CheckBox cb_Bongda, cb_Bongchuyen;
// Hi Top khung long dey
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkbox);
		tv_Ketqua = (TextView) findViewById(R.id.tvKetqua);
		cb_Bongda = (CheckBox) findViewById(R.id.cbBongda);
		cb_Bongchuyen = (CheckBox) findViewById(R.id.cbBongchuyen);
		
	}
	
	public void onCheckboxClicked(View view){
//		boolean checked = ((CheckBox) view).isChecked();
		String sothich = "Tá»•ng há»£p sá»Ÿ thĂ­ch cá»§a báº¡n lĂ :";
		
		if (cb_Bongda.isChecked()){
			sothich += "\n BĂ³ng Ä‘Ă¡";
		}
		
		if (cb_Bongchuyen.isChecked()){
			sothich += "\n BĂ³ng chuyá»�n";
		}
//		switch (view.getId()){
//		case R.id.cbBongda:
//			if (checked){
//				sothich += "BĂ³ng Ä‘Ă¡\n";
//				
//			}
//			break;
//		case R.id.cbBongchuyen:
//			if (checked){
//				sothich += "BĂ³ng chuyá»�n\n";
//			}
//			break;
//		case R.id.cbBongro:
//			if (checked){
//				sothich += "BĂ³ng rá»•\n";
//				tv_Ketqua.setText(sothich);
//			}
//			break;
//		case R.id.cbBongban:
//			if (checked){
//				sothich += "BĂ³ng bĂ n\n";
//				tv_Ketqua.setText(sothich);
//			}
//			break;
		
		tv_Ketqua.setText(sothich);
	}
	
	
}

