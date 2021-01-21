package com.example.test.cake;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter{ /* extends FragmentStateAdapter {
    private static final int TAB_ITEM_SIZE = 4;
    private final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewPagerAdapter(@NonNull Cake_shop fragmentActivity) {
        super(fragmentActivity);
    }
    public void addFragment(Fragment fragment) {

        mFragmentList.add(fragment);

    }
    @NonNull
    @Override
   public Fragment createFragment(int position) {

        //return mFragmentList.get(position);
        return Tab_Order_Form.newInstance(position);
    }*/
   /* public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Fragment(R.layout.fragment_tab__order__form);
            default:
                return new Fragment(R.layout.tab__orders_fragment);

        }
    }


    @Override
    public int getItemCount() {
        return TAB_ITEM_SIZE;
    }*/
}