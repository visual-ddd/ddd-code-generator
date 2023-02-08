package com.wd.paas.generator.common.context;


import java.util.*;

public final class ThreadLocalUtil {

    private static final ThreadLocal<Map<String, Object>> threadLocal = ThreadLocal.withInitial(HashMap::new);

    public static Map<String, Object> getThreadLocal() {
        return threadLocal.get();
    }

    public static <T> T get(String key) {
        Map<String, Object> map = threadLocal.get();
        return (T) map.get(key);
    }

    public static <T> T get(String key, T defaultValue) {
        Map<String, Object> map = threadLocal.get();
        return (T) map.get(key) == null ? defaultValue : (T) map.get(key);
    }

    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        map.put(key, value);
    }

    public static void set(Map<String, Object> keyValueMap) {
        Map<String, Object> map = threadLocal.get();
        map.putAll(keyValueMap);
    }

    public static void remove() {
        threadLocal.remove();
    }

    public static <T> Map<String, T> fetchVarsByPrefix(String prefix) {
        Map<String, T> vars = new HashMap<>();
        if (prefix == null) {
            return vars;
        }
        Map<String, Object> map = threadLocal.get();
        Set<Map.Entry<String, Object>> set = map.entrySet();

        for (Map.Entry<String, Object> entry : set) {
            String key = entry.getKey();
            if (key != null) {
                if (key.startsWith(prefix)) {
                    vars.put(key, (T) entry.getValue());
                }
            }
        }
        return vars;
    }

    public static <T> T remove(String key) {
        Map<String, Object> map = threadLocal.get();
        return (T) map.remove(key);
    }

    public static void clear(String prefix) {
        if (prefix == null) {
            return;
        }
        Map<String, Object> map = threadLocal.get();
        Set<Map.Entry<String, Object>> set = map.entrySet();
        List<String> removeKeys = new ArrayList<>();

        for (Map.Entry<String, Object> entry : set) {
            String key = entry.getKey();
            if (key != null && key.startsWith(prefix)) {
                removeKeys.add(key);
            }
        }
        for (String key : removeKeys) {
            map.remove(key);
        }
    }
}