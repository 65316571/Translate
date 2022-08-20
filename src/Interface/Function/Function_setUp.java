package Interface.Function;

import Global.Global_library;
import Interface.Interface_function;
import Interface.Function.SetUP.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hao
 * 设置功能
 */
public class Function_setUp extends JFrame{
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public Function_setUp() {
        setBounds(650, 260, 600, 500);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//SetFunction.gif"));
        label3.setBounds(0, 13, 614, 137);
        contentPane.add(label3);
        //插入设置图

        JButton button_0 = new JButton("修改题目数量");
        button_0.setBackground(new Color(153, 204, 204));
        button_0.setFont(new Font("", Font.PLAIN, 24));
        button_0.setBounds(79, 191, 203, 101);
        contentPane.add(button_0);
        //插入修改数量按钮
        JButton button_1 = new JButton("修改训练模式");
        button_1.setBackground(new Color(127, 198, 213));
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBounds(337, 191, 203, 101);
        contentPane.add(button_1);
        //插入修改模式按钮
        JButton button_2 = new JButton("返回功能窗口");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(102, 153, 153));
        button_2.setBounds(79, 323, 203, 101);
        contentPane.add(button_2);
        //插入增添题目按钮
        JButton button_3 = new JButton("修改自动模式");
        button_3.setFont(new Font("", Font.PLAIN, 24));
        button_3.setBackground(new Color(255, 204, 153));
        button_3.setBounds(337, 323, 203, 101);
        contentPane.add(button_3);
        //插入删除题目按钮

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
                if (e.getButton() == MouseEvent.BUTTON1) {//修改题目数量
                    setVisible(false);
                    new SetUp_quantity();
                }
            }
        });

        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {//修改训练模式
                    setVisible(false);
                    Global_library.click();
                }
            }
        });

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//返回功能界面
                setVisible(false);
                new Interface_function();
            }
        });


        button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {//修改自动模式
                setVisible(false);
                new SetUp_automatic();
            }
        });


        setTitle("设置功能");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
