package com.jhonnymoniz.examen;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.EmptyStackException;

import javax.crypto.spec.DESedeKeySpec;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    View inflatedView = null;
    public EditText texto;
    public Button guardar;
    public SeekBar fontBarr;
    public String textSecondFragment;
    public int number;
    public DataBetween dataBetween = null;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.inflatedView =inflater.inflate(R.layout.fragment_first, container, false);

        texto = (EditText) inflatedView.findViewById(R.id.text);
        guardar = (Button) inflatedView.findViewById(R.id.button1);
        fontBarr = (SeekBar) inflatedView.findViewById(R.id.fontBarr);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;
                text = String.valueOf(texto.getText());
                textSecondFragment = text;
                System.out.println(textSecondFragment);
                System.out.println(number);

                dataBetween.fontData(textSecondFragment,number);

            }
        });

        fontBarr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                number = seekBar.getProgress();
                System.out.println(number);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





        return inflatedView;
    }

}