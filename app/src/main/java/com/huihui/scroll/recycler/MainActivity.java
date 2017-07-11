package com.huihui.scroll.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private RecyclerView rvNormal;
    private BetterRecyclerView rvBetter;
    private FeedRootRecyclerView rvFeedRoot;
    private CheckBox cbAngle;
    private CheckBox cbIgnore;
    private SectionAdapter adapter;
    private CheckBox cbNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_demo);

        adapter = new SectionAdapter();


        rvNormal = (RecyclerView) findViewById(R.id.rv_normal);
        rvBetter = (BetterRecyclerView) findViewById(R.id.rv_better);
        rvFeedRoot = (FeedRootRecyclerView) findViewById(R.id.rv_feed);

        cbAngle = (CheckBox) findViewById(R.id.cb_consider_angle);
        cbIgnore = (CheckBox) findViewById(R.id.cb_ignore_child_requests);
        cbNormal = (CheckBox) findViewById(R.id.cb_consider_normal);


        rvNormal.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rvBetter.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rvFeedRoot.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        rvNormal.setAdapter(adapter);
        rvBetter.setAdapter(adapter);
        rvFeedRoot.setAdapter(adapter);


        cbAngle.setOnCheckedChangeListener(this);
        cbIgnore.setOnCheckedChangeListener(this);
        cbNormal.setOnCheckedChangeListener(this);

        rvNormal.setVisibility(View.VISIBLE);
        rvBetter.setVisibility(View.GONE);
        rvFeedRoot.setVisibility(View.GONE);



    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (buttonView==cbNormal){

            if (isChecked){

                rvNormal.setVisibility(View.VISIBLE);
                rvBetter.setVisibility(View.GONE);
                rvFeedRoot.setVisibility(View.GONE);
            }

        }else if (buttonView==cbAngle){

            if (isChecked){

                rvNormal.setVisibility(View.GONE);
                rvBetter.setVisibility(View.VISIBLE);
                rvFeedRoot.setVisibility(View.GONE);
            }

        }else if (buttonView==cbIgnore){

            if (isChecked){

                rvNormal.setVisibility(View.GONE);
                rvBetter.setVisibility(View.GONE);
                rvFeedRoot.setVisibility(View.VISIBLE);
            }
        }
    }
}
