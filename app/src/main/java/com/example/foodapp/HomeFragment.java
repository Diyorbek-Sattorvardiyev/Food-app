package com.example.foodapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<Food> foodList;
    private LinearLayout linerHammasi,linerBurger,Pizza,Disert;
    private TextView allllTxt,txtDisert,txtBrger,txtPiza;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);
        linerHammasi = view.findViewById(R.id.HmmasiF);
        linerBurger = view.findViewById(R.id.Burger);
        Pizza = view.findViewById(R.id.Pizza);
        Disert = view.findViewById(R.id.Disert);
        allllTxt = view.findViewById(R.id.allll);
        txtDisert = view.findViewById(R.id.txtDisert);
        txtBrger = view.findViewById(R.id.txtBrger);
        txtPiza = view.findViewById(R.id.txtPiza);


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        linerBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linerBurger.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.menu_card));
                linerHammasi.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Pizza.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Disert.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                allllTxt.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtDisert.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtBrger.setTextColor(ContextCompat.getColor(getContext(),R.color.color));
                txtPiza.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));


            }
        });
        linerHammasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linerBurger.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                linerHammasi.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.menu_card));
                Pizza.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Disert.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                allllTxt.setTextColor(ContextCompat.getColor(getContext(),R.color.color));
                txtDisert.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtBrger.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtPiza.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));


            }
        });
        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linerBurger.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                linerHammasi.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Pizza.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.menu_card));
                Disert.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                allllTxt.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtDisert.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtBrger.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtPiza.setTextColor(ContextCompat.getColor(getContext(),R.color.color));


            }
        });
        Disert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linerBurger.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                linerHammasi.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Pizza.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_back));
                Disert.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.menu_card));
                allllTxt.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtDisert.setTextColor(ContextCompat.getColor(getContext(),R.color.color));
                txtBrger.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));
                txtPiza.setTextColor(ContextCompat.getColor(getContext(),R.color.color2));


            }
        });



        loadFoodData();


        adapter = new FoodAdapter(getContext(), foodList);
        recyclerView.setAdapter(adapter);

        return view;
    }


    private void loadFoodData() {
        foodList = new ArrayList<>();
        foodList.add(new Food("shina2", "Shina 1", 15000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("shina3", "Shina 2", 25000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("shina4", "Shina 3", 10000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("reg1", "Video regstrator", 14000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("reg2", "Video regstrator 2", 18000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin."));
        foodList.add(new Food("reg4", "Video regstrator 3", 33000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("fara1", "Fara x", 56000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
        foodList.add(new Food("fara3", "Fara ", 80000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
    }
}
