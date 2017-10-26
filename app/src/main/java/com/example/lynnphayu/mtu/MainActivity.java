package com.example.lynnphayu.mtu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


        Toolbar toolbar;
        DrawerLayout drawer;
        NavigationView navigationView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_home);

                toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
                drawer.setDrawerListener(toggle);
                toggle.syncState();

                navigationView = (NavigationView)findViewById(R.id.nav_view);
                navigationView.setNavigationItemSelectedListener(this);

                if(savedInstanceState==null)
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new homeFragment()).commit();
        }

        @Override
        public void onBackPressed() {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                        drawer.closeDrawer(GravityCompat.START);
                } else {
                        super.onBackPressed();
                }
        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.drawer, menu);
                return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                        return true;
                }

                return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                switch (id){

                        case R.id.nav_home:
                                toolbar.setTitle("Home");
                                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new homeFragment()).commit();
                                break;

                        case R.id.nav_rollcall:
                                toolbar.setTitle("Roll Call Statistics");
                                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new homeFragment()).commit();
                                break;

                        case R.id.nav_about_me:
                                toolbar.setTitle("About me");;
                                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new homeFragment()).commit();
                                break;

                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
        }
}
