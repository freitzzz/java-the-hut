package freitzzz.yourownsoundboard;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    /**
     * Number of visible buttons at a given time in the screen
     */
    private int shownButtons = 0;

    /**
     * Displayed when max number of buttons is reached
     */
    private static final String MAX_BUTTONS_REACHED_ERROR =
            "Maximum number of sounds reached";

    /**
     * Max number of buttons to be displayed on screen
     */
    private static final int MAX_NUMBER_BUTTONS = 16;

    /**
     * Holds all sound buttons
     */
    private ImageButton[] buttons = new ImageButton[MAX_NUMBER_BUTTONS];

    /**
     * Executed on creation of activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateButtonsArray();

        /**
         * Add Sound Button
         */
        final Button addButton = (Button)findViewById(R.id.addbtn);
        addButton.setOnClickListener(addButtonListener());
    }

    /**
     * Add Sound Button Listener
     * @return OnClickListener
     */
    private View.OnClickListener addButtonListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (shownButtons < MAX_NUMBER_BUTTONS) {
                    buttons[shownButtons].setVisibility(View.VISIBLE);
                    shownButtons++;
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setTitle("Error")
                            .setMessage(MAX_BUTTONS_REACHED_ERROR)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    // Do nothing
                                }
                            });
                    builder.show();
                }
            }
        };
    }

    /**
     * Assigns each button to an array element
     */
    private void populateButtonsArray() {
        buttons[0] = (ImageButton) findViewById(R.id.btn0);
        buttons[1] = (ImageButton) findViewById(R.id.btn1);
        buttons[2] = (ImageButton) findViewById(R.id.btn2);
        buttons[3] = (ImageButton) findViewById(R.id.btn3);
        buttons[4] = (ImageButton) findViewById(R.id.btn4);
        buttons[5] = (ImageButton) findViewById(R.id.btn5);
        buttons[6] = (ImageButton) findViewById(R.id.btn6);
        buttons[7] = (ImageButton) findViewById(R.id.btn7);
        buttons[8] = (ImageButton) findViewById(R.id.btn8);
        buttons[9] = (ImageButton) findViewById(R.id.btn9);
        buttons[10] = (ImageButton) findViewById(R.id.btn10);
        buttons[11] = (ImageButton) findViewById(R.id.btn11);
        buttons[12] = (ImageButton) findViewById(R.id.btn12);
        buttons[13] = (ImageButton) findViewById(R.id.btn13);
        buttons[14] = (ImageButton) findViewById(R.id.btn14);
        buttons[15] = (ImageButton) findViewById(R.id.btn15);
    }

}
