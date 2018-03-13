package org.domain.lzy.app.commonly;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import java.util.List;

/**
 * 作者：zhengyang on 2018/3/9
 * 邮箱：lzy@winwayit.com.cn
 * 内容: {@link ConfigModule} 可以给框架配置一些参数,需要实现 {@link ConfigModule} 后,在 AndroidManifest 中声明该实现类
 * 注意:
 */

public interface ConfigModule {
    /**
     * 使用{@link GlobalConfigModule.Builder}给框架配置一些配置参数
     *
     * @param context
     * @param builder
     */
    void applyOptions(Context context, GlobalConfigModule.Builder builder);

    /**
     * 使用{@link AppLifecycles}在Application的生命周期中注入一些操作
     *
     * @param context
     * @param lifecycles
     */
//    void injectAppLifecycle(Context context, List<AppLifecycles> lifecycles);

    /**
     * 使用{@link Application.ActivityLifecycleCallbacks}在Activity的生命周期中注入一些操作
     *
     * @param context
     * @param lifecycles
     */
    void injectActivityLifecycle(Context context, List<Application.ActivityLifecycleCallbacks> lifecycles);


    /**
     * 使用{@link FragmentManager.FragmentLifecycleCallbacks}在Fragment的生命周期中注入一些操作
     *
     * @param context
     * @param lifecycles
     */
    void injectFragmentLifecycle(Context context, List<FragmentManager.FragmentLifecycleCallbacks> lifecycles);
}
