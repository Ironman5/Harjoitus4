package com.example.mika.harjoitus4;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAdd,buttonSubtract,buttonMultiply,buttonDivide,buttonDeleteAll;
    private TextView resultAdd,resultSubtract,resultMultiply,resultDivide;
    private EditText numAdd1,numAdd2,numSub1,numSub2,numMulti1,numMulti2,numDiv1,numDiv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonSubtract = (Button)findViewById(R.id.buttonSubtract);
        buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonDeleteAll = (Button)findViewById(R.id.buttonDeleteAll);

        resultAdd = (TextView)findViewById(R.id.resultAdd);
        resultSubtract = (TextView)findViewById(R.id.resultSubtract);
        resultMultiply = (TextView)findViewById(R.id.resultMultiply);
        resultDivide= (TextView)findViewById(R.id.resultDivide);

        numAdd1 = (EditText)findViewById(R.id.numAdd1);
        numAdd2 = (EditText)findViewById(R.id.numAdd2);
        numSub1 = (EditText)findViewById(R.id.numSub1);
        numSub2 = (EditText)findViewById(R.id.numSub2);
        numMulti1 = (EditText)findViewById(R.id.numMulti1);
        numMulti2 = (EditText)findViewById(R.id.numMulti2);
        numDiv1 = (EditText)findViewById(R.id.numDiv1);
        numDiv2 = (EditText)findViewById(R.id.numDiv2);

        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonDeleteAll.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        float num1,num2,num3,num4,num5,num6,num7,num8;

        switch (view.getId()){
            case R.id.buttonAdd:
                num1 = Integer.parseInt(numAdd1.getText().toString());
                num2 = Integer.parseInt(numAdd2.getText().toString());
                resultAdd.setText(String.valueOf(num1+num2));
                break;
            case R.id.buttonSubtract:
                num3 = Integer.parseInt(numSub1.getText().toString());
                num4 = Integer.parseInt(numSub2.getText().toString());
                resultSubtract.setText(String.valueOf(num3-num4));
                break;
            case R.id.buttonMultiply:
                num5 = Integer.parseInt(numMulti1.getText().toString());
                num6 = Integer.parseInt(numMulti2.getText().toString());
                resultMultiply.setText(String.valueOf(num5*num6));
                break;
            case R.id.buttonDivide:
                num7 = Integer.parseInt(numDiv1.getText().toString());
                num8 = Integer.parseInt(numDiv2.getText().toString());
                resultDivide.setText(String.valueOf(num7/num8));
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
                break;
            default:
                break;
        }

    }
}