package com.serc.joh40010740.speaksmart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import java.io.*;
import android.content.Context;
import android.widget.Toast;

public class CreateACActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createac);
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

    public void NavigationLogin(View view) {

        // Save Email to file.
        EditText textEmail;
        textEmail = (EditText)findViewById(R.id.txtEnterEmailAddress);
        String strData = textEmail.getText().toString();

        String filename = "f_email";
        FileOutputStream outputStream;

        try
        {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(strData.getBytes());
            outputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Save Password to file.
        EditText textPassword;
        textPassword = (EditText)findViewById(R.id.txtEnterPassword);
        String strData2 = textPassword.getText().toString();

        String filename2 = "f_password";
        FileOutputStream outputStream1;

        try
        {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(strData.getBytes());
            outputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            // Starting a New Intent.
            Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(nextScreen);
        }
    }
