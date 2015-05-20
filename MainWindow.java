//
package AppPackage;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import javax.swing.ImageIcon;

public class MainWin extends javax.swing.JFrame {
        JMessagePane JMP = new JMessagePane();
        InfoMessage IMP = new InfoMessage();
        AnimationClass AC = new AnimationClass();
    boolean open_close ;
    
    public MainWin() {
        initComponents();
       
        Developer.setVisible(false);
        TenantFile.setVisible(false);
        Fname.setVisible(false);
        Lname.setVisible(false);
        IDNo.setVisible(false);
        HouseNo.setVisible(false);
        Children.setVisible(false);
        EmailAd.setVisible(false);
        Adults.setVisible(false);
        RentalP.setVisible(false);
        Camera.setVisible(false);
        Browse.setVisible(false);
        Save.setVisible(false);
        
    }
    
    public void getWeather()
    {
        WeatherDoc Doc = new WeatherDoc("1580913","f");
        WeatherDisplay Disp = new WeatherDisplay();
        Disp.getCountry();
    }
    public void slideshow()
    {
         new Thread()
         {
             int count;
             @Override
             @SuppressWarnings("SleepWhileInLoop")
             public void run()
             {
                 try
                 {
                     while(true)
                     {
                         switch(count)
                         {
                             case 0:
                                 ImageIcon II = new ImageIcon(getClass().getResource("slide1"));
                                 Bqckground.setIcon(II);
                                 Thread.sleep(3000);
                                 AC.jLabelXLeft(0, -900, 40, 7, Bqckground);
                                 AC.jLabelXLeft(900, 0, 40, 7, Bqckground);
                                 count =1;
                                 break;
                             case 1:
                                 ImageIcon III = new ImageIcon(getClass().getResource("slide1"));
                                 Bqckground.setIcon(III);
                                 Thread.sleep(3000);
                                 AC.jLabelXRight(-900, 0, 40, 7, Bqckground);
                                 AC.jLabelXRight(0,900, 40, 7, Bqckground);
                                 count =2;
                                 break;
                              case 2:
                                  ImageIcon I2I = new ImageIcon(getClass().getResource("slide2"));
                                 Bqckground.setIcon(I2I);
                                 Thread.sleep(3000);
                                 AC.jLabelXLeft(0, -900, 40, 7, Bqckground);
                                 AC.jLabelXLeft(900, 0, 40, 7, Bqckground);
                                 count =0;
                                 break;
                         }
                     }
                 }
                 catch (Exception e)
                 {
                     
                 }
             }
         }.start(); 
        
    }
    int xMouse;
    int yMouse;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Children = new javax.swing.JComboBox();
        Adults = new javax.swing.JComboBox();
        HouseNo = new javax.swing.JComboBox();
        RentalP = new javax.swing.JComboBox();
        IDNo = new javax.swing.JTextField();
        EmailAd = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Browse = new javax.swing.JLabel();
        CloseTNT = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Camera = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Developer = new javax.swing.JLabel();
        TenantFile = new javax.swing.JLabel();
        Tenant = new javax.swing.JLabel();
        Management = new javax.swing.JLabel();
        ManagementFT = new javax.swing.JLabel();
        Properties = new javax.swing.JLabel();
        Gallery = new javax.swing.JLabel();
        Entertainment = new javax.swing.JLabel();
        Weather = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Twitter = new javax.swing.JLabel();
        Knob = new javax.swing.JLabel();
        DragBar = new javax.swing.JLabel();
        Bqckground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        Children.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        Children.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "none", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }));
        getContentPane().add(Children);
        Children.setBounds(464, 390, 190, 22);

        Adults.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        Adults.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Adults", "one", "two", "three", "four" }));
        getContentPane().add(Adults);
        Adults.setBounds(464, 360, 190, 22);

        HouseNo.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        HouseNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose House.", "House One", "House Two", "House Three", "House Four", "House Five" }));
        getContentPane().add(HouseNo);
        HouseNo.setBounds(464, 330, 190, 22);

        RentalP.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        RentalP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose property", "Muthaiga property", "Karen Property", "Kilimani", "Runda property" }));
        getContentPane().add(RentalP);
        RentalP.setBounds(464, 301, 190, 22);

        IDNo.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        IDNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDNo.setBorder(null);
        IDNo.setOpaque(false);
        getContentPane().add(IDNo);
        IDNo.setBounds(464, 422, 190, 19);

        EmailAd.setFont(new java.awt.Font("Arista", 0, 16)); // NOI18N
        EmailAd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailAd.setBorder(null);
        EmailAd.setOpaque(false);
        getContentPane().add(EmailAd);
        EmailAd.setBounds(464, 272, 190, 19);

        Lname.setFont(new java.awt.Font("[z] Arista", 0, 16)); // NOI18N
        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.setBorder(null);
        Lname.setOpaque(false);
        getContentPane().add(Lname);
        Lname.setBounds(464, 242, 190, 19);

        Fname.setFont(new java.awt.Font("[z] Arista", 0, 16)); // NOI18N
        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.setBorder(null);
        Fname.setOpaque(false);
        getContentPane().add(Fname);
        Fname.setBounds(462, 212, 192, 19);

        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });
        getContentPane().add(Browse);
        Browse.setBounds(157, 420, 120, 10);

        CloseTNT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CloseTNT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CloseTNTFocusGained(evt);
            }
        });
        CloseTNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseTNTMouseClicked(evt);
            }
        });
        getContentPane().add(CloseTNT);
        CloseTNT.setBounds(800, 164, 40, 20);

        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(710, 415, 110, 20);

        Camera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CameraMouseClicked(evt);
            }
        });
        getContentPane().add(Camera);
        Camera.setBounds(157, 360, 120, 10);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(870, 9, 20, 17);

        Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min);
        Min.setBounds(830, 7, 19, 17);

        Developer.setEnabled(false);
        Developer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeveloperMouseReleased(evt);
            }
        });
        getContentPane().add(Developer);
        Developer.setBounds(80, 130, 150, 140);

        TenantFile.setEnabled(false);
        TenantFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TenantFileMouseReleased(evt);
            }
        });
        getContentPane().add(TenantFile);
        TenantFile.setBounds(140, 160, 700, 300);

        Tenant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TenantMouseReleased(evt);
            }
        });
        getContentPane().add(Tenant);
        Tenant.setBounds(140, 160, 155, 138);

        Management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ManagementMouseReleased(evt);
            }
        });
        getContentPane().add(Management);
        Management.setBounds(320, 160, 150, 140);

        ManagementFT.setEnabled(false);
        getContentPane().add(ManagementFT);
        ManagementFT.setBounds(140, 160, 690, 300);

        Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PropertiesMouseReleased(evt);
            }
        });
        getContentPane().add(Properties);
        Properties.setBounds(494, 164, 155, 138);

        Gallery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GalleryMouseReleased(evt);
            }
        });
        getContentPane().add(Gallery);
        Gallery.setBounds(494, 314, 155, 138);

        Entertainment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EntertainmentMouseReleased(evt);
            }
        });
        getContentPane().add(Entertainment);
        Entertainment.setBounds(144, 314, 330, 140);

        Weather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                WeatherMouseReleased(evt);
            }
        });
        getContentPane().add(Weather);
        Weather.setBounds(670, 164, 150, 290);
        getContentPane().add(Facebook);
        Facebook.setBounds(40, 180, 40, 40);
        getContentPane().add(Email);
        Email.setBounds(40, 254, 40, 40);
        getContentPane().add(Twitter);
        Twitter.setBounds(40, 330, 40, 40);

        Knob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KnobMouseReleased(evt);
            }
        });
        getContentPane().add(Knob);
        Knob.setBounds(30, 50, 60, 60);

        DragBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragBarMouseDragged(evt);
            }
        });
        DragBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragBarMousePressed(evt);
            }
        });
        getContentPane().add(DragBar);
        DragBar.setBounds(0, 0, 900, 20);

        Bqckground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Project PROMAGE.png"))); // NOI18N
        getContentPane().add(Bqckground);
        Bqckground.setBounds(0, 0, 900, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.exit(0);
    }                                  

    private void DragBarMouseDragged(java.awt.event.MouseEvent evt) {                                     
         int x = evt.getXOnScreen();
         int y = evt.getYOnScreen();
       
       this.setLocation(x- xMouse, y - yMouse);       
    }                                    

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {                                 
        this.setState(MainWin.ICONIFIED);
    }                                

    private void DragBarMousePressed(java.awt.event.MouseEvent evt) {                                     
         xMouse = evt.getX();
         yMouse = evt.getY();
    }                                    

    private void KnobMouseReleased(java.awt.event.MouseEvent evt) {                                   
        if(open_close == false)
        {
        Developer.setVisible(true);
        Developer.setEnabled(true);
        ImageIcon II = new ImageIcon(getClass().getResource("Develop.png"));
        Developer.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
        Developer.setVisible(false);
        Developer.setEnabled(false);
        Developer.setIcon(null);
        open_close = false; 
        }
    }                                  
            
    private void DeveloperMouseReleased(java.awt.event.MouseEvent evt) {                                        
       
    }                                       
     
    private void TenantMouseReleased(java.awt.event.MouseEvent evt) {                                     
        
        if(open_close == false)
        {
       
        Fname.setVisible(true);
        Lname.setVisible(true);
        IDNo.setVisible(true);
        HouseNo.setVisible(true);
        Children.setVisible(true);
        EmailAd.setVisible(true);
        Adults.setVisible(true);
        RentalP.setVisible(true);
        Camera.setVisible(true);
        Browse.setVisible(true);
        TenantFile.setVisible(true);
        TenantFile.setEnabled(true);
        Save.setVisible(true);
        ImageIcon peg = new ImageIcon(getClass().getResource("TenantFile.png"));
        TenantFile.setIcon(peg);
        open_close = true;
        
        }
        else if(open_close == true)
        {
        open_close = false; 
        
        }
        
    }                                    

    private void TenantFileMouseReleased(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void ManagementMouseReleased(java.awt.event.MouseEvent evt) {                                         
        
        
        if(open_close == false)
        {
        TenantFile.setEnabled(true);
        TenantFile.setVisible(true);
       
        ImageIcon II = new ImageIcon(getClass().getResource("ManagementFT.png"));
        TenantFile.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
       
        open_close = false; 
        }
    }                                        

    private void CloseTNTFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void CloseTNTMouseClicked(java.awt.event.MouseEvent evt) {                                      
       if(TenantFile.isEnabled())
       {
           CloseTNT.isFocusable();
           CloseTNT.isEnabled();
           Fname.setVisible(false);
           Lname.setVisible(false);
           IDNo.setVisible(false);
           HouseNo.setVisible(false);
           Children.setVisible(false);
           EmailAd.setVisible(false);
           Adults.setVisible(false);
           RentalP.setVisible(false);
           Camera.setVisible(false);
           Browse.setVisible(false);
           TenantFile.setVisible(false);
          
        
       } 
       else 
       {
           CloseTNT.setVisible(false);
           
       }
       
    }                                     

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {                                    
      IMP.displayPane("INFO", "under development");
        
    }                                   

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {                                  
       if(Fname.getText().equals(""))
       {
        IMP.displayPane(" ERROR MESSAGE", " All fields must be filled");
       }
    }                                 

    private void PropertiesMouseReleased(java.awt.event.MouseEvent evt) {                                         
        if(open_close == false)
        {
        TenantFile.setEnabled(true);
        TenantFile.setVisible(true);
        
        ImageIcon II = new ImageIcon(getClass().getResource("Property.png"));
        TenantFile.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
       
        open_close = false; 
        }
    }                                        

    private void GalleryMouseReleased(java.awt.event.MouseEvent evt) {                                      
         slideshow();
        if(open_close == false)
        {
        TenantFile.setEnabled(true);
        TenantFile.setVisible(true);

        ImageIcon II = new ImageIcon(getClass().getResource("Gallery.png"));
        TenantFile.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
       
        open_close = false; 
        }
    }                                     

    private void EntertainmentMouseReleased(java.awt.event.MouseEvent evt) {                                            
        if(open_close == false)
        {
        TenantFile.setEnabled(true);
        TenantFile.setVisible(true);
        
        ImageIcon II = new ImageIcon(getClass().getResource("Entertainment.png"));
        TenantFile.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
       
        open_close = false; 
        }
    }                                           

    private void WeatherMouseReleased(java.awt.event.MouseEvent evt) {                                      
         getWeather();
        if(open_close == false)
        {
        TenantFile.setEnabled(true);
        TenantFile.setVisible(true);
        
        ImageIcon II = new ImageIcon(getClass().getResource("Weather.png"));
        TenantFile.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
       
        open_close = false; 
        }
        
    }                                     

    private void CameraMouseClicked(java.awt.event.MouseEvent evt) {                                    
        IMP.displayPane("INFO", "under development");
    }                                   

    
    public static void main(String args[]) {
        /* Set the Windows look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWin().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox Adults;
    public static javax.swing.JLabel Bqckground;
    private javax.swing.JLabel Browse;
    private javax.swing.JLabel Camera;
    private javax.swing.JComboBox Children;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel CloseTNT;
    private javax.swing.JLabel Developer;
    private javax.swing.JLabel DragBar;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailAd;
    private javax.swing.JLabel Entertainment;
    private javax.swing.JLabel Facebook;
    private javax.swing.JTextField Fname;
    private javax.swing.JLabel Gallery;
    private javax.swing.JComboBox HouseNo;
    private javax.swing.JTextField IDNo;
    private javax.swing.JLabel Knob;
    private javax.swing.JTextField Lname;
    private javax.swing.JLabel Management;
    private javax.swing.JLabel ManagementFT;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel Properties;
    private javax.swing.JComboBox RentalP;
    private javax.swing.JLabel Save;
    private javax.swing.JLabel Tenant;
    private javax.swing.JLabel TenantFile;
    private javax.swing.JLabel Twitter;
    private javax.swing.JLabel Weather;
    // End of variables declaration                   

    private void Start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
