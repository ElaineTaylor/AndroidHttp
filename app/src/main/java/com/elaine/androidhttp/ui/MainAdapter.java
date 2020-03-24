package com.elaine.androidhttp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.elaine.androidhttp.R;
import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.List;

/**
 * @author elaine
 * @date 2020/3/23
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private List<SubjectsBean> subjectsBeanList;
    private Context context;


    public MainAdapter(List<SubjectsBean> subjectsBeanList, Context context) {
        this.subjectsBeanList = subjectsBeanList;
        this.context = context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Glide.with(context).load(subjectsBeanList.get(position).getImages().getSmall()).into(holder.mIvSmall);
        holder.mTvCount.setText(subjectsBeanList.get(position).getCollect_count() + "人收藏");
        holder.mTvName.setText(subjectsBeanList.get(position).getOriginal_title());
        holder.mTvTime.setText(subjectsBeanList.get(position).getDirectors().get(0).getName());
    }

    @Override
    public int getItemCount() {
        return subjectsBeanList.size() > 0 ? subjectsBeanList.size() : 0;
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private ImageView mIvSmall;
        private TextView mTvName;
        private TextView mTvCount;
        private TextView mTvTime;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            mIvSmall = (ImageView) itemView.findViewById(R.id.iv_small);
            mTvName = (TextView) itemView.findViewById(R.id.tv_name);
            mTvCount = (TextView) itemView.findViewById(R.id.tv_count);
            mTvTime = (TextView) itemView.findViewById(R.id.tv_time);
        }
    }
}
