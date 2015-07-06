package com.sony.scalar.sysutil.didep;

public class ScalarSystemManager {
    public interface SystemReadyEventListener {
        void onSystemReady();
    }

    public static final boolean isSystemReady() { throw new RuntimeException(); }
    public void registerSystemReadyObserver(SystemReadyEventListener listener) { throw new RuntimeException(); }
    public void unregisterSystemReadyObserver() { throw new RuntimeException(); }
}
