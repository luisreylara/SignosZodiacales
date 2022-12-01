package com.tutorialesprogramacionya.proyecto079;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentoSignos extends Fragment {
    private RecyclerView rvsignos;

    public FragmentoSignos() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_signos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvsignos=view.findViewById(R.id.rvsignos);
        rvsignos.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        rvsignos.setLayoutManager(linearLayoutManager);
        rvsignos.setAdapter(new AdaptadorSigno());
    }

    class AdaptadorSigno extends RecyclerView.Adapter<AdaptadorSigno.AdaptadorSignoHolder> {

        @NonNull
        @Override
        public AdaptadorSignoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorSignoHolder(getLayoutInflater().inflate(R.layout.itemsigno,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorSignoHolder holder, int position) {
            holder.imprimir(position);
        }

        @Override
        public int getItemCount() {
            return ListaSignos.retornarTodos().size();
        }

        public class AdaptadorSignoHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            private TextView tv1;
            private ImageView iv1;
            public AdaptadorSignoHolder(@NonNull View itemView) {
                super(itemView);
                tv1=itemView.findViewById(R.id.tvsigno);
                iv1=itemView.findViewById(R.id.ivlistasigno);
                itemView.setOnClickListener(this);
            }


            public void imprimir(int position) {
                tv1.setText(ListaSignos.retornarTodos().get(position).getNombre());
                iv1.setImageResource(ListaSignos.retornarTodos().get(position).getImagen());
            }

            @Override
            public void onClick(View v) {
                if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)
                {
                    Intent intento=new Intent(getContext(),DescripcionSigno.class);
                    intento.putExtra("signo", ListaSignos.retornarTodos().get(getLayoutPosition()).getNombre());
                    startActivity(intento);
                }
                else
                {
                    Bundle bundle=new Bundle();
                    bundle.putString("signo",ListaSignos.retornarTodos().get(getLayoutPosition()).getNombre());
                    getParentFragmentManager().setFragmentResult("datos",bundle);
                }
            }
        }
    }
}
