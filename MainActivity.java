package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int correctScore = 0;

    //**
    public void firstQuestion(View view) {
        RadioButton firstClickQ1 = findViewById(R.id.correct_answer_question_one);
        RadioButton secondClickQ1 = findViewById(R.id.wrong_answer_question_one_2);
        RadioButton thirdClickQ1 = findViewById(R.id.wrong_answer_question_one_3);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.correct_answer_question_one:
                if (checked)
                    correctScore += +1;
                secondClickQ1.setEnabled(false);
                thirdClickQ1.setEnabled(false);
                break;

            case R.id.wrong_answer_question_one_2:
                if (checked)
                    firstClickQ1.setEnabled(false);
                thirdClickQ1.setEnabled(false);
                break;

            case R.id.wrong_answer_question_one_3:
                if (checked)
                    firstClickQ1.setEnabled(false);
                secondClickQ1.setEnabled(false);
                break;

        }


    }

    public void secondQuestion(View view) {
        RadioButton firstClickQ2 = findViewById(R.id.wrong_answer_question_two_1);
        RadioButton secondClickQ2 = findViewById(R.id.wrong_answer_question_two_2);
        RadioButton thirdClickQ2 = findViewById(R.id.correct_answer_question_two);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_answer_question_two_1:
                if (checked)
                    secondClickQ2.setEnabled(false);
                thirdClickQ2.setEnabled(false);
                break;

            case R.id.wrong_answer_question_two_2:
                if (checked)
                    firstClickQ2.setEnabled(false);
                thirdClickQ2.setEnabled(false);
                break;

            case R.id.correct_answer_question_two:
                if (checked)
                    correctScore += +1;
                firstClickQ2.setEnabled(false);
                secondClickQ2.setEnabled(false);
                break;


        }
    }

    public void thirdQuestion(View view) {
        RadioButton firstClickQ3 = findViewById(R.id.wrong_answer_question_three_1);
        RadioButton secondClickQ3 = findViewById(R.id.wrong_answer_question_three_2);
        RadioButton thirdClickQ3 = findViewById(R.id.correct_answer_question_three);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_answer_question_three_1:
                if (checked)
                    secondClickQ3.setEnabled(false);
                thirdClickQ3.setEnabled(false);
                break;

            case R.id.wrong_answer_question_three_2:
                if (checked)
                    firstClickQ3.setEnabled(false);
                thirdClickQ3.setEnabled(false);
                break;

            case R.id.correct_answer_question_three:
                if (checked)
                    correctScore += +1;
                firstClickQ3.setEnabled(false);
                secondClickQ3.setEnabled(false);
                break;
        }
    }

   public void fourthQuestion(View view) {
       EditText questionFour = findViewById(R.id.question_four);
        String correctFour = questionFour.getText().toString();
        if (correctFour.equals(0)) {
          correctScore += +1;
       }
   }

    public void fithQuestion(View view) {
        RadioButton firstClickQ5 = findViewById(R.id.correct_answer_question_Five);
        RadioButton secondClickQ5 = findViewById(R.id.wrong_answer_question_five_2);
        RadioButton thirdClickQ5 = findViewById(R.id.wrong_answer_question_five_3);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.correct_answer_question_Five:
                if (checked)
                    correctScore += +1;
                secondClickQ5.setEnabled(false);
                thirdClickQ5.setEnabled(false);
                break;

            case R.id.wrong_answer_question_five_2:
                if (checked)
                    firstClickQ5.setEnabled(false);
                thirdClickQ5.setEnabled(false);
                break;

            case R.id.wrong_answer_question_five_3:
                if (checked)
                    firstClickQ5.setEnabled(false);
                secondClickQ5.setEnabled(false);
                break;
        }
    }

    public void sixthQuestion(View view) {
        RadioButton firstClickQ6 = findViewById(R.id.wrong_answer_question_six_1);
        RadioButton secondClickQ6 = findViewById(R.id.correct_answer_question_six);
        RadioButton thirdClickQ6 = findViewById(R.id.wrong_answer_question_six_3);
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_answer_question_six_1:
                if (checked)
                    secondClickQ6.setEnabled(false);
                thirdClickQ6.setEnabled(false);
                break;

            case R.id.correct_answer_question_six:
                if (checked)
                    correctScore += +1;
                firstClickQ6.setEnabled(false);
                thirdClickQ6.setEnabled(false);
                break;

            case R.id.wrong_answer_question_six_3:
                if (checked)
                    firstClickQ6.setEnabled(false);
                secondClickQ6.setEnabled(false);
                break;
        }

    }
      public void questionSeven(View view) {
        EditText questionSeven = findViewById(R.id.question_seven);
        String correctFour = questionSeven.getText().toString();
        if (correctFour.equals(1)) {
            correctScore += +1;
        }
    }

    public void questionEight(View view) {
        RadioButton firstClickQ8 = findViewById(R.id.wrong_answer_question_Eight_1);
        RadioButton secondClickQ8 = findViewById(R.id.wrong_answer_question_Eight_2);
        RadioButton thirdClickQ8 = findViewById(R.id.correct_answer_question_Eight);

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_answer_question_Eight_1:
                if (checked)
                    secondClickQ8.setEnabled(false);
                thirdClickQ8.setEnabled(false);
                break;

            case R.id.wrong_answer_question_Eight_2:
                if (checked)
                    firstClickQ8.setEnabled(false);
                thirdClickQ8.setEnabled(false);
                break;

            case R.id.correct_answer_question_Eight:
                if (checked)
                    correctScore += +1;
                firstClickQ8.setEnabled(false);
                secondClickQ8.setEnabled(false);
                break;
        }
    }

    public void correctAnswerQuestionNine2(View view) {
        CheckBox questionNine = findViewById(R.id.correct_answer_question_nine_2);
        boolean checked = questionNine.isChecked();
        if (checked) {
            correctScore += +1;
        }
    }

    public void correctAnswerQuestionNine3(View view) {
        CheckBox questionNine = findViewById(R.id.correct_answer_question_nine_3);
        boolean checked = questionNine.isChecked();
        if (checked) {
            correctScore += +1;
        }
    }

    public void submitQuiz(View view) {
        Toast.makeText(this, "Your Test Score:" + correctScore / 9, Toast.LENGTH_LONG).show();
    }



    }


}




