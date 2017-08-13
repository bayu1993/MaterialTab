package com.example.dell.materialtab.Adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dell.materialtab.fragment.Tab1Fragment;
import com.example.dell.materialtab.fragment.Tab2Fagment;

/**
 * Created by dell on 8/11/17.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter{
    //nama tab
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    //memanipulasi penamilan fragment di layar
    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fagment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return title[position];
    }

    @Override
    public int getCount(){
        return title.length;
    }

}
