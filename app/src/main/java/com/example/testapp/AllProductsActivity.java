package com.example.testapp;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.HashMap;

public class AllProductsActivity extends ListActivity {
    // Progress Dialog
    private ProgressDialog pDialog;

    // Creating JSON Parser object
   JSONParser jsonParser = new JSONParser();

    ArrayList<HashMap<String, String>> productsList;


    // JSON Node names
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_PRODUCTS = "products";
    private static final String TAG_PID = "pid";
    private static final String TAG_NAME = "name";
    private static String url_all_products = "https://api.androidhive.info/android_connect/get_all_products.php";
    // products JSONArray
    JSONArray products = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_products);
    }
}
