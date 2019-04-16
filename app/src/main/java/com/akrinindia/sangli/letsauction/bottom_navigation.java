//package com.akrinindia.sangli.letsauction;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
//import android.widget.TextView;
//
//public class bottom_navigation extends AppCompatActivity {
//
//    private TextView mTextMessage;
//    //Intent i1 = new Intent(bottom_navigation.this,near_you.class);
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
//                    //startActivity(i1);
//                    return true;
//
//
//
//                case R.id.navigation_chat_button:
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_profile:
//                    mTextMessage.setText("Profile");
//                    return true;
//                case R.id.navigation_notification:
//                    mTextMessage.setText("Notifications");
//                    return true;
//                case R.id.navigation_auction_button:
//                    mTextMessage.setText("Auctions");
//                    return true;
//            }
//            return false;
//        }
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bottom_navigation);
//
//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//
//    }
//
//
//
//}
