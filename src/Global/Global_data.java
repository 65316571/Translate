package Global;

import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Global_data {
    /**
     * 分别为：
     * 常量 "汉译英"
     * 常量 "英译汉"
     */
    public static final String H = "汉译英";
    public static final String E = "英译汉";
    /**
     * 对应变量 分别为:
     * lock      建立登录锁
     * bl        控制执行只需要进行一次
     * S_mode    控制模式变量 首先汉译英
     * B_mode    初始化模式
     * quantity  记录次数(默认10次)
     * user      存储当前登录的用户名
     * account    当前账号名
     * userName  当前用户的电脑主机用户名
     * path      文件导出路径
     * sumEy      存储总正确个数英文
     * sumEn      存储总错误个数英文
     * sumCy      存储总正确个数中文
     * sumCn      存储总错误个数中文
     * get1       暂时存放get1的值
     * get2       暂时存放get2的值
     * html       存放常量html
     * mysql	  存放常量mysql
     * java	      存放常量java
     * git	      存放常量git
     * information	存放常量information
     * professional	存放常量professional
     * three	  存放常量three
     * table      存放当前表格名称的
     * t          记录当前查询模式
     * cka        cka选项框_1
     * ckb        cka选项框_2
     * date       设置日期格式
     */
    public static boolean lock = false;
    public static boolean bl = true;
    public static String S_mode = H;
    public static boolean B_mode = true;
    public static int quantity = 10;
    public static String user;
    public static String account;
    public static String userName;
    public static String path = "C:/Users/";
    public static int sumEy = 0;
    public static int sumEn = 0;
    public static int sumCy = 0;
    public static int sumCn = 0;
    public static String get1;
    public static String get2;

    public static final String html = "html";
    public static final String mysql = "mysql";
    public static final String java = "java";
    public static final String git = "git";
    public static final String important = "important";
    public static final String professional = "professional";
    public static final String three = "three";
    public static String table="no";
    public static int t=0;
    public static boolean cka=true;
    public static boolean ckb=true;

    public static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    /**
     * 对应集合 介绍为:
     * v是词汇
     * 键与值分别为：键(英文)     值(中文)
     * <p>
     * c是键值关系集合
     * 键(序号)    值(键值关系)
     */

    public static HashMap<String, String> hv = new HashMap<>();
    public static HashMap<String, String> jv = new HashMap<>();
    public static HashMap<String, String> gv = new HashMap<>();
    public static HashMap<String, String> mv = new HashMap<>();
    public static HashMap<String, String> tv = new HashMap<>();
    public static HashMap<String, String> pv = new HashMap<>();
    public static HashMap<String, String> iv = new HashMap<>();
    public static HashMap<String, String> uv = new HashMap<>();
    public static HashMap<Integer, String> hc = new HashMap<>();
    public static HashMap<Integer, String> jc = new HashMap<>();
    public static HashMap<Integer, String> gc = new HashMap<>();
    public static HashMap<Integer, String> mc = new HashMap<>();
    public static HashMap<Integer, String> tc = new HashMap<>();
    public static HashMap<Integer, String> pc = new HashMap<>();
    public static HashMap<Integer, String> ic = new HashMap<>();
    public static HashMap<Integer, String> uc = new HashMap<>();

}
