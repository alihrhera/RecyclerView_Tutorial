package test.view.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


		
		String [] names={"Ali","Bhaa","Sameh","Mahmod","Mouhmed","Karm","Saad",
                "Fhiem","Mouza","Hamza","Omar","Aamr"
                ,"karim","Lamiaz","nagy","elsmahey","norEldien"};

        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler);
        Adapter adapter=new Adapter(names,MainActivity.this);
        recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        recyclerview.setAdapter(adapter);


    }
}
