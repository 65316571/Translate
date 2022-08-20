package Interface;

import JDBC.Tool;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

/**
 * @author hao
 * 注册界面
 */
public class Interface_register extends JFrame {
    static Connection conn = null;
    static PreparedStatement st = null;
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public Interface_register() {
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
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//register.gif"));
        label3.setBounds(0, 18, 613, 137);
        contentPane.add(label3);
        //注册图
        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("", Font.PLAIN, 15));
        textField1.setColumns(10);
        textField1.setBounds(196, 261, 248, 41);
        contentPane.add(textField1);
        //用户名
        JLabel lblNewLabel2 = new JLabel("用户名:");
        lblNewLabel2.setFont(new Font("", Font.PLAIN, 21));
        lblNewLabel2.setIcon(new ImageIcon("img//user_name.png"));
        lblNewLabel2.setBounds(87, 171, 108, 88);
        contentPane.add(lblNewLabel2);
        //用户名图片
        JTextField textField = new JTextField();
        textField.setFont(new Font("", Font.PLAIN, 15));
        textField.setColumns(10);
        textField.setBounds(196, 201, 248, 35);
        contentPane.add(textField);
        //帐号框
        JLabel label = new JLabel("账号:");
        label.setFont(new Font("", Font.PLAIN, 21));
        label.setIcon(new ImageIcon("img//user_name.png"));
        label.setBounds(107, 242, 88, 72);
        contentPane.add(label);
        //账号图片
        JLabel label1 = new JLabel("密码:");
        label1.setFont(new Font("", Font.PLAIN, 21));
        label1.setIcon(new ImageIcon("img//password1.png"));
        label1.setBounds(103, 304, 138, 72);
        contentPane.add(label1);
        //密码图片
        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setBounds(196, 380, 249, 48);
        contentPane.add(passwordField1);
        //密码框
        JLabel label2 = new JLabel("确认密码:");
        label2.setFont(new Font("", Font.PLAIN, 21));
        label2.setIcon(new ImageIcon("img//password2.png"));
        label2.setBounds(65, 365, 129, 72);
        contentPane.add(label2);
        //确认密码图片
        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Gigi", Font.PLAIN, 15));
        passwordField.setBounds(196, 321, 248, 45);
        contentPane.add(passwordField);
        //确认密码框
        JButton button = new JButton("完成注册");
        button.setFont(new Font("", Font.PLAIN, 20));
        button.setBackground(new Color(216, 191, 216));
        button.setBounds(200, 450, 248, 53);
        contentPane.add(button);
        //完成注册按钮

        background = new ImageIcon("img/背景.jpg");
        //创建一个背景图片
        label4 = new JLabel(background);
        //把背景图片添加到标签里
        label4.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        //把标签设置为和图片等高等宽
        myPanel = (JPanel) this.getContentPane();
        //把我的面板设置为内容面板
        myPanel.setOpaque(false);
        //把我的面板设置为不可视
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    conn = Tool.getConn();
                    //连接数据库
                    String name = textField.getText();
                    String account = textField1.getText();
                    String password = passwordField.getText();
                    String pas = passwordField1.getText();
                    //获取对应文本框与密码框的内容
                    if (!Objects.equals(name, "") && !Objects.equals(account, "") && !Objects.equals(pas, "") && !Objects.equals(password, "")) {
                        if (password.equals(pas)) {
                            //判断密码与确认密码是否一致
                            String sql = "insert into information (User,account,password) values(?,?,?)";
                            //添加数据 information（用户）数据库
                            st = conn.prepareStatement(sql);
                            //执行MySQL语法
                            st.setString(1, name);
                            st.setString(2, account);
                            st.setString(3, password);
                            st.executeUpdate();
                            //更新数据库
                            JOptionPane.showMessageDialog(null, "注册成功!（即将跳入登录窗口）");
                            //跳出对话框——提示注册成功
                        } else {
                            JOptionPane.showMessageDialog(null, "两次密码不一致!（注册失败）");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "输入数据有空值（注册失败）");
                    }
                } catch (SQLIntegrityConstraintViolationException e) {
                    textField.setText("");
                    textField1.setText("");
                    passwordField.setText("");
                    passwordField1.setText("");
                    //清空所有的文本框
                    JOptionPane.showMessageDialog(null, "此账号已被占用!（请重新输入）");
                    e.printStackTrace();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "出现未知错误!");
                    e.printStackTrace();
                }
                setVisible(false);
                //关闭注册窗口
                new Interface_login().setVisible(true);
                //显示登录窗口
            }
        });

        //按回车键时 相当于点击 登录按钮
        setTitle("注册界面");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
    }
}