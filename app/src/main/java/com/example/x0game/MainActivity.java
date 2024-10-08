package com.example.x0game;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout main;


    TextView tvTurn;

    Button btnNewGame;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    boolean turn = false;

    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int b5 = 0;
    int b6 = 0;
    int b7 = 0;
    int b8 = 0;
    int b9 = 0;

    boolean win;
    int countClick = 9;

    boolean click1;
    boolean click2;
    boolean click3;
    boolean click4;
    boolean click5;
    boolean click6;
    boolean click7;
    boolean click8;
    boolean click9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initViews();


    }
    final Handler handler = new Handler();
    final Runnable runnable = new Runnable() {
        private boolean toggle = false;

        @Override
        public void run() {
            if (toggle) {
                main.setBackgroundColor(Color.parseColor("#0000FF")); // Blue
            } else {
                main.setBackgroundColor(Color.parseColor("#FFA500")); // Orange
            }
            toggle = !toggle;

            handler.postDelayed(this, 1000); // Run again after 1 second
        }
    };

    private void initViews() {
        main = findViewById(R.id.main);
        tvTurn = findViewById(R.id.tvTurn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnNewGame = findViewById(R.id.btnNewGame);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnNewGame.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(!win&&countClick>0){
            if (view==btn1&&!click1){
                if (turn==false){
                    btn1.setText("X");
                    btn1.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b1=1;

                }
                else if (turn==true) {
                    btn1.setText("0");
                    btn1.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b1=2;

                }
                countClick--;
                click1 = true;
            }

            if (view==btn2&&!click2){
                if (turn==false){
                    btn2.setText("X");
                    btn2.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b2=1;

                }
                else if (turn==true) {
                    btn2.setText("0");
                    btn2.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b2=2;
                }
                countClick--;
                click2 = true;
            }

            if (view==btn3&&!click3){
                if (turn==false){
                    btn3.setText("X");
                    btn3.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b3=1;
                }
                else if (turn==true) {
                    btn3.setText("0");
                    btn3.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b3=2;
                }
                countClick--;
                click3 = true;
            }

            if (view==btn4&&!click4){
                if (turn==false){
                    btn4.setText("X");
                    btn4.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b4=1;
                }
                else if (turn==true) {
                    btn4.setText("0");
                    btn4.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b4=2;
                }
                countClick--;
                click4 = true;
            }

            if (view==btn5&&!click5){
                if (turn==false){
                    btn5.setText("X");
                    btn5.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b5=1;
                }
                else if (turn==true) {
                    btn5.setText("0");
                    btn5.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b5=2;
                }
                countClick--;
                click5 = true;
            }

            if (view==btn6&&!click6){
                if (turn==false){
                    btn6.setText("X");
                    btn6.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b6=1;
                }
                else if (turn==true) {
                    btn6.setText("0");
                    btn6.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b6=2;
                }
                countClick--;
                click6 = true;
            }

            if (view==btn7&&!click7){
                if (turn==false){
                    btn7.setText("X");
                    btn7.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b7=1;
                }
                else if (turn==true) {
                    btn7.setText("0");
                    btn7.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b7=2;
                }
                countClick--;
                click7 = true;
            }

            if (view==btn8&&!click8){
                if (turn==false){
                    btn8.setText("X");
                    btn8.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b8=1;
                }
                else if (turn==true) {
                    btn8.setText("0");
                    btn8.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b8=2;
                }
                countClick--;
                click8 = true;
            }

            if (view==btn9&&!click9){
                if (turn==false){
                    btn9.setText("X");
                    btn9.setBackgroundColor(Color.parseColor("#ED0808"));
                    tvTurn.setText("O turn");
                    tvTurn.setTextColor(Color.parseColor("#13C21B"));
                    turn=true;
                    b9=1;
                }
                else if (turn==true) {
                    btn9.setText("0");
                    btn9.setBackgroundColor(Color.parseColor("#13C21B"));
                    tvTurn.setText("X turn");
                    tvTurn.setTextColor(Color.parseColor("#ED0808"));
                    turn = false;
                    b9=2;
                }
                countClick--;
                click9 = true;
            }
        }

        if(b1==2&&b2==2&&b3==2||
                b4==2&&b5==2&&b6==2||
                b7==2&&b8==2&&b9==2||
                b1==2&&b4==2&&b7==2||
                b2==2&&b5==2&&b8==2||
                b3==2&&b6==2&&b9==2||
                b1==2&&b5==2&&b9==2||
                b3==2&&b5==2&&b7==2){
            tvTurn.setText("0 WON!!!!!");
            tvTurn.setTextColor(Color.BLACK);
            win=true;

            handler.post(runnable);

        }

        if(b1==1&&b2==1&&b3==1||
                b4==1&&b5==1&&b6==1||
                b7==1&&b8==1&&b9==1||
                b1==1&&b4==1&&b7==1||
                b2==1&&b5==1&&b8==1||
                b3==1&&b6==1&&b9==1||
                b1==1&&b5==1&&b9==1||
                b3==1&&b5==1&&b7==1){
            tvTurn.setText("X WON!!!!!");
            tvTurn.setTextColor(Color.BLACK);
            win = true;


            handler.post(runnable);
        }
        if(countClick==0&&!win){
            System.out.println("losers");
            tvTurn.setText("Nobody won");
            tvTurn.setTextColor(Color.BLACK);
        }
        if(view==btnNewGame){
            btn1.setBackgroundColor(Color.parseColor("#EAD837"));
            btn1.setText("");
            btn2.setBackgroundColor(Color.parseColor("#EAD837"));
            btn2.setText("");
            btn3.setBackgroundColor(Color.parseColor("#EAD837"));
            btn3.setText("");
            btn4.setBackgroundColor(Color.parseColor("#EAD837"));
            btn4.setText("");
            btn5.setBackgroundColor(Color.parseColor("#EAD837"));
            btn5.setText("");
            btn6.setBackgroundColor(Color.parseColor("#EAD837"));
            btn6.setText("");
            btn7.setBackgroundColor(Color.parseColor("#EAD837"));
            btn7.setText("");
            btn8.setBackgroundColor(Color.parseColor("#EAD837"));
            btn8.setText("");
            btn9.setBackgroundColor(Color.parseColor("#EAD837"));
            btn9.setText("");

            tvTurn.setTextColor(Color.parseColor("#ED0808"));
            tvTurn.setText("x turn");

            turn=false;
            b1 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
            b5 = 0;
            b6 = 0;
            b7 = 0;
            b8 = 0;
            b9 = 0;

            win=false;
            countClick=9;

            click1 = false;
            click2 = false;
            click3 = false;
            click4 = false;
            click5 = false;
            click6 = false;
            click7 = false;
            click8 = false;
            click9 = false;

            handler.removeCallbacks(runnable);
            main.setBackgroundColor(Color.parseColor("#03A9F4"));





        }







    }
}
