package Interface.Function.SetUP;

import Global.Global_data;
import Interface.Function.Function_setUp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * @author hao
 * 更改数量
 */
public class SetUp_quantity extends JFrame {
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public SetUp_quantity() {
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
        label3.setFont(new Font("", Font.PLAIN, 30));
        label3.setIcon(new ImageIcon("img//genggai.gif"));
        label3.setBounds(5, 18, 621, 123);
        contentPane.add(label3);
        //插入数量图片
        JButton btnNewButton = new JButton("保存并退出");
        btnNewButton.setFont(new Font("", Font.PLAIN, 25));
        btnNewButton.setBackground(new Color(51, 153, 204));
        btnNewButton.setBounds(160, 423, 203, 92);
        contentPane.add(btnNewButton);
        //点击按钮
        JTextField textField = new JTextField();
        textField.setText("10");
        textField.setFont(new Font("", Font.PLAIN, 50));
        textField.setBounds(122, 300, 262, 92);
        contentPane.add(textField);
        textField.setColumns(10);
        //输入框
        JLabel lblNewLabel_1 = new JLabel("当前测试题目的数量为:" + Global_data.quantity);
        lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 30));
        lblNewLabel_1.setBounds(15, 231, 505, 56);
        contentPane.add(lblNewLabel_1);
        //文本框_1
        JLabel lblNewLabel_2 = new JLabel("请输入您需要的题目个数");
        lblNewLabel_2.setFont(new Font("", Font.PLAIN, 30));
        lblNewLabel_2.setBounds(20, 154, 460, 68);
        contentPane.add(lblNewLabel_2);
        //文本框_2

        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//返回按钮
                if (e.getButton() == MouseEvent.BUTTON1) {
                    textField.getText();
                    //获取文本域的值
                    if((Integer.parseInt(textField.getText())== 0)){
                        JOptionPane.showMessageDialog(null, "保存失败(原因是数量不能为0个)");
                    }else{
                        Global_data.quantity = (Integer.parseInt(textField.getText()));
                        //获取文本域的内容 并转成int类型 存入到Quantity（默认题目数量）
                        JOptionPane.showMessageDialog(null, "保存成功(当前单词数量为" + Global_data.quantity + "个)");
                    }
                    setVisible(false);
                    new Function_setUp();//返回功能窗口
                }
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {//文本框输入
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {
                    //控制文本框输入   使其只能输入0~9当中的值
                } else {
                    e.consume();
                }
            }
        });

        background = new ImageIcon("img//背景.jpg");
        //创建一个背景图片
        label4 = new JLabel(background);
        //把背景图片添加到标签里
        label4.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        //把标签设置为和图片等高等宽
        myPanel = (JPanel) this.getContentPane();
        //把我的面板设置为内容面板
        myPanel.setOpaque(false);

        setTitle("数量设置");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
