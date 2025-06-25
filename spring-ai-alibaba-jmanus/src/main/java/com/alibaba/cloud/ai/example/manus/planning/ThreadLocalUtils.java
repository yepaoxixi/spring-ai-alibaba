package com.alibaba.cloud.ai.example.manus.planning;

import com.alibaba.cloud.ai.example.manus.planning.model.vo.UserIntent;

public class ThreadLocalUtils {

	private static ThreadLocal<UserIntent> userIntentThreadLocal = new ThreadLocal<UserIntent>();

	public static void setUserIntent(UserIntent userIntent) {
		userIntentThreadLocal.set(userIntent);
	}

	public static UserIntent getUserIntent() {
		return userIntentThreadLocal.get();
	}

}
