package Interface.Function.Local;

import Global.Global_data;
import Global.Global_library;
import Interface.Function.Function_local;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 * @author hao
 * 导出功能
 */
public class Local_export extends JFrame{
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public Local_export() {
        setBounds(650, 260, 600, 500);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//data.gif"));
        label3.setBounds(0, 13, 614, 137);
        contentPane.add(label3);
        //插入设置图

        JButton button_0 = new JButton("导出本地词汇");
        button_0.setBackground(new Color(128, 221, 255));
        button_0.setFont(new Font("", Font.PLAIN, 24));
        button_0.setBounds(79, 191, 203, 101);
        contentPane.add(button_0);
        //插入 导出本地词汇 按钮
        JButton button_1 = new JButton("更改导出路径");
        button_1.setBackground(new Color(120, 180, 255));
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBounds(337, 191, 203, 101);
        contentPane.add(button_1);
        //插入 更改导出路径 按钮
        JButton button_2 = new JButton("返回本地窗口");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(132, 255, 213));
        button_2.setBounds(79, 323, 203, 101);
        contentPane.add(button_2);
        //插入 返回本地窗口 按钮
        JButton button_3 = new JButton("努力开发中...");
        button_3.setFont(new Font("", Font.PLAIN, 24));
        button_3.setBackground(new Color(200, 121, 255));
        button_3.setBounds(337, 323, 203, 101);
        contentPane.add(button_3);
        //插入 努力开发中... 按钮

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

        button_0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Global_library.Local_export();
                    JOptionPane.showMessageDialog(null, "用户“"+ Global_data.user+"“词汇已导出至对应路径!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"导出失败,未知错误!!!");
                    throw new RuntimeException(ex);
                }
            }
        });

        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });//修改导出路径

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Function_local();
            }
        });//返回本地界面


        this.getRootPane().setDefaultButton(button_1);
        //按回车键时 相当于点击 登录按钮
        setTitle("导出功能");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
