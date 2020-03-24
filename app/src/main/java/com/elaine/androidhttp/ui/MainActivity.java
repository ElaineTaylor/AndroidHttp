package com.elaine.androidhttp.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.elaine.androidhttp.R;
import com.elaine.androidhttp.bean.SubjectsBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView {
    private RecyclerView mRvMain;
    private MainAdapter adapter;
    private MainPresenter presenter;
    private int start = 1, count = 10;
    private List<SubjectsBean> subjectsBeans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initList();
        initAdapter();
        initPresenter();
        initData();

    }

    private void initView() {
        mRvMain = (RecyclerView) findViewById(R.id.rv_main);
    }

    private void initList() {
        subjectsBeans = new ArrayList<>();
    }

    private void initAdapter() {
        adapter = new MainAdapter(subjectsBeans, this);
        mRvMain.setLayoutManager(new LinearLayoutManager(this));
        mRvMain.setAdapter(adapter);
    }

    private void initPresenter() {
        presenter = new MainPresenter(this);
    }

    private void initData() {
        presenter.getFilmList(this, true, String.valueOf(start), String.valueOf(count));
    }

    @Override
    public void onFilmListSuccess(List<SubjectsBean> subjectsBeanList) {
        if (subjectsBeanList != null) {
            subjectsBeans.addAll(subjectsBeanList);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


}
