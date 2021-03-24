package com.example.autocomplete_tv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    private AutoCompleteTextView txt1;
    private MultiAutoCompleteTextView txtMany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.ed1);
        txtMany = findViewById(R.id.many);
        String[] s = getResources().getStringArray(R.array.country);
        txt1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,s));
        txtMany.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,s));
        txtMany.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}