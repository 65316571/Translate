package Interface.Function.Local;

import Global.Global_data;
import Global.Global_library;
import Interface.Interface_function;
import Interface.Function.Function_local;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hao
 * 中译英模式
 * User控制台词汇库
 */
public class Local_train_C extends JFrame {
    /**
     * correct 获取总个数
     * remaining 获取正确个数
     * txtS1
     * txtS2
     * txtS3
     */
    int correct = Global_data.quantity;
    //题目个数
    int remaining = 0;
    //正确个数
    String a = "正确题目:";
    String b = "剩余题目:";
    int z;

    //记录当前随机数
    public Local_train_C() {
        Global_data.uv.clear();
        //清空集合中的数据
        Global_library.obtainUser();
        //执行数据库
        z = (int) (Math.random() * Global_data.uc.size());
        //当前随机数

        setBounds(650, 260, 600, 600);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//Chinese_to_English.gif"));
        label3.setBounds(5, 13, 590, 137);
        contentPane.add(label3);
        //插入 中转英 图片
        JTextField txtS1 = new JTextField();
        txtS1.setFont(new Font("", Font.PLAIN, 24));
        txtS1.setBounds(200, 296, 300, 50);
        contentPane.add(txtS1);
        txtS1.setColumns(10);
        //插入 输入框 文本框
        JLabel label_a = new JLabel("本题目:");
        label_a.setFont(new Font("", Font.PLAIN, 35));
        label_a.setBounds(44, 237, 150, 47);
        contentPane.add(label_a);
        //插入 英文 标签
        JLabel label_b = new JLabel("待输入:");
        label_b.setFont(new Font("", Font.PLAIN, 35));
        label_b.setBounds(44, 296, 150, 47);
        contentPane.add(label_b);
        //插入 中文 标签
        JLabel label_c = new JLabel("原先题:");
        label_c.setFont(new Font("", Font.PLAIN, 35));
        label_c.setBounds(44, 355, 150, 47);
        contentPane.add(label_c);
        //插入 题目 标签
        JLabel label_d = new JLabel("原答案:");
        label_d.setFont(new Font("", Font.PLAIN, 35));
        label_d.setBounds(44, 404, 150, 47);
        contentPane.add(label_d);
        //插入 答案 标签

        JButton btnNewButton_1 = new JButton("跳过");
        btnNewButton_1.setBackground(new Color(194, 224, 102));
        btnNewButton_1.setFont(new Font("", Font.PLAIN, 21));
        btnNewButton_1.setBounds(25, 475, 120, 70);
        contentPane.add(btnNewButton_1);
        //插入 记录 按钮
        JButton btnNewButton_2 = new JButton("确认");
        btnNewButton_2.setBackground(new Color(204, 81, 115));
        btnNewButton_2.setFont(new Font("", Font.PLAIN, 21));
        btnNewButton_2.setBounds(165, 475, 120, 70);
        contentPane.add(btnNewButton_2);
        //插入 确认 按钮
        JButton btnNewButton_3 = new JButton("查阅");
        btnNewButton_3.setBackground(new Color(97, 183, 213, 228));
        btnNewButton_3.setFont(new Font("", Font.PLAIN, 21));
        btnNewButton_3.setBounds(310, 475, 120, 70);
        contentPane.add(btnNewButton_3);
        //插入 查阅 按钮
        JButton btnNewButton_4 = new JButton("退出");
        btnNewButton_4.setBackground(new Color(81, 229, 128, 228));
        btnNewButton_4.setFont(new Font("", Font.PLAIN, 21));
        btnNewButton_4.setBounds(450, 475, 120, 70);
        contentPane.add(btnNewButton_4);
        //插入 退出 按钮

        JLabel label_1 = new JLabel(a + remaining);
        label_1.setFont(new Font("", Font.PLAIN, 15));
        label_1.setBounds(44, 181, 94, 18);
        contentPane.add(label_1);
        //插入 正确题目,正确个数 标签
        JLabel label_2 = new JLabel(b + correct);
        label_2.setFont(new Font("", Font.PLAIN, 15));
        label_2.setBounds(428, 181, 108, 18);
        contentPane.add(label_2);
        //插入 剩余题目,剩余个数 标签

        JTextField txtS2 = new JTextField();
        txtS2.setFont(new Font("", Font.PLAIN, 24));
        txtS2.setBounds(200, 237, 300, 50);
        contentPane.add(txtS2);
        txtS2.setColumns(10);
        txtS2.setText(Global_data.uv.get(Global_data.uc.get(z)));
        //显示从集合中调用的内容内容
        txtS2.setEditable(false);
        //题目框 数据不可更改
        JTextField txtS3 = new JTextField();
        txtS3.setFont(new Font("", Font.PLAIN, 24));
        txtS3.setBounds(200, 365, 300, 40);
        contentPane.add(txtS3);
        txtS3.setColumns(10);
        txtS3.setEditable(false);
        //先题框 数据不可更改
        JTextField txtS4 = new JTextField();
        txtS4.setFont(new Font("", Font.PLAIN, 24));
        txtS4.setBounds(200, 420, 300, 40);
        contentPane.add(txtS4);
        txtS4.setColumns(10);
        txtS4.setEditable(false);
        //答案框 数据不可更改

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

        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtS1.setText("");
                //清空输入框
                z = (int) (Math.random() * Global_data.uc.size());
                //获取随机数
                txtS2.setText(Global_data.uv.get(Global_data.uc.get(z)));
                //获取题目
            }
        });//跳过当前题目

        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtS3.setText(Global_data.uv.get(Global_data.uc.get(z)));
                //题目
                txtS4.setText(Global_data.uc.get(z));
                //答案
                correct--;
                //每次递减
                if (Global_data.uc.get(z).equals(txtS1.getText())) {
                    remaining++;
                    if (Global_data.ckb) {
                        String a = txtS1.getText();
                        try {
                            Global_library.delete(txtS3.getText());
                            //执行 删除方法
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }//删除当前题目
                    }//只有开启此功能才会运行 ckb默认为ture
                }//判断是否正确    答对了就删除SQL中的数据

                label_1.setText(a + remaining);
                //正确个数 判断对+1
                label_2.setText(b + correct);
                //剩余个数 总次数-1

                if (correct != 0) {
                    //如果剩余题目为零——进入 训练界面
                    txtS1.setText("");
                    //清空输入框
                    z = (int) (Math.random() * Global_data.uc.size());
                    //获取随机数
                    txtS2.setText(Global_data.uv.get(Global_data.uc.get(z)));
                    //获取题目
                } else {
                    JOptionPane.showMessageDialog(null, "本次答题\n" + "总题目个数:" + Global_data.quantity + "个\n正确题目数:" + label_1.getText() + "个\n错误题目已记录到个人词库中记得查收哦~");
                    Global_data.sumCy += remaining;
                    //存储正确个数
                    Global_data.sumCn += Global_data.quantity - remaining;
                    //存储错误个数
                    setVisible(false);
                    new Interface_function();
                }
            }
        });

        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library.chineseExtract(txtS2.getText());
                //查询对应网页
            }
        });

        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                //关闭当前页面
                new Function_local();
                //进入本地页面
            }
        });

        setTitle("用户" + Global_data.user + "——单词训练（中译英）");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
