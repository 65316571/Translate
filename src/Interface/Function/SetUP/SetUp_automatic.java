package Interface.Function.SetUP;

import Global.Global_data;
import Interface.Function.Function_setUp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author hao
 * 修改自动模式
 */
public class SetUp_automatic extends JFrame {
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public SetUp_automatic() {
        setBounds(650, 260, 600, 500);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//zidonghua.gif"));
        label3.setBounds(0, 13, 614, 137);
        contentPane.add(label3);
        //插入设置图


        JCheckBox ck1 = new JCheckBox("自动记录错误单词");
        ck1.setFont(new Font("", Font.PLAIN, 24));
        ck1.setBackground(new Color(168, 231, 111));
        ck1.setBounds(20, 185, 250, 100);
        contentPane.add(ck1);
        ck1.setSelected(Global_data.cka);
        // 插入 自动记录错误单词 选项框
        JCheckBox ck2 = new JCheckBox("自动删除答对单词");
        ck2.setFont(new Font("", Font.PLAIN, 24));
        ck2.setBackground(new Color(231, 180, 128));
        ck2.setBounds(330, 185, 250, 100);
        contentPane.add(ck2);
        ck2.setSelected(Global_data.ckb);
        // 插入 自动删除答对单词 选项框

        JButton button_1 = new JButton("保存并退出");
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBackground(new Color(92, 139, 169));
        button_1.setBounds(20, 320, 250, 100);
        contentPane.add(button_1);

        JButton button_2 = new JButton("恢复默认选项");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(102, 153, 153));
        button_2.setBounds(330, 320, 250, 100);
        contentPane.add(button_2);

        ck1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//选项框_1
                Global_data.cka =!Global_data.cka;
                ck1.setSelected(Global_data.cka);
            }
        });

        ck2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//选项框_2
                Global_data.ckb =!Global_data.ckb;
                ck2.setSelected(Global_data.ckb);
            }
        });

        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//返回功能界面
                setVisible(false);
                new Function_setUp();
            }
        });

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//默认选项界面
                Global_data.cka =true;
                Global_data.ckb =true;
                ck1.setSelected(true);
                ck2.setSelected(true);
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
        //插入背景

        setTitle("自动化设置");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
