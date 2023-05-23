package com.iseyam195.arabkoora.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.iseyam195.arabkoora.Fragments.MatchesFragment;
import com.iseyam195.arabkoora.Fragments.ScorersFragment;
import com.iseyam195.arabkoora.Fragments.TableFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    int behavior;


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
//                MatchesFragment matchesFragment = new MatchesFragment();
                return new MatchesFragment();
            case 1:
                return new TableFragment();
            case 2:
                return new ScorersFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return behavior;
    }
}
