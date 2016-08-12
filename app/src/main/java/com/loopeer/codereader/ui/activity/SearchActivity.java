package com.loopeer.codereader.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.loopeer.codereader.Navigator;
import com.loopeer.codereader.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SearchActivity extends BaseActivity {

    @BindView(R.id.edit_search_content)
    EditText mEditSearchContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @OnClick(R.id.btn_search)
    void onClick(View view) {
        String searchText = mEditSearchContent.getText().toString();
        if (!TextUtils.isEmpty(searchText)) {
            Navigator.startRepositoryActivity(this, searchText);
        }
    }

}