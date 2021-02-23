package com.example.toolbarsamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.toolbarsamples.databinding.ActivityToolbarTestBinding;

public class ToolbarTestActivity extends AppCompatActivity {


    ActivityToolbarTestBinding toolbarTestBinding;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbarTestBinding = ActivityToolbarTestBinding.inflate(getLayoutInflater());
        setContentView(toolbarTestBinding.getRoot());

        toolbar = toolbarTestBinding.toolbar;
        setSupportActionBar(toolbar);

    }



}



/*
        <!--
        layout_scrollFlags : AppBarLayout 및 하위의 스크롤 동작 담당
        scroll :  내용과 같이 스크롤, 툴바를 다시 볼려면 스크롤을 위로 끝까지 올려야함
        enterAlways : 맨위에 없어도 위로 스크롤시 바로 툴바가 보임
        enterAlwaysCollapsed : enterAlways와 동작이 비슷하지만 스크롤을 위로 끝까지 올려야 전체뷰가 보임 (스크롤하면 툴바도 같이 스크롤되어 안보임)
        exitUntilCollapsed : 아래/위로 스크롤시 축소된 툴바가 보이고 스크롤을 위로 끝까지 올려야 전체뷰가 보임 (스크롤해도 축소된 툴바가 보임)
        snap : 툴바가 위쪽에서 얼마나 떨어져 있는지에 따라 숨겨지거나 보여짐
        -->
*/
