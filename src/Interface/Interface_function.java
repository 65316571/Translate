package Interface;

import Global.Global_data;
import Global.Global_library;
import Interface.Function.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.Map;

public class Interface_function extends JFrame {
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public Interface_function() {
        if (Global_data.lock) {
            //判断登陆锁

            if (Global_data.bl) {
                Map<String, String> map = System.getenv();
                Global_data.userName = map.get("USERNAME");
                // 获取当前用户的用户名
                Global_data.path += Global_data.userName;
                Global_data.path += "/Desktop/";
                //获取默认导出路径

                Global_library.obtainHtml();
                Global_library.obtainMysql();
                Global_library.obtainGit();
                Global_library.obtainJava();
                Global_library.obtainProfessional();
                Global_library.obtainImportant();
                Global_library.obtainThree();
                Global_library.obtainUser();
                //执行数据库

                Global_data.bl = false;
                //此内容只会执行一次
            }

            setBounds(650, 260, 600, 600);
            //窗口大小以及窗口位置
            JPanel contentPane = new JPanel();
            contentPane.setBackground(SystemColor.menu);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            //设置空布局
            JLabel label3 = new JLabel("");
            label3.setIcon(new ImageIcon("img//Main.gif"));
            label3.setBounds(0, 13, 614, 137);
            contentPane.add(label3);
            //功能图
            JButton button_0 = new JButton("查询功能");
            button_0.setBackground(new Color(75, 227, 181));
            button_0.setFont(new Font("", Font.PLAIN, 24));
            button_0.setBounds(62, 184, 205, 92);
            contentPane.add(button_0);
            //插入查询按钮
            JButton button_1 = new JButton("训练功能");
            button_1.setFont(new Font("", Font.PLAIN, 24));
            button_1.setBackground(new Color(217, 175, 238));
            button_1.setBounds(343, 184, 212, 97);
            contentPane.add(button_1);
            //插入训练按钮
            JButton button_2 = new JButton("笔记功能");
            button_2.setFont(new Font("", Font.PLAIN, 24));
            button_2.setBackground(new Color(96, 236, 227));
            button_2.setBounds(62, 312, 205, 92);
            contentPane.add(button_2);
            //插入笔记按钮
            JButton button_3 = new JButton("本地功能");
            button_3.setFont(new Font("", Font.PLAIN, 24));
            button_3.setBackground(new Color(243, 173, 237));
            button_3.setBounds(343, 312, 212, 97);
            contentPane.add(button_3);
            //插入设置按钮
            JButton button_4 = new JButton("退出账号");
            button_4.setFont(new Font("", Font.PLAIN, 24));
            button_4.setBackground(new Color(124, 215, 236));
            button_4.setBounds(62, 440, 212, 97);
            contentPane.add(button_4);
            //插入本地按钮
            JButton button_5 = new JButton("设置功能");
            button_5.setFont(new Font("", Font.PLAIN, 24));
            button_5.setBackground(new Color(239, 166, 203));
            button_5.setBounds(343, 440, 212, 97);
            contentPane.add(button_5);
            //插入返回按钮

            background = new ImageIcon("img/背景.jpg");
            //创建一个背景图片
            label4 = new JLabel(background);
            //把背景图片添加到标签里
            label4.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
            //把标签设置为和图片等高等宽
            myPanel = (JPanel) this.getContentPane();
            //把我的面板设置为内容面板
            myPanel.setOpaque(false);
            //插入背景

            button_0.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new Function_inquire();
                    //进入查询窗口
                }
            });

            button_1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new Function_practise();
                    //进入训练窗口
                }
            });

            button_2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new Function_notes();
                    //进入笔记窗口
                }
            });

            button_3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new Function_local();
                    //进入本地窗口
                }
            });

            button_4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logout();
                }
            });

            button_5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setVisible(false);
                    new Function_setUp();
                    //进入设置窗口
                }
            });


            setTitle("功能界面");
            //设置窗体标题
            setResizable(false);
            //不可调节窗口大小
            setVisible(true);
            //显示窗口
            this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
            //把标签添加到分层面板的最底层

        } else {
            new Interface_login();
            //进入登录界面
        }
    }

    public void logout() {
        JDialog dialog = new JDialog(this,"退出账号—对话框", true);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        dialog.setBounds(800, 550, 300, 80);
        dialog.setContentPane(panel);
        //控制台等...
        JButton button_1 = new JButton("取消");
        button_1.setBounds(1000, 850, 40, 20);
        JButton button_2 = new JButton("确认");
        button_2.setBounds(1100, 850, 40, 20);
        //按钮
        panel.add(button_1);
        panel.add(button_2);
        //添加控件到对话框
        button_1.addActionListener((e) -> {
            dialog.setVisible(false);
        });//取消
        button_2.addActionListener((e) -> {
            try {
                setVisible(false);
                new Interface_login();
                //进入返回窗口
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            //分别获取文本框的值
            dialog.setVisible(false);
        });//确认
        //点击按钮时，关闭对话框
        dialog.setResizable(false);
        //不可调节窗口大小
        dialog.setVisible(true);
        //显示对话框（setVisible()方法会阻塞，直到对话框关闭）
    }

}
