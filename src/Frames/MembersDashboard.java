package Frames;

import extraclasses.ComponentPrinter;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;
import java.util.Vector;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class MembersDashboard extends javax.swing.JFrame {

    static ImageIcon icon;
    static String todaysalenow;

//for calculator
    double firstNum;
    double secondNum;
    double total;
    double plusminus;

    int plusClick;
    int minusClick;
    int multiplyClick;
    int devideClick;
    int decimalClick;

    MembersDashboard(String memberid) {
        initComponents();

        new Thread() {
            public void run() {
                while (true) { //get date anx time
                    Date timenow = new Date();
                    Date datenow = new Date();
                    Date todaysalenow = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a"); //set time format to hh:mm:ss
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy"); //set date format to dd/MM/yyyy
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd"); //set date format to yyyy-MM-dd
                    String time = "" + sdft.format(timenow); //present time
                    String date = "" + sdfd.format(datenow); //present date
                    String todaysalesdate = "" + sdftodaysales.format(todaysalenow);
                    salesday.setText(todaysalesdate);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }
        }.start();
        MembersDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen
        MembersDashboard.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // do nothing on close
        black.setVisible(true);
        sectionlogout.setVisible(false);
        setIcon();
        refreshstocktableinpos();
        generateInvoiceID();

        jLabel2.setText(memberid);// get memeber ID
    }

    private MembersDashboard() {
        initComponents();

        new Thread() {
            public void run() {
                while (true) {
                    Date timenow = new Date(); //get date and time
                    Date datenow = new Date();
                    Date todaysalenow = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a"); //set time format to hh:mm:ss
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy"); //set date format to dd/MM/yyyy
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd"); //set date format to yyyy-MM-dd
                    String time = "" + sdft.format(timenow); //present time
                    String date = "" + sdfd.format(datenow); //present date
                    String todaysalesdate = "" + sdftodaysales.format(todaysalenow);
                    salesday.setText(todaysalesdate);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }
        }.start();
        MembersDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen
        MembersDashboard.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //do nothing on close
        black.setVisible(true);
        sectionlogout.setVisible(false);
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftside = new javax.swing.JPanel();
        lefticon = new javax.swing.JLabel();
        middle = new javax.swing.JPanel();
        hometoggle = new javax.swing.JLabel();
        stockstoggle = new javax.swing.JLabel();
        salestoggle = new javax.swing.JLabel();
        employeetoggle = new javax.swing.JLabel();
        customertoggle = new javax.swing.JLabel();
        logtoggle = new javax.swing.JLabel();
        settingstoggle = new javax.swing.JLabel();
        homepnl = new javax.swing.JPanel();
        lastactivities = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        lastactivities4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastactivities5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lastactivities6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        todayearned = new javax.swing.JLabel();
        lastactivities7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        todaysaleslbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        todaysales = new javax.swing.JTable();
        currencyinvisible = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        monthlysales = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        leftside1 = new javax.swing.JPanel();
        lefticon1 = new javax.swing.JLabel();
        middle1 = new javax.swing.JPanel();
        poslbl = new javax.swing.JLabel();
        salesrecordslbl = new javax.swing.JLabel();
        chartslbl = new javax.swing.JLabel();
        calculatorlbl = new javax.swing.JLabel();
        barcodegenlbl = new javax.swing.JLabel();
        emailclientlbl = new javax.swing.JLabel();
        rightside = new javax.swing.JPanel();
        pospanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        printinvoicebtn = new javax.swing.JButton();
        poscancelbtn = new javax.swing.JButton();
        sellbtn = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        paymentfield = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        totalinpos = new javax.swing.JTextField();
        discountfield = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        vatfield = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        nettotalfield = new javax.swing.JTextField();
        balancefield = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel62 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        customerid = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        pospanelk = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cartlisttable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        stocktableinpostable = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        searchinposfield = new javax.swing.JTextField();
        searchcomboinpos = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        quantityinpos = new javax.swing.JTextField();
        additeminpos = new javax.swing.JButton();
        removeitemfromlistbtn = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Sellidfield = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        Billokbtn = new javax.swing.JButton();
        invoice = new javax.swing.JPanel();
        invoicetab = new javax.swing.JTabbedPane();
        backtopos = new javax.swing.JButton();
        sellrecordspanel = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesrecordstable = new javax.swing.JTable();
        printinvoicebtninsellrecords = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        billbumberfieldinsellrecords = new javax.swing.JTextField();
        findbtn = new javax.swing.JButton();
        sellrecordstab = new javax.swing.JTabbedPane();
        chartspnl = new javax.swing.JPanel();
        chartstab = new javax.swing.JTabbedPane();
        calculatorpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        sellbtn3 = new javax.swing.JButton();
        sellbtn4 = new javax.swing.JButton();
        sellbtn5 = new javax.swing.JButton();
        sellbtn6 = new javax.swing.JButton();
        sellbtn7 = new javax.swing.JButton();
        sellbtn8 = new javax.swing.JButton();
        sellbtn9 = new javax.swing.JButton();
        sellbtn10 = new javax.swing.JButton();
        sellbtn11 = new javax.swing.JButton();
        sellbtn12 = new javax.swing.JButton();
        sellbtn13 = new javax.swing.JButton();
        sellbtn14 = new javax.swing.JButton();
        sellbtn15 = new javax.swing.JButton();
        sellbtn16 = new javax.swing.JButton();
        sellbtn17 = new javax.swing.JButton();
        sellbtn18 = new javax.swing.JButton();
        sellbtn19 = new javax.swing.JButton();
        sellbtn20 = new javax.swing.JButton();
        sellbtn21 = new javax.swing.JButton();
        sellbtn22 = new javax.swing.JButton();
        sellbtn23 = new javax.swing.JButton();
        sellbtn24 = new javax.swing.JButton();
        sellbtn25 = new javax.swing.JButton();
        sellbtn26 = new javax.swing.JButton();
        sellbtn27 = new javax.swing.JButton();
        barcodepanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        sellbtn1 = new javax.swing.JButton();
        sellbtn2 = new javax.swing.JButton();
        barcodegenlbl1 = new javax.swing.JLabel();
        emailpanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        emailrecetable = new javax.swing.JTable();
        jLabel69 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        receemailfromtable = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        saveemailtodb = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        fromfield = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        tofield = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        restorelocationfield3 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        sendmailbtn = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        browsepathinrestore2 = new javax.swing.JButton();
        attachpathmail = new javax.swing.JTextField();
        namefrattachment = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutsection = new javax.swing.JPanel();
        sectionlogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        black = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        salesday = new javax.swing.JLabel();

        leftside.setBackground(new java.awt.Color(89, 163, 0));

        lefticon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lefticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/greenfoodslight.png"))); // NOI18N
        lefticon.setName(""); // NOI18N

        javax.swing.GroupLayout leftsideLayout = new javax.swing.GroupLayout(leftside);
        leftside.setLayout(leftsideLayout);
        leftsideLayout.setHorizontalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lefticon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftsideLayout.setVerticalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lefticon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        middle.setBackground(new java.awt.Color(100, 183, 0));

        hometoggle.setBackground(new java.awt.Color(206, 252, 151));
        hometoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        hometoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hometoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/home-icon-silhouette (1).png"))); // NOI18N
        hometoggle.setOpaque(true);
        hometoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hometoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hometoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hometoggleMouseExited(evt);
            }
        });

        stockstoggle.setBackground(new java.awt.Color(111, 204, 0));
        stockstoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        stockstoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockstoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/factory-stock-house (1).png"))); // NOI18N
        stockstoggle.setOpaque(true);
        stockstoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockstoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockstoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockstoggleMouseExited(evt);
            }
        });

        salestoggle.setBackground(new java.awt.Color(111, 204, 0));
        salestoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        salestoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salestoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/tag (1).png"))); // NOI18N
        salestoggle.setOpaque(true);
        salestoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salestoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salestoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salestoggleMouseExited(evt);
            }
        });

        employeetoggle.setBackground(new java.awt.Color(111, 204, 0));
        employeetoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        employeetoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeetoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/businessmen-having-a-meeting (1).png"))); // NOI18N
        employeetoggle.setOpaque(true);
        employeetoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeetoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeetoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                employeetoggleMouseExited(evt);
            }
        });

        customertoggle.setBackground(new java.awt.Color(111, 204, 0));
        customertoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        customertoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customertoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/customer (1).png"))); // NOI18N
        customertoggle.setOpaque(true);
        customertoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customertoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customertoggleMouseExited(evt);
            }
        });

        logtoggle.setBackground(new java.awt.Color(111, 204, 0));
        logtoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        logtoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logtoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/log-file-format (1).png"))); // NOI18N
        logtoggle.setOpaque(true);
        logtoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logtoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logtoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logtoggleMouseExited(evt);
            }
        });

        settingstoggle.setBackground(new java.awt.Color(111, 204, 0));
        settingstoggle.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        settingstoggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingstoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/settings-gears (1).png"))); // NOI18N
        settingstoggle.setOpaque(true);
        settingstoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingstoggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingstoggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingstoggleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout middleLayout = new javax.swing.GroupLayout(middle);
        middle.setLayout(middleLayout);
        middleLayout.setHorizontalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hometoggle, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addComponent(stockstoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salestoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(employeetoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customertoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logtoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingstoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        middleLayout.setVerticalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleLayout.createSequentialGroup()
                .addComponent(hometoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockstoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salestoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(employeetoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(customertoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingstoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homepnl.setBackground(new java.awt.Color(206, 252, 151));
        homepnl.setFocusTraversalPolicyProvider(true);

        lastactivities.setBackground(new java.awt.Color(100, 183, 0));

        jList1.setBackground(new java.awt.Color(0, 50, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setFocusable(false);
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(jList1);

        jLabel8.setBackground(new java.awt.Color(100, 183, 0));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Last Activities");

        javax.swing.GroupLayout lastactivitiesLayout = new javax.swing.GroupLayout(lastactivities);
        lastactivities.setLayout(lastactivitiesLayout);
        lastactivitiesLayout.setHorizontalGroup(
            lastactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        lastactivitiesLayout.setVerticalGroup(
            lastactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lastactivitiesLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        lastactivities4.setBackground(new java.awt.Color(100, 183, 0));

        jLabel14.setBackground(new java.awt.Color(100, 183, 0));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Monthly Earning");

        jLabel11.setBackground(new java.awt.Color(0, 50, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout lastactivities4Layout = new javax.swing.GroupLayout(lastactivities4);
        lastactivities4.setLayout(lastactivities4Layout);
        lastactivities4Layout.setHorizontalGroup(
            lastactivities4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lastactivities4Layout.setVerticalGroup(
            lastactivities4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastactivities4Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lastactivities5.setBackground(new java.awt.Color(100, 183, 0));

        jLabel15.setBackground(new java.awt.Color(100, 183, 0));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Total Monthly Sales");

        jLabel12.setBackground(new java.awt.Color(0, 50, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout lastactivities5Layout = new javax.swing.GroupLayout(lastactivities5);
        lastactivities5.setLayout(lastactivities5Layout);
        lastactivities5Layout.setHorizontalGroup(
            lastactivities5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        lastactivities5Layout.setVerticalGroup(
            lastactivities5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastactivities5Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lastactivities6.setBackground(new java.awt.Color(100, 183, 0));

        jLabel16.setBackground(new java.awt.Color(100, 183, 0));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Today Sales Earning");

        todayearned.setBackground(new java.awt.Color(0, 50, 0));
        todayearned.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        todayearned.setForeground(new java.awt.Color(255, 255, 255));
        todayearned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todayearned.setOpaque(true);

        javax.swing.GroupLayout lastactivities6Layout = new javax.swing.GroupLayout(lastactivities6);
        lastactivities6.setLayout(lastactivities6Layout);
        lastactivities6Layout.setHorizontalGroup(
            lastactivities6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todayearned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        lastactivities6Layout.setVerticalGroup(
            lastactivities6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastactivities6Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(todayearned, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lastactivities7.setBackground(new java.awt.Color(100, 183, 0));

        jLabel18.setBackground(new java.awt.Color(100, 183, 0));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Today Sales");

        todaysaleslbl.setBackground(new java.awt.Color(0, 50, 0));
        todaysaleslbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        todaysaleslbl.setForeground(new java.awt.Color(255, 255, 255));
        todaysaleslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todaysaleslbl.setOpaque(true);

        javax.swing.GroupLayout lastactivities7Layout = new javax.swing.GroupLayout(lastactivities7);
        lastactivities7.setLayout(lastactivities7Layout);
        lastactivities7Layout.setHorizontalGroup(
            lastactivities7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todaysaleslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lastactivities7Layout.setVerticalGroup(
            lastactivities7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastactivities7Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(todaysaleslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.setBackground(new java.awt.Color(0, 50, 0));

        jLabel20.setBackground(new java.awt.Color(100, 183, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Today Sales Details");
        jLabel20.setOpaque(true);

        todaysales.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        todaysales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Number", "Item Ids and Quantities", "Sale Earnings", "Date Time", "Billed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        todaysales.setGridColor(new java.awt.Color(255, 255, 255));
        todaysales.setOpaque(false);
        todaysales.setSelectionBackground(new java.awt.Color(100, 183, 0));
        jScrollPane5.setViewportView(todaysales);

        currencyinvisible.setBackground(new java.awt.Color(73, 145, 255));
        currencyinvisible.setForeground(new java.awt.Color(73, 145, 255));
        currencyinvisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        monthlysales.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        monthlysales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Number", "Item Ids and Quantities", "Sale Earnings", "Date Time", "Billed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        monthlysales.setGridColor(new java.awt.Color(255, 255, 255));
        monthlysales.setOpaque(false);
        monthlysales.setSelectionBackground(new java.awt.Color(100, 183, 0));
        jScrollPane11.setViewportView(monthlysales);

        jLabel21.setBackground(new java.awt.Color(100, 183, 0));
        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Monthly Sales Details");
        jLabel21.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(currencyinvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(currencyinvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(605, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout homepnlLayout = new javax.swing.GroupLayout(homepnl);
        homepnl.setLayout(homepnlLayout);
        homepnlLayout.setHorizontalGroup(
            homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastactivities5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastactivities7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastactivities6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastactivities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastactivities4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homepnlLayout.setVerticalGroup(
            homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homepnlLayout.createSequentialGroup()
                        .addComponent(lastactivities7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastactivities6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastactivities5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastactivities4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastactivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("login"); // NOI18N
        setUndecorated(true);

        loginpanel.setBackground(new java.awt.Color(206, 252, 151));

        leftside1.setBackground(new java.awt.Color(89, 163, 0));

        lefticon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lefticon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/greenfoodslight.png"))); // NOI18N
        lefticon1.setName(""); // NOI18N

        javax.swing.GroupLayout leftside1Layout = new javax.swing.GroupLayout(leftside1);
        leftside1.setLayout(leftside1Layout);
        leftside1Layout.setHorizontalGroup(
            leftside1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftside1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lefticon1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftside1Layout.setVerticalGroup(
            leftside1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftside1Layout.createSequentialGroup()
                .addComponent(lefticon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        middle1.setBackground(new java.awt.Color(100, 183, 0));

        poslbl.setBackground(new java.awt.Color(206, 252, 151));
        poslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        poslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/tag (1).png"))); // NOI18N
        poslbl.setOpaque(true);
        poslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poslblMouseExited(evt);
            }
        });

        salesrecordslbl.setBackground(new java.awt.Color(111, 204, 0));
        salesrecordslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        salesrecordslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesrecordslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/sales.png"))); // NOI18N
        salesrecordslbl.setOpaque(true);
        salesrecordslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesrecordslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesrecordslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesrecordslblMouseExited(evt);
            }
        });

        chartslbl.setBackground(new java.awt.Color(111, 204, 0));
        chartslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        chartslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chartslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/line-chart.png"))); // NOI18N
        chartslbl.setOpaque(true);
        chartslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chartslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chartslblMouseExited(evt);
            }
        });

        calculatorlbl.setBackground(new java.awt.Color(111, 204, 0));
        calculatorlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        calculatorlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculatorlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/calculator.png"))); // NOI18N
        calculatorlbl.setOpaque(true);
        calculatorlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculatorlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculatorlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculatorlblMouseExited(evt);
            }
        });

        barcodegenlbl.setBackground(new java.awt.Color(111, 204, 0));
        barcodegenlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        barcodegenlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barcodegenlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/barcode.png"))); // NOI18N
        barcodegenlbl.setOpaque(true);
        barcodegenlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barcodegenlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barcodegenlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barcodegenlblMouseExited(evt);
            }
        });

        emailclientlbl.setBackground(new java.awt.Color(111, 204, 0));
        emailclientlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        emailclientlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailclientlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/email.png"))); // NOI18N
        emailclientlbl.setOpaque(true);
        emailclientlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailclientlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailclientlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailclientlblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout middle1Layout = new javax.swing.GroupLayout(middle1);
        middle1.setLayout(middle1Layout);
        middle1Layout.setHorizontalGroup(
            middle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(poslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(salesrecordslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chartslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(calculatorlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barcodegenlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(emailclientlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        middle1Layout.setVerticalGroup(
            middle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middle1Layout.createSequentialGroup()
                .addComponent(poslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesrecordslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculatorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barcodegenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailclientlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rightside.setBackground(new java.awt.Color(206, 252, 151));
        rightside.setLayout(new java.awt.CardLayout());

        pospanel.setBackground(new java.awt.Color(206, 252, 151));
        pospanel.setForeground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(100, 183, 0));

        printinvoicebtn.setBackground(new java.awt.Color(0, 50, 0));
        printinvoicebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        printinvoicebtn.setForeground(new java.awt.Color(255, 255, 255));
        printinvoicebtn.setText("Print Invoice");
        printinvoicebtn.setContentAreaFilled(false);
        printinvoicebtn.setFocusPainted(false);
        printinvoicebtn.setOpaque(true);
        printinvoicebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        printinvoicebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printinvoicebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseReleased(evt);
            }
        });
        printinvoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printinvoicebtnActionPerformed(evt);
            }
        });

        poscancelbtn.setBackground(new java.awt.Color(0, 50, 0));
        poscancelbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        poscancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        poscancelbtn.setText("Cancel/Next");
        poscancelbtn.setContentAreaFilled(false);
        poscancelbtn.setFocusPainted(false);
        poscancelbtn.setOpaque(true);
        poscancelbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        poscancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                poscancelbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseReleased(evt);
            }
        });
        poscancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poscancelbtnActionPerformed(evt);
            }
        });

        sellbtn.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        sellbtn.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn.setText("Sell");
        sellbtn.setContentAreaFilled(false);
        sellbtn.setFocusPainted(false);
        sellbtn.setOpaque(true);
        sellbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtnMouseReleased(evt);
            }
        });
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Balance");

        paymentfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        paymentfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        paymentfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        paymentfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentfieldActionPerformed(evt);
            }
        });
        paymentfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentfieldKeyTyped(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Payment");

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Total");

        totalinpos.setEditable(false);
        totalinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        totalinpos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        totalinpos.setSelectionColor(new java.awt.Color(100, 183, 0));

        discountfield.setEditable(false);
        discountfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        discountfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discountfield.setText("0");
        discountfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        discountfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        discountfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountfieldActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("-%");

        vatfield.setEditable(false);
        vatfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        vatfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vatfield.setText("0");
        vatfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        vatfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        vatfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatfieldActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("+%");

        nettotalfield.setEditable(false);
        nettotalfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nettotalfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nettotalfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        nettotalfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nettotalfieldActionPerformed(evt);
            }
        });

        balancefield.setEditable(false);
        balancefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        balancefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        balancefield.setSelectionColor(new java.awt.Color(100, 183, 0));
        balancefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancefieldActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(100, 183, 0));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(100, 183, 0));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Net Total");

        jLabel81.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Customer");

        jCheckBox3.setBackground(new java.awt.Color(100, 183, 0));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        customerid.setEditable(false);
        customerid.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        customerid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        customerid.setSelectionColor(new java.awt.Color(100, 183, 0));
        customerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, 0)
                        .addComponent(discountfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, 0)
                        .addComponent(vatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(nettotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(balancefield)
                            .addComponent(paymentfield, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addComponent(poscancelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printinvoicebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(discountfield, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(nettotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balancefield, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(sellbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poscancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(printinvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.CardLayout());

        pospanelk.setBackground(new java.awt.Color(100, 183, 0));

        cartlisttable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cartlisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Per Price", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartlisttable.setGridColor(new java.awt.Color(255, 255, 255));
        cartlisttable.setRowHeight(22);
        cartlisttable.setSelectionBackground(new java.awt.Color(100, 183, 0));
        cartlisttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartlisttableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(cartlisttable);

        stocktableinpostable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stocktableinpostable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Stock Count", "Per Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stocktableinpostable.setGridColor(new java.awt.Color(255, 255, 255));
        stocktableinpostable.setRowHeight(22);
        stocktableinpostable.setSelectionBackground(new java.awt.Color(100, 183, 0));
        stocktableinpostable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocktableinpostableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(stocktableinpostable);

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Search");

        searchinposfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        searchinposfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        searchinposfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        searchinposfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchinposfieldActionPerformed(evt);
            }
        });
        searchinposfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchinposfieldKeyReleased(evt);
            }
        });

        searchcomboinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        searchcomboinpos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item Id", "Item Name" }));
        searchcomboinpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcomboinposActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Quantity");

        quantityinpos.setEditable(false);
        quantityinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quantityinpos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quantityinpos.setSelectionColor(new java.awt.Color(100, 183, 0));
        quantityinpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityinposActionPerformed(evt);
            }
        });
        quantityinpos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityinposKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityinposKeyTyped(evt);
            }
        });

        additeminpos.setBackground(new java.awt.Color(0, 50, 0));
        additeminpos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        additeminpos.setForeground(new java.awt.Color(255, 255, 255));
        additeminpos.setText("Add Item");
        additeminpos.setContentAreaFilled(false);
        additeminpos.setFocusPainted(false);
        additeminpos.setOpaque(true);
        additeminpos.setPreferredSize(new java.awt.Dimension(140, 40));
        additeminpos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                additeminposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                additeminposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                additeminposMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                additeminposMouseReleased(evt);
            }
        });
        additeminpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additeminposActionPerformed(evt);
            }
        });

        removeitemfromlistbtn.setBackground(new java.awt.Color(0, 50, 0));
        removeitemfromlistbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        removeitemfromlistbtn.setForeground(new java.awt.Color(255, 255, 255));
        removeitemfromlistbtn.setText("Remove Item");
        removeitemfromlistbtn.setContentAreaFilled(false);
        removeitemfromlistbtn.setFocusPainted(false);
        removeitemfromlistbtn.setOpaque(true);
        removeitemfromlistbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        removeitemfromlistbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseReleased(evt);
            }
        });
        removeitemfromlistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitemfromlistbtnActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Producs Available");

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("List");

        Sellidfield.setEditable(false);
        Sellidfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Sellidfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Sellidfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        Sellidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellidfieldActionPerformed(evt);
            }
        });
        Sellidfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SellidfieldKeyReleased(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Sell/Invoice Id");

        Billokbtn.setBackground(new java.awt.Color(0, 50, 0));
        Billokbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Billokbtn.setForeground(new java.awt.Color(255, 255, 255));
        Billokbtn.setText("OK");
        Billokbtn.setContentAreaFilled(false);
        Billokbtn.setFocusPainted(false);
        Billokbtn.setOpaque(true);
        Billokbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        Billokbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BillokbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BillokbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BillokbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BillokbtnMouseReleased(evt);
            }
        });
        Billokbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillokbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pospanelkLayout = new javax.swing.GroupLayout(pospanelk);
        pospanelk.setLayout(pospanelkLayout);
        pospanelkLayout.setHorizontalGroup(
            pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelkLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelkLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sellidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchinposfield, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(searchcomboinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(quantityinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        pospanelkLayout.setVerticalGroup(
            pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelkLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchcomboinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchinposfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sellidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel6.add(pospanelk, "card2");

        invoice.setBackground(new java.awt.Color(100, 183, 0));

        backtopos.setBackground(new java.awt.Color(0, 50, 0));
        backtopos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        backtopos.setForeground(new java.awt.Color(255, 255, 255));
        backtopos.setText("Back");
        backtopos.setContentAreaFilled(false);
        backtopos.setFocusPainted(false);
        backtopos.setOpaque(true);
        backtopos.setPreferredSize(new java.awt.Dimension(140, 40));
        backtopos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backtoposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backtoposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backtoposMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backtoposMouseReleased(evt);
            }
        });
        backtopos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoiceLayout = new javax.swing.GroupLayout(invoice);
        invoice.setLayout(invoiceLayout);
        invoiceLayout.setHorizontalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invoicetab)
                    .addGroup(invoiceLayout.createSequentialGroup()
                        .addGap(0, 511, Short.MAX_VALUE)
                        .addComponent(backtopos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        invoiceLayout.setVerticalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicetab, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backtopos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(invoice, "card3");

        javax.swing.GroupLayout pospanelLayout = new javax.swing.GroupLayout(pospanel);
        pospanel.setLayout(pospanelLayout);
        pospanelLayout.setHorizontalGroup(
            pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pospanelLayout.setVerticalGroup(
            pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rightside.add(pospanel, "card2");

        sellrecordspanel.setBackground(new java.awt.Color(206, 252, 151));

        jPanel16.setBackground(new java.awt.Color(100, 183, 0));

        salesrecordstable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        salesrecordstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itm Name", "Item Ids x Quantities", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesrecordstable.setGridColor(new java.awt.Color(255, 255, 255));
        salesrecordstable.setRowHeight(22);
        salesrecordstable.setSelectionBackground(new java.awt.Color(100, 183, 0));
        salesrecordstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesrecordstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(salesrecordstable);

        printinvoicebtninsellrecords.setBackground(new java.awt.Color(0, 50, 0));
        printinvoicebtninsellrecords.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        printinvoicebtninsellrecords.setForeground(new java.awt.Color(255, 255, 255));
        printinvoicebtninsellrecords.setText("Preview Invoice");
        printinvoicebtninsellrecords.setContentAreaFilled(false);
        printinvoicebtninsellrecords.setFocusPainted(false);
        printinvoicebtninsellrecords.setOpaque(true);
        printinvoicebtninsellrecords.setPreferredSize(new java.awt.Dimension(140, 40));
        printinvoicebtninsellrecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseReleased(evt);
            }
        });
        printinvoicebtninsellrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printinvoicebtninsellrecordsActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Bill Number");

        billbumberfieldinsellrecords.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        billbumberfieldinsellrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbumberfieldinsellrecordsActionPerformed(evt);
            }
        });

        findbtn.setBackground(new java.awt.Color(0, 50, 0));
        findbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        findbtn.setForeground(new java.awt.Color(255, 255, 255));
        findbtn.setText("Find");
        findbtn.setContentAreaFilled(false);
        findbtn.setFocusPainted(false);
        findbtn.setOpaque(true);
        findbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        findbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                findbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                findbtnMouseReleased(evt);
            }
        });
        findbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(printinvoicebtninsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel47)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(billbumberfieldinsellrecords)
                                .addComponent(findbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(billbumberfieldinsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(findbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(printinvoicebtninsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sellrecordspanelLayout = new javax.swing.GroupLayout(sellrecordspanel);
        sellrecordspanel.setLayout(sellrecordspanelLayout);
        sellrecordspanelLayout.setHorizontalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellrecordstab, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sellrecordspanelLayout.setVerticalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellrecordstab)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        rightside.add(sellrecordspanel, "card3");

        chartspnl.setBackground(new java.awt.Color(206, 252, 151));

        javax.swing.GroupLayout chartspnlLayout = new javax.swing.GroupLayout(chartspnl);
        chartspnl.setLayout(chartspnlLayout);
        chartspnlLayout.setHorizontalGroup(
            chartspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chartspnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartstab, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        chartspnlLayout.setVerticalGroup(
            chartspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chartspnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartstab, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );

        rightside.add(chartspnl, "card5");

        calculatorpanel.setBackground(new java.awt.Color(206, 252, 151));

        jPanel3.setBackground(new java.awt.Color(100, 183, 0));

        jTextField4.setBackground(new java.awt.Color(100, 183, 0));
        jTextField4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 48)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setBorder(null);
        jTextField4.setSelectionColor(new java.awt.Color(0, 50, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        sellbtn3.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn3.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn3.setText("/");
        sellbtn3.setContentAreaFilled(false);
        sellbtn3.setFocusPainted(false);
        sellbtn3.setOpaque(true);
        sellbtn3.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn3MouseReleased(evt);
            }
        });
        sellbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn3ActionPerformed(evt);
            }
        });

        sellbtn4.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn4.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn4.setText("-");
        sellbtn4.setContentAreaFilled(false);
        sellbtn4.setFocusPainted(false);
        sellbtn4.setOpaque(true);
        sellbtn4.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn4MouseReleased(evt);
            }
        });
        sellbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn4ActionPerformed(evt);
            }
        });

        sellbtn5.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn5.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn5.setText("*");
        sellbtn5.setContentAreaFilled(false);
        sellbtn5.setFocusPainted(false);
        sellbtn5.setOpaque(true);
        sellbtn5.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn5MouseReleased(evt);
            }
        });
        sellbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn5ActionPerformed(evt);
            }
        });

        sellbtn6.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn6.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn6.setText("=");
        sellbtn6.setContentAreaFilled(false);
        sellbtn6.setFocusPainted(false);
        sellbtn6.setOpaque(true);
        sellbtn6.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn6MouseReleased(evt);
            }
        });
        sellbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn6ActionPerformed(evt);
            }
        });

        sellbtn7.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn7.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn7.setText("+");
        sellbtn7.setContentAreaFilled(false);
        sellbtn7.setFocusPainted(false);
        sellbtn7.setOpaque(true);
        sellbtn7.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn7MouseReleased(evt);
            }
        });
        sellbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn7ActionPerformed(evt);
            }
        });

        sellbtn8.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn8.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn8.setText("<-");
        sellbtn8.setContentAreaFilled(false);
        sellbtn8.setFocusPainted(false);
        sellbtn8.setOpaque(true);
        sellbtn8.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn8MouseReleased(evt);
            }
        });
        sellbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn8ActionPerformed(evt);
            }
        });

        sellbtn9.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn9.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn9.setText("9");
        sellbtn9.setContentAreaFilled(false);
        sellbtn9.setFocusPainted(false);
        sellbtn9.setOpaque(true);
        sellbtn9.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn9MouseReleased(evt);
            }
        });
        sellbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn9ActionPerformed(evt);
            }
        });

        sellbtn10.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn10.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn10.setText("6");
        sellbtn10.setContentAreaFilled(false);
        sellbtn10.setFocusPainted(false);
        sellbtn10.setOpaque(true);
        sellbtn10.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn10MouseReleased(evt);
            }
        });
        sellbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn10ActionPerformed(evt);
            }
        });

        sellbtn11.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn11.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn11.setText("3");
        sellbtn11.setContentAreaFilled(false);
        sellbtn11.setFocusPainted(false);
        sellbtn11.setOpaque(true);
        sellbtn11.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn11MouseReleased(evt);
            }
        });
        sellbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn11ActionPerformed(evt);
            }
        });

        sellbtn12.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn12.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn12.setText(".");
        sellbtn12.setContentAreaFilled(false);
        sellbtn12.setFocusPainted(false);
        sellbtn12.setOpaque(true);
        sellbtn12.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn12MouseReleased(evt);
            }
        });
        sellbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn12ActionPerformed(evt);
            }
        });

        sellbtn13.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn13.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn13.setText("C");
        sellbtn13.setContentAreaFilled(false);
        sellbtn13.setFocusPainted(false);
        sellbtn13.setOpaque(true);
        sellbtn13.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn13MouseReleased(evt);
            }
        });
        sellbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn13ActionPerformed(evt);
            }
        });

        sellbtn14.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn14.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn14.setText("2");
        sellbtn14.setContentAreaFilled(false);
        sellbtn14.setFocusPainted(false);
        sellbtn14.setOpaque(true);
        sellbtn14.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn14MouseReleased(evt);
            }
        });
        sellbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn14ActionPerformed(evt);
            }
        });

        sellbtn15.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn15.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn15.setText("0");
        sellbtn15.setContentAreaFilled(false);
        sellbtn15.setFocusPainted(false);
        sellbtn15.setOpaque(true);
        sellbtn15.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn15MouseReleased(evt);
            }
        });
        sellbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn15ActionPerformed(evt);
            }
        });

        sellbtn16.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn16.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn16.setText("5");
        sellbtn16.setContentAreaFilled(false);
        sellbtn16.setFocusPainted(false);
        sellbtn16.setOpaque(true);
        sellbtn16.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn16MouseReleased(evt);
            }
        });
        sellbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn16ActionPerformed(evt);
            }
        });

        sellbtn17.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn17.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn17.setText("8");
        sellbtn17.setContentAreaFilled(false);
        sellbtn17.setFocusPainted(false);
        sellbtn17.setOpaque(true);
        sellbtn17.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn17MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn17MouseReleased(evt);
            }
        });
        sellbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn17ActionPerformed(evt);
            }
        });

        sellbtn18.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn18.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn18.setText("CE");
        sellbtn18.setContentAreaFilled(false);
        sellbtn18.setFocusPainted(false);
        sellbtn18.setOpaque(true);
        sellbtn18.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn18MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn18MouseReleased(evt);
            }
        });
        sellbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn18ActionPerformed(evt);
            }
        });

        sellbtn19.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn19.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn19.setText("7");
        sellbtn19.setContentAreaFilled(false);
        sellbtn19.setFocusPainted(false);
        sellbtn19.setOpaque(true);
        sellbtn19.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn19MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn19MouseReleased(evt);
            }
        });
        sellbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn19ActionPerformed(evt);
            }
        });

        sellbtn20.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn20.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn20.setText("1");
        sellbtn20.setContentAreaFilled(false);
        sellbtn20.setFocusPainted(false);
        sellbtn20.setOpaque(true);
        sellbtn20.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn20MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn20MouseReleased(evt);
            }
        });
        sellbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn20ActionPerformed(evt);
            }
        });

        sellbtn21.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn21.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn21.setText("4");
        sellbtn21.setContentAreaFilled(false);
        sellbtn21.setFocusPainted(false);
        sellbtn21.setOpaque(true);
        sellbtn21.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn21MouseReleased(evt);
            }
        });
        sellbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn21ActionPerformed(evt);
            }
        });

        sellbtn22.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn22.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn22.setText("+-");
        sellbtn22.setContentAreaFilled(false);
        sellbtn22.setFocusPainted(false);
        sellbtn22.setOpaque(true);
        sellbtn22.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn22MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn22MouseReleased(evt);
            }
        });
        sellbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn22ActionPerformed(evt);
            }
        });

        sellbtn23.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn23.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn23.setText("x^2");
        sellbtn23.setContentAreaFilled(false);
        sellbtn23.setFocusPainted(false);
        sellbtn23.setOpaque(true);
        sellbtn23.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn23MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn23MouseReleased(evt);
            }
        });
        sellbtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn23ActionPerformed(evt);
            }
        });

        sellbtn24.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn24.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn24.setText("1/x");
        sellbtn24.setContentAreaFilled(false);
        sellbtn24.setFocusPainted(false);
        sellbtn24.setOpaque(true);
        sellbtn24.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn24MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn24MouseReleased(evt);
            }
        });
        sellbtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn24ActionPerformed(evt);
            }
        });

        sellbtn25.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn25.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn25.setText("%");
        sellbtn25.setContentAreaFilled(false);
        sellbtn25.setFocusPainted(false);
        sellbtn25.setOpaque(true);
        sellbtn25.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn25MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn25MouseReleased(evt);
            }
        });
        sellbtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn25ActionPerformed(evt);
            }
        });

        sellbtn26.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn26.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn26.setText("x^3");
        sellbtn26.setContentAreaFilled(false);
        sellbtn26.setFocusPainted(false);
        sellbtn26.setOpaque(true);
        sellbtn26.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn26MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn26MouseReleased(evt);
            }
        });
        sellbtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn26ActionPerformed(evt);
            }
        });

        sellbtn27.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        sellbtn27.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn27.setText("√");
        sellbtn27.setContentAreaFilled(false);
        sellbtn27.setFocusPainted(false);
        sellbtn27.setOpaque(true);
        sellbtn27.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn27MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn27MouseReleased(evt);
            }
        });
        sellbtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellbtn25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellbtn18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellbtn13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sellbtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(sellbtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sellbtn27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sellbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sellbtn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sellbtn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sellbtn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sellbtn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout calculatorpanelLayout = new javax.swing.GroupLayout(calculatorpanel);
        calculatorpanel.setLayout(calculatorpanelLayout);
        calculatorpanelLayout.setHorizontalGroup(
            calculatorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(562, 562, 562))
        );
        calculatorpanelLayout.setVerticalGroup(
            calculatorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );

        rightside.add(calculatorpanel, "card5");

        barcodepanel.setBackground(new java.awt.Color(206, 252, 151));

        jPanel2.setBackground(new java.awt.Color(100, 183, 0));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barcode");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jTextField2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField2.setSelectionColor(new java.awt.Color(100, 183, 0));

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField1.setSelectionColor(new java.awt.Color(100, 183, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        sellbtn1.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        sellbtn1.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn1.setText("Generate");
        sellbtn1.setContentAreaFilled(false);
        sellbtn1.setFocusPainted(false);
        sellbtn1.setOpaque(true);
        sellbtn1.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn1MouseReleased(evt);
            }
        });
        sellbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn1ActionPerformed(evt);
            }
        });

        sellbtn2.setBackground(new java.awt.Color(0, 50, 0));
        sellbtn2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        sellbtn2.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn2.setText("Print");
        sellbtn2.setContentAreaFilled(false);
        sellbtn2.setFocusPainted(false);
        sellbtn2.setOpaque(true);
        sellbtn2.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtn2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtn2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtn2MouseReleased(evt);
            }
        });
        sellbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtn2ActionPerformed(evt);
            }
        });

        barcodegenlbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barcodegenlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sellbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(sellbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barcodegenlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout barcodepanelLayout = new javax.swing.GroupLayout(barcodepanel);
        barcodepanel.setLayout(barcodepanelLayout);
        barcodepanelLayout.setHorizontalGroup(
            barcodepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barcodepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        barcodepanelLayout.setVerticalGroup(
            barcodepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barcodepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        rightside.add(barcodepanel, "card6");

        emailpanel.setBackground(new java.awt.Color(206, 252, 151));

        jPanel5.setBackground(new java.awt.Color(100, 183, 0));

        emailrecetable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emailrecetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee id", "Name", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emailrecetable.setGridColor(new java.awt.Color(255, 255, 255));
        emailrecetable.setRowHeight(22);
        emailrecetable.setSelectionBackground(new java.awt.Color(100, 183, 0));
        emailrecetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailrecetableMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(emailrecetable);

        jLabel69.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Recipients");

        jLabel80.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Email");

        emailfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emailfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        emailfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        emailfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailfieldKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Email Password");

        jLabel83.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Recipient Email");

        receemailfromtable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        receemailfromtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        receemailfromtable.setSelectionColor(new java.awt.Color(100, 183, 0));

        jLabel89.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Authentication");

        jPasswordField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        saveemailtodb.setBackground(new java.awt.Color(0, 50, 0));
        saveemailtodb.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        saveemailtodb.setForeground(new java.awt.Color(255, 255, 255));
        saveemailtodb.setText("Save Email to DB");
        saveemailtodb.setContentAreaFilled(false);
        saveemailtodb.setFocusPainted(false);
        saveemailtodb.setOpaque(true);
        saveemailtodb.setPreferredSize(new java.awt.Dimension(140, 40));
        saveemailtodb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveemailtodbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveemailtodbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveemailtodbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveemailtodbMouseReleased(evt);
            }
        });
        saveemailtodb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveemailtodbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(90, 90, 90)
                        .addComponent(emailfield))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addGap(24, 24, 24)
                        .addComponent(jPasswordField1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(23, 23, 23)
                        .addComponent(receemailfromtable))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveemailtodb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel89)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveemailtodb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel82)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receemailfromtable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(100, 183, 0));

        fromfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        fromfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fromfield.setSelectionColor(new java.awt.Color(100, 183, 0));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("From");

        jLabel65.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Mail Client");

        tofield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        tofield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tofield.setSelectionColor(new java.awt.Color(100, 183, 0));

        jLabel67.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("To");

        restorelocationfield3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        restorelocationfield3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        restorelocationfield3.setSelectionColor(new java.awt.Color(100, 183, 0));

        jLabel68.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Subject");

        sendmailbtn.setBackground(new java.awt.Color(0, 50, 0));
        sendmailbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        sendmailbtn.setForeground(new java.awt.Color(255, 255, 255));
        sendmailbtn.setText("Send");
        sendmailbtn.setContentAreaFilled(false);
        sendmailbtn.setFocusPainted(false);
        sendmailbtn.setOpaque(true);
        sendmailbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        sendmailbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendmailbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendmailbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sendmailbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendmailbtnMouseReleased(evt);
            }
        });
        sendmailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmailbtnActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextPane1.setSelectionColor(new java.awt.Color(100, 183, 0));
        jScrollPane15.setViewportView(jTextPane1);

        browsepathinrestore2.setBackground(new java.awt.Color(0, 50, 0));
        browsepathinrestore2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        browsepathinrestore2.setForeground(new java.awt.Color(255, 255, 255));
        browsepathinrestore2.setText("Attach File");
        browsepathinrestore2.setContentAreaFilled(false);
        browsepathinrestore2.setFocusPainted(false);
        browsepathinrestore2.setOpaque(true);
        browsepathinrestore2.setPreferredSize(new java.awt.Dimension(140, 40));
        browsepathinrestore2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browsepathinrestore2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browsepathinrestore2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browsepathinrestore2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                browsepathinrestore2MouseReleased(evt);
            }
        });
        browsepathinrestore2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsepathinrestore2ActionPerformed(evt);
            }
        });

        attachpathmail.setEditable(false);
        attachpathmail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        attachpathmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        attachpathmail.setSelectionColor(new java.awt.Color(100, 183, 0));

        namefrattachment.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        namefrattachment.setText("attachment");
        namefrattachment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        namefrattachment.setSelectionColor(new java.awt.Color(100, 183, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromfield, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tofield, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(restorelocationfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(attachpathmail)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(sendmailbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(browsepathinrestore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(namefrattachment)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fromfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tofield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(restorelocationfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attachpathmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browsepathinrestore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namefrattachment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(sendmailbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout emailpanelLayout = new javax.swing.GroupLayout(emailpanel);
        emailpanel.setLayout(emailpanelLayout);
        emailpanelLayout.setHorizontalGroup(
            emailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        emailpanelLayout.setVerticalGroup(
            emailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rightside.add(emailpanel, "card7");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addComponent(leftside1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(middle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1011, 1011, 1011))
            .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                    .addGap(0, 356, Short.MAX_VALUE)
                    .addComponent(rightside, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leftside1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(middle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rightside, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(1, 17, 1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/log-out-symbol.png"))); // NOI18N
        close.setToolTipText("");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Green Food Stores");

        logoutsection.setBackground(new java.awt.Color(1, 17, 1));
        logoutsection.setLayout(new java.awt.CardLayout());

        sectionlogout.setBackground(new java.awt.Color(1, 17, 1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logout Member ?");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("YES");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("NO");
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sectionlogoutLayout = new javax.swing.GroupLayout(sectionlogout);
        sectionlogout.setLayout(sectionlogoutLayout);
        sectionlogoutLayout.setHorizontalGroup(
            sectionlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionlogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        sectionlogoutLayout.setVerticalGroup(
            sectionlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        logoutsection.add(sectionlogout, "card3");

        black.setBackground(new java.awt.Color(1, 17, 1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout blackLayout = new javax.swing.GroupLayout(black);
        black.setLayout(blackLayout);
        blackLayout.setHorizontalGroup(
            blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        blackLayout.setVerticalGroup(
            blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        logoutsection.add(black, "card3");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutsection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        footer.setBackground(new java.awt.Color(1, 17, 1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vivex.ml");

        datelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datelbl.setName("timelbl"); // NOI18N

        timelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelbl.setName("timelbl"); // NOI18N

        salesday.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        salesday.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesday, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(timelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                            .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(21, 21, 21)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/mainicon.png")));
    }

    private void refreshstocktableinpos() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `stock` WHERE `Quantity`>0"); // get all data from library where quantity field is greater than 0
            DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //creating a table
            dtm.setRowCount(0);
            while (rs.next()) { //adding date to the table
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generateInvoiceID() {
        try {

            ResultSet rs = DB.DB.search("select count(DISTINCT Bill_number) as x from `salesrecords` ");
            if (rs.next()) {

                int rowcount = Integer.parseInt(rs.getString("x"));
                rowcount++;
                this.Sellidfield.setText("" + rowcount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void hometoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometoggleMouseClicked

        homepnl.setVisible(true); // open homepnl panel

    }//GEN-LAST:event_hometoggleMouseClicked

    private void hometoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometoggleMouseEntered
        //actions when mouse point entered 
        hometoggle.setText("Home"); //set text to Home 
        hometoggle.setIcon(null); //remove icon
    }//GEN-LAST:event_hometoggleMouseEntered

    private void hometoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometoggleMouseExited
        //actions when mouse point exited
        hometoggle.setText(null); //remove text 
        icon = new ImageIcon(getClass().getResource("images/home-icon-silhouette (1).png"));
        hometoggle.setIcon(icon); // set icon
    }//GEN-LAST:event_hometoggleMouseExited

    private void stockstoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockstoggleMouseClicked

    }//GEN-LAST:event_stockstoggleMouseClicked

    private void stockstoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockstoggleMouseEntered
        //actions when mouse point entered 
        stockstoggle.setText("Stock"); //set text to Stock
        stockstoggle.setIcon(null); // remove icon
    }//GEN-LAST:event_stockstoggleMouseEntered

    private void stockstoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockstoggleMouseExited
        //actions when mouse point exited
        stockstoggle.setText(null); //remove text
        icon = new ImageIcon(getClass().getResource("images/factory-stock-house (1).png"));
        stockstoggle.setIcon(icon); //set icon
    }//GEN-LAST:event_stockstoggleMouseExited

    private void salestoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salestoggleMouseClicked

    }//GEN-LAST:event_salestoggleMouseClicked

    private void salestoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salestoggleMouseEntered
        //actions when mouse point entered 
        salestoggle.setText("Sales"); //set text to Sales
        salestoggle.setIcon(null); //remove icon
    }//GEN-LAST:event_salestoggleMouseEntered

    private void salestoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salestoggleMouseExited
        //actions when mouse point exited
        salestoggle.setText(null); //remove text
        icon = new ImageIcon(getClass().getResource("images/tag (1).png"));
        salestoggle.setIcon(icon); //set icon
    }//GEN-LAST:event_salestoggleMouseExited

    private void employeetoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetoggleMouseClicked

    }//GEN-LAST:event_employeetoggleMouseClicked

    private void employeetoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetoggleMouseEntered
        //actions when mouse point entered 
        employeetoggle.setText("Employees"); //set text to Employees
        employeetoggle.setIcon(null); //remove icons
    }//GEN-LAST:event_employeetoggleMouseEntered

    private void employeetoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetoggleMouseExited
        //actions when mouse point exited
        employeetoggle.setText(null); // remove text
        icon = new ImageIcon(getClass().getResource("images/businessmen-having-a-meeting (1).png"));
        employeetoggle.setIcon(icon); //set icons
    }//GEN-LAST:event_employeetoggleMouseExited

    private void customertoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertoggleMouseClicked

    }//GEN-LAST:event_customertoggleMouseClicked

    private void customertoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertoggleMouseEntered
        //actions when mouse point entered 
        customertoggle.setText("Customers"); //set text to Customers
        customertoggle.setIcon(null); //remove icon
    }//GEN-LAST:event_customertoggleMouseEntered

    private void customertoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertoggleMouseExited
        //actions when mouse point exited
        customertoggle.setText(null); //remove text
        icon = new ImageIcon(getClass().getResource("images/customer (1).png"));
        customertoggle.setIcon(icon); //set icons
    }//GEN-LAST:event_customertoggleMouseExited

    private void logtoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logtoggleMouseClicked

    }//GEN-LAST:event_logtoggleMouseClicked

    private void logtoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logtoggleMouseEntered
        //actions when mouse point entered 
        logtoggle.setText("Logs"); //set text to Logs
        logtoggle.setIcon(null); //remove icon
    }//GEN-LAST:event_logtoggleMouseEntered

    private void logtoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logtoggleMouseExited
        //actions when mouse point exited
        logtoggle.setText(null); //remove text
        icon = new ImageIcon(getClass().getResource("images/log-file-format (1).png"));
        logtoggle.setIcon(icon); //set icon
    }//GEN-LAST:event_logtoggleMouseExited

    private void settingstoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingstoggleMouseClicked

    }//GEN-LAST:event_settingstoggleMouseClicked

    private void settingstoggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingstoggleMouseEntered

    }//GEN-LAST:event_settingstoggleMouseEntered

    private void settingstoggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingstoggleMouseExited

    }//GEN-LAST:event_settingstoggleMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        //action when mouse clicked
        sectionlogout.setVisible(true); //open sectionlogout panel
        close.setIcon(null); //remove icon
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited

    }//GEN-LAST:event_closeMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0, 234, 0)); //change button color when mouse entered
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(0, 204, 0));//change button color when mouse exited
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String activitylogapplicationexit = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jLabel2.getText() + "'),'','Member Logout','Admin Logged Out')";
        try {
            DB.DB.iud(activitylogapplicationexit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Login logn = new Login(); // open login frame
        this.dispose(); //close this panel
        logn.setVisible(true); //open login frame
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(255, 102, 102));//change button color when mouse entered
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(255, 51, 0)); //change button color when mouse exited
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //action when button pressed
        sectionlogout.setVisible(false); // close sectionlogout panel
        icon = new ImageIcon(getClass().getResource("images/log-out-symbol.png"));
        close.setIcon(icon); //set icon
    }//GEN-LAST:event_jButton2ActionPerformed

    private void poslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseClicked
        //close panels when mouse clicked
        pospanel.setVisible(true);
        sellrecordspanel.setVisible(false);
        chartspnl.setVisible(false);
        calculatorpanel.setVisible(false);
        barcodepanel.setVisible(false);
        emailpanel.setVisible(false);

        //change background colors when mouse clicked
        poslbl.setBackground(new Color(206, 252, 151));
        salesrecordslbl.setBackground(new Color(111, 204, 0));
        chartslbl.setBackground(new Color(111, 204, 0));
        calculatorlbl.setBackground(new Color(111, 204, 0));
        barcodegenlbl.setBackground(new Color(111, 204, 0));
        emailclientlbl.setBackground(new Color(111, 204, 0));
    }//GEN-LAST:event_poslblMouseClicked

    private void poslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseEntered
        //action when mouse entered
        poslbl.setText("POS"); //set text to POS
        poslbl.setIcon(null); //remove icon
    }//GEN-LAST:event_poslblMouseEntered

    private void poslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseExited
        //action when mouse exited
        icon = new ImageIcon(getClass().getResource("images/tag (1).png"));
        poslbl.setIcon(icon); //set icon
        poslbl.setText(null); //remove icon
    }//GEN-LAST:event_poslblMouseExited

    private void salesrecordslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesrecordslblMouseClicked
        //close  panels when mouse clicked
        pospanel.setVisible(false);
        sellrecordspanel.setVisible(true);
        chartspnl.setVisible(false);
        calculatorpanel.setVisible(false);
        barcodepanel.setVisible(false);
        emailpanel.setVisible(false);

        //change background color when mouse clicked
        poslbl.setBackground(new Color(111, 204, 0));
        salesrecordslbl.setBackground(new Color(206, 252, 151));
        chartslbl.setBackground(new Color(111, 204, 0));
        calculatorlbl.setBackground(new Color(111, 204, 0));
        barcodegenlbl.setBackground(new Color(111, 204, 0));
        emailclientlbl.setBackground(new Color(111, 204, 0));
    }//GEN-LAST:event_salesrecordslblMouseClicked

    private void salesrecordslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesrecordslblMouseEntered
        //action when mouse entered
        salesrecordslbl.setText("Sales"); //set text to Sales
        salesrecordslbl.setIcon(null); //remove icon
    }//GEN-LAST:event_salesrecordslblMouseEntered

    private void salesrecordslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesrecordslblMouseExited
        //action when mouse exited
        icon = new ImageIcon(getClass().getResource("images/sales.png"));
        salesrecordslbl.setIcon(icon); //set icon 
        salesrecordslbl.setText(null); //remove text
    }//GEN-LAST:event_salesrecordslblMouseExited

    private void chartslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartslblMouseClicked
        //close panels when mouse clicked
        pospanel.setVisible(false);
        sellrecordspanel.setVisible(false);
        chartspnl.setVisible(true);
        calculatorpanel.setVisible(false);
        barcodepanel.setVisible(false);
        emailpanel.setVisible(false);

        //change background color when mouse clicked
        poslbl.setBackground(new Color(111, 204, 0));
        salesrecordslbl.setBackground(new Color(111, 204, 0));
        chartslbl.setBackground(new Color(206, 252, 151));
        calculatorlbl.setBackground(new Color(111, 204, 0));
        barcodegenlbl.setBackground(new Color(111, 204, 0));
        emailclientlbl.setBackground(new Color(111, 204, 0));
        chartstab.removeAll();
        DefaultCategoryDataset Dataset = new DefaultCategoryDataset();
        try {
            ResultSet rs = DB.DB.search("SELECT `itemid`,SUM(`quantity`) FROM `salesrecords` WHERE cast(DateTime as date) = '" + salesday.getText() + "' GROUP BY `itemid`");
            while (rs.next()) {
                Dataset.setValue(rs.getInt(2), "Quantity", rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Daily Items and Sold Quantities Chart", "Item Id", "Quantity", Dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot P = chart.getCategoryPlot();
        P.setRangeGridlinePaint(Color.WHITE);
        P.setBackgroundPaint(Color.WHITE);
        ((BarRenderer) P.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) chart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, new Color(100, 183, 0));
        chartstab.add("Daily Items and Sold Quantities", new JPanel().add(new ChartPanel(chart)));
        DefaultCategoryDataset Datasettwo = new DefaultCategoryDataset();
        try {
            String month = salesday.getText().toString().substring(0, 7);
            ResultSet rs = DB.DB.search("SELECT `itemid`,SUM(`quantity`) FROM `salesrecords` WHERE cast(DateTime as date) LIKE '" + month + "%'  GROUP BY `itemid`");
            while (rs.next()) {
                Datasettwo.setValue(rs.getInt(2), "Quantity", rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFreeChart chart2 = ChartFactory.createBarChart3D("Monthly Items and Sold Quantities Chart", "Item Id", "Quantity", Datasettwo, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot P2 = chart2.getCategoryPlot();
        P2.setRangeGridlinePaint(Color.WHITE);
        P2.setBackgroundPaint(Color.WHITE);
        ((BarRenderer) P2.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r2 = (BarRenderer) chart2.getCategoryPlot().getRenderer();
        r2.setSeriesPaint(0, new Color(0, 112, 0));
        chartstab.add("Monthly Items and Sold Quantities", new JPanel().add(new ChartPanel(chart2)));
    }//GEN-LAST:event_chartslblMouseClicked

    private void chartslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartslblMouseEntered
        //action when mouse entered
        chartslbl.setText("Charts"); //set text to Charts
        chartslbl.setIcon(null); //remove icon
    }//GEN-LAST:event_chartslblMouseEntered

    private void chartslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartslblMouseExited
        //acion when mouse exited
        icon = new ImageIcon(getClass().getResource("images/line-chart.png"));
        chartslbl.setIcon(icon); //set icon
        chartslbl.setText(null); //remove text
    }//GEN-LAST:event_chartslblMouseExited

    private void calculatorlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatorlblMouseClicked
        //close panels when mouse clicked
        pospanel.setVisible(false);
        sellrecordspanel.setVisible(false);
        chartspnl.setVisible(false);
        calculatorpanel.setVisible(true);
        barcodepanel.setVisible(false);
        emailpanel.setVisible(false);

        //change background color when mouse clicked
        poslbl.setBackground(new Color(111, 204, 0));
        salesrecordslbl.setBackground(new Color(111, 204, 0));
        chartslbl.setBackground(new Color(111, 204, 0));
        calculatorlbl.setBackground(new Color(206, 252, 151));
        barcodegenlbl.setBackground(new Color(111, 204, 0));
        emailclientlbl.setBackground(new Color(111, 204, 0));
    }//GEN-LAST:event_calculatorlblMouseClicked

    private void calculatorlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatorlblMouseEntered
        //action when mouse entered
        calculatorlbl.setText("Calculator"); //set text to Calculator
        calculatorlbl.setIcon(null); //remove icon
    }//GEN-LAST:event_calculatorlblMouseEntered

    private void calculatorlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatorlblMouseExited
        //action when mouse exited
        icon = new ImageIcon(getClass().getResource("images/calculator.png"));
        calculatorlbl.setIcon(icon); //set icon
        calculatorlbl.setText(null); //remove text
    }//GEN-LAST:event_calculatorlblMouseExited

    private void barcodegenlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodegenlblMouseClicked
        //close panels when mouse clicked
        pospanel.setVisible(false);
        sellrecordspanel.setVisible(false);
        chartspnl.setVisible(false);
        calculatorpanel.setVisible(false);
        barcodepanel.setVisible(true);
        emailpanel.setVisible(false);

        //change background when mouse clicked
        poslbl.setBackground(new Color(111, 204, 0));
        salesrecordslbl.setBackground(new Color(111, 204, 0));
        chartslbl.setBackground(new Color(111, 204, 0));
        calculatorlbl.setBackground(new Color(111, 204, 0));
        barcodegenlbl.setBackground(new Color(206, 252, 151));
        emailclientlbl.setBackground(new Color(111, 204, 0));
    }//GEN-LAST:event_barcodegenlblMouseClicked

    private void barcodegenlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodegenlblMouseEntered
        //action when mouse entered
        barcodegenlbl.setText("Barcode"); //set text to Barcode
        barcodegenlbl.setIcon(null); //remmove icon
    }//GEN-LAST:event_barcodegenlblMouseEntered

    private void barcodegenlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodegenlblMouseExited
        //action when mouse exited
        icon = new ImageIcon(getClass().getResource("images/barcode.png"));
        barcodegenlbl.setIcon(icon); //set icon
        barcodegenlbl.setText(null); //remove text
    }//GEN-LAST:event_barcodegenlblMouseExited

    private void emailclientlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailclientlblMouseClicked
        //close panels when mouse clicked
        pospanel.setVisible(false);
        sellrecordspanel.setVisible(false);
        chartspnl.setVisible(false);
        calculatorpanel.setVisible(false);
        barcodepanel.setVisible(false);
        emailpanel.setVisible(true);

        //change background color when mouse clicked
        poslbl.setBackground(new Color(111, 204, 0));
        salesrecordslbl.setBackground(new Color(111, 204, 0));
        chartslbl.setBackground(new Color(111, 204, 0));
        calculatorlbl.setBackground(new Color(111, 204, 0));
        barcodegenlbl.setBackground(new Color(111, 204, 0));
        emailclientlbl.setBackground(new Color(206, 252, 151));
        DefaultTableModel dtm = (DefaultTableModel) emailrecetable.getModel(); //setting a table model
        dtm.setRowCount(0); //setting raw count to 0
        refreshrecepients();
    }//GEN-LAST:event_emailclientlblMouseClicked

    private void refreshrecepients() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `emp`"); // select all data from emp table
            DefaultTableModel dtm = (DefaultTableModel) emailrecetable.getModel(); // creating a table
            while (rs.next()) { //adding data to the table
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void emailclientlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailclientlblMouseEntered
        //action when mouse entered
        emailclientlbl.setText("Email"); //set text to Email
        emailclientlbl.setIcon(null); //remove icon
    }//GEN-LAST:event_emailclientlblMouseEntered

    private void emailclientlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailclientlblMouseExited
        //action when mouse exited
        icon = new ImageIcon(getClass().getResource("images/email.png"));
        emailclientlbl.setIcon(icon); //set icon
        emailclientlbl.setText(null); //remove text
    }//GEN-LAST:event_emailclientlblMouseExited

    private void printinvoicebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseEntered
        printinvoicebtn.setBackground(new Color(0, 112, 0));//change color of printinvoicebtn
    }//GEN-LAST:event_printinvoicebtnMouseEntered

    private void printinvoicebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseExited
        printinvoicebtn.setBackground(new Color(0, 50, 0));//change color of printinvoicebtn
    }//GEN-LAST:event_printinvoicebtnMouseExited

    private void printinvoicebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMousePressed
        printinvoicebtn.setBackground(new Color(0, 168, 0));//change color of printinvoicebtn
    }//GEN-LAST:event_printinvoicebtnMousePressed

    private void printinvoicebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseReleased
        printinvoicebtn.setBackground(new Color(0, 50, 0));//change color of printinvoicebtn
    }//GEN-LAST:event_printinvoicebtnMouseReleased

    private void printinvoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printinvoicebtnActionPerformed
        pospanelk.setVisible(false); //close pospanelk panel
        invoice.setVisible(true); //open invoice panel
        invoicetab.removeAll(); //remove all component from invoicetab
        new Thread() {
            public void run() {
                try {
                    String path = "C:\\JasperReports\\INVOICEGFS.jrxml";
                    JasperReport compileReport = JasperCompileManager.compileReport(path);
                    HashMap hm = new HashMap();
                    hm.put("Sellidfield", Sellidfield.getText());
                    hm.put("cusid", customerid.getText());
                    JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
                    invoicetab.add("Preview Invoice", new JPanel().add(new JRViewer(jp)));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }//GEN-LAST:event_printinvoicebtnActionPerformed

    private void poscancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseEntered
        poscancelbtn.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_poscancelbtnMouseEntered

    private void poscancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseExited
        poscancelbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_poscancelbtnMouseExited

    private void poscancelbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMousePressed
        poscancelbtn.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_poscancelbtnMousePressed

    private void poscancelbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseReleased
        poscancelbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_poscancelbtnMouseReleased

    private void poscancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poscancelbtnActionPerformed
        searchinposfield.setText(null); //remove text from searchinposfield
        searchinposfield.grabFocus(); //focus searchinposfield
        quantityinpos.setText(null); //remove text from quantityinpos
        searchcomboinpos.setSelectedIndex(0);
        generateInvoiceID();
        DefaultTableModel dtmsalesstock = (DefaultTableModel) stocktableinpostable.getModel(); //create a table modle
        dtmsalesstock.setRowCount(0); //set raw count to 0
        refreshstocktableinpos();
        DefaultTableModel dtmlist = (DefaultTableModel) cartlisttable.getModel(); //create table model
        dtmlist.setRowCount(0); //set raw count to 0

        //remove text from components
        totalinpos.setText(null);
        discountfield.setText(null);
        vatfield.setText(null);
        nettotalfield.setText(null);
        paymentfield.setText(null);
        balancefield.setText(null);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_poscancelbtnActionPerformed

    private void sellbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseEntered
        sellbtn.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtnMouseEntered

    private void sellbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseExited
        sellbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtnMouseExited

    private void sellbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMousePressed
        sellbtn.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtnMousePressed

    private void sellbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseReleased
        sellbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtnMouseReleased

    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        if (nettotalfield.getText().isEmpty()) { //if nettotalfield text is empty
            JOptionPane.showMessageDialog(null, "Plz fill !!!"); //message to user
        } else if (nettotalfield.getText().isEmpty()) { //if nettotalfield text is empty
            JOptionPane.showMessageDialog(null, "Plz fill Pyament field !!!"); //messege to user
        } else {
            int newestcount = cartlisttable.getRowCount();
            for (int i = 0; i < newestcount; i++) {
                String ids = cartlisttable.getValueAt(i, 0).toString();
                String quantitiesn = cartlisttable.getValueAt(i, 3).toString();
                String perprice = cartlisttable.getValueAt(i, 4).toString();
                String itemname = cartlisttable.getValueAt(i, 1).toString();
                String ItemIdsandQuantities = ids + "  x  " + quantitiesn;
                try {
                    DB.DB.iud("INSERT INTO `salesrecords` (Item_Ids_and_Quantities, Sale_Earnings, Bill_number, DateTime, `salesatus`,`Billtotal`,`itemname`,`justtoatal`, `discount`, `vat`, `payment`, `balance`,`quantity`, `itemid`,`billedby`,`accountid`) VALUES ('" + ItemIdsandQuantities + "', '" + perprice + "', '" + Sellidfield.getText() + "', CURRENT_TIMESTAMP,  'SUCCESS', '" + nettotalfield.getText() + "', '" + itemname + "', '" + totalinpos.getText() + "', '" + discountfield.getText() + "', '" + vatfield.getText() + "', '" + paymentfield.getText() + "', '" + balancefield.getText() + "', '" + quantitiesn + "', '" + ids + "', '" + jLabel2.getText() + "',(SELECT `accountId` FROM account WHERE `userName`= '" + jLabel2.getText() + "'))");
                    JOptionPane.showMessageDialog(this, "Success !");
                    ResultSet cusidrs = DB.DB.search("SELECT `nooforders` FROM `customers` WHERE `cusid`='" + customerid.getText() + "'  ");
                    int newnoorders = 0;
                    while (cusidrs.next()) {
                        newnoorders = cusidrs.getInt(1) + 1;
                    }
                    DB.DB.iud("Update `customers` SET `nooforders` ='" + newnoorders + "'  ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Failed !");
                    JOptionPane.showMessageDialog(this, e);
                    e.printStackTrace();
                }
            }
            int updatedstockcount = stocktableinpostable.getRowCount();
            for (int i = 0; i < updatedstockcount; i++) {
                String ids = stocktableinpostable.getValueAt(i, 0).toString();
                String quantitiesn = stocktableinpostable.getValueAt(i, 2).toString();
                try {
                    DB.DB.iud("UPDATE `stock` SET  `Quantity`='" + quantitiesn + "'  WHERE Item_Id='" + ids + "' ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_sellbtnActionPerformed

    private void paymentfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentfieldActionPerformed
        double d1 = Double.parseDouble(nettotalfield.getText()); //get value at nettotalfield
        double d2 = Double.parseDouble(paymentfield.getText()); //get value at paymentfield
        double d3 = d2 - d1;
        balancefield.setText("" + d3);
    }//GEN-LAST:event_paymentfieldActionPerformed

    private void paymentfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentfieldKeyReleased
        double d1 = Double.parseDouble(nettotalfield.getText()); //get value at nettotalfield
        double d2 = Double.parseDouble(paymentfield.getText()); //get value at paymentfield
        double d3 = d2 - d1;
        balancefield.setText("" + d3);
    }//GEN-LAST:event_paymentfieldKeyReleased

    private void paymentfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentfieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_paymentfieldKeyTyped

    private void discountfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountfieldActionPerformed
        double d1 = Double.parseDouble(totalinpos.getText()); //get value at totalinpos
        double d2 = Double.parseDouble(discountfield.getText()); //get value at discountfield
        double d3 = d1 * (100 - d2) / 100;
        nettotalfield.setText("" + d3);
        nettotalfield.grabFocus();
    }//GEN-LAST:event_discountfieldActionPerformed

    private void vatfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatfieldActionPerformed
        double d1 = Double.parseDouble(totalinpos.getText()); //get value at totalinpos
        double d2 = Double.parseDouble(vatfield.getText()); //get value at discountfield
        double d3 = d1 * (100 + d2) / 100;
        nettotalfield.setText("" + d3);
        nettotalfield.grabFocus();
    }//GEN-LAST:event_vatfieldActionPerformed

    private void nettotalfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nettotalfieldActionPerformed

    }//GEN-LAST:event_nettotalfieldActionPerformed

    private void balancefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancefieldActionPerformed

    }//GEN-LAST:event_balancefieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) { //if the checkbox is selected
            discountfield.setEditable(true); //discountfield is editable
            discountfield.grabFocus(); //select discountfield
        } else {
            discountfield.setEditable(false); //discountfield non editable
            discountfield.setText("0"); //set text to 0
            nettotalfield.setText(totalinpos.getText()); //set text to value at totalinpos
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {//if the checkbox is selected
            vatfield.setEditable(true); //vatfield is editable
            vatfield.grabFocus(); //select vatfield
        } else {
            vatfield.setEditable(false); //vatfield non editable
            vatfield.setText("0"); //set text to 0
            nettotalfield.setText(totalinpos.getText()); //set text to value at totalinpos
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) { //if the checkbox is selected
            customerid.setEditable(true); //vatfield is editable
            customerid.grabFocus(); //select vatfield
        } else {
            customerid.setEditable(false); //customerid non edotable

        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void customeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeridActionPerformed
        try {
            double d1 = Double.parseDouble(totalinpos.getText()); //get value at totalinpos
            double d2 = 0;
            ResultSet rs = DB.DB.search("SELECT membershipdiscount FROM memberships WHERE membershiptypes=(SELECT `membership`FROM customers WHERE `cusid`='1' )");
            while (rs.next()) {
                Vector v = new Vector();
                d2 = Double.parseDouble(rs.getString(1));
            }
            double d3 = d1 * (100 - d2) / 100;
            nettotalfield.setText("" + d3);
            nettotalfield.grabFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_customeridActionPerformed

    private void cartlisttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartlisttableMouseClicked

    }//GEN-LAST:event_cartlisttableMouseClicked

    private void stocktableinpostableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocktableinpostableMouseClicked
        searchinposfield.setText((String) stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 0));
        quantityinpos.setEnabled(true);
        quantityinpos.setEditable(true);
        quantityinpos.grabFocus();
    }//GEN-LAST:event_stocktableinpostableMouseClicked

    private void searchinposfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchinposfieldActionPerformed
        if (searchinposfield.getText().isEmpty()) { // value at searchinposfield is empty
            JOptionPane.showMessageDialog(null, "Search / Select Item !"); //user message
        } else {
            quantityinpos.setEditable(true); // enable componenet quantityinpos
            quantityinpos.grabFocus(); //select quantityinpos
        }
    }//GEN-LAST:event_searchinposfieldActionPerformed

    private void searchinposfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchinposfieldKeyReleased
        if (searchcomboinpos.getSelectedIndex() == 0) { //if value at searchcomboinpos equal to 0
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  Item_Id LIKE  '" + searchinposfield.getText() + "%' AND `Quantity`>0");
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //create a table 
                dtm.setRowCount(0); //set taw count to 0
                while (rs.next()) { //add data to a vector object 
                    Vector v = new Vector();
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(13));
                    v.add(rs.getString(7));
                    dtm.addRow(v); // add raw to tab;e
                    stocktableinpostable.selectAll(); //select all at stocktableinpostable
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (searchcomboinpos.getSelectedIndex() == 1) { //if value at searchcomboinpos equals 1
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  Item_Name LIKE  '" + searchinposfield.getText() + "%' ");
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //create table model
                dtm.setRowCount(0); //set raw count to 0
                while (rs.next()) { //add data to a vector object
                    Vector v = new Vector();
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(13));
                    v.add(rs.getString(7));
                    dtm.addRow(v); //add raw to table

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_searchinposfieldKeyReleased

    private void searchcomboinposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcomboinposActionPerformed

        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  '" + searchcomboinpos.getSelectedItem().toString() + "' LIKE '" + searchinposfield.getText() + "' ");
            DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //create a table
            dtm.setRowCount(0); //set raw count to 0
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                v.add(rs.getString(7));
                dtm.addRow(v); // add raw to table
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchcomboinposActionPerformed

    private void quantityinposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityinposActionPerformed

    }//GEN-LAST:event_quantityinposActionPerformed

    private void quantityinposKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityinposKeyReleased

    }//GEN-LAST:event_quantityinposKeyReleased

    private void quantityinposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityinposKeyTyped

        char c = evt.getKeyChar(); //get key pressed value

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) { //adding key shortcuts
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_quantityinposKeyTyped

    private void additeminposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseEntered
        additeminpos.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_additeminposMouseEntered

    private void additeminposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseExited
        additeminpos.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_additeminposMouseExited

    private void additeminposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMousePressed
        additeminpos.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_additeminposMousePressed

    private void additeminposMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseReleased
        additeminpos.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_additeminposMouseReleased

    private void additeminposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additeminposActionPerformed
        if (searchinposfield.getText().isEmpty()) { //if value at searchinposfieldis empty
            JOptionPane.showMessageDialog(null, "Search / Select Item !"); //user message
        } else if (quantityinpos.getText().isEmpty()) {  //if value at quantityinpos is empty
            JOptionPane.showMessageDialog(null, "Enter Quntity !"); //user message
        } else {
            int quantitytyped = parseInt(quantityinpos.getText()); //get value at quantityinpos
            String stockcount = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString(); //get vlue at a cell
            int stockintii = Integer.parseInt(stockcount);
            if (stockintii < quantitytyped) {
                JOptionPane.showMessageDialog(this, "Enter Quantity less than " + stockintii + " "); //user message
            } else if (quantitytyped == 0) {
                JOptionPane.showMessageDialog(this, "Out of Item Quantity !"); //user message
            } else {
                int tostocktableup = stockintii - quantitytyped;
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //create a table model
                dtm.setValueAt(tostocktableup, stocktableinpostable.getSelectedRow(), 2); //change value at a cell
                String itemID = searchinposfield.getText().toString(); //get value at searchinposfield
                String itemName = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 1).toString();//get vlue at a cell
                String stock = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString();//get vlue at a cell
                String PerPrice = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 3).toString();//get vlue at a cell
                int Perpriceint = Integer.parseInt(PerPrice);
                int quantity = Integer.parseInt(quantityinpos.getText());
                int stockint = Integer.parseInt(stock);
                if (quantityinpos.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Add quantity");
                } else {
                    DefaultTableModel dtml = (DefaultTableModel) cartlisttable.getModel();

                    int count = cartlisttable.getRowCount();

                    boolean flag = true; //if the flag is true
                    for (int i = 0; i < count; i++) { //loop untill i is greater than count
                        String prerow = (String) cartlisttable.getValueAt(i, 0);
                        if (itemID.equals(prerow)) {
                            flag = false;
                            quantity++; //quantity + 1
                            int cartquaex = (int) dtml.getValueAt(i, 3); //get value at a cell
                            int exisquantity = quantity + cartquaex;
                            dtml.removeRow(i); //remove raw
                            Vector v = new Vector(); //new vector object
                            v.add(itemID);
                            v.add(itemName);
                            v.add(PerPrice);
                            v.add(exisquantity);
                            v.add(Perpriceint * (exisquantity));
                            dtml.addRow(v); //add raw

                        }
                    }
                    if (flag) { // action when flag is true
                        Vector v = new Vector(); //new vector
                        v.add(itemID);
                        v.add(itemName);
                        v.add(PerPrice);
                        v.add(quantity);
                        v.add(Perpriceint * (quantity));
                        dtml.addRow(v); //add raw to table

                    }
                }
            }
        }
    }//GEN-LAST:event_additeminposActionPerformed

    private void removeitemfromlistbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseEntered
        removeitemfromlistbtn.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_removeitemfromlistbtnMouseEntered

    private void removeitemfromlistbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseExited
        removeitemfromlistbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_removeitemfromlistbtnMouseExited

    private void removeitemfromlistbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMousePressed
        removeitemfromlistbtn.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_removeitemfromlistbtnMousePressed

    private void removeitemfromlistbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseReleased
        removeitemfromlistbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_removeitemfromlistbtnMouseReleased

    private void removeitemfromlistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnActionPerformed
        if (cartlisttable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Select Row to Delete"); //user message
        } else {
            if (stocktableinpostable.getSelectedRow() == cartlisttable.getSelectedRow()) {
                String stockcount = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString(); //get a value at a cell
                int stockintii = Integer.parseInt(stockcount);
                String cartcount = cartlisttable.getValueAt(cartlisttable.getSelectedRow(), 3).toString(); //get a value at a cell
                int quantitytyped = Integer.parseInt(cartcount); //value at cartcount
                int tostocktableup = stockintii + quantitytyped; //equal of stockintii and quantitytyped
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel(); //create a table model
                dtm.setValueAt(tostocktableup, stocktableinpostable.getSelectedRow(), 2); //get a value at a cell
                DefaultTableModel dtmremv = (DefaultTableModel) cartlisttable.getModel(); //new table model
                dtmremv.removeRow(cartlisttable.getSelectedRow());//remove the selected raw
            }

            //        int[] i = cartlisttable.getSelectedRows();
            //        DefaultTableModel dtmremv = (DefaultTableModel) cartlisttable.getModel();
            //        for (int j = i.length - 1; j >= 0; j--) {
            //            dtmremv.removeRow(i[j]);
            //        }
        }
    }//GEN-LAST:event_removeitemfromlistbtnActionPerformed

    private void SellidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellidfieldActionPerformed

    private void SellidfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellidfieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SellidfieldKeyReleased

    private void BillokbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseEntered
        Billokbtn.setBackground(new Color(0, 112, 0));
    }//GEN-LAST:event_BillokbtnMouseEntered

    private void BillokbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseExited
        Billokbtn.setBackground(new Color(0, 50, 0));
    }//GEN-LAST:event_BillokbtnMouseExited

    private void BillokbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMousePressed
        Billokbtn.setBackground(new Color(0, 168, 0));
    }//GEN-LAST:event_BillokbtnMousePressed

    private void BillokbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseReleased
        Billokbtn.setBackground(new Color(0, 50, 0));
    }//GEN-LAST:event_BillokbtnMouseReleased

    private void BillokbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillokbtnActionPerformed
        double totcookie = 0;
        int count2 = cartlisttable.getRowCount(); //get value at cartlisttable
        for (int i = 0; i < count2; i++) { //loop
            totcookie += Double.parseDouble(cartlisttable.getValueAt(i, 4).toString());
        }
        totalinpos.setText("" + totcookie);
        nettotalfield.setText("" + totcookie);
        quantityinpos.setText(null);
        searchinposfield.setText(null);
        searchinposfield.grabFocus();
        paymentfield.grabFocus();
    }//GEN-LAST:event_BillokbtnActionPerformed

    private void backtoposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseEntered

    private void backtoposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseExited

    private void backtoposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMousePressed

    private void backtoposMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseReleased

    private void backtoposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoposActionPerformed
        pospanelk.setVisible(true);
        invoice.setVisible(false);
    }//GEN-LAST:event_backtoposActionPerformed

    private void salesrecordstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesrecordstableMouseClicked

    }//GEN-LAST:event_salesrecordstableMouseClicked

    private void printinvoicebtninsellrecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseEntered
        printinvoicebtninsellrecords.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseEntered

    private void printinvoicebtninsellrecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseExited
        printinvoicebtninsellrecords.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseExited

    private void printinvoicebtninsellrecordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMousePressed
        printinvoicebtninsellrecords.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_printinvoicebtninsellrecordsMousePressed

    private void printinvoicebtninsellrecordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseReleased
        printinvoicebtninsellrecords.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseReleased

    private void printinvoicebtninsellrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsActionPerformed
        sellrecordstab.removeAll();//remove all components
        try {
            String path = "C:\\JasperReports\\INVOICEGFS.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            HashMap hm = new HashMap();
            hm.put("Sellidfield", billbumberfieldinsellrecords.getText());
            JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
            sellrecordstab.add("Preview Invoice", new JPanel().add(new JRViewer(jp)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printinvoicebtninsellrecordsActionPerformed

    private void billbumberfieldinsellrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbumberfieldinsellrecordsActionPerformed
        if (billbumberfieldinsellrecords.getText().isEmpty()) { //if value at billbumberfieldinsellrecords is empty
            JOptionPane.showMessageDialog(null, "Search Sell Record First !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel(); //new table model
            dtm.setRowCount(0); //set raw count 0
            refreshsellrecords(); //refreshing all methods
        }
    }//GEN-LAST:event_billbumberfieldinsellrecordsActionPerformed

    private void findbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseEntered
        findbtn.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_findbtnMouseEntered

    private void findbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseExited
        findbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_findbtnMouseExited

    private void findbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMousePressed
        findbtn.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_findbtnMousePressed

    private void findbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseReleased
        findbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_findbtnMouseReleased

    private void findbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbtnActionPerformed
        if (billbumberfieldinsellrecords.getText().isEmpty()) { //if value at billbumberfieldinsellrecords is empty
            JOptionPane.showMessageDialog(null, "Search Sell Record First !"); //user message
        } else {
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel(); //new table model
            dtm.setRowCount(0); //set raw count to 0
            refreshsellrecords(); //refresh methods
        }
    }//GEN-LAST:event_findbtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sellbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn1MouseEntered
        sellbtn1.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn1MouseEntered

    private void sellbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn1MouseExited
        sellbtn1.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn1MouseExited

    private void sellbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn1MousePressed
        sellbtn1.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn1MousePressed

    private void sellbtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn1MouseReleased
        sellbtn1.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn1MouseReleased

    private void sellbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn1ActionPerformed

        String a = jTextField1.getText();

        if (a.equalsIgnoreCase("") == false && jTextField2.getText().equalsIgnoreCase("") == false) {
            File theDir = new File("C:\\Barcode");

            // if the directory does not exist, create it
            if (!theDir.exists()) {
                //System.out.println("creating directory: " + directoryName);
                boolean result = false;

                try {
                    theDir.mkdir();
                    result = true;
                } catch (SecurityException se) {
                    //handle it
                }
                if (result) {
                    System.out.println("DIR created");
                }
            }

            //Get 128B Barcode instance from the Factory
            Barcode barcode = null;
            try {
                barcode = BarcodeFactory.createCode128B(a);
            } catch (BarcodeException ex) {

            }
            barcode.setBarHeight(60);
            barcode.setBarWidth(2);

            File imgFile = new File("C:\\Barcode\\" + jTextField2.getText() + ".png");

            try {
                //Write the bar code to PNG file
                BarcodeImageHandler.savePNG(barcode, imgFile);
            } catch (OutputException ex) {

            }

            System.out.println(a);

            barcodegenlbl1.setIcon(new javax.swing.ImageIcon("C:\\Barcode\\" + jTextField2.getText() + ".png"));

            //jTextField1.setText("");
            //jTextField2.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Enter Name and code first");
        }

    }//GEN-LAST:event_sellbtn1ActionPerformed

    private void sellbtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn2MouseEntered
        sellbtn2.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn2MouseEntered

    private void sellbtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn2MouseExited
        sellbtn2.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn2MouseExited

    private void sellbtn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn2MousePressed
        sellbtn2.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn2MousePressed

    private void sellbtn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn2MouseReleased
        sellbtn2.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn2MouseReleased

    private void sellbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn2ActionPerformed

        try {
            printComponent(barcodegenlbl, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_sellbtn2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void sellbtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn3MouseEntered
        sellbtn3.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn3MouseEntered

    private void sellbtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn3MouseExited
        sellbtn3.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn3MouseExited

    private void sellbtn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn3MousePressed
        sellbtn3.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn3MousePressed

    private void sellbtn3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn3MouseReleased
        sellbtn3.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn3MouseReleased

    private void sellbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn3ActionPerformed
        firstNum = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        jTextField4.setText("");
        devideClick = 1;
        decimalClick = 0;
    }//GEN-LAST:event_sellbtn3ActionPerformed

    private void sellbtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn4MouseEntered
        sellbtn4.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn4MouseEntered

    private void sellbtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn4MouseExited
        sellbtn4.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn4MouseExited

    private void sellbtn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn4MousePressed
        sellbtn4.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn4MousePressed

    private void sellbtn4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn4MouseReleased
        sellbtn4.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn4MouseReleased

    private void sellbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn4ActionPerformed
        firstNum = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        jTextField4.setText("");
        minusClick = 1;
        decimalClick = 0;
    }//GEN-LAST:event_sellbtn4ActionPerformed

    private void sellbtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn5MouseEntered
        sellbtn5.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn5MouseEntered

    private void sellbtn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn5MouseExited
        sellbtn5.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn5MouseExited

    private void sellbtn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn5MousePressed
        sellbtn5.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn5MousePressed

    private void sellbtn5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn5MouseReleased
        sellbtn5.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn5MouseReleased

    private void sellbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn5ActionPerformed
        firstNum = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        jTextField4.setText("");
        multiplyClick = 1;
        decimalClick = 0;
    }//GEN-LAST:event_sellbtn5ActionPerformed

    private void sellbtn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn6MouseEntered
        sellbtn6.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn6MouseEntered

    private void sellbtn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn6MouseExited
        sellbtn6.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn6MouseExited

    private void sellbtn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn6MousePressed
        sellbtn6.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn6MousePressed

    private void sellbtn6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn6MouseReleased
        sellbtn6.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn6MouseReleased

    private void sellbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn6ActionPerformed
        secondNum = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        if (plusClick > 0) {
            total = firstNum + secondNum;
            jTextField4.setText(String.valueOf(total));
            firstNum = 0;
            secondNum = 0;
            plusClick = 0;
        }

        if (minusClick > 0) {
            total = firstNum - secondNum;
            jTextField4.setText(String.valueOf(total));
            firstNum = 0;
            secondNum = 0;
            minusClick = 0;
        }

        if (multiplyClick > 0) {
            total = firstNum * secondNum;
            jTextField4.setText(String.valueOf(total));
            firstNum = 0;
            secondNum = 0;
            multiplyClick = 0;

        }

        if (devideClick > 0) {
            total = firstNum / secondNum;
            jTextField4.setText(String.valueOf(total));
            firstNum = 0;
            secondNum = 0;
            devideClick = 0;

        }

    }//GEN-LAST:event_sellbtn6ActionPerformed

    private void sellbtn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn7MouseEntered
        sellbtn7.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn7MouseEntered

    private void sellbtn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn7MouseExited
        sellbtn7.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn7MouseExited

    private void sellbtn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn7MousePressed
        sellbtn7.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn7MousePressed

    private void sellbtn7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn7MouseReleased
        sellbtn7.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn7MouseReleased

    private void sellbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn7ActionPerformed
        firstNum = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        jTextField4.setText("");
        plusClick = 1;
        decimalClick = 0;
    }//GEN-LAST:event_sellbtn7ActionPerformed

    private void sellbtn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn8MouseEntered
        sellbtn8.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn8MouseEntered

    private void sellbtn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn8MouseExited
        sellbtn8.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn8MouseExited

    private void sellbtn8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn8MousePressed
        sellbtn8.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn8MousePressed

    private void sellbtn8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn8MouseReleased
        sellbtn8.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn8MouseReleased

    private void sellbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn8ActionPerformed
        String backspace = null;

        if (jTextField4.getText().length() > 0) {
            StringBuilder strb = new StringBuilder(jTextField4.getText());
            strb.deleteCharAt(jTextField4.getText().length() - 1);
            backspace = strb.toString();
            jTextField4.setText(backspace);
        }
    }//GEN-LAST:event_sellbtn8ActionPerformed

    private void sellbtn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn9MouseEntered
        sellbtn9.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn9MouseEntered

    private void sellbtn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn9MouseExited
        sellbtn9.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn9MouseExited

    private void sellbtn9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn9MousePressed
        sellbtn9.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn9MousePressed

    private void sellbtn9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn9MouseReleased
        sellbtn9.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn9MouseReleased

    private void sellbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn9ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn9.getText());
    }//GEN-LAST:event_sellbtn9ActionPerformed

    private void sellbtn10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn10MouseEntered
        sellbtn10.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn10MouseEntered

    private void sellbtn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn10MouseExited
        sellbtn10.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn10MouseExited

    private void sellbtn10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn10MousePressed
        sellbtn10.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn10MousePressed

    private void sellbtn10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn10MouseReleased
        sellbtn10.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn10MouseReleased

    private void sellbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn10ActionPerformed

    private void sellbtn11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn11MouseEntered
        sellbtn11.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn11MouseEntered

    private void sellbtn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn11MouseExited
        sellbtn11.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn11MouseExited

    private void sellbtn11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn11MousePressed
        sellbtn11.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn11MousePressed

    private void sellbtn11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn11MouseReleased
        sellbtn11.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn11MouseReleased

    private void sellbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn11ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn11.getText());
    }//GEN-LAST:event_sellbtn11ActionPerformed

    private void sellbtn12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn12MouseEntered
        sellbtn12.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn12MouseEntered

    private void sellbtn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn12MouseExited
        sellbtn12.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn12MouseExited

    private void sellbtn12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn12MousePressed
        sellbtn12.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn12MousePressed

    private void sellbtn12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn12MouseReleased
        sellbtn12.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn12MouseReleased

    private void sellbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn12ActionPerformed
        plusminus = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        plusminus = plusminus * (-1);
        jTextField4.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_sellbtn12ActionPerformed

    private void sellbtn13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn13MouseEntered
        sellbtn13.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn13MouseEntered

    private void sellbtn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn13MouseExited
        sellbtn13.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn13MouseExited

    private void sellbtn13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn13MousePressed
        sellbtn13.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn13MousePressed

    private void sellbtn13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn13MouseReleased
        sellbtn13.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn13MouseReleased

    private void sellbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn13ActionPerformed

    private void sellbtn14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn14MouseEntered
        sellbtn14.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn14MouseEntered

    private void sellbtn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn14MouseExited
        sellbtn14.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn14MouseExited

    private void sellbtn14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn14MousePressed
        sellbtn14.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn14MousePressed

    private void sellbtn14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn14MouseReleased
        sellbtn14.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn14MouseReleased

    private void sellbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn14ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn14.getText());
    }//GEN-LAST:event_sellbtn14ActionPerformed

    private void sellbtn15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn15MouseEntered
        sellbtn15.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn15MouseEntered

    private void sellbtn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn15MouseExited
        sellbtn15.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn15MouseExited

    private void sellbtn15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn15MousePressed
        sellbtn15.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn15MousePressed

    private void sellbtn15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn15MouseReleased
        sellbtn15.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn15MouseReleased

    private void sellbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn15ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn15.getText());
    }//GEN-LAST:event_sellbtn15ActionPerformed

    private void sellbtn16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn16MouseEntered
        sellbtn16.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn16MouseEntered

    private void sellbtn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn16MouseExited
        sellbtn16.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn16MouseExited

    private void sellbtn16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn16MousePressed
        sellbtn16.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn16MousePressed

    private void sellbtn16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn16MouseReleased
        sellbtn16.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn16MouseReleased

    private void sellbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn16ActionPerformed

    private void sellbtn17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn17MouseEntered
        sellbtn17.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn17MouseEntered

    private void sellbtn17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn17MouseExited
        sellbtn17.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn17MouseExited

    private void sellbtn17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn17MousePressed
        sellbtn17.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn17MousePressed

    private void sellbtn17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn17MouseReleased
        sellbtn17.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn17MouseReleased

    private void sellbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn17ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn17.getText());
    }//GEN-LAST:event_sellbtn17ActionPerformed

    private void sellbtn18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn18MouseEntered
        sellbtn18.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn18MouseEntered

    private void sellbtn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn18MouseExited
        sellbtn18.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn18MouseExited

    private void sellbtn18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn18MousePressed
        sellbtn18.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn18MousePressed

    private void sellbtn18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn18MouseReleased
        sellbtn18.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn18MouseReleased

    private void sellbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn18ActionPerformed

    }//GEN-LAST:event_sellbtn18ActionPerformed

    private void sellbtn19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn19MouseEntered
        sellbtn19.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn19MouseEntered

    private void sellbtn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn19MouseExited
        sellbtn19.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn19MouseExited

    private void sellbtn19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn19MousePressed
        sellbtn19.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn19MousePressed

    private void sellbtn19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn19MouseReleased
        sellbtn19.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn19MouseReleased

    private void sellbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn19ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn19.getText());
    }//GEN-LAST:event_sellbtn19ActionPerformed

    private void sellbtn20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn20MouseEntered
        sellbtn20.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn20MouseEntered

    private void sellbtn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn20MouseExited
        sellbtn20.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn20MouseExited

    private void sellbtn20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn20MousePressed
        sellbtn20.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn20MousePressed

    private void sellbtn20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn20MouseReleased
        sellbtn20.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn20MouseReleased

    private void sellbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn20ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn20.getText());
    }//GEN-LAST:event_sellbtn20ActionPerformed

    private void sellbtn21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn21MouseEntered
        sellbtn21.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn21MouseEntered

    private void sellbtn21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn21MouseExited
        sellbtn21.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn21MouseExited

    private void sellbtn21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn21MousePressed
        sellbtn21.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn21MousePressed

    private void sellbtn21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn21MouseReleased
        sellbtn21.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn21MouseReleased

    private void sellbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn21ActionPerformed
        jTextField4.setText(jTextField4.getText() + sellbtn12.getText());
    }//GEN-LAST:event_sellbtn21ActionPerformed

    private void sellbtn22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn22MouseEntered
        sellbtn22.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn22MouseEntered

    private void sellbtn22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn22MouseExited
        sellbtn22.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn22MouseExited

    private void sellbtn22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn22MousePressed
        sellbtn22.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn22MousePressed

    private void sellbtn22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn22MouseReleased
        sellbtn22.setBackground(new Color(0, 50, 0));
    }//GEN-LAST:event_sellbtn22MouseReleased

    private void sellbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn22ActionPerformed
        plusminus = (Double.parseDouble(String.valueOf(jTextField4.getText())));
        plusminus = plusminus * (-1);
        jTextField4.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_sellbtn22ActionPerformed

    private void sellbtn23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn23MouseEntered
        sellbtn23.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn23MouseEntered

    private void sellbtn23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn23MouseExited
        sellbtn23.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn23MouseExited

    private void sellbtn23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn23MousePressed
        sellbtn23.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn23MousePressed

    private void sellbtn23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn23MouseReleased
        sellbtn23.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn23MouseReleased

    private void sellbtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn23ActionPerformed

    }//GEN-LAST:event_sellbtn23ActionPerformed

    private void sellbtn24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn24MouseEntered
        sellbtn24.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn24MouseEntered

    private void sellbtn24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn24MouseExited
        sellbtn24.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn24MouseExited

    private void sellbtn24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn24MousePressed
        sellbtn24.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn24MousePressed

    private void sellbtn24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn24MouseReleased
        sellbtn24.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn24MouseReleased

    private void sellbtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn24ActionPerformed

    private void sellbtn25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn25MouseEntered
        sellbtn25.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn25MouseEntered

    private void sellbtn25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn25MouseExited
        sellbtn25.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn25MouseExited

    private void sellbtn25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn25MousePressed
        sellbtn25.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn25MousePressed

    private void sellbtn25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn25MouseReleased
        sellbtn25.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn25MouseReleased

    private void sellbtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn25ActionPerformed

    private void sellbtn26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn26MouseEntered
        sellbtn26.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn26MouseEntered

    private void sellbtn26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn26MouseExited
        sellbtn26.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn26MouseExited

    private void sellbtn26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn26MousePressed
        sellbtn26.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn26MousePressed

    private void sellbtn26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn26MouseReleased
        sellbtn26.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn26MouseReleased

    private void sellbtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtn26ActionPerformed

    private void sellbtn27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn27MouseEntered
        sellbtn27.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sellbtn27MouseEntered

    private void sellbtn27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn27MouseExited
        sellbtn27.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn27MouseExited

    private void sellbtn27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn27MousePressed
        sellbtn27.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sellbtn27MousePressed

    private void sellbtn27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtn27MouseReleased
        sellbtn27.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sellbtn27MouseReleased

    private void sellbtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtn27ActionPerformed
        firstNum = Double.parseDouble(jTextField4.getText());
        jTextField4.setText(Math.sqrt(firstNum) + "");
    }//GEN-LAST:event_sellbtn27ActionPerformed

    private void emailrecetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailrecetableMouseClicked
        receemailfromtable.setText((String) emailrecetable.getValueAt(emailrecetable.getSelectedRow(), 2));
        tofield.setText((String) emailrecetable.getValueAt(emailrecetable.getSelectedRow(), 2));
    }//GEN-LAST:event_emailrecetableMouseClicked

    private void emailfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailfieldKeyPressed
        fromfield.setText(emailfield.getText());
    }//GEN-LAST:event_emailfieldKeyPressed

    private void sendmailbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendmailbtnMouseEntered
        sendmailbtn.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_sendmailbtnMouseEntered

    private void sendmailbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendmailbtnMouseExited
        sendmailbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sendmailbtnMouseExited

    private void sendmailbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendmailbtnMousePressed
        sendmailbtn.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_sendmailbtnMousePressed

    private void sendmailbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendmailbtnMouseReleased
        sendmailbtn.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_sendmailbtnMouseReleased

    private void sendmailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmailbtnActionPerformed
        String From = fromfield.getText();
        String To = tofield.getText();
        String Subject = restorelocationfield3.getText();
        String Text = jTextPane1.getText();

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailfield.getText(), jPasswordField1.getText());
            }
        }
        );
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(From));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject(Subject);
            MimeBodyPart messagebodypart = new MimeBodyPart();
            messagebodypart.setText(Text);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messagebodypart);
            messagebodypart = new MimeBodyPart();
            DataSource source = new FileDataSource(filename);
            messagebodypart.setDataHandler(new DataHandler(source));
            messagebodypart.setFileName(namefrattachment.getText());
            multipart.addBodyPart(messagebodypart);
            message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "message sent");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sendmailbtnActionPerformed

    private void browsepathinrestore2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestore2MouseEntered
        browsepathinrestore2.setBackground(new Color(0, 112, 0));//change color of btn
    }//GEN-LAST:event_browsepathinrestore2MouseEntered

    private void browsepathinrestore2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestore2MouseExited
        browsepathinrestore2.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_browsepathinrestore2MouseExited

    private void browsepathinrestore2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestore2MousePressed
        browsepathinrestore2.setBackground(new Color(0, 168, 0));//change color of btn
    }//GEN-LAST:event_browsepathinrestore2MousePressed

    private void browsepathinrestore2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestore2MouseReleased
        browsepathinrestore2.setBackground(new Color(0, 50, 0));//change color of btn
    }//GEN-LAST:event_browsepathinrestore2MouseReleased

    private void browsepathinrestore2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsepathinrestore2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        attachpathmail.setText(filename);
    }//GEN-LAST:event_browsepathinrestore2ActionPerformed

    private void saveemailtodbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveemailtodbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_saveemailtodbMouseEntered

    private void saveemailtodbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveemailtodbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_saveemailtodbMouseExited

    private void saveemailtodbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveemailtodbMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveemailtodbMousePressed

    private void saveemailtodbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveemailtodbMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_saveemailtodbMouseReleased

    private void saveemailtodbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveemailtodbActionPerformed
        try {
            DB.DB.iud("Update `emp` SET email='" + emailfield.getText() + "' where empid=(SELECT `accountId` FROM account WHERE `userName`= '" + jLabel2.getText() + "')  ");
            DefaultTableModel dtm = (DefaultTableModel) emailrecetable.getModel();//update database table emp
            dtm.setRowCount(0);//set raw count 0
            refreshrecepients();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveemailtodbActionPerformed

    public static void printComponent(JComponent comp, boolean fill) throws PrinterException {
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat pf = pjob.defaultPage();
        pf.setOrientation(PageFormat.LANDSCAPE);

        PageFormat postformat = pjob.pageDialog(pf);
        if (pf != postformat) {
            //Set print component
            pjob.setPrintable(new ComponentPrinter(comp, fill), postformat);
            if (pjob.printDialog()) {
                pjob.print();
            }
        }
    }

    private void refreshsellrecords() {
        try {
            ResultSet rs = DB.DB.search("select * from `salesrecords` where Bill_number = '" + billbumberfieldinsellrecords.getText() + "'"); //get data from database table salesrecords
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel(); //new table model
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(8));
                v.add(rs.getString(2));
                v.add(rs.getString(7));
                dtm.addRow(v); //add raw to table
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Billokbtn;
    private javax.swing.JTextField Sellidfield;
    private javax.swing.JButton additeminpos;
    private javax.swing.JTextField attachpathmail;
    private javax.swing.JButton backtopos;
    private javax.swing.JTextField balancefield;
    private javax.swing.JLabel barcodegenlbl;
    private javax.swing.JLabel barcodegenlbl1;
    private javax.swing.JPanel barcodepanel;
    private javax.swing.JTextField billbumberfieldinsellrecords;
    private javax.swing.JPanel black;
    private javax.swing.JButton browsepathinrestore2;
    private javax.swing.JLabel calculatorlbl;
    private javax.swing.JPanel calculatorpanel;
    private javax.swing.JTable cartlisttable;
    private javax.swing.JLabel chartslbl;
    private javax.swing.JPanel chartspnl;
    private javax.swing.JTabbedPane chartstab;
    private javax.swing.JLabel close;
    private javax.swing.JLabel currencyinvisible;
    private javax.swing.JTextField customerid;
    private javax.swing.JLabel customertoggle;
    private javax.swing.JLabel datelbl;
    private javax.swing.JTextField discountfield;
    private javax.swing.JLabel emailclientlbl;
    private javax.swing.JTextField emailfield;
    private javax.swing.JPanel emailpanel;
    private javax.swing.JTable emailrecetable;
    private javax.swing.JLabel employeetoggle;
    private javax.swing.JButton findbtn;
    private javax.swing.JPanel footer;
    private javax.swing.JTextField fromfield;
    private javax.swing.JPanel header;
    private javax.swing.JPanel homepnl;
    private javax.swing.JLabel hometoggle;
    private javax.swing.JPanel invoice;
    private javax.swing.JTabbedPane invoicetab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel lastactivities;
    private javax.swing.JPanel lastactivities4;
    private javax.swing.JPanel lastactivities5;
    private javax.swing.JPanel lastactivities6;
    private javax.swing.JPanel lastactivities7;
    private javax.swing.JLabel lefticon;
    private javax.swing.JLabel lefticon1;
    private javax.swing.JPanel leftside;
    private javax.swing.JPanel leftside1;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel logoutsection;
    private javax.swing.JLabel logtoggle;
    private javax.swing.JPanel middle;
    private javax.swing.JPanel middle1;
    private javax.swing.JTable monthlysales;
    private javax.swing.JTextField namefrattachment;
    private javax.swing.JTextField nettotalfield;
    private javax.swing.JTextField paymentfield;
    private javax.swing.JButton poscancelbtn;
    private javax.swing.JLabel poslbl;
    private javax.swing.JPanel pospanel;
    private javax.swing.JPanel pospanelk;
    private javax.swing.JButton printinvoicebtn;
    private javax.swing.JButton printinvoicebtninsellrecords;
    private javax.swing.JTextField quantityinpos;
    private javax.swing.JTextField receemailfromtable;
    private javax.swing.JButton removeitemfromlistbtn;
    private javax.swing.JTextField restorelocationfield3;
    private javax.swing.JPanel rightside;
    private javax.swing.JLabel salesday;
    private javax.swing.JLabel salesrecordslbl;
    private javax.swing.JTable salesrecordstable;
    private javax.swing.JLabel salestoggle;
    private javax.swing.JButton saveemailtodb;
    private javax.swing.JComboBox<String> searchcomboinpos;
    private javax.swing.JTextField searchinposfield;
    private javax.swing.JPanel sectionlogout;
    private javax.swing.JButton sellbtn;
    private javax.swing.JButton sellbtn1;
    private javax.swing.JButton sellbtn10;
    private javax.swing.JButton sellbtn11;
    private javax.swing.JButton sellbtn12;
    private javax.swing.JButton sellbtn13;
    private javax.swing.JButton sellbtn14;
    private javax.swing.JButton sellbtn15;
    private javax.swing.JButton sellbtn16;
    private javax.swing.JButton sellbtn17;
    private javax.swing.JButton sellbtn18;
    private javax.swing.JButton sellbtn19;
    private javax.swing.JButton sellbtn2;
    private javax.swing.JButton sellbtn20;
    private javax.swing.JButton sellbtn21;
    private javax.swing.JButton sellbtn22;
    private javax.swing.JButton sellbtn23;
    private javax.swing.JButton sellbtn24;
    private javax.swing.JButton sellbtn25;
    private javax.swing.JButton sellbtn26;
    private javax.swing.JButton sellbtn27;
    private javax.swing.JButton sellbtn3;
    private javax.swing.JButton sellbtn4;
    private javax.swing.JButton sellbtn5;
    private javax.swing.JButton sellbtn6;
    private javax.swing.JButton sellbtn7;
    private javax.swing.JButton sellbtn8;
    private javax.swing.JButton sellbtn9;
    private javax.swing.JPanel sellrecordspanel;
    private javax.swing.JTabbedPane sellrecordstab;
    private javax.swing.JButton sendmailbtn;
    private javax.swing.JLabel settingstoggle;
    private javax.swing.JLabel stockstoggle;
    private javax.swing.JTable stocktableinpostable;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel todayearned;
    private javax.swing.JTable todaysales;
    private javax.swing.JLabel todaysaleslbl;
    private javax.swing.JTextField tofield;
    private javax.swing.JTextField totalinpos;
    private javax.swing.JTextField vatfield;
    // End of variables declaration//GEN-END:variables
        String attachmentpath;
    String filename;

}
