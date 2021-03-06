package com.example.tour;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ResultActivityGrounds extends AppCompatActivity {

    //private CardView b1;
    //private CardView b2;


//step1 implement class

    //step2 implement objects
    CardBool b1 = new CardBool();
    CardBool b2 = new CardBool();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_grounds);

        b1.c = (CardView) findViewById(R.id.b1);
        b2.c = (CardView) findViewById(R.id.b2);


        b1.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                }
                switchCard(b1);
            }
        });

        b2.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.getisCollapsed()) {
                    switchCard(b1);
                }
                switchCard(b2);
            }
        });

    }


    //private Boolean isCollapsed = true;

    public void switchCard(CardBool b1) {

        final int originalDimension = Math.round(getResources().getDimension(R.dimen.original_card_view_height));
        final int newDimension = Math.round(getResources().getDimension(R.dimen.new_card_view_height));

        if (b1.getisCollapsed()) {
            TransitionManager.beginDelayedTransition(b1.c, new TransitionSet().addTransition(new ChangeBounds()));
            ViewGroup.LayoutParams params = b1.c.getLayoutParams();
            params.height = newDimension;
            b1.c.setLayoutParams(params);


            b1.setIsCollapsed(false);
        } else {
            TransitionManager.beginDelayedTransition(b1.c, new TransitionSet()
                    .addTransition(new ChangeBounds()));

            ViewGroup.LayoutParams params = b1.c.getLayoutParams();
            params.height = originalDimension;

            b1.c.setLayoutParams(params);


            b1.setIsCollapsed(true);
        }
    }

    class CardBool {
        private Boolean isCollapsed = true;
        private CardView c;

        Boolean getisCollapsed() {
            return isCollapsed;
        }

        void setIsCollapsed(Boolean n) {
            isCollapsed = n;
        }

    }

}