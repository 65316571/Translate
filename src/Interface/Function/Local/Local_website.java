package Interface.Function.Local;

/**
 * @author hao
 * 网站推荐功能
 */

import Global.Global_library;
import Interface.Function.Function_local;
import Interface.Interface_function;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author hao
 * 本地功能
 */
public class Local_website extends JFrame{
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;
    public Local_website() {
        setBounds(650, 260, 600, 600);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//tuijian.gif"));
        label3.setBounds(0, 13, 614, 137);
        contentPane.add(label3);
        //功能图
        JButton button_0 = new JButton("谷歌翻译");
        button_0.setBackground(new Color(255, 204, 255));
        button_0.setFont(new Font("", Font.PLAIN, 24));
        button_0.setBounds(62, 184, 205, 92);
        contentPane.add(button_0);
        //插入查询按钮
        JButton button_1 = new JButton("基础学习");
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBackground(new Color(204, 204, 255));
        button_1.setBounds(343, 184, 212, 97);
        contentPane.add(button_1);
        //插入训练按钮
        JButton button_2 = new JButton("听力练习");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(255, 255, 204));
        button_2.setBounds(62, 312, 205, 92);
        contentPane.add(button_2);
        //插入笔记按钮
        JButton button_3 = new JButton("研究词源");
        button_3.setFont(new Font("", Font.PLAIN, 24));
        button_3.setBackground(new Color(0, 153, 204));
        button_3.setBounds(343, 312, 212, 97);
        contentPane.add(button_3);
        //插入设置按钮
        JButton button_4 = new JButton("返回功能");
        button_4.setFont(new Font("", Font.PLAIN, 24));
        button_4.setBackground(new Color(174, 217, 139));
        button_4.setBounds(62, 440, 212, 97);
        contentPane.add(button_4);
        //插入本地按钮
        JButton button_5 = new JButton("积累写作");
        button_5.setFont(new Font("", Font.PLAIN, 24));
        button_5.setBackground(new Color(224, 151, 188));
        button_5.setBounds(343, 440, 212, 97);
        contentPane.add(button_5);
        //插入返回按钮

        button_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library.translate();
                //谷歌翻译
            }
        });

        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library. study();
                //基础学习
            }
        });

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library. hearing();
                //听力练习
            }
        });

        button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library. etymology();
                //研究词源
            }
        });

        button_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_library. writing();
                //进入返回窗口
            }
        });

        button_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Function_local();
                //积累写作
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

        setTitle("网站推荐");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
    }
}
