package goe.rmutsv.ac.th.firebaseservice.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import goe.rmutsv.ac.th.firebaseservice.R;


/**
 * Created by RTP-10305 on 6/2/2561.
 */

public class register extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater
            , @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register,container,false);
        return view;
    }
}


