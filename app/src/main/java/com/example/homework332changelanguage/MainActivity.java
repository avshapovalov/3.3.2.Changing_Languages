package com.example.homework332changelanguage;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String selectedLanguage, selectedColor, selectedMargin;
    Spinner spinner, colorSpinner, marginSpinner;

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
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);


        ArrayAdapter<?> adapterLanguage = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapterLanguage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = (Spinner) findViewById(R.id.myLanguageSpinner);
        spinner.setAdapter(adapterLanguage);

        ArrayAdapter<?> adapterColor = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        adapterColor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorSpinner = (Spinner) findViewById(R.id.myColorSpinner);
        colorSpinner.setAdapter(adapterColor);

        ArrayAdapter<?> adapterMargin = ArrayAdapter.createFromResource(this, R.array.margins, android.R.layout.simple_spinner_item);
        adapterMargin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        marginSpinner = (Spinner) findViewById(R.id.myMarginSpinner);
        marginSpinner.setAdapter(adapterMargin);

        findViewById(R.id.btn_ChangeLanguage).setOnClickListener(this);
        findViewById(R.id.btn_ChangeColor).setOnClickListener(this);
        findViewById(R.id.btn_ChangeMargin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_ChangeLanguage:
                spinner = (Spinner) findViewById(R.id.myLanguageSpinner);
                selectedLanguage = spinner.getSelectedItem().toString();
                changeLanguage(selectedLanguage);
                break;
            case R.id.btn_ChangeColor:
                colorSpinner = (Spinner) findViewById(R.id.myColorSpinner);
                selectedColor = colorSpinner.getSelectedItem().toString();
                switch (selectedColor){
                    case "Black":
                        Utils.changeToTheme(this, Utils.THEME_BLACK);
                        break;
                    case "Черный":
                        Utils.changeToTheme(this, Utils.THEME_BLACK);
                        break;
                    case "Синий":
                        Utils.changeToTheme(this, Utils.THEME_BLUE);
                        break;
                    case "Blue":
                        Utils.changeToTheme(this, Utils.THEME_BLUE);
                        break;
                    case "Green":
                        Utils.changeToTheme(this, Utils.THEME_GREEN);
                        break;
                    case "Зеленый":
                        Utils.changeToTheme(this, Utils.THEME_GREEN);
                        break;
                }
            case R.id.btn_ChangeMargin:
                marginSpinner = (Spinner) findViewById(R.id.myMarginSpinner);
                selectedMargin = marginSpinner.getSelectedItem().toString();
                switch (selectedMargin){
                    case "Крупная":
                        Utils.changeToTheme(this, Utils.THEME_BIG);
                        break;
                    case "Big":
                        Utils.changeToTheme(this, Utils.THEME_BIG);
                        break;
                    case "Средняя":
                        Utils.changeToTheme(this, Utils.THEME_MEDIUM);
                        break;
                    case "Medium":
                        Utils.changeToTheme(this, Utils.THEME_MEDIUM);
                        break;
                    case "Мелкая":
                        Utils.changeToTheme(this, Utils.THEME_SMALL);
                        break;
                    case "Small":
                        Utils.changeToTheme(this, Utils.THEME_SMALL);
                        break;
                }
        }
    }
}
