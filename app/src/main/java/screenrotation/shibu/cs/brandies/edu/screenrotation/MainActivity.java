package screenrotation.shibu.cs.brandies.edu.screenrotation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameTxt;
    int switchFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onRotation(this.getResources().getConfiguration());
        changeText();
    }

//    //check orientation and do sth
//    private void onRotation(Configuration newConfig) {
//        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            //add a textview
//
//
//        }
//    }

    //add listener to button and change text when click it
    private void changeText() {
        //set button id and txt id
        Button button = (Button)findViewById(R.id.magic);
        nameTxt = (TextView) findViewById(R.id.my_name);
        switchFlag = 0;
        //set button behavior
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switchFlag = 1 - switchFlag;
                if(switchFlag == 1) {
                    nameTxt.setText(getResources().getString(R.string.my_name));
                    Log.i("ScreenRotation", "onClick: clicked on 1");
                } else {
                    nameTxt.setText("");
                    Log.i("ScreenRotation", "onClick: clicked on 0");
                }


            }
        });
    }

}
