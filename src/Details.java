import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;


public class Details extends JFrame {

    private JTextField nametext;
    private JTextArea addresstext;
    private JTextField phonetext;
    private JTextField emailtext;
    private JTextField skills1;
    private JTextField skills2;
    private JTextField skills3;
    private JTextField skills4;
    private JTextField skills5;
    private JTextField skills6;
    private JTextArea edu1text;
    private JTextField start1text;
    private JTextField end1text;
    private JTextArea edu2text;
    private JTextArea edu3text;
    private JTextField start2text;
    private JTextField end2text;
    private JTextField start3text;
    private JTextField end3text;
    private JTextField comp1;
    private JTextField post1;
    private JTextField yr1;
    private JTextField comp2;
    private JTextField post2;
    private JTextField yr2;
    private JTextField comp3;
    private JTextField post3;
    private JTextField yr3;

    private JButton generate;


    public static final Font TITLEFONT =new Font("serif",Font.BOLD,30);
    public static final Font SUBTITLEFONT =new Font("serif",Font.BOLD,25);
    public static final Font NORMALFONT =new Font("serif", Font.PLAIN,20);

    Border blackline = BorderFactory.createLineBorder(Color.black);

    Color c1=new Color(231,233,235,255);

    Color c2=new Color(203,253,217,255);


