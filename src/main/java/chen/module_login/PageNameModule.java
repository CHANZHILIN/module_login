package chen.module_login;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import chen.baselib.baseActivityModule.BaseModule;
import chen.baselib.baseActivityModule.ModuleContext;

/**
 * Introduce :
 * Created by CHEN_ on 2019/3/29.
 * PACKAGE_NAME : chen.module_login
 **/
public class PageNameModule extends BaseModule {
    private Activity activity;
    private ModuleContext moduleContext;
    private ViewGroup parentViewGroup;
    private View pageNameView;
    private TextView pageTitle;

    @Override
    public void init(ModuleContext moduleContext, Bundle bundle) {
        super.init(moduleContext, bundle);
        activity = moduleContext.getContext();
        parentViewGroup = moduleContext.getViewGroups().get(0);
        this.moduleContext = moduleContext;
        initView();
    }

    private void initView() {
        pageNameView = LayoutInflater.from(activity).inflate(R.layout.page_name_layout, parentViewGroup, true);
        pageTitle = (TextView) pageNameView.findViewById(R.id.page_title);
    }
}
