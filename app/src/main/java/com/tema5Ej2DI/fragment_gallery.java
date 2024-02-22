package com.tema5Ej2DI;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;



public class fragment_gallery extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Card> imagenes = new ArrayList<Card>(){{
            add(new Card(R.drawable.image1, "Card 1"));
            add(new Card(R.drawable.image2, "Card 2"));
            add(new Card(R.drawable.image3, "Card 3"));
            add(new Card(R.drawable.image4, "Card 4"));
            add(new Card(R.drawable.image5, "Card 5"));
            add(new Card(R.drawable.image6, "Card 6"));
            add(new Card(R.drawable.image7, "Card 7"));
            add(new Card(R.drawable.image8, "Card 8"));
            add(new Card(R.drawable.image9, "Card 9"));
        }};

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHome);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        CardAdapter adaptador = new CardAdapter(imagenes);

        recyclerView.setAdapter(adaptador);

    }

    public void ocultarToolbar(){
        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
    }
}