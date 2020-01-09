package com.bawei.zhujinru20200108.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.zhujinru20200108.R;
import com.bawei.zhujinru20200108.model.bean.DzBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyDZAdapter extends RecyclerView.Adapter<MyDZAdapter.MyViewHolder> {

    private List<DzBean.ResultBean> result;

    public MyDZAdapter(List<DzBean.ResultBean> result) {

        this.result = result;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.dzchild, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DzBean.ResultBean resultBean = result.get(position);
        holder.name.setText(resultBean.getRealName());
        holder.phone.setText(resultBean.getPhone()+"");
        holder.address.setText(resultBean.getAddress());
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.phone)
        TextView phone;
        @BindView(R.id.address)
        TextView address;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
