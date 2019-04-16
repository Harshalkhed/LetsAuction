package helpers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akrinindia.sangli.letsauction.R;

public class NearViewAdapter extends RecyclerView.Adapter<NearViewAdapter.ViewHolder> {
    Context context;
    @NonNull
    @Override
    public NearViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.near_you_layout_inflator, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NearViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            // Log.i("autolog", "ViewHolder");

            name = (TextView) itemView.findViewById(R.id.sub_type);


//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
        }
    }
}
