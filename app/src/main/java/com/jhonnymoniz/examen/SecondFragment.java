package com.jhonnymoniz.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    View inflatedView;
    TextView textView1 = null;


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.inflatedView =inflater.inflate(R.layout.fragment_second, container, false);

        textView1 = (TextView) inflatedView.findViewById(R.id.texto123);

        return inflatedView;
    }

    public void createText(String text, int num){
        textView1.setText(text);
        textView1.setTextSize(num);
    }

}