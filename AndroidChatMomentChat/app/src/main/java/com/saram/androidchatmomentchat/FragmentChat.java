package com.saram.androidchatmomentchat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by saram on 4/9/2016.
 */
public class FragmentChat extends Fragment{

    public static FragmentChat newInstance() {
        FragmentChat fragment = new FragmentChat();
        return fragment;
    }

    public FragmentChat() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        return rootView;
    }
}