    public Details(){

        getContentPane().setBackground(new Color(163,204,245,255));
        setSize(700,810);
        setLocation(400,80);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       JLabel titlelabel=new JLabel("Enter all details!!");
       titlelabel.setFont(TITLEFONT);
       titlelabel.setBounds(240,0,300,50);

       add(titlelabel);

        JLabel conlabel=new JLabel("Contact Information:");
        conlabel.setFont(SUBTITLEFONT);
        conlabel.setBounds(10,50,300,20);
        add(conlabel);


        JLabel name=new JLabel("Full Name:");
       name.setFont(NORMALFONT);

       name.setBounds(10,90,100,20);
       add(name);

       nametext =new JTextField();
       nametext.setBounds(110,90,200,20);
       nametext.setBorder(blackline);

       add(nametext);

        JLabel email=new JLabel("Email:");
        email.setFont(NORMALFONT);
        email.setBounds(10,130,100,20);
        add(email);

        emailtext =new JTextField();
        emailtext.setBounds(110,130,200,20);
        emailtext.setBorder(blackline);
        add(emailtext);

        JLabel phone=new JLabel("Phone:");
        phone.setFont(NORMALFONT);
        phone.setBounds(10,170,100,20);
        add(phone);

        phonetext =new JTextField();
        phonetext.setBounds(110,170,200,20);
        phonetext.setBorder(blackline);
        add(phonetext);

        JLabel address=new JLabel("Address:");
        address.setFont(NORMALFONT);
        address.setBounds(10,210,100,20);
        add(address);

        addresstext =new JTextArea();
        addresstext.setBounds(110,210,200,100);
        addresstext.setBorder(blackline);
        add(addresstext);

        JLabel edulabel=new JLabel("Education:");
        edulabel.setFont(SUBTITLEFONT);
        edulabel.setBounds(10,330,300,20);
        add(edulabel);

        JLabel edu1=new JLabel("School:");
        edu1.setFont(NORMALFONT);
        edu1.setBounds(10,370,300,20);
        add(edu1);

        edu1text =new JTextArea();
        edu1text.setBounds(110,370,200,40);
        edu1text.setBorder(blackline);
        add(edu1text);

        JLabel start1=new JLabel("Start Date:");
        start1.setFont(NORMALFONT);
        start1.setBounds(10,430,300,20);
        add(start1);

        start1text =new JTextField();
        start1text.setBounds(110,430,200,20);
        start1text.setBorder(blackline);
        add(start1text);

        JLabel end1=new JLabel("End Date:");
        end1.setFont(NORMALFONT);
        end1.setBounds(10,460,300,20);
        add(end1);

        end1text =new JTextField();
        end1text.setBounds(110,460,200,20);
        end1text.setBorder(blackline);
        add(end1text);

        JLabel edu2=new JLabel("Degree 1:");
        edu2.setFont(NORMALFONT);
        edu2.setBounds(10,500,300,20);
        add(edu2);

        edu2text =new JTextArea();
        edu2text.setBounds(110,500,200,40);
        edu2text.setBorder(blackline);
        add(edu2text);

        JLabel start2=new JLabel("Start Date:");
        start2.setFont(NORMALFONT);
        start2.setBounds(10,560,300,20);
        add(start2);

        start2text =new JTextField();
        start2text.setBounds(110,560,200,20);
        start2text.setBorder(blackline);
        add(start2text);

        JLabel end2=new JLabel("End Date:");
        end2.setFont(NORMALFONT);
        end2.setBounds(10,590,300,20);
        add(end2);

        end2text =new JTextField();
        end2text.setBounds(110,590,200,20);
        end2text.setBorder(blackline);
        add(end2text);

        JLabel edu3=new JLabel("Degree 2:");
        edu3.setFont(NORMALFONT);
        edu3.setBounds(10,630,300,20);
        add(edu3);

        edu3text =new JTextArea();
        edu3text.setBounds(110,630,200,40);
        edu3text.setBorder(blackline);
        add(edu3text);

        JLabel start3=new JLabel("Start Date:");
        start3.setFont(NORMALFONT);
        start3.setBounds(10,690,300,20);
        add(start3);

        start3text =new JTextField();
        start3text.setBounds(110,690,200,20);
        start3text.setBorder(blackline);
        add(start3text);

        JLabel end3=new JLabel("End Date:");
        end3.setFont(NORMALFONT);
        end3.setBounds(10,720,300,20);
        add(end3);

        end3text =new JTextField();
        end3text.setBounds(110,720,200,20);
        end3text.setBorder(blackline);
        add(end3text);


        JLabel skill=new JLabel("Skills:-");
        skill.setBounds(370,35,300,50);
        skill.setFont(SUBTITLEFONT);
        add(skill);

        JLabel skilllabel1=new JLabel("1.");
        skilllabel1.setFont(NORMALFONT);
        skilllabel1.setBounds(370,85,100,20);
        add(skilllabel1);

        skills1=new JTextField();
        skills1.setBounds(430,85,170,20);
        skills1.setBorder(blackline);
        add(skills1);

        JLabel skilllabel2=new JLabel("2.");
        skilllabel2.setFont(NORMALFONT);
        skilllabel2.setBounds(370,125,100,20);
        add(skilllabel2);

        skills2=new JTextField();
        skills2.setBounds(430,125,170,20);
        skills2.setBorder(blackline);
        add(skills2);

        JLabel skilllabel3=new JLabel("3.");
        skilllabel3.setFont(NORMALFONT);
        skilllabel3.setBounds(370,165,100,20);
        add(skilllabel3);

        skills3=new JTextField();
        skills3.setBounds(430,165,170,20);
        skills3.setBorder(blackline);
        add(skills3);

        JLabel skilllabel4=new JLabel("4.");
        skilllabel4.setFont(NORMALFONT);
        skilllabel4.setBounds(370,205,100,20);
        add(skilllabel4);

        skills4=new JTextField();
        skills4.setBounds(430,205,170,20);
        skills4.setBorder(blackline);
        add(skills4);

        JLabel skilllabel5=new JLabel("5.");
        skilllabel5.setFont(NORMALFONT);
        skilllabel5.setBounds(370,245,100,20);
        add(skilllabel5);

        skills5=new JTextField();
        skills5.setBounds(430,245,170,20);
        skills5.setBorder(blackline);
        add(skills5);

        JLabel skilllabel6=new JLabel("6.");
        skilllabel6.setFont(NORMALFONT);
        skilllabel6.setBounds(370,285,100,20);
        add(skilllabel6);

        skills6=new JTextField();
        skills6.setBounds(430,285,170,20);
        skills6.setBorder(blackline);
        add(skills6);

        JLabel explabel=new JLabel("Experience:");
        explabel.setFont(SUBTITLEFONT);
        explabel.setBounds(350,310,300,50);
        add(explabel);

        JLabel exp1label=new JLabel("Experience 1:");
        exp1label.setFont(NORMALFONT);
        exp1label.setBounds(350,360,300,30);
        add(exp1label);

        JLabel exp11label=new JLabel("Company:");
        exp11label.setFont(NORMALFONT);
        exp11label.setBounds(350,390,300,20);
        add(exp11label);

        comp1 =new JTextField();
        comp1.setBounds(440,390,200,20);
        comp1.setBorder(blackline);
        add(comp1);

        JLabel exp12label=new JLabel("Post:");
        exp12label.setFont(NORMALFONT);
        exp12label.setBounds(350,420,300,20);
        add(exp12label);

        post1 =new JTextField();
        post1.setBounds(395,420,170,20);
        post1.setBorder(blackline);
        add(post1);

        JLabel exp13label=new JLabel("Yrs:");
        exp13label.setFont(NORMALFONT);
        exp13label.setBounds(570,420,300,20);
        add(exp13label);

        yr1 =new JTextField();
        yr1.setBounds(610,420,50,20);
        yr1.setBorder(blackline);
        add(yr1);

        JLabel exp2label=new JLabel("Experience 2:");
        exp2label.setFont(NORMALFONT);
        exp2label.setBounds(350,460,300,50);
        add(exp2label);

        JLabel exp21label=new JLabel("Company:");
        exp21label.setFont(NORMALFONT);
        exp21label.setBounds(350,490,300,50);
        add(exp21label);

        comp2 =new JTextField();
        comp2.setBounds(440,505,200,20);
        comp2.setBorder(blackline);
        add(comp2);

        JLabel exp22label=new JLabel("Post:");
        exp22label.setFont(NORMALFONT);
        exp22label.setBounds(350,520,300,50);
        add(exp22label);

        post2 =new JTextField();
        post2.setBounds(395,535,170,20);
        post2.setBorder(blackline);
        add(post2);


        JLabel exp23label=new JLabel("Yrs:");
        exp23label.setFont(NORMALFONT);
        exp23label.setBounds(570,520,300,50);
        add(exp23label);

        yr2 =new JTextField();
        yr2.setBounds(610,535,50,20);
        yr2.setBorder(blackline);
        add(yr2);


        JLabel exp3label=new JLabel("Experience 3:");
        exp3label.setFont(NORMALFONT);
        exp3label.setBounds(350,570,300,50);
        add(exp3label);

        JLabel exp31label=new JLabel("Company:");
        exp31label.setFont(NORMALFONT);
        exp31label.setBounds(350,600,300,50);
        add(exp31label);

        comp3 =new JTextField();
        comp3.setBounds(440,615,200,20);
        comp3.setBorder(blackline);
        add(comp3);

        JLabel exp32label=new JLabel("Post:");
        exp32label.setFont(NORMALFONT);
        exp32label.setBounds(350,630,300,50);
        add(exp32label);

        post3 =new JTextField();
        post3.setBounds(395,645,170,20);
        post3.setBorder(blackline);
        add(post3);

        JLabel exp33label=new JLabel("Yrs:");
        exp33label.setFont(NORMALFONT);
        exp33label.setBounds(570,630,300,50);
        add(exp33label);

        yr3 =new JTextField();
        yr3.setBounds(610,645,50,20);
        yr3.setBorder(blackline);
        add(yr3);

        generate=new JButton("Generate Resume");
        generate.setBounds(250,750,200,30);
        generate.setBackground(c2);
        generate.setForeground(Color.BLACK);

        add(generate);
        generate.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
          if(nametext.getText().isEmpty()||addresstext.getText().isEmpty()||phonetext.getText().isEmpty()||emailtext.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Please enter all details!!");
          }
          else{
           try{
            String NameOfFile ="/Users/tanishakanal/Documents/Java sync tasks/ResumeBuilder/myresume.pdf";
            Document mydoc=new Document();
            PdfWriter.getInstance(mydoc,new FileOutputStream(NameOfFile));

            mydoc.open();

            mydoc.add(new Paragraph(nametext.getText(), FontFactory.getFont(FontFactory.HELVETICA_BOLD,25,Font.BOLD, BaseColor.BLACK)));
            mydoc.add(Chunk.NEWLINE);



            mydoc.add(new Paragraph("Contact Details:",FontFactory.getFont(FontFactory.TIMES,20,Font.ITALIC,BaseColor.BLACK)));
            mydoc.add(new Paragraph("Email:"+emailtext.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
            mydoc.add(new Paragraph("Phone:"+phonetext.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
            mydoc.add(new Paragraph("Address:"+addresstext.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));

            mydoc.add(new Paragraph("Education:",FontFactory.getFont(FontFactory.TIMES,20,Font.ITALIC,BaseColor.BLACK)));
            if(!edu1text.getText().isEmpty()){
             mydoc.add(new Paragraph("School:"+edu1text.getText(),FontFactory.getFont(FontFactory.TIMES,16,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Start Date:"+start1text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("End Date:"+end1text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
            }
            if(!edu2text.getText().isEmpty()){
             mydoc.add(new Paragraph("Degree 1:"+edu2text.getText(),FontFactory.getFont(FontFactory.TIMES,16,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Start Date:"+start2text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("End Date:"+end2text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
            }
            if(!edu3text.getText().isEmpty()){
             mydoc.add(new Paragraph("Degree 2:"+edu3text.getText(),FontFactory.getFont(FontFactory.TIMES,16,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Start Date:"+start3text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
             mydoc.add(new Paragraph("End Date:"+end3text.getText(),FontFactory.getFont(FontFactory.TIMES,12,Font.PLAIN,BaseColor.BLACK)));
            }

            mydoc.add(new Paragraph("Skills:",FontFactory.getFont(FontFactory.TIMES,20,Font.ITALIC,BaseColor.BLACK)));
            if(!skills1.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills1.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if(!skills2.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills2.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if(!skills3.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills3.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if(!skills4.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills4.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if(!skills5.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills5.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if(!skills6.getText().isEmpty()) {
             mydoc.add(new Paragraph(skills6.getText(), FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            mydoc.add(new Paragraph("Experience:",FontFactory.getFont(FontFactory.TIMES,20,Font.ITALIC,BaseColor.BLACK)));
            if((!comp1.getText().isEmpty() )&& (!post1.getText().isEmpty())&&(!yr1.getText().isEmpty())){
             mydoc.add(new Paragraph("Experience 1:",FontFactory.getFont(FontFactory.TIMES,16,Font.ITALIC,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Company:"+comp1.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Post:"+post1.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Years of Experience:"+yr1.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if((!comp2.getText().isEmpty())&&(!post2.getText().isEmpty())&&(!yr2.getText().isEmpty())){
             mydoc.add(new Paragraph("Experience 2:",FontFactory.getFont(FontFactory.TIMES,16,Font.ITALIC,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Company:"+comp2.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Post:"+post2.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Years of Experience:"+yr2.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            if((!comp3.getText().isEmpty())&&!(post3.getText().isEmpty())&&(!yr3.getText().isEmpty())){
             mydoc.add(new Paragraph("Experience 3:",FontFactory.getFont(FontFactory.TIMES,16,Font.ITALIC,BaseColor.BLACK)));
             mydoc.add(new Paragraph("Company:"+comp3.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Post:"+post3.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
             mydoc.add(new Paragraph("Years of Experience:"+yr3.getText(),FontFactory.getFont(FontFactory.TIMES, 12, Font.PLAIN, BaseColor.BLACK)));
            }
            mydoc.close();
            JOptionPane.showMessageDialog(null,"CV was successfully generated");

           }
           catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex);
           }

          }
         }
        });

        setVisible(true);





    }




}

