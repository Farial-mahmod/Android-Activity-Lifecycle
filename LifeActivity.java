package com.webandroidbd.activitylifecycleexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;



    public class HomeActivity extends AppCompatActivity {

        private static final String HOME_ACTIVITY_TAG = HomeActivity.class.getSimpleName();


        private void showLog(String text){

            Log.d(HOME_ACTIVITY_TAG, text);

        }

        @Override

        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            showLog("Activity Created");

        }

        @Override

        protected void onRestart(){

            super.onRestart();//call to restart after onStop

            showLog("Activity restarted");

        }

        @Override

        protected void onStart() {

            super.onStart();//soon be visible

            showLog("Activity started");

        }

        @Override

        protected void onResume() {

            super.onResume();//visible

            showLog("Activity resumed");

        }

        @Override

        protected void onPause() {

            super.onPause();//invisible

            showLog("Activity paused");

        }

        @Override

        protected void onStop() {

            super.onStop();

            showLog("Activity stopped");

        }

        @Override

        protected void onDestroy() {

            super.onDestroy();

            showLog("Activity is being destroyed");

        }

    }
