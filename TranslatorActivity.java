package com.serc.joh40010740.speaksmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import android.speech.tts.TextToSpeech;
import android.widget.Toast;

/**
 * Created by emmajohnston on 11/05/2017.
 */

public class TranslatorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextToSpeech t1;
    Button b1;

    Spinner spinner,spinner1,spinner2;
    ArrayAdapter<CharSequence> adapter,adapter1,adapter2;
    ArrayList<String> languages, languages1, languages2;

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        String spinner_text = spinner.getSelectedItem().toString();
        String spinner_text1 = spinner1.getSelectedItem().toString();
        String spinner_text2 = spinner2.getSelectedItem().toString();
        if (spinner_text.equals("English")) {
            adapter2.clear();
            adapter2.add("Spanish");
            adapter2.add("French");
            adapter2.notifyDataSetChanged();
            adapter1.clear();
            adapter1.add("Hello");
            adapter1.add("Goodbye");
            adapter1.add("Please");
            adapter1.add("Thank you");
            adapter1.add("How much?");
            adapter1.add("Do you speak English?");
            adapter1.notifyDataSetChanged();
            spinner_text2 = spinner2.getSelectedItem().toString();
            spinner_text1 = spinner1.getSelectedItem().toString();
            if (spinner_text2.equals("Spanish")) {
                if (spinner_text1.equals("Hello")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Hola");
                } else if (spinner_text1.equals("Goodbye")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Adiós");
                } else if (spinner_text1.equals("Please")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Por favor");
                } else if (spinner_text1.equals("Thank you")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Gracias");
                } else if (spinner_text1.equals("How much?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Cuánto?");
                } else if (spinner_text1.equals("Do you speak English?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("¿Habla usted Inglés?");
                }
            } else if (spinner_text2.equals("French")){
                if (spinner_text1.equals("Hello")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Bonjour");
                } else if (spinner_text1.equals("Goodbye")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Au Revoir");
                } else if (spinner_text1.equals("Please")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("S\'il vous plaît");
                } else if (spinner_text1.equals("Thank you")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Je vous remercie");
                } else if (spinner_text1.equals("How much?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Combien?");
                } else if (spinner_text1.equals("Do you speak English?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Parlez vous anglais?");
                }
            }
        } else if (spinner_text.equals("Spanish")) {
            adapter2.clear();
            adapter2.add("English");
            adapter2.add("French");
            adapter2.notifyDataSetChanged();
            adapter1.clear();
            adapter1.add("Hola");
            adapter1.add("Adiós");
            adapter1.add("Por favor");
            adapter1.add("Gracias");
            adapter1.add("Cuánto?");
            adapter1.add("¿Habla usted Inglés?");
            adapter1.notifyDataSetChanged();
            spinner_text2 = spinner2.getSelectedItem().toString();
            spinner_text1 = spinner1.getSelectedItem().toString();
            if (spinner_text2.equals("English")) {
                if (spinner_text1.equals("Hola")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Hello");
                } else if (spinner_text1.equals("Adiós")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Goodbye");
                } else if (spinner_text1.equals("Por favor")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Please");
                } else if (spinner_text1.equals("Gracias")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Thank you");
                } else if (spinner_text1.equals("Cuánto?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("How much?");
                } else if (spinner_text1.equals("¿Habla usted Inglés?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Do you speak English?");
                }
            } else {
                if (spinner_text1.equals("Hola")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Bonjour");
                } else if (spinner_text1.equals("Adiós")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Au Revoir");
                } else if (spinner_text1.equals("Por favor")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("S\'il vous plaît");
                } else if (spinner_text1.equals("Gracias")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Je vous remercie");
                } else if (spinner_text1.equals("Cuánto?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Combien");
                } else if (spinner_text1.equals("¿Habla usted Inglés?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Parlez vous anglais?");
                }
            }
        } else {
            adapter2.clear();
            adapter2.add("English");
            adapter2.add("Spanish");
            adapter1.clear();
            adapter2.notifyDataSetChanged();
            adapter1.add("Bonjour");
            adapter1.add("Combien?");
            adapter1.add("S\'il vous plaît");
            adapter1.add("Je vous remercie");
            adapter1.add("Au Revoir");
            adapter1.add("Parlez vous anglais?");
            adapter1.notifyDataSetChanged();
            spinner_text2 = spinner2.getSelectedItem().toString();
            spinner_text1 = spinner1.getSelectedItem().toString();
            if (spinner_text2.equals("English")) {
                if (spinner_text1.equals("Bonjour")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Hello");
                } else if (spinner_text1.equals("Au Revoir")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Goodbye");
                } else if (spinner_text1.equals("S\'il vous plaît")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Please");
                } else if (spinner_text1.equals("Je vous remercie")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Thank you");
                } else if (spinner_text1.equals("Combien?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("How much?");
                } else if (spinner_text1.equals("Parlez vous anglais?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Do you speak English?");
                }
            } else {
                if (spinner_text1.equals("Bonjour")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Hola");
                } else if (spinner_text1.equals("Au Revoir")){
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Adiós");
                } else if (spinner_text1.equals("S\'il vous plaît")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Por favor");
                } else if (spinner_text1.equals("Je vous remercie")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Gracias");
                } else if (spinner_text1.equals("Combien?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("Cuánto?");
                } else if (spinner_text1.equals("Parlez vous anglais?")) {
                    TextView tView = (TextView) findViewById(R.id.translated_phrase);
                    tView.setText("¿Habla usted Inglés?");
                }
            }
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        spinner = (Spinner) findViewById(R.id.from_language_spinner);
        String[] langs = getResources().getStringArray(R.array.languages);
        languages = new ArrayList<String>(Arrays.asList(langs));
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner1 = (Spinner) findViewById(R.id.phrases);
        langs = getResources().getStringArray(R.array.english_phrases);
        languages1 = new ArrayList<String>(Arrays.asList(langs));
        adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, languages1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
        spinner2 = (Spinner) findViewById(R.id.to_language_spinner);
        langs = getResources().getStringArray(R.array.languages);
        languages2 = new ArrayList<String>(Arrays.asList(langs));
        adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, languages2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        final TextView ed1=(TextView)findViewById(R.id.translated_phrase);
        b1 = (Button)findViewById(R.id.btnSpeak);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.FRENCH);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = ed1.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(final MenuItem item) {

        //respond to menu item selection
        switch (item.getItemId()) {
            case R.id.id_about:
                startActivity((new Intent(this, AboutActivity1.class)));
                return true;
            case R.id.id_translator:
                return true;
            case R.id.id_countries:
                startActivity((new Intent(this, WebActivity.class)));
                return true;
            case R.id.id_logout:
                startActivity((new Intent(this, MainActivity.class)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
