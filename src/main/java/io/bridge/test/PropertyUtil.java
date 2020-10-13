package io.bridge.test;

public class PropertyUtil {

    /**
     * 静态块
     */
    static {

        System.out.println("do some init");
        // 阻止其运行
        System.out.println(1 / 0);
    }

    public static String getConfig(String key, String defaultValue) {
        return "1";
    }

    public static void setConfig(String code, String value) throws Exception {
        if (code == null) {
            throw new Exception();
        }
    }
}
