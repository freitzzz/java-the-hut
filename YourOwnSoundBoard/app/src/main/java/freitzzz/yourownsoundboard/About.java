package freitzzz.yourownsoundboard;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends Activity {
    private Button github;
    private static final String URL_GITHUB="https://github.com/portosummerofcode/java-the-hut";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        createButton();
    }
    private void createButton(){
        github=(Button)findViewById(R.id.github);
        createListeners();
    }
    private void createListeners(){
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(URL_GITHUB)));
            }
        });
    }
}
