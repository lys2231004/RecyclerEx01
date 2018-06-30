package merong.com.recyclerex01;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

	public CheckBox likeBt, shareBt;
	public ImageView photo;
	public TextView title;
	public RecyclerAdapter adaper;

	public RecyclerViewHolder(View itemView, RecyclerAdapter adaper) {
		super(itemView);

		this.adaper = adaper;
		likeBt = itemView.findViewById(R.id.bt_like);
		shareBt = itemView.findViewById(R.id.bt_share);
		photo = itemView.findViewById(R.id.iv_photo);
		title = itemView.findViewById(R.id.tv_tit);
	}
}
