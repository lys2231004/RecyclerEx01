package merong.com.recyclerex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	private ArrayList<PostItem> items = new ArrayList<>();
	private RecyclerView recycler;
	private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

	private void initView() {
    	recycler = findViewById(R.id.recycler);
    	for(int i=0; i<100; i++) {
    		PostItem item = new PostItem("https://upload.wikimedia.org/wikipedia/commons/e/e3/Pablo_picasso.jpg", "피카소 좋아요"+i, false, false);
    		items.add(i, item);
		}
		adapter = new RecyclerAdapter(this, items);
    	recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
    	recycler.setAdapter(adapter);
	}
}
