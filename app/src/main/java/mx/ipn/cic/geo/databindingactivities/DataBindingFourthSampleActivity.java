package mx.ipn.cic.geo.databindingactivities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.ipn.cic.geo.databindingactivities.databinding.ActivityDataBindingFourthSampleBinding;
import mx.ipn.cic.geo.databindingactivities.databinding.ActivityDataBindingThirdSampleBinding;

public class DataBindingFourthSampleActivity extends AppCompatActivity {

    Button updateNamesDataBindingFourthSampleButton;
    int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ActivityDataBindingFourthSampleBinding fourthSampleBinding;
        final UserInfoObservableFieldPrivate userInfoObservableFieldprivate;
        super.onCreate(savedInstanceState);

        fourthSampleBinding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_fourth_sample);


        //setContentView(R.layout.activity_data_binding_fourth_sample);


        userInfoObservableFieldprivate = new UserInfoObservableFieldPrivate("EJEMPLO DE CAMBIO PROPIEDAD TEXT",
                "USANDO DATABINDING OBSERVABLE FIELD");
        fourthSampleBinding.setUserInfoObservableFieldPrivate(userInfoObservableFieldprivate);

        updateNamesDataBindingFourthSampleButton = findViewById(R.id.updateNamesDataBindingThirdSampleButton);
        updateNamesDataBindingFourthSampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Modificación de Atributos después de la Inicialización
                userInfoObservableFieldprivate.firstName.set("INTENTO DE MODIFICACIÓN PROPIEDAD TEXT" + " \n " +
                        "Numero de Click: " + clickCounter);
                userInfoObservableFieldprivate.lastName.set("DESPUÉS DE LA INICIALIZACIÓN OBSERVABLE FIELD"  + " \n " +
                        "Numero de Click: " + clickCounter);
                clickCounter++;
            }
        });
    }
}
