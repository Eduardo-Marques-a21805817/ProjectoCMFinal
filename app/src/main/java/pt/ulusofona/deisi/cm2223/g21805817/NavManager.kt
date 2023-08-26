package pt.ulusofona.deisi.cm2223.g21805817

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import pt.ulusofona.deisi.cm2223.g21805817.fragments.DashBoardFragment
import pt.ulusofona.deisi.cm2223.g21805817.fragments.MovieListFragment

abstract class NavManager : AppCompatActivity(){
    companion object{
        private fun LoadNewFragment(fm: FragmentManager, frag: Fragment, nome:String?){
            val transition= fm.beginTransaction()
            transition.replace(R.id.frame,frag)
            transition.addToBackStack(nome)
            transition.commit()

        }
        private fun LoadNewFragmentOnTop(fm: FragmentManager, frag: Fragment){
            val transition= fm.beginTransaction()
            transition.add(R.id.frame,frag)
            transition.addToBackStack(null)

            transition.commit()
        }
        fun leaveApp() {
            System.exit(-1)
        }

        fun goToDashboardFragment(fm: FragmentManager) {
            LoadNewFragment(fm, DashBoardFragment(),null)
            //FireCrackerApplication.nomeFrag=R.string.drawerDashboard.toString()
        }

        fun goToListaFilmesFragment(fm: FragmentManager) {
            LoadNewFragment(fm, MovieListFragment(),null)
        }





    }


}