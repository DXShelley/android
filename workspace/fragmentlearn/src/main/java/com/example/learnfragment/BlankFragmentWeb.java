package com.example.learnfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class BlankFragmentWeb extends Fragment {


    public BlankFragmentWeb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment_web, container, false);
        WebView webView = view.findViewById(R.id.wv);
        webView.loadUrl("http://124.133.33.114:81/login.aspx");
        return view;
    }

}
