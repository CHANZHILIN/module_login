package chen.module_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;

import chen.baselib.Constants;
import chen.baselib.modularization_distribute.ModuleManagerActivity;

@Route(path = Constants.LOGIN_ACTIVITY_PATH)
public class LoginActivity extends ModuleManagerActivity {
    private String appId;
    private String cartId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);

        Intent intent = getIntent();    //intent
        if (intent != null && intent.getExtras() != null) {
            Bundle bundle = intent.getExtras().getBundle("bundle");
            if (bundle != null) {
                appId = bundle.getString("appId", "");
                cartId = bundle.getString("cartId", "");
            }
        }

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "appId:" + appId + ",cartId:" + cartId, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    public ArrayMap<String, ArrayList<Integer>> moduleConfig() {    //配置module的反射需要的名字和装载的ViewGroup
        ArrayMap<String, ArrayList<Integer>> map = new ArrayMap<>();
        map.put(PageConfig.MODULE_PAGE_NAME, new ArrayList<Integer>() {{
            add(R.id.page_name);
        }});
        map.put(PageConfig.MODULE_PAGE_BODYT, new ArrayList<Integer>() {{
            add(R.id.page_bodyT);
        }});
        map.put(PageConfig.MODULE_PAGE_BODYB, new ArrayList<Integer>() {{
            add(R.id.page_bodyB);
        }});
        return map;
    }
}
