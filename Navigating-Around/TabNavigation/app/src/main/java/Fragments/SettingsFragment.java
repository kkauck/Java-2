//Kyle Kauck

package Fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.kyle.tabnavigation.R;

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);

    }
}
