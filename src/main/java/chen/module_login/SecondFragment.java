package chen.module_login;

import android.util.ArrayMap;

import java.util.ArrayList;

import chen.baselib.modularization_distribute.ModuleManagerFragment;

/**
 * Introduce :
 * Created by CHEN_ on 2019/4/4.
 * PACKAGE_NAME : chen.module_login
 **/
public class SecondFragment extends ModuleManagerFragment {
    @Override
    protected int getContentViewId() {
        return R.layout.activity_login;
    }


    @Override
    public ArrayMap<String, ArrayList<Integer>> moduleConfig() {
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
