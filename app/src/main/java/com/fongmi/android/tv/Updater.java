package com.fongmi.android.tv;

import androidx.fragment.app.FragmentActivity;

/**
 * R1: 應用程式內版本更新功能已停用。
 * 保留原有 API，避免其他產品變體或舊呼叫點造成編譯相容性問題。
 */
public final class Updater {

    private Updater() {
    }

    public static Updater create() {
        return new Updater();
    }

    public Updater force() {
        return this;
    }

    public void start(FragmentActivity activity) {
        // Intentionally empty: no update checks, notifications, downloads, or prompts.
    }
}
