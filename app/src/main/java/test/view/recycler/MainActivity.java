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


		int [] photos={R.drawable.man,R.drawable.man1,R.drawable.man2,R.drawable.man3,R.drawable.man4
                       ,R.drawable.man5,R.drawable.man6,R.drawable.man7,R.drawable.man8,R.drawable.man9};
		String [] names={"Bhaa","Sameh","Mahmod","Mouhmed","Karm","Saad",
                "Fhiem","Mouza","Hamza","Omar"};

        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler);
        Adapter adapter=new Adapter(MainActivity.this,names,photos);
        recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        recyclerview.setAdapter(adapter);


    }
}
