package goe.rmutsv.ac.th.firebaseservice.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import goe.rmutsv.ac.th.firebaseservice.R;

/**
 * Created by RTP-10305 on 4/2/2561.
 */

public class Mainfregment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        goregister();
    }

    private void goregister() {
        TextView textView = getView().findViewById(R.id.txtregister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentfregment, new register())
                        .addToBackStack(null).commit();

            }
        });
    }




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater
            , @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fregment_main,container,false);
        return view;

    }
}
