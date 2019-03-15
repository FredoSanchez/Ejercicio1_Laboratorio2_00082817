package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private TextView showView;
    private TextView UserName;
    private TextView Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        showView = findViewById(R.id.choose);
        UserName = findViewById(R.id.user);
        Password = findViewById(R.id.pass);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showView.setText(UserName.getText());
            }
        });

        loginButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showView.setText(Password.getText());
                return false;
            }
        });
    }
}
