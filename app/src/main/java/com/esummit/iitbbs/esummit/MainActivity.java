package com.esummit.iitbbs.esummit;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    /*ActionBar.Tab Tab1, Tab2;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getActionBar();
        setTitle("E-SUMMIT-2K19");
       /* Tab1 = actionBar.newTab().setText("tab1");
        Tab2 = actionBar.newTab().setText("Tab2");

        // Set Tab Listeners
        Tab1.setTabListener(new Tablistner(new BlankFragment2()));
        Tab2.setTabListener(new Tablistner(new BlankFragment3()));

        // Add tabs to actionbar
        actionBar.addTab(Tab1);
        actionBar.addTab(Tab2);*/
       /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ABOUT"));
        tabLayout.addTab(tabLayout.newTab().setText("GALLERY"));
        final ViewPager viewPager =
                (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new TabPagerAdapter
                (getSupportFragmentManager(),
                        tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new
                                                   TabLayout.OnTabSelectedListener() {
                                                       @Override
                                                       public void onTabSelected(TabLayout.Tab tab) {
                                                           viewPager.setCurrentItem(tab.getPosition());
                                                       }

                                                       @Override
                                                       public void onTabUnselected(TabLayout.Tab tab) {

                                                       }

                                                       @Override
                                                       public void onTabReselected(TabLayout.Tab tab) {

                                                       }

                                                   });
        for (int i = 0; i< tabLayout.getTabCount(); i++) {
            TabLayout.Tab mTab = tabLayout.getTabAt(i);
            if (mTab != null) {
                switch (i){
                    case 0:
                        View tabViewOne = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
                        tabViewOne.setId(R.id.id_one);
                        //ect..
                        break;
                    case 1:
                        View tabViewTwo = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
                        tabViewTwo.setId(R.id.id_two);
                        //ect..
                        break;
                    case 2:
                        //etc..
                }
            }
        }*//*
        int i;
         i = tabLayout.getSelectedTabPosition();
         if (i == 0){
             android.app.FragmentManager fragmentManager = getFragmentManager();
             FragmentTransaction ft = fragmentManager.beginTransaction();
             ft.replace(R.id.fragment, new BlankFragment());
             ft.commit();

         } else if (i == 1){
             android.app.FragmentManager fragmentManager = getFragmentManager();
             FragmentTransaction ft = fragmentManager.beginTransaction();
             ft.replace(R.id.fragment, new BlankFragment2());
             ft.commit();
         }


*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fragment, new BlankFragment4());
        ft.addToBackStack(null);
        ft.commit();
    for (int i = 0;i<=1;i++) {
        Toast toast = Toast.makeText(getApplication().getBaseContext(), "Scroll Down", Toast.LENGTH_SHORT);
        toast.show();
    }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        item.setVisible(false);
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_map) {
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment());
            ft.addToBackStack(null);
            ft.commit();
            /* getSupportFragmentManager().beginTransaction().replace(R.id.fragment,(Fragment)( new BlankFragment())).addToBackStack(null).commit();*/
        } else if (id == R.id.nav_home) {
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment4());
            ft.addToBackStack(null);
            ft.commit();
            for (int i = 0;i<=4;i++) {
                Toast toast = Toast.makeText(getApplication().getBaseContext(), "Scroll Down", Toast.LENGTH_SHORT);
                toast.show();

            }
        } else if (id == R.id.nav_speakers) {
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment3());
            ft.addToBackStack(null);
            ft.commit();
        } else if (id == R.id.nav_events) {
           /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment2());
            ft.addToBackStack(null);
            ft.commit();
        } else if (id == R.id.nav_drive) {
          /*  TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            /*android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment4());
            ft.commit();*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment22());
            ft.addToBackStack(null);
            ft.commit();
        } else if (id == R.id.nav_eday) {
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment24());
            ft.addToBackStack(null);
            ft.commit();

        } else if(id == R.id.nav_contact){
           /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment23());
            ft.addToBackStack(null);
            ft.commit();


        } else if (id == R.id.nav_sponsers){
          /*  TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment16());
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_ca){
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment21());
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_Schedule){
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment17());
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_website){
           /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment18());
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_facebook){
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment19());
            ft.addToBackStack(null);
            ft.commit();
            /*TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/

        } else if (id == R.id.nav_youtube){
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment20());
            ft.addToBackStack(null);
            ft.commit();
           /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/

        }else if (id == R.id.nav_more){
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment, new BlankFragment25());
            ft.addToBackStack(null);
            ft.commit();
           /* TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.setVisibility(View.GONE);*/

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClickcreative(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment5());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClickguest(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment6());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClickworkshop(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment7());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClickcomp(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment8());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickadvert(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment9());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickdesign(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment10());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickstock(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment11());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickipl(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment12());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickbiz(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment13());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickpitch(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment14());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onClickb(View view){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        FragmentTransaction replace = ft.replace(R.id.fragment, new BlankFragment15());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClicksia(View view){

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("  https://www.thecollegefever.com/events/e-summit-19-qGrMpRr7X8"));
        startActivity(intent);
    }

    public void onClicktoca(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://ca.e-summit-iitbbs.com/"));
        startActivity(intent);
    }
    public void onClickbrowse(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://ca.e-summit-iitbbs.com/"));
        startActivity(intent);
    }

}
