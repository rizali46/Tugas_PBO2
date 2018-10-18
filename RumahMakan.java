package Tugas_PBO2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*; 

class RumahMakan extends JFrame{
    JLabel lblmenu=new JLabel("===MAKANAN===");
    JLabel lblmenu1=new JLabel("<1>. Ayam Penyet            14 K");
    JLabel lblmenu2=new JLabel("<2>. Ayam Geprek            12 K");
    JLabel lblmenu3=new JLabel("<3>. Ayam Lalapan           11 K");
    JLabel lblmin=new JLabel("===Minuman===");
    JLabel lblmin1=new JLabel("<1>. Teh Es/Hangat            2K");
    JLabel lblmin2=new JLabel("<2>. Jeruk Es/Hangat         3K");
    JLabel lblmin3=new JLabel("<3>. Susu Es/Hangat          4K");
    JLabel lblpes=new JLabel("===Input Pesanan Pelanggan===");
    JRadioButton pil1=new JRadioButton("Bungkus");
    JRadioButton pil2=new JRadioButton("Makan Ditempat");
    ButtonGroup bg = new ButtonGroup();
    JLabel plbl = new JLabel("===           Pesana Pelanggan           ===");
    JLabel pm = new JLabel(" Makanan =>>");
    JLabel pmin = new JLabel(" Minuman =>>");
    JLabel lbljum=new JLabel("Jumlah =>>");
    String[] cbpesm={"","Ayam Penyet","Ayam Geprek","Ayam Lalapan"};
    JComboBox cbpm=new JComboBox(cbpesm);
    String[] cbpmin={"","Teh","Jeruk","Susu"};
    JComboBox cbmin=new JComboBox(cbpmin);
    ButtonGroup bg2 =new ButtonGroup();
    JRadioButton pilm1=new JRadioButton("Es");
    JRadioButton pilm2=new JRadioButton("Hangat");
    JTextField txtj = new JTextField(20);
    JButton btnpesan=new JButton("Pesan");
    JButton btnbatal=new JButton("Batal");
    JButton btnexit=new JButton("Exit");
    JTextArea txtAp = new JTextArea();
    
            
    
    
    
  RumahMakan()
 {
     setTitle("Warung Makan Hafizh ");
     setLocation(300,100);
     setSize(600,350);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
 }
  void komponenVisual()
 {
    getContentPane().setLayout(null);
    getContentPane().add(lblmenu);
    lblmenu.setBounds(10,10,150,20);
    getContentPane().add(lblmenu1);
    lblmenu1.setBounds(10,30,200,20);
    getContentPane().add(lblmenu2);
    lblmenu2.setBounds(10,50,200,20);
    getContentPane().add(lblmenu3);
    lblmenu3.setBounds(10,70,200,20);
    getContentPane().add(lblmin);
    lblmin.setBounds(10,90,200,20);
     getContentPane().add(lblmin1);
    lblmin1.setBounds(10,110,200,20);
     getContentPane().add(lblmin2);
    lblmin2.setBounds(10,130,200,20);
     getContentPane().add(lblmin3);
    lblmin3.setBounds(10,150,200,20);
    getContentPane().add(lblpes);
    lblpes.setBounds(10,180,200,20);
    bg.add(pil1);
    bg.add(pil2);
    getContentPane().add(pil1);
    pil1.setBounds(10,200,200,20);
    getContentPane().add(pil2);
    pil2.setBounds(10,220,200,20);
    getContentPane().add(plbl);
    plbl.setBounds(300,10,300 , 20);
    getContentPane().add(pm);
    pm.setBounds(300,40,250 , 20);
    getContentPane().add(cbpm);
    cbpm.setBounds(400,40,150 , 20);
    getContentPane().add(pmin);
    pmin.setBounds(300,70,200 , 20);
    getContentPane().add(cbmin);
    cbmin.setBounds(400,70,150 , 20);
    bg2.add(pilm1);
    bg2.add(pilm2);
    getContentPane().add(pilm1);
    pilm1.setBounds(350,90,50,20);
    getContentPane().add(pilm2);
    pilm2.setBounds(450,90,100,20);
    getContentPane().add(lbljum);
    lbljum.setBounds(300,120 ,150, 20);
    getContentPane().add(txtj);
    txtj.setBounds(400,120 ,150, 20);
    getContentPane().add(btnpesan);
    btnpesan.setBounds(310, 150, 70, 20);
    getContentPane().add(btnbatal);
    btnbatal.setBounds(400, 150, 70, 20);
    getContentPane().add(btnexit);
    btnexit.setBounds(490, 150, 70, 20);
    getContentPane().add(txtAp);
    txtAp.setBounds(320, 180, 250, 150 );
    
    

 setVisible(true); 
 } 
  void AksiReaksi()
 {
    btnpesan.addActionListener((ActionEvent e) -> {
        String A = cbpm.getSelectedItem().toString();
        String B = cbmin.getSelectedItem().toString();
        int harga =0;
        int hargam=0;
        String C =txtj.getText();
        int j =Integer.parseInt(C);
        
        txtAp.setText("Makana  =>> "+cbpm.getSelectedItem().toString()+"\n");
        txtAp.append("Minuman =>> "+cbmin.getSelectedItem().toString()+"  ");
        if(pilm1.isSelected()==true) 

            {
            txtAp.append(pilm1.getText()+"\n");
            }
            else
            {
            txtAp.append(pilm2.getText()+"\n");
            } 
                  if(pil1.isSelected()==true) 

            {
            txtAp.append(pil1.getText()+"\n");
            }
            else
            {
            txtAp.append(pil2.getText()+"\n");
            } 
             
        switch (A) {
            case "Ayam Penyet":
                harga =14000;
                
                break;
            case "Ayam Geprek":
                harga=12000;
                break;
            case "Ayam Lalapan":
                harga=11000;
                break;
            default:
                break;
        }
        switch (B) {
            case "Teh":
                hargam =2000;
                break;
            case "Jeruk":
                hargam=3000;
                break;
            case "Susu":
                hargam=4000;
                break;
            default:
                break;
        }
      
        double total =(harga+hargam)*j;
        txtAp.append("Total Pembayaran =>> "+total);
        
    });
    btnbatal.addActionListener((ActionEvent e) -> {
    cbpm.setSelectedIndex(0);
    cbmin.setSelectedIndex(0);
    txtj.setText("");
     
 });
    txtj.addKeyListener(new KeyAdapter() {
        public void KeyPressed (KeyEvent e){
            if (e.getKeyCode()== e.VK_ENTER){
                btnpesan.addActionListener((ActionListener) e);
            }
                
        }
});
    btnexit.addActionListener((ActionEvent e) -> {
        System.exit(0);
    });
 }
    
    public static void main(String args[])
 {
    RumahMakan ap=new RumahMakan();
    ap.komponenVisual(); 
    ap.AksiReaksi();
 } 


}
