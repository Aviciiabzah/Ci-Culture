package com.example.ci_culture;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BussinesViewHolder {
    TextView txtTitle,txtDescription ,txtOpeningHours;
    Button btnMap;
    public BussinesViewHolder (View view){
        txtTitle = view.findViewById(R.id.txtTiltle);
        txtDescription = view.findViewById(R.id.txtDescription);
        txtOpeningHours =  view.findViewById(R.id.txtOpeningHours);
        btnMap = view.findViewById(R.id.btnMap);
    }

    public TextView getTxtTitle() {
        return txtTitle;
    }

    public TextView getTxtDescription() {
        return txtDescription;
    }

    public TextView getTxtOpeningHours() {
        return txtOpeningHours;
    }

    public Button getBtnMap() {
        return btnMap;
    }
}
