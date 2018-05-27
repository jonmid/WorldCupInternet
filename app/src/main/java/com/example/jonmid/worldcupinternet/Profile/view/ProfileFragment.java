package com.example.jonmid.worldcupinternet.Profile.view;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonmid.worldcupinternet.Login.view.LoginActivity;
import com.example.jonmid.worldcupinternet.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements ProfileFragmentView {

    SharedPreferences sharedPreferences;
    CircleImageView circleImageView;
    TextView textViewProfileName;
    TextView textViewProfileEmail;
    Switch aSwitchOut;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_profile, container, false);

        circleImageView = view.findViewById(R.id.id_img_profile_image);
        textViewProfileName = view.findViewById(R.id.id_txv_profile_name);
        textViewProfileEmail = view.findViewById(R.id.id_txv_profile_email);
        aSwitchOut = view.findViewById(R.id.id_swi_profile_out);

        aSwitchOut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    SignOff();
                } else {
                    Toast.makeText(getActivity(), "Se quito la seleccion", Toast.LENGTH_SHORT).show();
                }
            }
        });

        initSharedPreferences();

        return view;
    }

    public void initSharedPreferences(){
        sharedPreferences = this.getActivity().getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);

        String imageProfile = sharedPreferences.getString("img", null);
        String nameProfile = sharedPreferences.getString("name", null);
        String emailProfile = sharedPreferences.getString("email", null);

        Picasso.get().load(imageProfile).into(circleImageView);
        textViewProfileName.setText(nameProfile);
        textViewProfileEmail.setText(emailProfile);
    }

    @Override
    public void SignOff() {
        sharedPreferences = this.getActivity().getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        Intent intent = new Intent(this.getActivity(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
