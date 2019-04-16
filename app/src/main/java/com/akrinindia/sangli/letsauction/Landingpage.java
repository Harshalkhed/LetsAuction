package com.akrinindia.sangli.letsauction;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class Landingpage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    ActionBar actionBar;
    FloatingActionButton fab;
    Intent i;
//    BottomNavigationView navigation;
//    final Fragment fragment1 = new BlankFragment();
//
//    final FragmentManager fm = getSupportFragmentManager();
//    Fragment active = fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage);
        loadFragment(new home());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new home();
                break;

            case R.id.navigation_auction_button:
                fragment = new Fragment_Postad();
                break;

            case R.id.navigation_notification:
                fragment = new Notiication_Fargment();
                break;

            case R.id.navigation_chat_button:
                fragment = new Fragment_Nearyou();
                break;
        }
        return loadFragment(fragment);
    }
}
//         BottomNavigationView.OnNavigationItemSelectedListener navlistener = new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                Fragment selectedFragment=null;
//
//                switch (menuItem.getItemId())
//                {
//                    case R.id.navigation_auction_button:
//                        selectedFragment=new Fragment_Postad();
//                        break;
//
//                    case R.id.navigation_notification:
//                        selectedFragment=new Notiication_Fargment();
//                        break;
//                    case R.id.navigation_home:
//                        selectedFragment=new Fragment_Nearyou();
//                        break;
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
//                return true;
//            }
//        };


//        fab = findViewById(R.id.fab_auction);
//        i = new Intent(Landingpage.this,postad_final.class);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(i);
//            }
//        });
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        fm.beginTransaction().add(R.id.txt, fragment1, "1").commit();



//   private   BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_chat_button:
//                    fm.beginTransaction().hide(active).show(fragment1).commit();
//                    active = fragment1;
//                    return true;
//            }
//            return false;
//        }
//        };
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_settings) {
//            startActivity(new Intent(Landingpage.this, postad_final.class));
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);


