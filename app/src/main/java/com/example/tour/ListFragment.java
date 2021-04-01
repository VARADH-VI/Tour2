package com.example.tour;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListFragment extends Fragment {
    private Button buttonBlock;
    //private Button buttonLabs;
    private Button buttonGrounds;
    private Button buttonCanteens;
    private Button buttonTheater;
    private Button buttonHangout;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContent(R.layout.fragment_list);

        buttonBlock = buttonBlock.findViewById(R.id.blocks);
        buttonBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResult();
            }
        });
        //grounds
        buttonGrounds = buttonBlock.findViewById(R.id.grounds);
        buttonGrounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultGrounds();
            }
        });
        //canteen
        buttonCanteens = buttonBlock.findViewById(R.id.canteens);
        buttonCanteens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultCanteens();
            }
        });
        //theaters
        buttonTheater = buttonBlock.findViewById(R.id.theaters);
        buttonTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultTheaters();
            }
        });
        //hangouts
        buttonHangout = buttonBlock.findViewById(R.id.hangouts);
        buttonHangout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultHangouts();
            }
        });
    }



    public void openActivityResult() {
        Intent intent = new Intent(this,ResultActivity.class);
        startActivity(intent);
    }

    public void openActivityResultGrounds() {
        Intent intent = new Intent(this, ResultActivityGrounds.class);
        startActivity(intent);
    }

    public void openActivityResultCanteens() {
        Intent intent = new Intent(this, ResultActivityCanteens.class);
        startActivity(intent);
    }

    public void openActivityResultTheaters() {
        Intent intent = new Intent(this, ResultActivityTheaters.class);
        startActivity(intent);
    }

    public void openActivityResultHangouts() {
        Intent intent = new Intent(this, ResultActivityHangouts.class);
        startActivity(intent);
    }}
