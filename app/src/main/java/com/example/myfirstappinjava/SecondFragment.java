package com.example.myfirstappinjava;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TableRow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfirstappinjava.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);


        TableRow.LayoutParams cellLayout = new TableRow.LayoutParams();
        cellLayout.width = (Math.min(getContext().getDisplay().getHeight(), getContext().getDisplay().getWidth()) - 100) / 8;
        cellLayout.height = cellLayout.width;

        for (int rowIdx = 0; rowIdx < 8; rowIdx++) {
            TableRow row = new TableRow(getContext());
            binding.chessBoard.addView(row);

            for (int columnIdx = 0; columnIdx < 8; columnIdx++) {
                ImageView cell = new ImageView(getContext());

                if ((columnIdx + rowIdx) % 2 == 0) {
                    cell.setBackgroundColor(Color.BLACK);
                } else {
                    cell.setBackgroundColor(Color.WHITE);
                }



                row.addView(cell, cellLayout);
            }

        }


        return binding.getRoot();


    }










    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {


        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    //Figure
    public void onViewCreated(View view) {

        TableRow.LayoutParams cellLayout = new TableRow.LayoutParams();
        cellLayout.width = (Math.min(getContext().getDisplay().getHeight(), getContext().getDisplay().getWidth()) - 100) / 8;
        cellLayout.height = cellLayout.width;

        for (int rowIdx = 0; rowIdx < 8; rowIdx++) {
            TableRow row = new TableRow(getContext());
            binding.chessBoard.addView(row);

            for (int columnIdx = 0; columnIdx < 8; columnIdx++) {
                ImageView cell = new ImageView(getContext());



            }