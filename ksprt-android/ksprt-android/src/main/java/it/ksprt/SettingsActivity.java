package it.ksprt;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.List;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
    }

    @Override
    protected boolean isValidFragment(String fragment) {
        return PrefGeneralFragment.class.getName().equals(fragment);
    }

    public static class PrefGeneralFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstance) {
            super.onCreate(savedInstance);
            addPreferencesFromResource(R.xml.pref_general);
        }
    }
}
