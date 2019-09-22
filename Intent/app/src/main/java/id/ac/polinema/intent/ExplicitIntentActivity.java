package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
    }

    public void handleShow(View view) {
        EditText teksedit = (EditText) findViewById(R.id.input_name);
        TextView text = (TextView) findViewById(R.id.text_output);
        text.setText("Hello "+teksedit.getText()+", Congratulations!");
    }
}
