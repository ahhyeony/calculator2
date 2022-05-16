package com.example.calculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    int value =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private TextView txtExpression;
        private TextView txtResult;
        private List<Integer> checkList; // -1: 이콜, 0: 연산자, 1: 숫자, 2: . / 예외 발생을 막는 리스트
        private Stack<String> operatorStack; // 연산자를 위한 스택
        private List<String> infixList; // 중위 표기
        private List<String> postfixList; // 후위 표기

        void init()
        {   txtExpression = findViewById(R.id.textView);
            txtResult = findViewById(R.id.textView);
            checkList = new ArrayList<>();
            operatorStack = new Stack<>();
            infixList = new ArrayList<>();
            postfixList = new ArrayList<>();

            ActionBar actionBar = getSupportActionBar();
            assert actionBar != null;
            actionBar.hide();
        }

        // 필드 초기화
        void init()
        {   txtExpression = findViewById(R.id.textView);
            txtResult = findViewById(R.id.textView);
            checkList = new ArrayList<>();
            operatorStack = new Stack<>();
            infixList = new ArrayList<>();
            postfixList = new ArrayList<>();

            ActionBar actionBar = getSupportActionBar()
            assert actionBar != null;
            actionBar.hide();
        }

        // 연산자 가중치 (우선순위 *,/,%,+,-)
        int getWeight(String operator) {
            int weight = 0;
            switch (operator) {
                case "X": case "/": weight = 5; break;
                case "%": weight = 3; break;
                case "+": case "-": weight = 1; break;
            }
            return weight;
        }

        // 전위 -> 후위
        void infixToPostfix() {
            for (String item : infixList) {
                // 피연산자
                if (isNumber(item)) postfixList.add(String.valueOf(Double.parseDouble(item)));
                // 연산자
                else {
                    if (operatorStack.isEmpty()) operatorStack.push(item);
                    else {
                        if (getWeight(operatorStack.peek()) >= getWeight(item)) postfixList.add(operatorStack.pop());
                        operatorStack.push(item);
                    }
                }
            } while (!operatorStack.isEmpty()) postfixList.add(operatorStack.pop());
        }







            }
        }
}