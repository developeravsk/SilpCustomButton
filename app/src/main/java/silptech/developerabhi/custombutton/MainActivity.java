package silptech.developerabhi.custombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import silptech.developerabhi.silpbutton.SilpCustomButton;

public class MainActivity extends AppCompatActivity {
    SilpCustomButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (SilpCustomButton) findViewById(R.id.clickbtn);
        b1.setText("Hello world");
        b1.setRadius(5);
        b1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        b1.setBorderColor(getResources().getColor(R.color.colorTint));
        b1.setBorderWidth(5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
