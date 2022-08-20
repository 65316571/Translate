package Interface.Function.Local;

import Global.Global_data;
import Interface.Function.Function_local;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hao
 * 统计功能
 */
public class Local_statistics extends JFrame{
    ImageIcon background;
    JPanel myPanel;
    JLabel label4;

    public Local_statistics() {
        setBounds(650, 260, 600, 500);
        //窗口大小以及窗口位置
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.menu);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //设置空布局

        JLabel label3 = new JLabel("");
        label3.setIcon(new ImageIcon("img//Local_statistics.gif"));
        label3.setBounds(-15, 13, 614, 150);
        contentPane.add(label3);
        //插入设置图

        double sum;
        double sumC;
        double sumE;
        //总个数

        if((Global_data.sumEy+ Global_data.sumEn)==0){
            sumE=0;
        }else {
            sumE=(Global_data.sumEy*100)/(Global_data.sumEy+ Global_data.sumEn);
        }

        if((Global_data.sumCy+ Global_data.sumCn)==0){
            sumC=0;
        }else {
            sumC=(Global_data.sumCy*100)/(Global_data.sumCy+ Global_data.sumCn);
        }

        if((Global_data.sumEy+ Global_data.sumEn+ Global_data.sumCy+ Global_data.sumCn)==0){
            sum=0;
        }else {
            sum=((Global_data.sumCy+ Global_data.sumEy)*100)/(Global_data.sumEy+ Global_data.sumEn+ Global_data.sumCy+ Global_data.sumCn);
        }

        JLabel lblNewLabel_1 = new JLabel("中文 正确:" + Global_data.sumCy+" 错误:" + Global_data.sumCn+" 总数:"+(Global_data.sumCy+ Global_data.sumCn)+" 正确率:"+sumC+"%");
        lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(15, 170, 550, 50);
        contentPane.add(lblNewLabel_1);
        //文本框_1
        JLabel lblNewLabel_2 =  new JLabel("英文 正确:" + Global_data.sumEy+" 错误:" + Global_data.sumEn+" 总数:"+(Global_data.sumEy+ Global_data.sumEn)+" 正确率:"+sumE+"%");
        lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(15, 220, 550, 50);
        contentPane.add(lblNewLabel_2);
        //文本框_2
        JLabel lblNewLabel_3 =  new JLabel("综合 正确:" +(Global_data.sumEy+ Global_data.sumCy)+" 错误:" +(Global_data.sumEn+ Global_data.sumCn)+" 总数:" +(Global_data.sumEn+ Global_data.sumCn+ Global_data.sumEy+ Global_data.sumCy)+" 正确率:" +sum+"%");
        lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 25));
        lblNewLabel_3.setBounds(15, 270, 550, 50);
        contentPane.add(lblNewLabel_3);
        //文本框_3
        JButton button_1 = new JButton("返回功能");
        button_1.setFont(new Font("", Font.PLAIN, 24));
        button_1.setBackground(new Color(132, 255, 213));
        button_1.setBounds(79, 340, 203, 101);
        contentPane.add(button_1);
        //插入 返回本地窗口 按钮
        JButton button_2 = new JButton("清空数据");
        button_2.setFont(new Font("", Font.PLAIN, 24));
        button_2.setBackground(new Color(200, 121, 255));
        button_2.setBounds(337, 340, 203, 101);
        contentPane.add(button_2);
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



        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Function_local();
            }
        });//返回本地界面

        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Global_data.sumCn=0;
                Global_data.sumCy=0;
                Global_data.sumEn=0;
                Global_data.sumEy=0;
                setVisible(false);
              new Local_statistics();
            }
        });//清空数据


        setTitle("统计功能");
        //设置窗体标题
        setResizable(false);
        //不可调节窗口大小
        setVisible(true);
        //显示窗口
        this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
        //把标签添加到分层面板的最底层
    }
}
