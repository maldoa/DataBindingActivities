package mx.ipn.cic.geo.databindingactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class NoDataBindingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button firstNameNoDataBindingButton;
        Button lastNameNoDataBindingButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_databinding);

        // Cambiar propiedad Text de los Botones sin hacer uso de DatBinding
        firstNameNoDataBindingButton = this.findViewById(R.id.firstNameNoDataBindingButton);
        lastNameNoDataBindingButton = this.findViewById(R.id.lastNameNoDataBindingButton);
        firstNameNoDataBindingButton.setText("EJEMPLO DE CAMBIO PROPIEDAD TEXT");
        lastNameNoDataBindingButton.setText("SIN USAR DATABINDING");


        ((Button)findViewById(R.id.dataBindingFirstSampleStartButton)).setText("CLASE DE ANDROID");
    }
}
