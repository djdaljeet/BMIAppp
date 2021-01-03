package dj.example.bmiapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void calcbmi(View view)
    {
      double height=0;
      double weight=0;
      double bmi= 0;
      String msg="";



        EditText editText1=findViewById(R.id.editText1);
        EditText et2=findViewById(R.id.editText2);

        Button b1=findViewById(R.id.button2);

        TextView t1=findViewById(R.id.textView1);
        TextView t2=findViewById(R.id.textView2);

    weight=Double.parseDouble(editText1.getText().toString());
    height=Double.parseDouble(et2.getText().toString());

    bmi=height*height;
    bmi=weight/bmi;

    t1.setText(String.valueOf(bmi));
    if(bmi<18.5)
    {
        msg="Underweight";

    }
    else if(bmi>18.5&&bmi<25){
        msg="Normal";

    }
    else if(bmi>25)
    {
        msg="Overweight";
    }


    t2.setText(msg);
    }
}