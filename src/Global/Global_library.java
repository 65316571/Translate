package Global;

import Interface.Function.SetUP.*;
import Interface.Function.Practise.Chinese.*;
import Interface.Function.Practise.English.*;
import JDBC.Tool;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * @author hao
 * 函数库
 */
public class Global_library {

    /**
     * Local_export    导出文件方法
     */
    public static void Local_export() throws IOException {
        Global_library.obtainHtml();
        Set<Map.Entry<String, String>> tmpSet = Global_data.hv.entrySet();
        ArrayList<Map.Entry<String, String>> array = new ArrayList<>(tmpSet);
        // 封装数据源(创建集合对象)
        BufferedWriter bw = new BufferedWriter(new FileWriter(Global_data.path + Global_data.user + "用户词汇表.txt"));
        // 封装目的地
        for (Map.Entry s : array) {
            bw.write(String.valueOf(s));
            bw.newLine();
            bw.flush();
            // 写出数据
        } // 遍历
        // 释放资源
        bw.close();
    }//导出文件

    /**
     * 分别根据对应的内容进入
     * 相对于的翻译查询网页
     */
    public static void chineseExtract(String c) {
        try {
            String url = "https://translate.google.cn/?=translate&sl=zh-CN&tl=en&text=" + c + "&op=translate";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入中译英网页

    public static void englishExtract(String c) {
        try {
            String url = "https://translate.google.cn/?=translate&sl=en&tl=zh-CN&text=" + c + "&op=translate";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入英译中网页

    public static void translate() {
        try {
            String url = "https://translate.google.cn/?sl=auto&tl=en&op=translate";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入翻译网页

    public static void study() {
        try {
            String url = "https://www.duolingo.cn/";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入翻译网页

    public static void hearing() {
        try {
            String url = "https://www.51voa.com/";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入翻译网页

    public static void etymology() {
        try {
            String url = "https://www.etymonline.com/";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入翻译网页

    public static void writing() {
        try {
            String url = "https://www.procon.org/";
            java.net.URI uri = java.net.URI.create(url);
            java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
                dp.browse(uri);
                // 获取系统默认浏览器打开链接
            }
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }//进入翻译网页

    /**
     * 选择分别进入对应模式:
     */
    public static void click() {
        if (Global_data.B_mode) {
            Global_data.S_mode = Global_data.H;
            //控制模式变量 赋值为 汉译英
            Global_data.B_mode = !Global_data.B_mode;
            //点击按钮使数据发生改变
            new SetUp_mode_C();
        } else {
            Global_data.S_mode = Global_data.E;
            //控制模式变量 赋值为 汉译英
            Global_data.B_mode = !Global_data.B_mode;
            //点击按钮使数据发生改变
            new SetUp_mode_E();
        }
    }//点击按钮 选择模式

    public void practiseJava() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Java_C();
        } else {
            new Practise_Java_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseGit() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Git_C();
        } else {
            new Practise_Git_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseHtml() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Html_C();
        } else {
            new Practise_Html_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseMysql() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Mysql_C();
        } else {
            new Practise_Mysql_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseImportant() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Important_C();
        } else {
            new Practise_Important_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseProfessional() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Professional_C();
        } else {
            new Practise_Professional_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    public void practiseThree() {
        if (Global_data.S_mode.equals(Global_data.H)) {
            new Practise_Three_C();
        } else {
            new Practise_Three_E();
        }//判断是否为汉译英
    }//选择进入 汉(英)模式

    /**
     * all  分别为把数据与表模型融合
     * single   判断对应的单词，是否有与值相同的数据一致
     */
    public void all(DefaultTableModel dft, Set set) {
        Iterator iterator = set.iterator();
        dft.setRowCount(0);
        while (iterator.hasNext()) {
            Vector<String> v = new Vector<String>();
            Map.Entry mapentry = (Map.Entry) iterator.next();
            v.add((String) mapentry.getKey());
            v.add((String) mapentry.getValue());
            dft.addRow(v);
        }
    }//把对应的数据与表模型一同融合在一起

    public static void single(String english, DefaultTableModel dft, Set set) {
        Iterator iterator = set.iterator();
        dft.setRowCount(0);
        while (iterator.hasNext()) {
            Vector<String> v = new Vector<String>();
            Map.Entry mapentry = (Map.Entry) iterator.next();
            if (english.equals(mapentry.getKey())) {
                v.add(english);
                v.add((String) mapentry.getValue());
                dft.addRow(v);
            }//有 则打印出来
        }
    }//判断对应的单词，是否有与值相同的数据


    /**
     * 选择分别获取对应数据
     */
    private static Connection conn = null;
    private static Statement st = null;
    private static ResultSet rs = null;

    public static void obtainHtml() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from html";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.hv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.hv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.hc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取Html的值

    public static void obtainMysql() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from mysql";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.mv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.mv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.mc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取MySql的值

    public static void obtainGit() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from git";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.gv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.gv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.gc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取Git的值

    public static void obtainJava() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from java";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.jv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.jv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.jc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取java的值

    public static void obtainImportant() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from important";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.iv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.iv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.ic.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取Important的值

    public static void obtainProfessional() {
        //记录当前循环数量
        try {
            conn = Tool.getConn();
            String sql = "select * from Professional";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.pv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.pv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.pc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取Professional的值

    public static void obtainThree() {
        try {
            conn = Tool.getConn();
            String sql = "select * from three";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.tv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.tv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.tc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取Three的值

    public static void obtainUser() {
        try {
            conn = Tool.getConn();
            String sql = "select english,chinese from User where user='" + Global_data.user + "'";
            //输入SQL语句
            st = conn.createStatement();
            //创建语句
            rs = st.executeQuery(sql);
            //执行语句
            while (rs.next()) {
                //循环执行到查询完所有数据
                String english = rs.getString("english");
                String chinese = rs.getString("chinese");
                Global_data.uv.put(english, chinese);
                //填充到对应 词汇集合
            }
            Iterator<String> it;
            //建立迭代器
            it = Global_data.uv.keySet().iterator();
            //将词汇集合的值赋值给 迭代器中
            int i = 0;
            //定义 计数器
            while (it.hasNext()) {
                Global_data.uc.put(i, it.next());
                //获取词汇集合的键值关系
                i++;
                //计数器自增+1
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Tool.release(conn, st, rs);
            //释放资源
        }
    }//从数据库中 获取user表的值

    /**
     * 分别对于 词汇数据表 对数据的增，删，改的操作
     */

    public static void insert(String user) throws Exception {
        String english = Global_data.get1;
        String chinese = Global_data.get2;
        //分别获把get的值赋值到到对应区域
        Connection conn = Tool.getConn();
        String sql = "insert into " + user + " values('" + english + "','" + chinese + "')";
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//插入数据

    public static void delete(String user, String get) throws Exception {
        Connection conn = Tool.getConn();
        String sql = "delete  from " + user + " where english='" + get + "'"+"OR " + "chinese='" + get + "'";
        //用获取到的get（文本域）值 进行删除判断
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//删除数据

    public static void updateE(String user) throws Exception {
        String get = Global_data.get1;
        String english = Global_data.get2;
        //分别获把get的值赋值到到对应区域
        Connection conn = Tool.getConn();
        String sql = "update " + user + " set english='" + english + "' where english='" + get + "' OR chinese='" + get + "'";
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//根据中文或英文 修改英文数据

    public static void updateC(String user) throws Exception {
        String get = Global_data.get1;
        String chinese = Global_data.get2;
        //分别获把get的值赋值到到对应区域
        Connection conn = Tool.getConn();
        String sql = "update " + user + " set chinese='" + chinese + "' where english='" + get + "' OR chinese='" + get + "'";
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//根据中文或英文 修改中文数据

    /**
     * 分别对于 用户词汇表 数据的增，删的操作
     */

    public static void insert() throws Exception {
        String english = Global_data.get1;
        String chinese = Global_data.get2;
        //分别获把get的值赋值到到对应区域
        Connection conn = Tool.getConn();
        String sql = "insert into  user values('" + Global_data.user + "','" + english + "','" + chinese + "')";
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//用户表专用 插入数据

    public static void delete(String get) throws Exception {
        Connection conn = Tool.getConn();
        String sql = "delete  from user where english='" + get + "'" + "AND user='" + Global_data.user + "' OR " + "chinese='" + get + "'" + "AND user='" + Global_data.user + "'";
        //用获取到的get（文本域）值 进行删除判断
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//用户表专用 删除数据

    public static void drop() throws Exception {
        Connection conn = Tool.getConn();
        String sql = "delete  from user where user='" + Global_data.user + "'";
        //用获取到的get（文本域）值 进行删除判断
        st = conn.createStatement();
        st.executeUpdate(sql);
    }//用户表专用 清空本地词汇

}
