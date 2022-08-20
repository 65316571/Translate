package Interface;

import Global.Global_data;
import JDBC.Tool;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

/**
 * @author hao
 * 登录界面
 */
public class Interface_login extends JFrame {
    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    public Interface_login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //关闭窗口
        setBounds(650, 260, 600, 600);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局
        JLabel label = new JLabel("账号:");
        label.setFont(new Font("", Font.PLAIN, 21));
        label.setIcon(new ImageIcon("img//user_name.png"));
        label.setBounds(115, 216, 88, 72);
        contentPane.add(label);
        //账号图片&&标签
        JLabel label1 = new JLabel("密码:");
        label1.setFont(new Font("", Font.PLAIN, 21));
        label1.setIcon(new ImageIcon("img//password1.png"));
        label1.setBounds(115, 281, 138, 72);
        contentPane.add(label1);
        //密码图片&&标签
        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("", Font.PLAIN, 15));
        textField1.setColumns(10);
        textField1.setBounds(196, 221, 248, 41);
        contentPane.add(textField1);
        //插入帐号框
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//login.gif"));
        label3.setBounds(0, 18, 613, 137);
        contentPane.add(label3);
        //插入登录界面图
        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Gigi", Font.PLAIN, 15));
        passwordField.setBounds(196, 301, 248, 41);
        contentPane.add(passwordField);
        //插入密码框
        ImageIcon background;
        background = new ImageIcon("img//背景.jpg");
        //创建一个背景图片
        JLabel label4;
        label4 = new JLabel(background);
        //把背景图片添加到标签里
        label4.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        //把标签设置为和图片等高等宽
        JPanel myPanel;
        myPanel = (JPanel) this.getContentPane();
        //把我的面板设置为内容面板
        myPanel.setOpaque(false);
        //设置面板不透明
        JButton button_1 = new JButton("登录");
        button_1.setBackground(new Color(216, 191, 216));
        button_1.setBounds(196, 383, 248, 53);
        button_1.setFont(new Font("", Font.PLAIN, 24));
        contentPane.add(button_1);
        //插入登录按钮
        JButton button_2 = new JButton("退出");
        button_2.setFont(new Font("", Font.PLAIN, 20));
        button_2.setBackground(new Color(240, 255, 240));
        button_2.setBounds(14, 491, 138, 48);
        contentPane.add(button_2);
        //插入注册按钮
        JButton button_3 = new JButton("注册");
        button_3.setFont(new Font("", Font.PLAIN, 20));
        button_3.setBackground(new Color(229, 216, 156));
        button_3.setBounds(450, 495, 138, 48);
        contentPane.add(button_3);
        //插入退出按钮
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层

        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    conn = Tool.getConn();
                    String account = textField1.getText();
                    String pow = passwordField.getText();
                    st = conn.createStatement();
                    String sql = "select * from information where account = '"+account+"'";
                    rs = st.executeQuery(sql);
                    rs.next();
                    String password = rs.getString("password");
                    //获取rs结果集,password字段的值
                    String user = rs.getString("user");
                    //获取rs结果集,user字段的值
                    if(pow.equals(password))
                    {
                        Global_data.lock=true;
                        //打开登录锁
                        Global_data.user=user;
                        //获取用户名
                        Global_data.account=textField1.getText();
                        //获取账号名

                        if(Global_data.user.equals("admin")){
                            JOptionPane.showMessageDialog(null,"欢迎登录，尊敬的管理员\n登陆时间为:"+Global_data.date.format(new java.util.Date()));
                        }else{
                            JOptionPane.showMessageDialog(null,"欢迎登录,尊敬的用户”"+Global_data.user+"”\n登陆时间为:"+Global_data.date.format(new Date()));
                        }//登陆提示:返回 登录用户 && 登陆时间

                        new Interface_function();
                        //进入功能页面
                        setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(null,"密码不一致!");
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null,"未知错误,请重新输入~");
                    e1.printStackTrace();
                }
            }
        });


        button_2.addMouseListener(new MouseAdapter() {
            //退出
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {//判断被鼠标左键所点击
                    setVisible(false);
                    System.exit(0);
                    //退出程序
                }
            }
        });


        button_3.addMouseListener(new MouseAdapter() {
            //注册
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {//判断被鼠标左键所点击
                    setVisible(false);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //关闭当前窗口
                    new Interface_register();
                    //进入注册界面
                }
            }
        });

        this.getRootPane().setDefaultButton(button_1);
        //按回车键时 相当于点击 登录按钮
        setTitle("登录界面");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
    }

}