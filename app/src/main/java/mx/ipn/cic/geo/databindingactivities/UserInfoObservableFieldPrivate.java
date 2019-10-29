package mx.ipn.cic.geo.databindingactivities;

import android.databinding.ObservableField;

public class UserInfoObservableFieldPrivate {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();

     UserInfoObservableFieldPrivate(String firstName, String lastName)
    {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }

    public ObservableField<String> getFirstName() {
        return firstName;
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }
}
