package helpers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akrinindia.sangli.letsauction.R;

public class AuctionSellDetailsAdapter extends RecyclerView.Adapter<AuctionSellDetailsAdapter.ViewHolder> {
    @NonNull
    @Override
    public AuctionSellDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AuctionSellDetailsAdapter.ViewHolder viewHolder, int i) {

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
