package com.serc.joh40010740.speaksmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;
import java.io.*;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    // Declaration of Global Variables.
    public static String strEmail = "";
    public static String strPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

        final EditText ed = (EditText) findViewById(R.id.txtEnterPassword);
        CheckBox c = (CheckBox) findViewById(R.id.chkShowPassword);

        c.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (!isChecked)
                {
                    ed.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                else
                {
                    ed.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
    }

    public void NavigationTranslator(View view) {

        // Save Email to Declared Variable strEmail - save Email to file.
        EditText textEmail;
        textEmail = (EditText)findViewById(R.id.txtEnterEmailAddress);
        strEmail = textEmail.getText().toString();

        // Save Password to Declared Variable strPassword.
        EditText textPassword;
        textPassword = (EditText)findViewById(R.id.txtEnterPassword);
        strPassword = textPassword.getText().toString();

        // Verifying Email and Password.
        if(strEmail.equals("emma@serc.ac.uk") && strPassword.equals("admin"))
        {
            // Starting a New Intent.
            Intent nextScreen = new Intent(getApplicationContext(), TranslatorActivity.class);
            startActivity(nextScreen);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Invalid Email Address or Password. Use email " +
                                                    "'emma@serc.ac.uk' and password 'admin' to test.",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void NavigationCreateAC(View view) {

        // Starting a New Intent.
        Intent nextScreen = new Intent(getApplicationContext(), CreateACActivity.class);
        startActivity(nextScreen);
    }
}
