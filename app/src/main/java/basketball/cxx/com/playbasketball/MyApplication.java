package basketball.cxx.com.playbasketball;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by cxx on 2016/10/22 0022.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {

        /**
         * 初始化融云
         */
        RongIM.init(this);
    }
}
