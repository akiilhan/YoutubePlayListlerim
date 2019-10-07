package com.example.navigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var mDrawerLayout: DrawerLayout
    lateinit var mNavigationView: NavigationView
    lateinit var mtextViewBaslik:TextView
    lateinit var img:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("ParcaBurada")
        mNavigationView=findViewById(R.id.nav_view)
        //mNavigationView.setNavigationItemSelectedListener(this)





        mDrawerLayout = findViewById(R.id.drawerLayout)
        var drawerToggle = ActionBarDrawerToggle(
            this,
            mDrawerLayout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        mDrawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

    }
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        var id =p0.itemId

        navigationViewKapat()

        var manager = supportFragmentManager

        if (id==R.id.nav_home){
            var transaction = manager.beginTransaction().replace(R.id.deneme,AnaSayfa()).commit()
        }
        else if (id==R.id.nav_gallery){
            var transaction = manager.beginTransaction().replace(R.id.deneme,Galeri()).commit()
        }
        return true
    }






    private fun navigationViewAc() {
        mDrawerLayout.openDrawer(GravityCompat.START)    }

    private fun navigationViewKapat() {
        mDrawerLayout.closeDrawer(GravityCompat.START)
    }

    override fun onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){

            navigationViewKapat()
        }else
        super.onBackPressed()
    }

}
