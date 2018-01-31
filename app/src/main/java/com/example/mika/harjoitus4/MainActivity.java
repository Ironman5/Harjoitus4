package com.example.mika.harjoitus4;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    public static final String EXTRA_MESSAGE = "mika.example.harjoitus4.MESSAGE";
    private TextView resultAdd,resultSubtract,resultMultiply,resultDivide;
    private EditText numAdd1,numAdd2,numSub1,numSub2,numMulti1,numMulti2,numDiv1,numDiv2;
    private String loki = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        resultAdd = findViewById(R.id.resultAdd);
        resultSubtract = findViewById(R.id.resultSubtract);
        resultMultiply = findViewById(R.id.resultMultiply);
        resultDivide = findViewById(R.id.resultDivide);

        numAdd1 = findViewById(R.id.numAdd1);
        numAdd2 = findViewById(R.id.numAdd2);
        numSub1 = findViewById(R.id.numSub1);
        numSub2 = findViewById(R.id.numSub2);
        numMulti1 = findViewById(R.id.numMulti1);
        numMulti2 = findViewById(R.id.numMulti2);
        numDiv1 = findViewById(R.id.numDiv1);
        numDiv2 = findViewById(R.id.numDiv2);

    }

    public void sendMessage(View view) {

        float num1,num2,num3,num4,num5,num6,num7,num8;

        Intent intent = new Intent(this, DisplayLogActivity.class);

        switch (view.getId()){

            case R.id.buttonAdd:
                num1 = Integer.parseInt(numAdd1.getText().toString());
                num2 = Integer.parseInt(numAdd2.getText().toString());
                resultAdd.setText(String.valueOf(num1+num2));
                loki += String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + String.valueOf(num1+num2) + "\n";
                break;
            case R.id.buttonSubtract:
                num3 = Integer.parseInt(numSub1.getText().toString());
                num4 = Integer.parseInt(numSub2.getText().toString());
                resultSubtract.setText(String.valueOf(num3-num4));
                loki += String.valueOf(num3) + " - " + String.valueOf(num4) + " = " + String.valueOf(num3-num4) + "\n";
                break;
            case R.id.buttonMultiply:
                num5 = Integer.parseInt(numMulti1.getText().toString());
                num6 = Integer.parseInt(numMulti2.getText().toString());
                resultMultiply.setText(String.valueOf(num5*num6));
                loki += String.valueOf(num5) + " * " + String.valueOf(num6) + " = " + String.valueOf(num5*num6) + "\n";
                break;
            case R.id.buttonDivide:
                num7 = Integer.parseInt(numDiv1.getText().toString());
                num8 = Integer.parseInt(numDiv2.getText().toString());
                resultDivide.setText(String.valueOf(num7/num8));
                loki += String.valueOf(num7) + " / " + String.valueOf(num8) + " = " + String.valueOf(num7/num8) + "\n";
                break;
            case R.id.buttonDeleteAll:
                resultAdd.setText("");
                resultSubtract.setText("");
                resultMultiply.setText("");
                resultDivide.setText("");
                numAdd1.setText("");
                numAdd2.setText("");
                numSub1.setText("");
                numSub2.setText("");
                numMulti1.setText("");
                numMulti2.setText("");
                numDiv1.setText("");
                numDiv2.setText("");
                loki = "";
                break;
            case R.id.buttonShowLog:
                intent.putExtra(EXTRA_MESSAGE,loki);
                startActivity(intent);
                loki = "";
                break;
            default:
                break;
        }

    }
}


