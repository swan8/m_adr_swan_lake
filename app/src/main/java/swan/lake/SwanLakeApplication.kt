package swan.lake

import swan.atom.core.base.SwanAtomBaseApplication

class SwanLakeApplication : SwanAtomBaseApplication() {

    override fun initModuleApplicationImpl(module: MutableList<String>) {
        module.add("swan.atom.core.AtomCoreApplicationImpl")
        module.add("swan.biz.koala.KoalaApplicationImpl")
    }
}