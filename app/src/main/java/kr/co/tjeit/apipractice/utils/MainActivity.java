package kr.co.tjeit.apipractice.utils;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import kr.co.tjeit.apipractice.BaseActivity;
import kr.co.tjeit.apipractice.LoginActivity;
import kr.co.tjeit.apipractice.R;

public class MainActivity extends BaseActivity {

    private android.widget.TextView welcomeMsgTxt;
    private de.hdodenhof.circleimageview.CircleImageView userProfileImgView;
    private android.widget.TextView userEmailTxt;
    private android.widget.TextView userPhoneTxt;
    private android.widget.Button logoutBtn;
    private Button showBankListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        showBankListBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                
            }
        });


        logoutBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                AlertDialog.Builder logoutAlert = new AlertDialog.Builder(mContext);
                logoutAlert.setTitle("LogOut");
                logoutAlert.setMessage("진짜 로그아웃?");
                logoutAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        ContextUtil.setToken(mContext, "");

                        Intent intent = new Intent(mContext, LoginActivity.class);
                        finish();

                    }
                });

                logoutAlert.setNegativeButton("Cancel", null);
                logoutAlert.show();
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        this.logoutBtn = (Button) findViewById(R.id.logoutBtn);
        this.showBankListBtn = (Button) findViewById(R.id.showBankListBtn);
        this.userPhoneTxt = (TextView) findViewById(R.id.userPhoneTxt);
        this.userEmailTxt = (TextView) findViewById(R.id.userEmailTxt);
        this.userProfileImgView = (CircleImageView) findViewById(R.id.userProfileImgView);
        this.welcomeMsgTxt = (TextView) findViewById(R.id.welcomeMsgTxt);

    }
}
