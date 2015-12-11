package com.potkanburger.sudoku_durif_genoux_hu;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class SudokuAdapter extends ArrayAdapter {

    private SudokuGrid sudoGrid;

    public SudokuAdapter(Context context, int resource, SudokuGrid sudokuGrid){
        super(context, resource, sudokuGrid.toList());
        this.sudoGrid = sudokuGrid;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.item_sudoku, null);
        }
        final SquareEditText squareEditText = (SquareEditText) convertView.findViewById(R.id.item_sudoku);
        squareEditText.setText(sudoGrid.toList().get(position).toString());
        squareEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Coordonnee case: ", String.valueOf(position));
                Log.d("Valeur case: ", squareEditText.getText().toString());
            }
        });
        return squareEditText;
    }
}
