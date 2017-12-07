package com.rowfive.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by adam on 11/26/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
