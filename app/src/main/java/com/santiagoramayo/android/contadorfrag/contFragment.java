package com.santiagoramayo.android.contadorfrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SAN RC on 27/10/2017.
 */

public class contFragment extends Fragment {
    private EditText mcont;
    private Button mBoton_contar, mBoton_Reiniciar;
    int c;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_cont,container,false);
        mcont=(EditText)v.findViewById(R.id.cont);
        mBoton_contar=(Button) v.findViewById(R.id.boton_contar);
        mBoton_Reiniciar=(Button) v.findViewById(R.id.boton_reiniciar);

        mBoton_contar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=c+1;
                String s=String.format("%1$s",c);
                mcont.setText(s);

            }
        });

        mBoton_Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcont.setText("0");
                c=0;
            }
        });


        return v;
    }
}
