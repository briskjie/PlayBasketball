package basketball.cxx.com.playbasketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        /**
         * 融云的连线操作,建立与服务器的连接
         */
        String Token = "obc3z/J6ScAlXO22qae43n5eWBRAGstJaPog8u6v5B9iUFPi1plEnszMkZ+0aRcQZ/5HvvgEId4=";//test
        RongIM.connect(Token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                //token失效，需要重新连接
                Log.d("briskjie","---onTokenIncorrect---");
                System.out.println("briskjie");

            }

            @Override
            public void onSuccess(String userId) {
                Log.d("briskjie", "---onSuccess---" + userId);
                System.out.println("briskjie:"+userId);
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.d("briskjie", "---onError---" + errorCode);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                startActivity(new Intent(this,ConversationListAcitivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,SubConversationListActivtiy.class));
                break;
        }
    }
}
