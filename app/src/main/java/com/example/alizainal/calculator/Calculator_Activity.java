package com.example.alizainal.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Calculator_Activity extends AppCompatActivity {

    @BindView(R.id.txtwidth)
    EditText txtwidth;
    @BindView(R.id.txtLong)
    EditText txtLong;
    @BindView(R.id.txtCOUNT)
    Button txtCOUNT;
    @BindView(R.id.txtRESULT)
    TextView txtRESULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.txtCOUNT)
    public void onViewClicked() {
        Double Long = Double.valueOf(txtLong.getText().toString());
        Double width = Double.valueOf(txtwidth.getText().toString());

        if (TextUtils.isEmpty(txtLong.getText().toString())){
            txtLong.setError("Panjang Masih Kosong");
            txtLong.requestFocus();
        }else if (TextUtils.isEmpty(txtwidth.getText().toString())){
            txtwidth.setError("Lebar Masih Kosong");
            txtwidth.requestFocus();
        }else {
            Double Result = (Long * width);
            txtRESULT.setText(String.valueOf(Result));
        }
    }
}
