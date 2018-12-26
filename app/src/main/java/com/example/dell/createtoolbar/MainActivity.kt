package com.example.dell.createtoolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Set toolbar as activity's action bar
        setSupportActionBar(toolBar)
        //Display back button on toolbar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId
        when(id){
            R.id.setting->{
                Toast.makeText(this, "Setting", Toast.LENGTH_LONG).show()
            }
            R.id.log_out->{
                Toast.makeText(this, "Log out", Toast.LENGTH_LONG).show()
            }
            R.id.save->{
                Toast.makeText(this, "Save", Toast.LENGTH_LONG).show()
            }
            //Set even listener to back button on toolbar
            android.R.id.home->{
                finish()
            }
            else->{
                Toast.makeText(this, "No action match this button...", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
