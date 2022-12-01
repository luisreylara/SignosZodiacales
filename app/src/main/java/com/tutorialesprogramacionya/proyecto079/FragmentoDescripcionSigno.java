package com.tutorialesprogramacionya.proyecto079;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentoDescripcionSigno extends Fragment {
    private ImageView ivsigno;
    private TextView tvfecha,tvdescripcion;
    public FragmentoDescripcionSigno() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("datos", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String signo=result.getString("signo");
                Signo signoSelec=ListaSignos.retornar(signo);
                ivsigno.setImageResource(signoSelec.getImagen());
                tvfecha.setText(signoSelec.getTitulo());
                tvdescripcion.setText(signoSelec.getDescripcion());
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_descripcion_signo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivsigno=view.findViewById(R.id.ivsigno);
        tvfecha=view.findViewById(R.id.tvfecha);
        tvdescripcion= view.findViewById(R.id.tvdescripcion);
        ivsigno.setImageResource(ListaSignos.retornarTodos().get(0).getImagen());
        tvfecha.setText(ListaSignos.retornarTodos().get(0).getTitulo());
        tvdescripcion.setText(ListaSignos.retornarTodos().get(0).getDescripcion());

    }
}