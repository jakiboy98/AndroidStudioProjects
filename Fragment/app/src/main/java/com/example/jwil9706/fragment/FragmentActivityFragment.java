package com.example.jwil9706.fragment;

import android.app.Fragment;

/**
 * Created by jwil9706 on 10/8/15.
 */
public class FragmentActivityFragment extends Fragment
{

    public FragmentActivityFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_morning, container, false);
    }
}
