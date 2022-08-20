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
import java.util.Set;


/**
 * @author hao
 * 笔记功能
 */
public class Function_notes extends JFrame {
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

    public Function_notes() {
        setBounds(650, 260, 720, 770);
        //窗口大小以及窗口位置
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//biji.gif"));
        label3.setBounds(47, 18, 631, 137);
        contentPane.add(label3);
        //插入  查询 图片

        JTextField textField;
        textField = new JTextField();
        textField.setFont(new Font("", Font.PLAIN, 24));
        textField.setBounds(80, 180, 500, 40);
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

        set = Global_data.uv.entrySet();
        //运行用户表数据库
        table();


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

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Global_data.uv.clear();
                //清空集合中的数据
                Global_library.obtainUser();
                //执行数据库
                setVisible(false);
                new Function_notes();
            }
        });//数据刷新

        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = "添加英文:";
                String b = "添加中文:";
                String c = "添加数据:";
                getUserInput(a, b, c);
                try {
                    Global_library.insert();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });//单词添加

        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String a = textField.getText();
                    getUserInput(a);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });//单词删除

        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = "修改前:";
                String b = "修改后:";
                String c = "修改中文";
                getUserInput(a, b, c);
                try {
                    Global_library.updateC();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });//修改中文

        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = "修改前:";
                String b = "修改后:";
                String c = "修改英文";
                getUserInput(a, b, c);
                try {
                    Global_library.updateE();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });//修改英文

        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getUserInput();
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
                new Interface_function();
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

        setTitle("笔记功能");
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
        scrollPane.setBounds(80, 230, 500, 520);
        //设置  滚动窗格 大小
        contentPane.add(scrollPane);
    }//把表的信息打印出来
    /**
     * 分别进行删除，清除，添加的SQL操作
     */
    public void getUserInput() {
        JDialog dialog = new JDialog(this,"清空数据—对话框", true);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        dialog.setBounds(900, 750, 300, 80);
        dialog.setContentPane(panel);
        //控制台等...
        JButton button_1 = new JButton("取消");
        button_1.setBounds(1000, 850, 40, 20);
        JButton button_2 = new JButton("确认");
        button_2.setBounds(1100, 850, 40, 20);
        //按钮
        panel.add(button_1);
        panel.add(button_2);
        //添加控件到对话框
        button_1.addActionListener((e) -> {
            dialog.setVisible(false);
        });//取消
        button_2.addActionListener((e) -> {
            try {
                Global_library.drop();
                //清空当前词汇表
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
    }//清空专用

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
                Global_library.delete(testfield_1.getText());
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
        JDialog dialog = new JDialog(this, c+"——对话框", true);
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