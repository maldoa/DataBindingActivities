package mx.ipn.cic.geo.databindingactivities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.ipn.cic.geo.databindingactivities.databinding.ActivityDataBindingFirstSampleBinding;

public class DataBindingFirstSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ActivityDataBindingFirstSampleBinding firstSampleBinding;
        final UserInfo userInfo;

        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_data_binding_first_sample);

        firstSampleBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_data_binding_first_sample);
        userInfo = new UserInfo("EJEMPLO DE CAMBIO PROPIEDAD TEXT", "USANDO DATABINDING POJO");
        firstSampleBinding.setUserInfo(userInfo);
    }
}








