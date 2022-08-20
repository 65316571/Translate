package Interface;

import Global.Global_data;
import Global.Global_library;
import Interface.Function.Function_local;

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
 * 数据管理
 */
public class Local_manage extends JFrame {
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

    public Local_manage() {
        setBounds(650, 260, 720, 770);
        //窗口大小以及窗口位置
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//guanli.gif"));
        label3.setBounds(47, 18, 631, 137);
        contentPane.add(label3);
        //插入  查询 图片

        JTextField textField;
        textField = new JTextField();
        textField.setFont(new Font("", Font.PLAIN, 24));
        textField.setBounds(100, 180, 500, 40);
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
        btnNewButton_7.setBounds(620, 180, 100, 40);
        contentPane.add(btnNewButton_7);
        //插入 单词查询 查询按钮
        JButton btnNewButton_1 = new JButton("数据刷新");
        btnNewButton_1.setBackground(new Color(82, 208, 169));
        btnNewButton_1.setBounds(620, 230, 100, 40);
        contentPane.add(btnNewButton_1);
        //插入 数据刷新 按钮
        JButton btnNewButton_6 = new JButton("单词清空");
        btnNewButton_6.setBackground(new Color(82, 208, 169));
        btnNewButton_6.setBounds(620, 280, 100, 40);
        contentPane.add(btnNewButton_6);
        //插入 单词清空 按钮
        JButton btnNewButton_2 = new JButton("单词添加");
        btnNewButton_2.setBackground(new Color(75, 166, 225));
        btnNewButton_2.setBounds(620, 400, 100, 40);
        contentPane.add(btnNewButton_2);
        //插入 单词添加 按钮
        JButton btnNewButton_3 = new JButton("单词删除");
        btnNewButton_3.setBackground(new Color(75, 166, 225));
        btnNewButton_3.setBounds(620, 450, 100, 40);
        contentPane.add(btnNewButton_3);
        //插入 单词删除 按钮
        JButton btnNewButton_4 = new JButton("修改中文");
        btnNewButton_4.setBackground(new Color(75, 166, 225));
        btnNewButton_4.setBounds(620, 500, 100, 40);
        contentPane.add(btnNewButton_4);
        //插入 中文修改 按钮
        JButton btnNewButton_5 = new JButton("修改英文");
        btnNewButton_5.setBackground(new Color(75, 166, 225));
        btnNewButton_5.setBounds(620, 550, 100, 40);
        contentPane.add(btnNewButton_5);
        //插入 英文修改 按钮
        JButton btnNewButton_9 = new JButton("返回功能");
        btnNewButton_9.setBackground(new Color(96, 140, 236));
        btnNewButton_9.setBounds(620, 650, 100, 40);
        contentPane.add(btnNewButton_9);
        //插入 返回功能 按钮

        JButton btnNewButton_a = new JButton("Html");
        btnNewButton_a.setBackground(new Color(82, 211, 134));
        btnNewButton_a.setBounds(0, 250, 85, 40);
        contentPane.add(btnNewButton_a);
        //插入 Html 按钮
        JButton btnNewButton_b = new JButton("MySQL");
        btnNewButton_b.setBackground(new Color(82, 211, 134));
        btnNewButton_b.setBounds(0, 300, 85, 40);
        contentPane.add(btnNewButton_b);
        //插入 MySQL 按钮
        JButton btnNewButton_c = new JButton("Java");
        btnNewButton_c.setBackground(new Color(82, 211, 134));
        btnNewButton_c.setBounds(0, 350, 85, 40);
        contentPane.add(btnNewButton_c);
        //插入 Java 按钮
        JButton btnNewButton_d = new JButton("Git");
        btnNewButton_d.setBackground(new Color(82, 211, 134));
        btnNewButton_d.setBounds(0, 400, 85, 40);
        contentPane.add(btnNewButton_d);
        //插入 Git 按钮
        JButton btnNewButton_e = new JButton("重要");
        btnNewButton_e.setBackground(new Color(82, 187, 211));
        btnNewButton_e.setBounds(0, 500, 85, 40);
        contentPane.add(btnNewButton_e);
        //插入 重要 按钮
        JButton btnNewButton_f = new JButton("专业");
        btnNewButton_f.setBackground(new Color(82, 187, 211));
        btnNewButton_f.setBounds(0, 550, 85, 40);
        contentPane.add(btnNewButton_f);
        //插入 专业 按钮
        JButton btnNewButton_g = new JButton("四级");
        btnNewButton_g.setBackground(new Color(82, 187, 211));
        btnNewButton_g.setBounds(0, 600, 85, 40);
        contentPane.add(btnNewButton_g);
        //插入 四级 按钮
        JButton btnNewButton_h = new JButton("总词汇");
        btnNewButton_h.setBackground(new Color(82, 187, 211));
        btnNewButton_h.setBounds(0, 650, 85, 40);
        contentPane.add(btnNewButton_h);
        //插入 总词汇 按钮

        btnNewButton_a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=1;
                //记录当前模式 为了方便出现此效果的出现
                Global_data.table = Global_data.html;
                //获取当前表格名称  html
                set = Global_data.hv.entrySet();
                table();
            }
        });//显示 Html 表

        btnNewButton_b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=2;
                //记录当前查询模式
                Global_data.table = Global_data.mysql;
                //获取当前表格名称 mysql
                set = Global_data.mv.entrySet();
                table();
            }
        });//显示 MySQL 表

        btnNewButton_c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=3;
                //记录当前查询模式
                Global_data.table = Global_data.java;
                //获取当前表格名称 java
                set = Global_data.jv.entrySet();
                table();
            }
        });//显示 Java 表
        btnNewButton_d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=4;
                //记录当前查询模式
                Global_data.table = Global_data.git;
                //获取当前表格名称 git
                set = Global_data.gv.entrySet();
                table();
            }
        });//显示 Git 表
        btnNewButton_e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=5;
                //记录当前查询模式
                Global_data.table = Global_data.important;
                //获取当前表格名称 important
                set = Global_data.iv.entrySet();
                table();
            }
        });//显示 重要 表
        btnNewButton_f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=6;
                //记录当前查询模式
                Global_data.table = Global_data.professional;
                //获取当前表格名称 professional
                set = Global_data.pv.entrySet();
                table();
            }
        });//显示 专业 表
        btnNewButton_g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=7;
                //记录当前查询模式
                Global_data.table = Global_data.three;
                //获取当前表格名称 three
                set = Global_data.tv.entrySet();
                table();
            }
        });//显示 四级 表
        btnNewButton_h.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.t=0;
                //记录当前查询模式
                JOptionPane.showMessageDialog(null, "注意!总词汇表仅供查询,无法进行其他操作");
                Global_data.table = "no";
                //获取当前表格名称 no

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

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.uv.clear();
                Global_data.hv.clear();
                Global_data.mv.clear();
                Global_data.jv.clear();
                Global_data.gv.clear();
                Global_data.iv.clear();
                Global_data.pv.clear();
                Global_data.tv.clear();
                //清空集合中的数据
                Global_library.obtainHtml();
                Global_library.obtainMysql();
                Global_library.obtainGit();
                Global_library.obtainJava();
                Global_library.obtainProfessional();
                Global_library.obtainImportant();
                Global_library.obtainThree();
                Global_library.obtainUser();
                //重新执行数据库
                setVisible(false);
                new Local_manage();

            }
        });//数据刷新

        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"no".equals(Global_data.table)) {
                    String a = "添加英文:";
                    String b = "添加中文:";
                    String c = "添加数据:";
                    getUserInput(a, b, c);
                    try {
                        Global_library.insert(Global_data.table);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "无法进行其操作!!!");
                }//判断是否为当前用户
            }
        });//单词添加

        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"no".equals(Global_data.table)) {
                    try {
                        String a = textField.getText();
                        getUserInput(a);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "无法进行其操作!!!");
                }
            }
        });//单词删除

        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"no".equals(Global_data.table)) {
                    String a = "修改前:";
                    String b = "修改后:";
                    String c = "修改中文";
                    getUserInput(a, b, c);
                    try {
                        Global_library.updateC(Global_data.table);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "无法进行其操作!!!");
                }
            }
        });//修改中文

        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"no".equals(Global_data.table)) {
                    String a = "修改前:";
                    String b = "修改后:";
                    String c = "修改英文";
                    getUserInput(a, b, c);
                    try {
                        Global_library.updateE(Global_data.table);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "无法进行其操作!!!");
                }
            }
        });//修改英文

        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "考虑数据不可逆,清空功能暂时无法使用!");
            }
        });//单词清空

        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String english = textField.getText();
                DefaultTableModel dft = (DefaultTableModel) table_2.getModel();
                Global_library.single(english, dft, set);
            }
        });//单词查询

        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                //关闭当前页面
                new Function_local();
                //进入功能页面
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


        switch (Global_data.t) {
            case 1:
                btnNewButton_a.doClick();
                break;
            case 2:
                btnNewButton_b.doClick();
                break;
            case 3:
                btnNewButton_c.doClick();
                break;
            case 4:
                btnNewButton_d.doClick();
                break;
            case 5:
                btnNewButton_e.doClick();
                break;
            case 6:
                btnNewButton_f.doClick();
                break;
            case 7:
                btnNewButton_g.doClick();
                break;
            default:btnNewButton_g.doClick();
        }

        setTitle("管理功能");
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
        scrollPane.setBounds(100, 230, 500, 500);
        //设置  滚动窗格 大小
        contentPane.add(scrollPane);
    }//把表的信息打印出来

    /**
     * 分别进行删除，清除，添加的SQL操作
     */

    public void getUserInput(String a) {
        JDialog dialog = new JDialog(this, "删除数据——对话框", true);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        dialog.setBounds(900, 650, 280, 150);
        dialog.setContentPane(panel);
        //控制台等...
        JLabel Label_1 = new JLabel("删除数据（可以删除中文或英文）");
        Label_1.setBounds(900, 650, 100, 50);
        //标签
        JTextField testfield_1 = new JTextField(20);
        testfield_1.setBounds(1000, 650, 100, 50);
        testfield_1.setText(a);
        //文本框
        JButton button_1 = new JButton("取消");
        button_1.setBounds(1000, 850, 40, 20);
        JButton button_2 = new JButton("确认");
        button_2.setBounds(1100, 850, 40, 20);
        //按钮
        panel.add(Label_1);
        panel.add(testfield_1);
        panel.add(button_1);
        panel.add(button_2);
        //添加控件到对话框
        button_1.addActionListener((e) -> {
            dialog.setVisible(false);
        });//取消
        button_2.addActionListener((e) -> {
            try {
                Global_library.delete(Global_data.table, testfield_1.getText());
                //执行 删除方法
                JOptionPane.showMessageDialog(null, "刷新查看最新数据");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            //分别获取文本框的值
            dialog.setVisible(false);
        });//确认

        //点击按钮时，关闭对话框
        dialog.setResizable(false);
        //不可调节窗口大小
        dialog.setVisible(true);
        //显示对话框（setVisible()方法会阻塞，直到对话框关闭）
    }//删除专用

    public void getUserInput(String a, String b, String c) {
        JDialog dialog = new JDialog(this, "修改数据——对话框", true);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        dialog.setBounds(900, 650, 300, 130);
        dialog.setContentPane(panel);
        //控制台等...
        JLabel Label_1 = new JLabel(a);
        Label_1.setBounds(900, 650, 100, 50);
        JLabel Label_2 = new JLabel(b);
        Label_2.setBounds(900, 750, 100, 50);
        //标签
        JTextField testfield_1 = new JTextField(20);
        testfield_1.setBounds(1000, 650, 100, 50);
        JTextField testfield_2 = new JTextField(20);
        testfield_2.setBounds(1000, 750, 100, 50);
        //文本框
        JButton button_1 = new JButton("取消");
        button_1.setBounds(1000, 850, 40, 20);
        JButton button_2 = new JButton("确认");
        button_2.setBounds(1100, 850, 40, 20);
        //按钮
        panel.add(Label_1);
        panel.add(testfield_1);
        panel.add(Label_2);
        panel.add(testfield_2);
        panel.add(button_1);
        panel.add(button_2);
        //添加控件到对话框

        button_1.addActionListener((e) -> {
            dialog.setVisible(false);
        });//取消
        button_2.addActionListener((e) -> {
            Global_data.get1 = testfield_1.getText();
            Global_data.get2 = testfield_2.getText();
            //分别获取文本框的值
            dialog.setVisible(false);
            JOptionPane.showMessageDialog(null, "刷新查看最新数据");
        });//确认
        //点击按钮时，关闭对话框

        dialog.setResizable(false);
        //不可调节窗口大小
        dialog.setVisible(true);
        //显示对话框（setVisible()方法会阻塞，直到对话框关闭）
    }//弹出对话框

}