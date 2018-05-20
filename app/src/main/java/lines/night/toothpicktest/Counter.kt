package lines.night.toothpicktest

import timber.log.Timber
import javax.inject.Inject

class Counter @Inject constructor() {

    init {
        Timber.i("INITIALIZATION")
    }

    var count = 0
}