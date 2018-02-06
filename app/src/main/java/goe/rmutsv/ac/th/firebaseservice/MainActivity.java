package goe.rmutsv.ac.th.firebaseservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import goe.rmutsv.ac.th.firebaseservice.fregment.Mainfregment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentfregment,new Mainfregment())
                    .commit();
        }




    }
}
