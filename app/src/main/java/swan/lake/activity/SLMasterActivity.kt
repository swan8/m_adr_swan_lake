package swan.lake.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.joanzapata.iconify.IconDrawable
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import swan.atom.core.base.AtomCoreBaseToolbarActivity
import swan.atom.core.icon.AtomCoreIconifyIcons
import swan.lake.R
import swan.lake.eternal.ISwanLakeMasterDrawerConst

class SLMasterActivity : AtomCoreBaseToolbarActivity() {

    private var drawer: Drawer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layoutResId = R.layout.swan_lake_master

        cirrusResId = R.id.cirrus

        cirrus?.let {
            builder
                    .withCirrusTitle(R.string.app_name)
                    .withCirrusMenu(R.menu.swan_lake_menu, Toolbar.OnMenuItemClickListener {
                        when(it.itemId) {
                            0 -> {

                            }
                        }

                        false
                    })
                    .withCirrusOverflowResId(R.drawable.cirrus_ic_menu_white_64dp)
                    .build(it)
        }

        immersionBar.init()

        drawer =
                DrawerBuilder(this)
                        .withRootView(R.id.drawer_container)
                        .withDisplayBelowStatusBar(false)
                        .withActionBarDrawerToggleAnimated(true)
                        .addDrawerItems(
                                PrimaryDrawerItem()
                                        .withIdentifier(ISwanLakeMasterDrawerConst.IDENTIFIER_HOME)
                                        .withName("Home")
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_EARTH)),

                                PrimaryDrawerItem()
                                        .withIdentifier(ISwanLakeMasterDrawerConst.IDENTIFIER_KOALA)
                                        .withName("Koala")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_DIAMOND)),

                                PrimaryDrawerItem()
                                        .withIdentifier(ISwanLakeMasterDrawerConst.IDENTIFIER_RED_HUB)
                                        .withName("RedHub")
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_DIAMOND)),

                                DividerDrawerItem(),

                                PrimaryDrawerItem()
                                        .withIdentifier(ISwanLakeMasterDrawerConst.IDENTIFIER_SETTING)
                                        .withName("Setting")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_SETTING)),

                                PrimaryDrawerItem()
                                        .withIdentifier(ISwanLakeMasterDrawerConst.IDENTIFIER_ABOUT)
                                        .withName("About")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_INFORMATION))
                        )
                        .withOnDrawerItemClickListener { _, _, drawerItem ->
                            when (drawerItem.identifier) {
                                ISwanLakeMasterDrawerConst.IDENTIFIER_KOALA -> {
                                    startActivity(Intent("swan.biz.koala.activity.MzituMasterActivity.action"))
                                    true
                                }

                                else -> false
                            }
                        }
                        .withShowDrawerOnFirstLaunch(true)
                        .withShowDrawerUntilDraggedOpened(true)
                        .withSavedInstance(savedInstanceState)
                        .build()
    }
}