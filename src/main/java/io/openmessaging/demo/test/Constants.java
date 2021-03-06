package io.openmessaging.demo.test;

public class Constants {
    public final static String STORE_LINUX = System.getProperty("store.path", "/home/zwy/test");
    public static String STORE_PATH = STORE_LINUX;

    public final static String QUEUE_PRE = System.getProperty("queue.pre", "QUEUE_");
    public final static String TOPIC_PRE = System.getProperty("topic.pre", "TOPIC_");
    public final static String PRO_PRE = System.getProperty("pro.pre", "PRODUCER_");

    public final static int PRO_MAX = Integer.valueOf(System.getProperty("pro.max", "40000"));
    public final static int PRO_NUM = Integer.valueOf(System.getProperty("pro.num", "10"));
    public final static int CON_NUM = Integer.valueOf(System.getProperty("con.num", "10"));
    public final static int QUEUE_NUM = Integer.valueOf(System.getProperty("queue.num", "10"));
    public final static int TOPIC_NUM = Integer.valueOf(System.getProperty("topic.num", "90"));
}
