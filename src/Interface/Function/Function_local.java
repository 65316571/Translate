package Interface.Function;

import Global.Global_data;
import Interface.Interface_function;
import Interface.Function.Local.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author hao
 * 本地功能
 */
public class Function_local extends JFrame{
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;
    public Function_local() {
        setBounds(650, 260, 600, 600);
        //窗口大小以及窗口位置在
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//bendi.gif"));
        label3.setBounds(-15, 13, 614, 137);
        contentPane.add(label3);
        //功能图
        JButton button_0 = new JButton("导出文件");
        button_0.setBackground(new Color(92, 201, 255));
        button_0.setFont(new Font("", Font.PLAIN, 24));
        button_0.setBounds(62, 184, 205, 92);
        contentPane.add(button_0);
        //插入查询按钮
        JButton button_1 = new JButton("统计中心");
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBackground(new Color(191, 180, 255));
        button_1.setBounds(343, 184, 212, 97);
        contentPane.add(button_1);
        //插入训练按钮
        JButton button_2 = new JButton("网站推荐");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(250, 253, 128));
        button_2.setBounds(62, 312, 205, 92);
        contentPane.add(button_2);
        //插入笔记按钮
        JButton button_3 = new JButton("本地训练");
        button_3.setFont(new Font("", Font.PLAIN, 24));
        button_3.setBackground(new Color(250, 143, 208));
        button_3.setBounds(343, 312, 212, 97);
        contentPane.add(button_3);
        //插入设置按钮
        JButton button_4 = new JButton("返回界面");
        button_4.setFont(new Font("", Font.PLAIN, 24));
        button_4.setBackground(new Color(51, 213, 145));
        button_4.setBounds(62, 440, 212, 97);
        contentPane.add(button_4);
        //插入本地按钮
        JButton button_5 = new JButton("");
        if("admin".equals(Global_data.user)){
            button_5.setText("词汇管理");
        }else {
            button_5.setText("暂无此权限...");
        }

        button_5.setFont(new Font("", Font.PLAIN, 24));
        button_5.setBackground(new Color(181, 132, 255, 255));
        button_5.setBounds(343, 440, 212, 97);
        contentPane.add(button_5);
        //插入返回按钮

        button_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Local_export();
                //进入导出功能
            }
        });

        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Local_statistics();
                //进入统计功能
            }
        });

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Local_website();
                //进入推荐功能
            }
        });

        button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                if(Global_data.S_mode.equals(Global_data.H)){
                    new Local_train_C();
                }
                else{
                    new Local_train_E();
                }
                //进入本地训练
            }
        });

        button_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if("admin".equals(Global_data.user)){
                    //admin为默认管理用户
                    setVisible(false);
                    //关闭当前窗口
                    new Interface.Local_manage();
                    //进入词汇更改
                }else{
                    JOptionPane.showMessageDialog(null,"不好意思,当前用户暂时无法使用此功能(您可以更换用户再试试)");
                }
            }
        });

        button_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Interface_function();
                //进入返回窗口
            }
        });
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

        setTitle("本地功能");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
    }
}
