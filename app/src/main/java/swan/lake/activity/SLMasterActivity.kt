package swan.lake.activity

import android.content.Intent
import android.os.Bundle
import com.joanzapata.iconify.IconDrawable
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import swan.atom.core.base.AtomCoreBaseToolbarActivity
import swan.atom.core.icon.AtomCoreIconifyIcons
import swan.lake.R

class SLMasterActivity : AtomCoreBaseToolbarActivity() {

    private var drawer: Drawer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layoutResId = R.layout.swan_lake_master

        cirrusResId = R.id.cirrus

        cirrus?.let {
            builder
                    .withCirrusTitle(R.string.app_name)
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
                                        .withIdentifier(1)
                                        .withName("Home")
                                        .withSelectable(false)
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_EARTH)),

                                PrimaryDrawerItem()
                                        .withIdentifier(11)
                                        .withName("Koala")
                                        .withIcon(IconDrawable(applicationContext, AtomCoreIconifyIcons.ATOM_CORE_DIAMOND)),

                                DividerDrawerItem(),

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
                        .withOnDrawerItemClickListener { _, _, drawerItem ->
                            when (drawerItem.identifier) {
                                11L -> {
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