package swan.lake.activity

import android.os.Bundle
import com.github.ajalt.timberkt.Timber
import swan.atom.core.AtomCoreApplicationImpl
import swan.atom.core.base.AtomCoreBaseActivity
import swan.lake.R

class SLMasterActivity : AtomCoreBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swan_lake_master)

        Timber.e {
            "AtomCoreApplicationImpl.getContext()::${AtomCoreApplicationImpl.getContext()}"
        }
    }
}