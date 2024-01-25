package com.example.lab1amysteryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab1amysteryhelper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String[] story_array = getResources().getStringArray(R.array.story_array);
        Random rand = new Random();



        binding.storyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.storyText;
                t.setText(story_array[rand.nextInt(story_array.length-1)]);

                TextView tf = binding.textFinal;
                tf.setText(story_array[story_array.length-1]);
            }
        });
    }
}