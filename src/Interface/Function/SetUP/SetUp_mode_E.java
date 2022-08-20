package Interface.Function.SetUP;

import Global.Global_library;
import Interface.Function.Function_setUp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hao
 * 修改界面模式
 */
public class SetUp_mode_E extends JFrame {
    ImageIcon background;
    JPanel myPanel;
    JLabel label5;
    public SetUp_mode_E() {
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
        label3.setIcon(new ImageIcon("img//English_to_Chinese.gif"));
        label3.setBounds(5, 18, 621, 123);
        contentPane.add(label3);
        //英翻译中模式
        JLabel lblNewLabel_1 = new JLabel("点击按钮更改模式" );
        lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 30));
        lblNewLabel_1.setBounds(15, 180, 460, 68);
        contentPane.add(lblNewLabel_1);
        //文本框_1
        JLabel lblNewLabel_2 = new JLabel("当前模式为:英译汉");
        lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 50));
        lblNewLabel_2.setBounds(20, 250, 460, 68);
        contentPane.add(lblNewLabel_2);
        //文本框_2
        JButton btnNewButton_1 = new JButton("切换模式");
        btnNewButton_1.setFont(new Font("", Font.PLAIN, 30));
        btnNewButton_1.setBackground(new Color(113, 181, 215));
        btnNewButton_1.setBounds(200, 350, 203, 92);
        contentPane.add(btnNewButton_1);
        //按钮_1
        JButton btnNewButton_2 = new JButton("保存并退出");
        btnNewButton_2.setFont(new Font("", Font.PLAIN, 30));
        btnNewButton_2.setBackground(new Color(188, 134, 220, 255));
        btnNewButton_2.setBounds(200, 450, 203, 92);
        contentPane.add(btnNewButton_2);
        //按钮_2
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {//更改模式
                    setVisible(false);
                    Global_library.click();
                }
            }
        });

        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {//返回功能界面
                    JOptionPane.showMessageDialog(null, "保存成功!(当前模式为:英译汉)");
                    setVisible(false);
                     new Function_setUp();
                }
            }
        });

        background = new ImageIcon("img//背景.jpg");
        //创建一个背景图片
        label5 = new JLabel(background);
        label5.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        myPanel = (JPanel) this.getContentPane();
        myPanel.setOpaque(false);

        setTitle("模式设置");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label5, new Integer(Integer.MIN_VALUE));
        //把背景添加到界面中
    }
}
