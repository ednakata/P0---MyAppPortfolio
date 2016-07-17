package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Respond to the button click to open the Popular Movies app
     * @param view
     */
    public void openMoviesApp(View view) {
        showToast(getString(R.string.popular_movies));
    }

    /**
     * Respond to the button click to open the Stock Hawk app
     * @param view
     */
    public void openStockApp(View view) {
        showToast(getString(R.string.stock_hawk));
    }

    /**
     * Respond to the button click to open the Build it Bigger app
     * @param view
     */
    public void openBuildApp(View view) {
        showToast(getString(R.string.build_it_bigger));
    }

    /**
     * Respond to the button click to open the Make your App Material app
     * @param view
     */
    public void openMaterialApp(View view) {
        showToast(getString(R.string.make_your_app_material));
    }

    /**
     * Respond to the button click to open the Go Ubiquitous app
     * @param view
     */
    public void openUbiquitousApp(View view) {
        showToast(getString(R.string.go_ubiquitous));
    }

    /**
     * Respond to the button click to open the Capstone app
     * @param view
     */
    public void openCapstoneApp(View view) {
        showToast(getString(R.string.capstone));
    }

    /**
     * Show a toast message including the passed in application name
     * @param appName
     */
    private void showToast (String appName) {
        Toast.makeText(this,getString(R.string.openAppMessage,appName), Toast.LENGTH_SHORT).show();
    }
}
