package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.databinding.ActivityMain2Binding;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    ArrayList<Double> grade = new ArrayList<>();
    ArrayList<Integer> time = new ArrayList<>();
    double temp = 0;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main_2);

        // 학점 버튼
        binding.btAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(4.5);
            }
        });
        binding.btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(4.0);
            }
        });
        binding.btBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(3.5);
            }
        });
        binding.btB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(3.0);
            }
        });
        binding.btCP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(2.5);
            }
        });
        binding.btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(2.0);
            }
        });
        binding.btDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(1.5);
            }
        });
        binding.btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(1.0);
            }
        });
        binding.btF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.add(0.0);
            }
        });


        // 시수 버튼
        binding.btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum += 1;

                temp += (grade.get(grade.size() - 1) * 1);
                binding.tvAnswer.setText(String.format("%.2f", temp / sum));
            }
        });
        binding.btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum += 2;

                temp += (grade.get(grade.size() - 1) * 2);
                binding.tvAnswer.setText(String.format("%.2f", temp / sum));
            }
        });
        binding.btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum += 3;

                temp += (grade.get(grade.size() - 1) * 3);
                binding.tvAnswer.setText(String.format("%.2f", temp / sum));
            }
        });
        binding.btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum += 4;

                temp += (grade.get(grade.size() - 1) * 4);
                binding.tvAnswer.setText(String.format("%.2f", temp / sum));
            }
        });

        // 취소 버튼
        binding.btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.remove(grade.size() - 1);
            }
        });
        binding.btClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade.clear();
                binding.tvAnswer.setText("0.0");
            }
        });
    }
}
