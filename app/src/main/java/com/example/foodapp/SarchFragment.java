package com.example.foodapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class SarchFragment extends Fragment {
    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<Food> foodList;
    private List<Food> filteredList;
    private EditText editTextSearch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sarch, container, false);


        recyclerView = view.findViewById(R.id.recyclerViewSearch);
        editTextSearch = view.findViewById(R.id.editTextSearch);


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));


        loadFoodData();


        adapter = new FoodAdapter(getContext(), foodList);
        recyclerView.setAdapter(adapter);


        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

                updateRecyclerView(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

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
        foodList.add(new Food("img_27", "Fara ", 80000, "Agar siz yangi Android Studio yoki eski versiyada ishlayotgan bo'lsangiz, gradle va Android Gradle Plugin versiyalarini yangilash kerak bo'lishi mumkin"));
    }


    private void updateRecyclerView(String query) {
        filteredList = new ArrayList<>();


        for (Food food : foodList) {
            if (food.getFoodName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(food);
            }
        }


        adapter.updateList(filteredList);
    }
}