package com.potkanburger.sudoku_durif_genoux_hu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;


public class Sudoku extends Activity {

    GridView grille = null;
    TextView item_sudoku = null;
    ArrayAdapter<String> arrayAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);

        grille = (GridView) findViewById(R.id.grile);
        item_sudoku = (TextView) findViewById(R.id.item_sudoku);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_sudoku);

        for(int i=1;i<=81;i++){
            arrayAdapter.add(String.valueOf(i));
        }
        grille.setAdapter(arrayAdapter);
    }
}
