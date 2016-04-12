package com.saram.androidchatmomentchat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentChatConversation extends Fragment {

    public static final FragmentChatConversation newInstance() {
        FragmentChatConversation fragment = new FragmentChatConversation();
        return fragment;
    }

    public FragmentChatConversation() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat_conversation, container, false);
        return rootView;
    }
}
