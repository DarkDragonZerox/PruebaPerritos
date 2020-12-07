package cl.evilcorp.perritos.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.evilcorp.perritos.R;


public class breedFragment extends Fragment {

    public breedFragment() {
        // Required empty public constructor
    }


    public static breedFragment newInstance() {
        breedFragment fragment = new breedFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_breed, container, false);
    }
}