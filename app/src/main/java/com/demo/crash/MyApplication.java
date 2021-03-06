package com.demo.crash;

import android.app.Application;

import com.tuzhenlei.crashhandler.CrashHandler;


/**
 * author：tuzhenlei
 * time  ：2017/2/20 17:50
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		/**
		 * 不带重启的
		 */
//		CrashHandler.getInstance().init(this, BuildConfig.DEBUG);
		/**
		 * 带重启的
		 * 参数1:this
		 * 参数2:是否保存日志到SD卡crash目录，建议设置为BuildConfig.DEBUG，在debug时候保存，方便调试
		 * 参数3:是否crash后重启APP
		 * 参数4:多少秒后重启app，建议设为0，因为重启采用闹钟定时任务模式，app会反应3秒钟，所以最快也是3-4秒后重启
		 * 参数5：重启后打开的第一个activity，建议是splashActivity
		 */

		CrashHandler.getInstance().init(this, BuildConfig.DEBUG, true, 0, MainActivity.class);


		/**
		 * 更多的设置方法
		 */
		/*
		//自定义Toast
		Toast toast = Toast.makeText(this, "自定义提示信息", Toast.LENGTH_LONG);
		toast.setGravity(Gravity.BOTTOM, 0, 0);
		CrashHandler.setCustomToast(toast);
		//自定义提示信息
		CrashHandler.setCrashTip("自定义提示信息");
		//自定义APP关闭动画
		CrashHandler.setCloseAnimation(android.R.anim.fade_out);
		*/

	}
}
