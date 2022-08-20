package Interface.Function;

import Global.Global_data;
import Global.Global_library;
import Interface.Interface_function;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;


/**
 * @author hao
 * 查询功能
 */
public class Function_inquire extends JFrame {
    /**
     * fl 调用函数库中的方法
     * contentPane 窗口布局
     * Set   Set集合用来存储   键值映射关系
     * table_2 数据表
     */
    Global_library fl = new Global_library();
    JPanel contentPane = new JPanel();
    private Set set;
    JTable table_2;

    public Function_inquire() {
        setBounds(650, 260, 720, 770);
        //窗口大小以及窗口位置
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//Inquire.gif"));
        label3.setBounds(47, 18, 631, 137);
        contentPane.add(label3);
        //插入  查询 图片

        JTextField textField;
        textField = new JTextField();
        textField.setFont(new Font("", Font.PLAIN, 24));
        textField.setBounds(70, 195, 500, 40);
        contentPane.add(textField);
        textField.setColumns(10);
        //插入  查询 文本域

        table_2 = new JTable();
        table_2.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "英文", "中文"
                }
        ));

        JButton btnNewButton_7 = new JButton("单词查询");
        btnNewButton_7.setBackground(new Color(82, 208, 169));
        btnNewButton_7.setBounds(620, 195, 100, 40);
        contentPane.add(btnNewButton_7);
        //插入 点击查询 按钮
        JButton btnNewButton_8 = new JButton("全部查询");
        btnNewButton_8.setBackground(new Color(82, 208, 169));
        btnNewButton_8.setBounds(620, 245, 100, 40);
        contentPane.add(btnNewButton_8);
        //插入 全部查询 查询按钮
        JButton btnNewButton_0 = new JButton("联网查询");
        btnNewButton_0.setBackground(new Color(82, 208, 169));
        btnNewButton_0.setBounds(620, 295, 100, 40);
        contentPane.add(btnNewButton_0);
        //插入 联网查询 按钮

        JButton btnNewButton = new JButton("HTML");
        btnNewButton.setBackground(new Color(75, 166, 225));
        btnNewButton.setBounds(620, 375, 100, 35);
        contentPane.add(btnNewButton);
        //插入 HTML   查询按钮
        JButton btnNewButton_1 = new JButton("MySQL");
        btnNewButton_1.setBackground(new Color(75, 166, 225));
        btnNewButton_1.setBounds(620, 415, 100, 35);
        contentPane.add(btnNewButton_1);
        //插入 MySQL 查询按钮
        JButton btnNewButton_2 = new JButton("Git");
        btnNewButton_2.setBackground(new Color(75, 166, 225));
        btnNewButton_2.setBounds(620, 455, 100, 35);
        contentPane.add(btnNewButton_2);
        //插入 Git 查询按钮
        JButton btnNewButton_3 = new JButton("Java");
        btnNewButton_3.setBackground(new Color(75, 166, 225));
        btnNewButton_3.setBounds(620, 495, 100, 35);
        contentPane.add(btnNewButton_3);
        //插入 Java 查询按钮
        JButton btnNewButton_4 = new JButton("Important");
        btnNewButton_4.setBackground(new Color(75, 166, 225));
        btnNewButton_4.setBounds(620, 535, 100, 35);
        contentPane.add(btnNewButton_4);
        //插入 重要 查询按钮
        JButton btnNewButton_5 = new JButton("三级");
        btnNewButton_5.setBackground(new Color(75, 166, 225));
        btnNewButton_5.setBounds(620, 575, 100, 35);
        contentPane.add(btnNewButton_5);
        //插入 三级 查询按钮
        JButton btnNewButton_6 = new JButton("专业");
        btnNewButton_6.setBackground(new Color(75, 166, 225));
        btnNewButton_6.setBounds(620, 615, 100, 35);
        contentPane.add(btnNewButton_6);
        //插入 专业 查询按钮
        JButton btnNewButton_9 = new JButton("退出查询");
        btnNewButton_9.setBackground(new Color(96, 140, 236));
        btnNewButton_9.setBounds(620, 685, 100, 40);
        contentPane.add(btnNewButton_9);
        //插入 退出查询 按钮



        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.hv.entrySet();
                table();
            }
        });//此方法用来获取HTML  对应的映射关系，并通过Set集合来存储
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.mv.entrySet();
                table();
            }
        });//此方法用来获取MySQL  对应的映射关系，并通过Set集合来存储
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.gv.entrySet();
                table();
            }
        });//此方法用来获取Git  对应的映射关系，并通过Set集合来存储
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.jv.entrySet();
                table();
            }
        });//此方法用来获取Java  对应的映射关系，并通过Set集合来存储
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.iv.entrySet();
                table();
            }
        });//此方法用来获取important  对应的映射关系，并通过Set集合来存储
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.tv.entrySet();
                table();
            }
        });//此方法用来获取Three  对应的映射关系，并通过Set集合来存储
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                set = Global_data.pv.entrySet();
                table();
            }
        });//此方法用来获取Professional  对应的映射关系，并通过Set集合来存储

        btnNewButton_7.addActionListener(new ActionListener() {
            //单词查询
            public void actionPerformed(ActionEvent e) {
                String english = textField.getText();
                DefaultTableModel dft = (DefaultTableModel) table_2.getModel();
                Global_library.single(english, dft, set);
            }
        });

        btnNewButton_8.addActionListener(new ActionListener() {
            //全部查询
            public void actionPerformed(ActionEvent e) {
                Set set1, set2, set3, set4, set5, set6;
                set = Global_data.tv.entrySet();
                set1 = Global_data.hv.entrySet();
                set2 = Global_data.mv.entrySet();
                set3 = Global_data.gv.entrySet();
                set4 = Global_data.jv.entrySet();
                set5 = Global_data.iv.entrySet();
                set6 = Global_data.pv.entrySet();
                Set set = new HashSet();
                //获取所有Set集合的并集
                set.addAll(set1);
                set.addAll(set2);
                set.addAll(set3);
                set.addAll(set4);
                set.addAll(set5);
                set.addAll(set6);
                table();
            }
        });//此方法用来获取所有词汇  对应的映射关系，并通过Set集合来存储

        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                //关闭当前页面
                new Interface_function();
                //进入功能页面
            }
        });

        btnNewButton_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String english = textField.getText();
                Global_library.englishExtract(english);
            }
        });

        ImageIcon background;
        JPanel myPanel;
        JLabel label4;
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

        setTitle("查询模式");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }

    public void table() {
        DefaultTableModel dft = (DefaultTableModel) table_2.getModel();
        //创建数据表模型
        fl.all(dft, set);
        //对应数据与表模型 合并
        JTable table = new JTable(dft);
        table.setFont(new Font("", Font.PLAIN, 25));
        //设置字体大小
        table.setRowHeight(30);
        // 设置表格行宽
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        //设置第一列的列宽
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        //单元格渲染器
        tcr.setHorizontalAlignment(JLabel.CENTER);
        //居中显示
        table.setDefaultRenderer(Object.class, tcr);
        //设置渲染器
        JScrollPane scrollPane = new JScrollPane(table);
        //把表中数据 添加至  滚动窗格
        scrollPane.setBounds(70, 250, 500, 520);
        //设置  滚动窗格 大小
        contentPane.add(scrollPane);
    }//把表的信息打印出来

}