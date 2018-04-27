package swan.lake.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.joanzapata.iconify.IconDrawable
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import swan.atom.core.base.AtomCoreBaseActivity
import swan.atom.core.icon.AtomCoreIconifyIcons
import swan.lake.R


class SLMasterActivity : AtomCoreBaseActivity() {

    private var drawer: Drawer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swan_lake_master)

//        setSupportActionBar(toolbar)

        findViewById<Toolbar>(R.id.cirrusCoreToolbar).title = "cirrusCoreToolbar"

        drawer =
                DrawerBuilder(this)
                        .withRootView(R.id.drawer_container)
//                        .withToolbar(toolbar)
                        .withDisplayBelowStatusBar(false)
                        .withActionBarDrawerToggleAnimated(true)
                        .addDrawerItems(
                                PrimaryDrawerItem()
                                        .withIdentifier(1)
                                        .withName("Home")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_EARTH)),

                                PrimaryDrawerItem()
                                        .withIdentifier(11)
                                        .withName("Koala")
                                        .withDescription("Go Koala")
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_DIAMOND)),

                                PrimaryDrawerItem()
                                        .withIdentifier(12)
                                        .withName("Setting")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_SETTING)),

                                PrimaryDrawerItem()
                                        .withIdentifier(13)
                                        .withName("About")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_INFORMATION))
                        )
                        .withOnDrawerItemClickListener { view, position, drawerItem ->
                            when (drawerItem.identifier) {
                                11L -> {
                                    startActivity(Intent("swan.biz.koala.activity.MzituMasterActivity.action"))
                                    true
                                }

                                else -> false
                            }
                        }
                        .withShowDrawerOnFirstLaunch(true)
                        .withSavedInstance(savedInstanceState)
                        .build()
    }
}