package osc.ada.tomislavgazica.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edittext_enterNumberOne)EditText numberOne;
    @BindView(R.id.edittext_enterNumberTwo)EditText numberTwo;
    @BindView(R.id.textview_result)TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_add,R.id.button_subtract,R.id.button_multiply,R.id.button_divide})
    public void setResult(View view){
        double firstNumber = Double.parseDouble(this.numberOne.getText().toString());
        double secondNumber = Double.parseDouble(this.numberTwo.getText().toString());
        double result;

        switch (view.getId()){
            case R.id.button_add:
                result = firstNumber + secondNumber;
                resultTextView.setText(Double.toString(result));
                break;

            case R.id.button_subtract:
                result = firstNumber - secondNumber;
                resultTextView.setText(Double.toString(result));
                break;

            case R.id.button_multiply:
                result = firstNumber * secondNumber;
                resultTextView.setText(Double.toString(result));
                break;

            case R.id.button_divide:
                result = firstNumber / secondNumber;
                resultTextView.setText(Double.toString(result));
                break;

            default:
                Toast.makeText(this, "Not a choice.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
