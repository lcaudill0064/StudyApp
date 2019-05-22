package com.example.nagolmac.studyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    TextView resultTextView;
    TextView questionTextView;

    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();
    int locationOfCorrectAnswer;
    int score = 0;
    int numberOfQuestions = 0;
    int questionCount = 0;
    Boolean shuffleList = true;

    public void start(View view) {

        startButton.setVisibility(View.INVISIBLE);
        questionCount = 0;
        score = 0;
        numberOfQuestions = 0;
        resultTextView.setText("");
        button0.setClickable(true);
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        questions.clear();
        shuffleList = true;

        setGame();

    }

    public void generateQuestion() {

        questions.add("0");
        questions.add("1");
        questions.add("2");
        questions.add("3");
        questions.add("4");
        questions.add("5");
        questions.add("6");
        questions.add("7");
        questions.add("8");
        questions.add("9");
        questions.add("10");
        questions.add("11");
        questions.add("12");
        questions.add("13");
        questions.add("14");
        questions.add("15");
        questions.add("16");
        questions.add("17");
        questions.add("18");
        questions.add("19");

    }

    public void generateAnswer() {

        answers.clear();

        questionTextView.setText(questions.get(questionCount));

        if (questionCount > 19) {
            startButton.setVisibility(View.VISIBLE);
            questionTextView.setText
                    ("You scored: " + Integer.toString(score) + " / " +
                            Integer.toString(numberOfQuestions));
            button0.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
        }

        else {

            if (shuffleList) {
                Collections.shuffle(questions, new Random(System.currentTimeMillis()));
                shuffleList = false;
            }

            switch (questions.get(questionCount).intern()) {
                case "0":
                    String message = "___________ states that if there are n1 outcomes in set S1, n2 outcomes in set S2," +
                            " ... and nk outcomes in set Sk and you are determining number of possible" +
                            " ways of having a sequence of outcomes made out of one from each set" +
                            " then there are n1n2...nk ways of choosing the outcomes from each set.";
                    questionTextView.setText(message);
                    answers.add("multiplication principle");
                    answers.add("addition principle");
                    answers.add("inclusion-exclusion principle");
                    answers.add("permutation");
                    while (!"multiplication principle".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("multiplication principle".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "1":
                    message = "___________ states that if there are n1 elements of set S1, n2 elements of set S2," +
                            " ... and nk elements of set Sk and no elements of the sets are common" +
                            " (the sets are disjoint) then there are n1+n2+...+nk ways of choosing" +
                            " one element from one of the given sets.";
                    questionTextView.setText(message);
                    answers.add("multiplication principle");
                    answers.add("addition principle");
                    answers.add("inclusion-exclusion principle");
                    answers.add("permutation");
                    while (!"addition principle".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("addition principle".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "2":
                    message = "___________ states that if there are n1 elements of set S1, and there are n2" +
                            " elements of set S2, ... and nk elements of set Sk and some of the elements" +
                            " are common to some sets then there are n1+n2+...+nk-[elements in" +
                            " intersection of all sets] ways of choosing one element from one of the" +
                            " given sets.";
                    questionTextView.setText(message);
                    answers.add("multiplication principle");
                    answers.add("addition principle");
                    answers.add("inclusion-exclusion principle");
                    answers.add("permutation");
                    while (!"inclusion-exclusion principle".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("inclusion-exclusion principle".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "3":
                    message = "Repetition is ___________ and order ___________" +
                            " when counting the number of ways of choosing k elements from a set that" +
                            " has n elements. It is computed n^k using the multiplication rule." +
                            " If different choices are to be from different sets then see the" +
                            " product rule.";
                    questionTextView.setText(message);
                    answers.add("allowed, matters");
                    answers.add("not allowed, matters");
                    answers.add("allowed, doesn't matter");
                    answers.add("not allowed, does'nt matter");
                    while (!"allowed, matters".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("allowed, matters".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "4":
                    message = "A ___________ of a finite set counts the number of ways of selecting elements of" +
                            " a set such that repetition is not allowed and order matters.";
                    questionTextView.setText(message);
                    answers.add("permutation");
                    answers.add("sub-set");
                    answers.add("computation");
                    answers.add("combination");
                    while (!"permutation".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("permutation".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "5":
                    message = "An ___________ of some of the elements of a set S is a permutation of r distinct" +
                            " elements and is written:\n" +
                            "            n!\n" +
                            " P(n,r) = ------.\n" +
                            "              (n-r)!";
                    questionTextView.setText(message);
                    answers.add("r-permutation");
                    answers.add("sub-set");
                    answers.add("cardinal set");
                    answers.add("combination");
                    while (!"r-permutation".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("r-permutation".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "6":
                    message = "To count the number of ways of choosing r elements from a set that has n elements" +
                            " such that repetition is not allowed and order does not matter then use" +
                            " a ___________ or ___________ which is written:\n" +
                            " \n" +
                            " C(n, r) or n^C_r or:\n" +
                            " ( n )       n!\n" +
                            "      (    ) = ----------\n" +
                            "        ( r  )       (n-r)!r!";
                    questionTextView.setText(message);
                    answers.add("binomial coefficient, combination");
                    answers.add("pascals coefficient, combination");
                    answers.add("power-set, r-permutation");
                    answers.add("proper-set, union");
                    while (!"binomial coefficient, combination".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("binomial coefficient, combination".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "7":
                    message = "When repetition is ___________ and order ___________ " +
                            " then the combinations is now written:" +
                            " n+r-1^C_r or:\n" +
                            "\n" +
                            " ( n+r-1 )    (n+r-1)!\n" +
                            " (       ) = ----------\n" +
                            " (   r   )    (n-1)!r!";
                    questionTextView.setText(message);
                    answers.add("allowed, doesn't matter");
                    answers.add("allowed, matters");
                    answers.add("not allowed, doesn't matter");
                    answers.add("not allowed, matters");
                    while (!"allowed, doesn't matter".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("allowed, doesn't matter".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "8":
                    message = "The ___________ of an event E given that another event F occurred, p(E|F)," +
                            " is given by:\n" +
                            "           p(E∩F)\n" +
                            " p(E|F) = ----------\n" +
                            "              p(F)";
                    questionTextView.setText(message);
                    answers.add("conditional probability");
                    answers.add("independent probability");
                    answers.add("sequential probability");
                    answers.add("standard probability");
                    while (!"conditional probability".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("conditional probability".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "9":
                    message = "If E and F are ___________ then p(E∩F) = p(E)p(F)";
                    questionTextView.setText(message);
                    answers.add("independent");
                    answers.add("dependent");
                    answers.add("multiples");
                    answers.add("commutative");
                    while (!"independent".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("independent".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "10":
                    message = "___________ states that if p(E) and p(F) are not 0 then:\n" +
                            "                    p(E|F)p(F)\n" +
                            " p(F | E) = ----------------------------\n" +
                            "                p(E|F)p(F) + p(E|!F)p(!F)";
                    questionTextView.setText(message);
                    answers.add("bayes' theorem");
                    answers.add("geometric distribution");
                    answers.add("bernoulli's theorem");
                    answers.add("boole's theorem");
                    while (!"bayes' theorem".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("bayes' theorem".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "11":
                    message = "The ___________ states that if a finite set S is partitioned into k sets, then" +
                            " at least one of the sets has |S|/k or more elements.";
                    questionTextView.setText(message);
                    answers.add("pigeon-hole principle");
                    answers.add("geometric principle");
                    answers.add("probability principle");
                    answers.add("pascal triangle");
                    while (!"pigeon-hole principle".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("pigeon-hole principle".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "12":
                    message = "The binomial coefficients or combinations produce a ___________ as we vary" +
                            " r from 0 to n and as n varies so that n = 0, 1, 2, ...";
                    questionTextView.setText(message);
                    answers.add("pascal triangle");
                    answers.add("binomial theorem");
                    answers.add("probability principle");
                    answers.add("pigeon-hole principle");
                    while (!"pascal triangle".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("pascal triangle".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "13":
                    message = "The ___________ of an event from set E, p(E), is given by the number of possible" +
                            " outcomes in the event set, divided by the number of outcomes in the" +
                            " sample space:\n" +
                            " \n" +
                            "           |E|\n" +
                            " p(E) = -----\n" +
                            "           |Ω|";
                    questionTextView.setText(message);
                    answers.add("probability");
                    answers.add("outcome");
                    answers.add("sum");
                    answers.add("set");
                    while (!"probability".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("probability".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "14":
                    message = "\n" +
                            "p(!E) = 1-p(E)\n" +
                            "\n" +
                            " This formula represents the probability of ___________";
                    questionTextView.setText(message);
                    answers.add("An event not occurring");
                    answers.add("An event occurring");
                    answers.add("All outcomes occurring");
                    answers.add("No outcomes occurring");
                    while (!"An event not occurring".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("An event not occurring".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "15":
                    message = "p(E∪F) = p(E) + p(F) - p(E∩F)\n" +
                            "\n" +
                            " This formula represents the probability of ___________";
                    questionTextView.setText(message);
                    answers.add("An event from one set or another set occurring");
                    answers.add("An event from two sets occurring at once");
                    answers.add("No events occurring");
                    answers.add("Shared events from two sets occurring");
                    while (!"An event from one set or another set occurring".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("An event from one set or another set occurring".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "16":
                    message = "Probability is a real number between 0 and 1. The probability of an ___________" +
                            " is ___________ and the probability of the ___________ is ___________";
                    questionTextView.setText(message);
                    answers.add("{empty set, 0},{sample space, 1}");
                    answers.add("{empty set, 0},{sample space, ∞}");
                    answers.add("{empty set, 0},{sample space, 5}");
                    answers.add("all answers are wrong");
                    while (!"{empty set, 0},{sample space, 1}".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("{empty set, 0},{sample space, 1}".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "17":
                    message = "The ___________ assigns probability to each event.";
                    questionTextView.setText(message);
                    answers.add("probability distribution function (pdf)");
                    answers.add("probability multiplier function (pmf)");
                    answers.add("commutative probability function (cpf)");
                    answers.add("probability event function (pef)");
                    while (!"probability distribution function (pdf)".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("probability distribution function (pdf)".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "18":
                    message = "The ___________ in a sample space is 1.";
                    questionTextView.setText(message);
                    answers.add("sum of all pdf values");
                    answers.add("product of all pdf values");
                    answers.add("event");
                    answers.add("outcome");
                    while (!"sum of all pdf values".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("sum of all pdf values".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
                case "19":
                    message = "If all n elements of a set S are equally likely then their probability is" +
                            " ___________ 1/n";
                    questionTextView.setText(message);
                    answers.add("uniform");
                    answers.add("disjointed");
                    answers.add("universal");
                    answers.add("relative");
                    while (!"uniform".equals(answers.get(locationOfCorrectAnswer))) {
                        Collections.shuffle(answers);
                    }
                    if ("uniform".equals(answers.get(locationOfCorrectAnswer))) {
                        button0.setText(answers.get(0));
                        button1.setText(answers.get(1));
                        button2.setText(answers.get(2));
                        button3.setText(answers.get(3));
                    }
                    break;
            }
        }

    }

    public void setGame() {

        Random rand = new Random();

        locationOfCorrectAnswer = rand.nextInt(4);

        generateQuestion();

        generateAnswer();

    }

    public void chooseAnswer(View view) {

        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {

            score++;
            questionCount++;
            resultTextView.setText("Correct!");
        }
        else {

            resultTextView.setText("Wrong!");
        }
        numberOfQuestions++;
        setGame();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        resultTextView = findViewById(R.id.resultTextView);
        questionTextView = findViewById(R.id.questionTextView);

        setGame();
    }
}
