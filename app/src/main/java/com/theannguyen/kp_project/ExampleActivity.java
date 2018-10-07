package com.theannguyen.kp_project;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExampleActivity extends AppCompatActivity {

    private EditText txtUsername,txtPassword;
    private Button btnLogin,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        gatherControl();
        setupButton();
        createTextView();

//        Resources resources = getResources();
//        resources.getColor(R.color.aqua);
//        ColorDrawable colorDrawable = (ColorDrawable)resources.getDrawable(R.drawable.hinh5);

    }

    private void gatherControl(){
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword.requestFocus();
    }
    private void setupButton(){
        btnLogin    = (Button)   findViewById(R.id.btnLogin);
        btnCancel   = (Button)   findViewById(R.id.btnCacel);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleActivity.this,txtUsername.getText().toString() + " - " + txtPassword.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ExampleActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                intent.putExtra("keyname",txtUsername.getText().toString());
                ExampleActivity.this.startActivity(intent);
            }
        });
    }
    private void createTextView(){
        final TextView textView = new TextView(ExampleActivity.this);
        textView.setText(getResources().getString(R.string.hello));
        textView.setTextSize(25);
        textView.setMinWidth(200);
        textView.setMinHeight(46);
        textView.setBackgroundColor(getResources().getColor(R.color.yellow));
        textView.setTextColor(getResources().getColor(R.color.red));
        textView.setGravity(1);

        setContentView(textView);
    }

}
