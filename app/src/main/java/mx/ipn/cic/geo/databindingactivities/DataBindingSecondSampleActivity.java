package mx.ipn.cic.geo.databindingactivities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.ipn.cic.geo.databindingactivities.databinding.ActivityDataBindingSecondSampleBinding;

public class DataBindingSecondSampleActivity extends AppCompatActivity {
    Button updateNamesDataBindingSecondSampleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ActivityDataBindingSecondSampleBinding secondSampleBinding;
        final UserInfoPrivate userInfoPrivate;

        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_data_binding_second_sample);

        secondSampleBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_data_binding_second_sample);
        userInfoPrivate = new UserInfoPrivate("EJEMPLO DE CAMBIO PROPIEDAD TEXT",
                "USANDO DATABINDING PRIVATE DATA");
        secondSampleBinding.setUserInfoPrivate(userInfoPrivate);

        updateNamesDataBindingSecondSampleButton = findViewById(R.id.updateNamesDataBindingSecondSampleButton);
        updateNamesDataBindingSecondSampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Modificación de Atributos después de la Inicialización
                userInfoPrivate.setFirstName("INTENTO DE MODIFICACIÓN PROPIEDAD TEXT");
                userInfoPrivate.setLastName("DESPUÉS DE LA INICIALIZACIÓN USERINFOPRIVATE");
                secondSampleBinding.setUserInfoPrivate(userInfoPrivate);
            }
        });
    }
}
