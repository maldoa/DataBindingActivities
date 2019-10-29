package mx.ipn.cic.geo.databindingactivities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import mx.ipn.cic.geo.databindingactivities.databinding.ActivityDataBindingThirdSampleBinding;

public class DataBindingThirdSampleActivity extends AppCompatActivity {
    Button updateNamesDataBindingThirdSampleButton;
    int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ActivityDataBindingThirdSampleBinding thirdSampleBinding;
        final UserInfoObservableField userInfoObservableField;

        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_data_binding_third_sample);

        thirdSampleBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_data_binding_third_sample);
        userInfoObservableField = new UserInfoObservableField("EJEMPLO DE CAMBIO PROPIEDAD TEXT",
                "USANDO DATABINDING OBSERVABLE FIELD");
        thirdSampleBinding.setUserInfoObservableField(userInfoObservableField);

        updateNamesDataBindingThirdSampleButton = findViewById(R.id.updateNamesDataBindingThirdSampleButton);
        updateNamesDataBindingThirdSampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Modificación de Atributos después de la Inicialización
                userInfoObservableField.firstName.set("INTENTO DE MODIFICACIÓN PROPIEDAD TEXT" + " \n " +
                    "Numero de Click: " + clickCounter);
                userInfoObservableField.lastName.set("DESPUÉS DE LA INICIALIZACIÓN OBSERVABLE FIELD"  + " \n " +
                    "Numero de Click: " + clickCounter);
                clickCounter++;
            }
        });
    }
}
