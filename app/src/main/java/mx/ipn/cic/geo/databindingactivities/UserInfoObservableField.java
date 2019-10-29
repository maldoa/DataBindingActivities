package mx.ipn.cic.geo.databindingactivities;

import android.databinding.ObservableField;

public class UserInfoObservableField {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();

    public UserInfoObservableField(String firstName, String lastName)
    {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
}
