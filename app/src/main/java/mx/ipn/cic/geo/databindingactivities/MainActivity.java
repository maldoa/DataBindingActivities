package mx.ipn.cic.geo.databindingactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button noDataBindingStartButton;
    private Button dataBindingFirstSampleStartButton;
    private Button dataBindingSecondSampleStartButton;
    private Button dataBindingThirdSampleStartButton;
    private Button dataBindingFourthSampleStartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noDataBindingStartButton = findViewById(R.id.noDataBindingStartButton);
        dataBindingFirstSampleStartButton = findViewById(R.id.dataBindingFirstSampleStartButton);
        dataBindingSecondSampleStartButton = findViewById(R.id.dataBindingSecondSampleStartButton);
        dataBindingThirdSampleStartButton = findViewById(R.id.dataBindingThirdSampleStartButton);
        dataBindingFourthSampleStartButton = findViewById(R.id.dataBindingFourthSampleStartButton);
        SetOnClickListeners();
    }

    private void SetOnClickListeners()
    {
        noDataBindingStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NoDataBindingActivity.class);
                startActivity(intent);
            }
        });

        dataBindingFirstSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingFirstSampleActivity.class);
                startActivity(intent);
            }
        });

        dataBindingSecondSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingSecondSampleActivity.class);
                startActivity(intent);
            }
        });

        dataBindingThirdSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingFourthSampleActivity.class);
                startActivity(intent);
            }
        });

        dataBindingFourthSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingThirdSampleActivity.class);
                startActivity(intent);
            }
        });
    }
}
