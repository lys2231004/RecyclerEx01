package merong.com.recyclerex01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

	private Context context;
	private ArrayList<PostItem> items;
	private View view;
	private RecyclerViewHolder holder;

	public RecyclerAdapter(Context context, ArrayList<PostItem> items) {
		this.context = context;
		this.items = items;
	}

	@NonNull
	@Override
	public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		view = View.inflate(context, R.layout.recycler_item, null);
		holder = new RecyclerViewHolder(view, this);
		return holder;
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
		PostItem item = items.get(position);
		holder.title.setText(item.getTit());
		Picasso.get().load(item.getImgUrl()).into(holder.photo);
	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
