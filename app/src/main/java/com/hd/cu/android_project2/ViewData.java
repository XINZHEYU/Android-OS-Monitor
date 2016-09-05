package com.hd.cu.android_project2;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewData {
    ImageView appIcon;
    TextView tv_AppName;
    TextView tv_memory;
    TextView tv_process;
    TextView tv_pid;
    TextView tv_cpu;
    TextView tv_percent;

    public ViewData(View view){
        appIcon = (ImageView) view.findViewById(R.id.imv_ap_icon);
        tv_AppName = (TextView) view.findViewById(R.id.tv_app_name);
        tv_memory = (TextView) view.findViewById(R.id.tv_pkg_name);
        tv_process = (TextView) view.findViewById(R.id.tv_process);
        tv_pid = (TextView) view.findViewById(R.id.tv_pid);
        tv_cpu = (TextView) view.findViewById(R.id.tv_cpuTime);
        tv_percent = (TextView) view.findViewById(R.id.tv_percent);
    }

}
