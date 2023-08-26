package pt.ulusofona.deisi.cm2223.g21805817.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBarDrawerToggle

import android.os.Bundle

import android.view.MenuItem
import android.view.View

import android.widget.PopupMenu
import androidx.core.view.GravityCompat
import com.fondesa.kpermissions.allGranted
import com.fondesa.kpermissions.extension.permissionsBuilder
import com.fondesa.kpermissions.extension.send
import com.google.android.gms.location.LocationServices
import com.google.android.material.navigation.NavigationView
import pt.ulusofona.deisi.cm2223.g21805817.NavManager

import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener, View.OnClickListener,PopupMenu.OnMenuItemClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        permissionsBuilder(
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION
        ).build().send() { result ->
            if (result.allGranted()) {
                //NavManager.goToDashboardFragment(supportFragmentManager)
            } else {
                finish()
            }
        }

        setSupportActionBar(binding.toolbar)
        setupDrawerMenu()

    }


    public fun setupDrawerMenu() {

        val toggle = ActionBarDrawerToggle(
            this, binding.drawer, binding.toolbar,
            R.string.drawerAbrir,
            R.string.drawerFechar
        )
        binding.navDrawer.setNavigationItemSelectedListener(this)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
    }



    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    override fun onMenuItemClick(p0: MenuItem?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_dashboard -> {
                NavManager.goToDashboardFragment(supportFragmentManager)
                // NomeFrag.text = getString(R.string.drawerDashboard)
            }
            R.id.nav_listaFilmes ->{
                NavManager.goToListaFilmesFragment(supportFragmentManager)

            }
            //
            R.id.nav_sair -> NavManager.leaveApp()


        }
        binding.drawer.closeDrawer(GravityCompat.START)
        return true
    }
}