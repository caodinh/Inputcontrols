package caodinh.inputcontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity extends Activity {
	
	TextView tv_Ketqua;
	CheckBox cb_Bongda, cb_Bongchuyen;

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
		String sothich = "Tổng hợp sở thích của bạn là:";
		
		if (cb_Bongda.isChecked()){
			sothich += "\n Bóng đá";
		}
		
		if (cb_Bongchuyen.isChecked()){
			sothich += "\n Bóng chuyền";
		}
//		switch (view.getId()){
//		case R.id.cbBongda:
//			if (checked){
//				sothich += "Bóng đá\n";
//				
//			}
//			break;
//		case R.id.cbBongchuyen:
//			if (checked){
//				sothich += "Bóng chuyền\n";
//			}
//			break;
//		case R.id.cbBongro:
//			if (checked){
//				sothich += "Bóng rổ\n";
//				tv_Ketqua.setText(sothich);
//			}
//			break;
//		case R.id.cbBongban:
//			if (checked){
//				sothich += "Bóng bàn\n";
//				tv_Ketqua.setText(sothich);
//			}
//			break;
		
		tv_Ketqua.setText(sothich);
	}
	
	
}

