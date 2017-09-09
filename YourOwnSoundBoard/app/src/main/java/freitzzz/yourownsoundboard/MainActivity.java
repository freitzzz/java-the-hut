package freitzzz.yourownsoundboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /**
     * Touch buttons Make,Load and About
     */
    private Button about;
    private Button load;
    private Button make;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createButtons();
    }
    private void createButtons(){
        make=(Button)findViewById(R.id.make);
        load=(Button)findViewById(R.id.load);
        about=(Button)findViewById(R.id.about);
        createListeners();
    }
    private void createListeners(){
        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open maker
            }
        });
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open loader
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,About.class));
            }
        });
    }
}
