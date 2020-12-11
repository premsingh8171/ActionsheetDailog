package com.premsinghdaksha.actionsheetdailog;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.actionsheet.ActionSheet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> actionsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionsList.add("Upload");
        actionsList.add("View");
        actionsList.add("Delete");
        actionsList.add("Move");
        actionsList.add("Duplicate");

        Button button = findViewById(R.id.testbtn);
        button.setOnClickListener(view -> new ActionSheet(MainActivity.this, actionsList)
                .setTitle("What do you want to do?")
                .setCancelTitle("Cancel")
                .setColorTitle(getResources().getColor(R.color.title))
                .setColorBackground(getResources().getColor(R.color.background))
//                        .hideTitle()
//                        .setFontData(R.font.meryana_script)
//                        .setFontCancelTitle(R.font.meryana_script)
//                        .setFontTitle(R.font.meryana_script)
//                        .setSizeTextCancel(30)
//                        .setSizeTextData(30)
//                        .setSizeTextTitle(30)
                .setColorTitleCancel(getResources().getColor(R.color.action))
                .setColorData(getResources().getColor(R.color.action))
                .setColorSelected(getResources().getColor(R.color.colorAccent))
                .create((data, position) -> {
                    switch (position) {
                        case 0:
                            // your action
                            setLog(data);
                            break;
                        case 1:
                            // your action
                            break;
                        case 2:
                            // your action
                            break;
                        case 3:
                            // your action
                            break;
                        case 4:
                            // your action
                            break;
                    }
                }));
    }

    private void setLog(String s) {
        Log.e("Tag", s);
    }
}