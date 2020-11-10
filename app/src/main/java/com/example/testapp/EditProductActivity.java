package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class EditProductActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_product);
    }
}
