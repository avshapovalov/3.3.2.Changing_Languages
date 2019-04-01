package com.example.homework332changelanguage;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String selectedLanguage, selectedColor;
    Button btnChangeLanguage;
    TextView textView;
    Spinner spinner, colorSpinner;

    public void changeLanguage(String selectedLanguage) {
        if (selectedLanguage.equals("English")) {
            Locale locale = new Locale("en");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        } else if (selectedLanguage.equals("Russian")) {
            Locale locale = new Locale("ru");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        } else if (selectedLanguage.equals("Русский")) {
            Locale locale = new Locale("ru");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        } else if (selectedLanguage.equals("Английский")) {
            Locale locale = new Locale("en");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<?> adapterLanguage = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapterLanguage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = (Spinner) findViewById(R.id.myLanguageSpinner);
        spinner.setAdapter(adapterLanguage);

        ArrayAdapter<?> adapterColor = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        adapterColor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorSpinner = (Spinner) findViewById(R.id.myColorSpinner);
        colorSpinner.setAdapter(adapterColor);

        findViewById(R.id.btn_ChangeLanguage).setOnClickListener(this);
        findViewById(R.id.btn_ChangeColor).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {

            case R.id.btn_ChangeLanguage:
                spinner = (Spinner) findViewById(R.id.myLanguageSpinner);
                selectedLanguage = spinner.getSelectedItem().toString();
                changeLanguage(selectedLanguage);
                break;
            case R.id.btn_ChangeColor:
                colorSpinner = (Spinner) findViewById(R.id.myColorSpinner);
                selectedColor = colorSpinner.getSelectedItem().toString();
                if (selectedColor.equals("Синий") || selectedColor.equals("Blue")) {
                    setTheme(R.style.BlueTheme);
                    MainActivity.this.recreate();
                    break;
                } else if (selectedColor.equals("Зеленый") || selectedColor.equals("Green")) {
                    Utils.changeToTheme(this, Utils.GREEN);
                } else if (selectedColor.equals("Черный") || selectedColor.equals("Black")) {
                    Utils.changeToTheme(this, Utils.BLACK);
                }
        }
    }
}
