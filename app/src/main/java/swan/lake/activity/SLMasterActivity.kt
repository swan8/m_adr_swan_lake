package swan.lake.activity

import android.os.Bundle
import swan.atom.core.Cirrus
import swan.atom.core.base.AtomCoreBaseActivity
import swan.atom.core.icon.AtomCoreIconifyIcons
import swan.lake.R


class SLMasterActivity : AtomCoreBaseActivity() {

//    private var drawer: Drawer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swan_lake_master)

//        setSupportActionBar(toolbar)

        val cirrus: Cirrus? = findViewById<Cirrus>(R.id.cirrus)
        cirrus?.let {
            Cirrus.Companion.CirrusBuilder()
                    .withCirrusTitle("TTTTTTTTTTTTTTTTilte")
                    .withCirrusSubtitle("TfafsafsafasfasfdsaTTTTTTTTTTTTTTTilte")
                    .withCirrusNavigationBackPressIcon()
                    .withCirrusRightComponent(AtomCoreIconifyIcons.ATOM_CORE_SHARE.value("\nDown"), null)
                    .withCirrusMenu(R.menu.swan_lake_menu, null)
                    .build(it)
        }

//        drawer =
//                DrawerBuilder(this)
//                        .withRootView(R.id.drawer_container)
////                        .withToolbar(toolbar)
//                        .withDisplayBelowStatusBar(false)
//                        .withActionBarDrawerToggleAnimated(true)
//                        .addDrawerItems(
//                                PrimaryDrawerItem()
//                                        .withIdentifier(1)
//                                        .withName("Home")
//                                        .withSelectable(false)
//                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_EARTH)),
//
//                                PrimaryDrawerItem()
//                                        .withIdentifier(11)
//                                        .withName("Koala")
//                                        .withDescription("Go Koala")
//                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_DIAMOND)),
//
//                                PrimaryDrawerItem()
//                                        .withIdentifier(12)
//                                        .withName("Setting")
//                                        .withSelectable(false)
//                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_SETTING)),
//
//                                PrimaryDrawerItem()
//                                        .withIdentifier(13)
//                                        .withName("About")
//                                        .withSelectable(false)
//                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_INFORMATION))
//                        )
//                        .withOnDrawerItemClickListener { view, position, drawerItem ->
//                            when (drawerItem.identifier) {
//                                11L -> {
//                                    startActivity(Intent("swan.biz.koala.activity.MzituMasterActivity.action"))
//                                    true
//                                }
//
//                                else -> false
//                            }
//                        }
//                        .withShowDrawerOnFirstLaunch(true)
//                        .withSavedInstance(savedInstanceState)
//                        .build()
    }
}