package Interface.Function;

import Global.Global_library;
import Interface.Interface_function;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hao
 * 训练模式
 */
public class Function_practise extends JFrame {
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;
    public Function_practise() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //关闭窗口
        setBounds(650, 260, 600, 720);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局
        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//TrainingFunction.gif"));
        label3.setBounds(0, 18, 631, 137);
        contentPane.add(label3);
        //插入训练图
        JButton button = new JButton("HTML");
        button.setBackground(new Color(153, 204, 204));
        button.setFont(new Font("", Font.PLAIN, 24));
        button.setBounds(79, 191, 203, 101);
        contentPane.add(button);
        //插入HTML按钮
        JButton btnMysql = new JButton("MySQL");
        btnMysql.setFont(new Font("", Font.PLAIN, 24));
        btnMysql.setBackground(new Color(216, 191, 216));
        btnMysql.setBounds(337, 191, 203, 101);
        contentPane.add(btnMysql);
        //插入Mysql按钮
        JButton btnGit = new JButton("Git");
        btnGit.setFont(new Font("", Font.PLAIN, 24));
        btnGit.setBackground(new Color(102, 153, 153));
        btnGit.setBounds(79, 323, 203, 101);
        contentPane.add(btnGit);
        //插入Git按钮
        JButton btnJava = new JButton("Java");
        btnJava.setFont(new Font("", Font.PLAIN, 24));
        btnJava.setBackground(new Color(255, 204, 153));
        btnJava.setBounds(337, 323, 203, 101);
        contentPane.add(btnJava);
        //插入Java按钮
        JButton  btnProfessional= new JButton("专业");
        btnProfessional.setFont(new Font("", Font.PLAIN, 25));
        btnProfessional.setBackground(new Color(217, 131, 124));
        btnProfessional.setBounds(79, 458, 203, 92);
        contentPane.add(btnProfessional);
        //插入专业按钮
        JButton btnThree = new JButton("四级");
        btnThree.setFont(new Font("", Font.PLAIN, 24));
        btnThree.setBackground(new Color(210, 209, 112));
        btnThree.setBounds(337, 458, 203, 92);
        contentPane.add(btnThree);
        //插入三级按钮
        JButton btnQuit = new JButton("Exit");
        btnQuit.setFont(new Font("", Font.PLAIN, 25));
        btnQuit.setBackground(new Color(124, 210, 154));
        btnQuit.setBounds(79, 582, 204, 92);
        contentPane.add(btnQuit);
        //插入退出按钮
        JButton  btnDaily= new JButton("Important");
        btnDaily.setFont(new Font("", Font.PLAIN, 24));
        btnDaily.setBackground(new Color(120, 190, 224));
        btnDaily.setBounds(337, 582, 204, 92);
        contentPane.add(btnDaily);
        //插入重要按钮

        background = new ImageIcon("img//背景.jpg");
        //创建一个背景图片
        label4 = new JLabel(background);
        //把背景图片添加到标签里
        label4.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        //把标签设置为和图片等高等宽
        myPanel = (JPanel) this.getContentPane();
        //把我的面板设置为内容面板
        myPanel.setOpaque(false);

        btnProfessional.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseProfessional();
            }//进入_专业训练
        });

        btnThree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseThree();
            }//进入_三级训练
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseHtml();
            } //进入_Html训练
        });

        btnJava.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseJava();
            }//进入_Java训练
        });

        btnGit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseGit();
            } //进入_Git训练
        });

        btnDaily.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseImportant();
            }//进入_重要训练
        });

        btnMysql.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Global_library().practiseMysql();
            }//进入_Mysql训练
        });

        btnQuit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Interface_function();
                //返回_功能菜单
            }
        });

        setTitle("训练模式");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
