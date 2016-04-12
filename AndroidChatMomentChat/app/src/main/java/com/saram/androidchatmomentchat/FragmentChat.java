package com.saram.androidchatmomentchat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentChat extends Fragment{

    ListView list_conversations;
    ArrayList<Contact> ArrayContacts; //test
    ContactAdapter myAdapter;

    public static FragmentChat newInstance() {
        FragmentChat fragment = new FragmentChat();
        return fragment;
    }

    public FragmentChat() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        //Test: create the fake contacts. We have to take them from the database
        ArrayContacts=new ArrayList<Contact>();
        ArrayContacts.add(new Contact("Sara", "5512148288"));
        ArrayContacts.add(new Contact("Sid", "5512148289"));

        list_conversations = (ListView) rootView.findViewById(R.id.list_conversations);
        myAdapter= new ContactAdapter(getContext(), ArrayContacts);
        list_conversations.setAdapter(myAdapter);//relacionar el adaptador con la listview.

        //PREST ANY ITEM
        list_conversations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.form, FragmentChatConversation.newInstance());
                //FragmentChatConversation.newInstance();
                //Toast.makeText(getContext(), "ENTRA AQUI", Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}

