package helpers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akrinindia.sangli.letsauction.OnItemClickListener;
import com.akrinindia.sangli.letsauction.R;

import java.util.List;

import models.GetSubCategoriesResponse;

public class SubcategoryViewAdapter extends RecyclerView.Adapter<SubcategoryViewAdapter.ViewHolder> {

    private List<GetSubCategoriesResponse> list;
    private Context context;
    private OnItemClickListener listener;
    public SubcategoryViewAdapter(List<GetSubCategoriesResponse> list, Context context) {
        this.list = list;
        this.context = context;
        //this.listener = listener;
    }

    @NonNull
    @Override
    public SubcategoryViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_sub_cat, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SubcategoryViewAdapter.ViewHolder viewHolder,int i) {
        viewHolder.name.setText(list.get(i).getSubtype_name());

    }

    @Override
    public int getItemCount() {
        return list.size();
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
