package hr.elpros.kimelkockica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity {

    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();
        final RelativeLayout relativeLayout =(RelativeLayout)findViewById(R.id.rlVar1);


        Button buttonGenerate = (Button)findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.generatenumber);
        final TextView textGenerateNumber1 = (TextView)findViewById(R.id.generatenumber1);
        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(6)));
                textGenerateNumber1.setText(String.valueOf(myRandom.nextInt(6)));
                if (count%4==0)
                {
                    relativeLayout.setBackgroundResource(R.color.red);
                }
                if (count%4==1)
                {
                    relativeLayout.setBackgroundResource(R.color.green);
                }
                if (count%4==2)
                {
                    relativeLayout.setBackgroundResource(R.color.cool);
                }
                if (count%4==3)
                {
                    relativeLayout.setBackgroundResource(R.color.warm);
                }
                count++;

            }
        });
    }
}