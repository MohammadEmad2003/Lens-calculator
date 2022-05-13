package zod;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/* @author Mohammad Emad */

public class ZodController extends err implements Initializable {
    
    @FXML private Pane pm, l1, al, thick, thick1,contp, main,pl,pu;
    @FXML private AnchorPane mainanc;
    @FXML private TextField txtsphr,txtsphl,txtcylr,txtcyll,txtbvd,txtaxl,txtaxr,txtipd,txtadd,txtd,txtfw,txted,txtct,txtbrid;
    @FXML private Label i50,i53,i56,i59,i60,i67,i74,i76,i7,i8,i9,lblnote,all,all1,lblnote1;
    @FXML private Label lblsph,lblcyl,lblax,lblipd,lbladd,lbld,lblfw,lbled,lblct,lblbrid,lblR,lblL,lblcr,lblcl;
    @FXML private Label lblsphR,lblcylR,lblaxR,lblsphL,lblcylL,lblaxL,lblRight,lblLeft;
    @FXML private Label lbl50r,lbl50l,lbl53r,lbl53l,lbl56r,lbl56l,lbl59r,lbl59l,lbl60r,lbl60l,lbl67r,lbl67l,lbl74r,lbl74l,lbl76r,lbl76l,lbl7r,lbl7l,lbl8r,lbl8l,lbl9r,lbl9l;
    @FXML private Label t1,t2,t3,t4,lblr1,lblr3,lblr4,lbll1,lbll3,lbll4,lblthickr,lblthickl,lblbvd;
    @FXML private Button lens,add,reset,abbe,index,trans,cont,dens,btnd,btnu,btnclos,btnmin;
    @FXML private RadioButton ara,eng;
    @FXML private ImageView imgr,imgl;
    public static TextField txtsphrr,txtsphll,txtcylrr,txtcylll,txtaxll,txtaxrr,txtipdd,txtaddd,txtdd,txtfww,txtedd,txtctt,txtbridd;
    public static Pane alll, thickk;
    public static RadioButton araa, engg;
    public static Label lblRightt, lblLeftt; 
    /*
      BlueDown Animation :-
      * this animation makes the blue picture goes down after being up from 
        the Abbe, Density and Index Keys.
      
    Thick Animation :-
      * Works for the thick Pane to show or hide it.
      * Works for pm Pane to make it go down and up while the fade working.
    
    Tac Animation :-
      * Make The same work of Thick animation but with the al Pane 
        Which used for Transposition, Addition and Contact lenses.
    
    DAI Animation :-
      * this animation makes made for the Abbe, Density and Index Keys.
    
    Cont Animation :-
      * this animation made for contact only as it contains another Pane.
    */
    private void BlueDownAnim(){
        Bounds boundsInScene = all.localToScene(all.getBoundsInLocal());
        double x = boundsInScene.getMinY();
        if(x != 42){
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.seconds(1.3));
        slid.setToY(0);
        slid.setNode(all);
        slid.play();}
        FadeTransition fa = new FadeTransition(Duration.seconds(2), thick1);
        fa.setFromValue(1.0);
        fa.setToValue(0.0);
        fa.play();
    }
    private void TickAnim()    {
        thick.setVisible(true);
        BlueDownAnim();
        if(al.getOpacity() != 0){
        FadeTransition fa = new FadeTransition(Duration.seconds(2), al);
        fa.setFromValue(1.0);
        fa.setToValue(0.0);
        fa.play();}
        
        Bounds boundsInScene = pm.localToScene(pm.getBoundsInLocal());
        double x = boundsInScene.getMinY();

        if(x != 240){
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(2000));
        slid.setFromY(-200);
        slid.setToY(220);
        slid.setCycleCount(2);
        slid.setAutoReverse(true);
        slid.setNode(pm);
        slid.play();
        if(thick.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(2), thick);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
        FadeTransition fad = new FadeTransition(Duration.seconds(2), thick);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.setDelay(Duration.seconds(2));
        fad.play();}
        else{
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(2000));
        slid.setFromY(0);
        slid.setToY(-200);
        slid.setNode(pm);
        slid.play();
        FadeTransition fad = new FadeTransition(Duration.seconds(2), thick);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.play();}
    }
    private void TACAnim()     {
        BlueDownAnim();
        al.setVisible(true);
        if(thick.getOpacity() != 0){
        FadeTransition fa = new FadeTransition(Duration.seconds(2), thick);
        fa.setFromValue(1.0);
        fa.setToValue(0.0);
        fa.play();}
        
        Bounds boundsInScene = pm.localToScene(pm.getBoundsInLocal());
        double x = boundsInScene.getMinY();
        if(x != 240){
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(2000));
        slid.setFromY(-200);
        slid.setToY(100);
        slid.setCycleCount(2);
        slid.setAutoReverse(true);
        slid.setNode(pm);
        slid.play();        
        if (al.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(2), al);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
        FadeTransition fad = new FadeTransition(Duration.seconds(2), al);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.setDelay(Duration.seconds(2));
        fad.play();}
        else{
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(2000));
        slid.setFromY(0);
        slid.setToY(-200);
        slid.setNode(pm);
        slid.play();
        FadeTransition fad = new FadeTransition(Duration.seconds(2), al);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.play();
        }
    }
    private void DAIAnim()     {
        Bounds boundsInScene = pm.localToScene(pm.getBoundsInLocal());
        double x = boundsInScene.getMinY();

        if(x != 40){
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(1000));
        slid.setFromY(0);
        slid.setToY(-200);
        slid.setNode(pm);
        slid.play();}
        if(al.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), al);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
        if(thick.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), thick);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.seconds(1.3));
        slid.setToY(-700);
        slid.setNode(all);
        slid.play();
        FadeTransition fa = new FadeTransition(Duration.seconds(1.5), thick1);
        fa.setFromValue(0.0);
        fa.setToValue(1.0);
        fa.play();}        
    private void ContAnim()    {
        Bounds boundsInScene = pm.localToScene(pm.getBoundsInLocal());
        double x = boundsInScene.getMinY();
        if(x != 240){
        FadeTransition fad = new FadeTransition(Duration.seconds(2), contp);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.setDelay(Duration.seconds(1.5));
        fad.play();}
        else{
        FadeTransition fad = new FadeTransition(Duration.seconds(2), contp);
        fad.setFromValue(0.0);
        fad.setToValue(1.0);
        fad.play();}
        
    }
    
    // Tools
    private void SceneOpen() throws IOException {
        FXMLLoader f = new FXMLLoader(getClass().getResource("FXML.fxml"));
        Parent root1 = (Parent) f.load();       
        Rectangle rect = new Rectangle(461, 170);
        rect.setArcHeight(30.0);
        rect.setArcWidth(30.0);
        root1.setClip(rect);
        Stage s = new Stage();
        Scene scene = new Scene(root1, 461, 170);
        s.initStyle(StageStyle.UNDECORATED);
        s.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        s.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT); 
        s.setScene(scene);
        s.centerOnScreen();
        s.show();
        if(ara.isSelected()){erlbl.setStyle("-fx-font-family:Calibri;");}
        else{erlbl.setStyle("-fx-font-family:Cambria;");}
        }
    private void EmptyScene() throws IOException{ SceneOpen();       
    if (ara.isSelected()){
    erlbl.setText("أنت لم تدخل الاسفير");
    }else{erlbl.setText("You did not Enter The Sphere");}
    txtsphr.requestFocus();
    }
    
    // Clear Labels Before every Operation
    private void clearThick() {
    lbl50r.setText(""); 
    lbl50l.setText(""); 
    lbl53r.setText(""); 
    lbl53l.setText(""); 
    lbl56r.setText(""); 
    lbl56l.setText(""); 
    lbl59r.setText(""); 
    lbl59l.setText(""); 
    lbl60r.setText(""); 
    lbl60l.setText(""); 
    lbl67r.setText(""); 
    lbl67l.setText(""); 
    lbl74r.setText(""); 
    lbl74l.setText(""); 
    lbl76r.setText(""); 
    lbl76l.setText(""); 
    lbl7r.setText(""); 
    lbl7l.setText(""); 
    lbl8r.setText(""); 
    lbl8l.setText(""); 
    lbl9r.setText(""); 
    lbl9l.setText(""); 
    lblRight.setVisible(false);
    lblLeft.setVisible(false);
    imgr.setVisible(false);
    imgl.setVisible(false);
    lblthickl.setVisible(false);
    lblthickr.setVisible(false);
    }
    private void clearTAC()   {
    lblsphR.setText("");
    lblcylR.setText("");
    lblaxR.setText("");
    lblsphL.setText("");
    lblcylL.setText("");
    lblaxL.setText("");
    lblcr.setText("");
    lblcl.setText("");
    }
    
    // The Main Calculator Component
       double sphr,sphl,cyll,cylr,axl,h,axr,F,cylcr,sphcr,cylcl,sphcl;
        
    // Thickness
    private void Power(double k, Label thick, ImageView img){
        Image i1 = new Image("/zod/Cent.png");
        Image i2 = new Image("/zod/Ed.png");
        if (k < 0 ){
            if(ara.isSelected()){
                thick.setStyle("-fx-font-family:Calibri;");
                thick.setText("سمك الطرف");}
            else{
                thick.setStyle("-fx-font-family:Cambria;");
                thick.setText("Edge Thickness");}
            img.setImage(i2);img.setVisible(true);thick.setVisible(true);}
        else{if(ara.isSelected()){
            thick.setStyle("-fx-font-family:Calibri;");
            thick.setText("سمك المنتصف");}
            else{
            thick.setStyle("-fx-font-family:Cambria;");
            thick.setText("Center Thickness");}
            img.setImage(i1);img.setVisible(true);thick.setVisible(true);}
    }
    private void getNum()   {
        String scylr = txtcylr.getText();
        String ssphr = txtsphr.getText();
        String ssphl = txtsphl.getText();
        String scyll = txtcyll.getText();
        if("".equals(scylr)){cylr = 0;} else {cylr = Double.parseDouble(scylr);}
        if("".equals(scyll)){cyll = 0;} else {cyll = Double.parseDouble(scyll);}
        if("".equals(ssphr)){sphr = 0;} else {sphr = Double.parseDouble(ssphr);}
        if("".equals(ssphl)){sphl = 0;} else {sphl = Double.parseDouble(ssphl);}
    }
    private void Diameter() {
        String fw = txtfw.getText();
        String D = txtd.getText();
        String B = txtbrid.getText();
        String ipd = txtipd.getText();
        getNum();
        double e = Double.parseDouble(txted.getText());
        double d = 0;
            
             if (!("".equals(fw))&&!("".equals(B))&&!("".equals(ipd)))
             {double IPD = Double.parseDouble(ipd); double FW = Double.parseDouble(fw); 
              double Brid = Double.parseDouble(B);
              double y = FW + Brid; d = y - IPD + FW; d += e;}
        else if (!("".equals(D)) && !("65".equals(D)) && !("70".equals(D))){ d = Double.parseDouble(D);}
        else if((sphr + cylr) > 0 || (sphl + cyll) > 0){d = 65; txtd.setText("65");}
        else if((sphr + cylr) < 0 || (sphl + cyll) < 0){d = 70; txtd.setText("70");}
        
        txtd.setText(String.valueOf(String.format("%.0f",d))); h = d/2;}
        
    private void printright(double e1, double k){
               Power(k, lblthickr, imgr);
        if (k < 0 ){ k *= -1;}
        double n_r = (h*h)*k;
        
        double r[] = new double[11];
        
        r[0] = (n_r/1000) + e1; lbl50r.setText(String.valueOf(String.format("%.3g%n",r[0])));
        r[1] = (n_r/1060) + e1; lbl53r.setText(String.valueOf(String.format("%.3g%n",r[1])));
        r[2] = (n_r/1120) + e1; lbl56r.setText(String.valueOf(String.format("%.3g%n",r[2])));
        r[3] = (n_r/1180) + e1; lbl59r.setText(String.valueOf(String.format("%.3g%n",r[3])));
        r[4] = (n_r/1200) + e1; lbl60r.setText(String.valueOf(String.format("%.3g%n",r[4])));
        r[5] = (n_r/1340) + e1; lbl67r.setText(String.valueOf(String.format("%.3g%n",r[5])));
        r[6] = (n_r/1480) + e1; lbl74r.setText(String.valueOf(String.format("%.3g%n",r[6])));
        r[7] = (n_r/1520) + e1; lbl76r.setText(String.valueOf(String.format("%.3g%n",r[7])));
        r[8] = (n_r/1400) + e1; lbl7r .setText(String.valueOf(String.format("%.3g%n",r[8])));
        r[9] = (n_r/1600) + e1; lbl8r .setText(String.valueOf(String.format("%.3g%n",r[9])));
       r[10] = (n_r/1800) + e1; lbl9r .setText(String.valueOf(String.format("%.3g%n",r[10])));
    }
    private void printleft(double e1, double k) {
    Power(k, lblthickl, imgl);
        if (k < 0 ){ k*= -1;}
       
        double n_l = (h*h)*k;
        double l[] = new double[11];
        
        l[0] = (n_l/1000) + e1; lbl50l.setText(String.valueOf(String.format("%.3g%n",l[0])));
        l[1] = (n_l/1060) + e1; lbl53l.setText(String.valueOf(String.format("%.3g%n",l[1])));
        l[2] = (n_l/1120) + e1; lbl56l.setText(String.valueOf(String.format("%.3g%n",l[2])));
        l[3] = (n_l/1180) + e1; lbl59l.setText(String.valueOf(String.format("%.3g%n",l[3])));
        l[4] = (n_l/1200) + e1; lbl60l.setText(String.valueOf(String.format("%.3g%n",l[4])));
        l[5] = (n_l/1340) + e1; lbl67l.setText(String.valueOf(String.format("%.3g%n",l[5])));
        l[6] = (n_l/1480) + e1; lbl74l.setText(String.valueOf(String.format("%.3g%n",l[6])));
        l[7] = (n_l/1520) + e1; lbl76l.setText(String.valueOf(String.format("%.3g%n",l[7])));
        l[8] = (n_l/1400) + e1; lbl7l .setText(String.valueOf(String.format("%.3g%n",l[8])));
        l[9] = (n_l/1600) + e1; lbl8l .setText(String.valueOf(String.format("%.3g%n",l[9])));
       l[10] = (n_l/1800) + e1; lbl9l .setText(String.valueOf(String.format("%.3g%n",l[10])));
    }
    private void Right()    {
       Diameter();
       getNum();
       lblRight.setVisible(true);
        double k_r = 0;
        String CYL_r = txtcylr.getText();
        String SPH_r = txtsphr.getText();
        String AX_r = txtaxr.getText();
        double e = Double.parseDouble(txtct.getText());
   
            double v = sphr + cylr;
            
    if(!("".equals(txtaxr.getText()))&&(!"0".equals(txtaxr.getText()))){
             axl = Double.parseDouble(AX_r);
        
              if ("".equals(CYL_r)){sphr = Double.parseDouble(SPH_r); k_r = sphr;}
         else if ("".equals(SPH_r)){cylr = Double.parseDouble(CYL_r); k_r = cylr;}  
                 
        double cylxr = cylr;if (cylxr < 0) cylxr *= -1;
        double sphxr = sphr;if (sphxr < 0) sphxr *= -1;
        
            if ((sphr < 0)&&(cylr < 0)){
                     if (axr < 90){cylr *= axr/90;}
                else if (axr > 90){axr = 180 - axr; cylr *= axr/90;}
                else if (axr == 90){} k_r = cylr + sphr;
                printright(e, v);}    
        else if ((sphr > 0)&&(cylr > 0)){ 
                     if (axr < 90){axr = 90 - axr; cylr *= axr/90;}
                else if (axr > 90){axr = axr - 90; cylr *= axr/90;}
                else if (axr == 90){k_r = sphr; cylr = 0;} k_r = cylr + sphr;
                printright(e, v);}
        else if((((sphr < 0)&&(cylr > 0))||((sphr > 0)&&(cylr < 0)))&&(sphxr > cylxr)){
            sphr = sphr + cylr; 
            cylr *= -1;
                 if(axr > 90)  axr -= 90;   
            else if(axr <= 90) axr += 90;
     
                 if ((sphr < 0)&&(cylr < 0)){
                        if (axr < 90){cylr *= axr/90;}
                   else if (axr > 90){axr = 180 - axr; cylr *= axr/90;}
                   else if (axr == 90){} k_r = cylr + sphr;}    
                   else if ((sphr > 0)&&(cylr > 0)){ 
                        if (axr < 90){axr = 90 - axr; cylr *= axr/90;}
                   else if (axr > 90){axr = axr - 90; cylr *= axr/90;}
                   else if (axr == 90){k_r = sphr; cylr = 0;} k_r = cylr + sphr;}
                   printright(e, v);
}
else if((((sphr < 0)&&(cylr > 0))||((sphr > 0)&&(cylr < 0)))&&(sphxr < cylxr)){
        
        if (cylr < 0){
                  if (axr < 90){cylr *= axr/90;}
             else if (axr > 90){axr = 180 - axr; cylr *= axr/90;}
             else if (axr == 90){} k_r = cylr + sphr;}    
   else if (cyll > 0){ 
                  if (axr < 90){axr = 90 - axr; cylr *= axr/90;}
             else if (axr > 90){axr = axr - 90; cylr *= axr/90;}
             else if (axr == 90){k_r = sphr; cylr = 0;} k_r = cylr + sphr;}
             printright(0, v);
}
        }
else if(("".equals(AX_r))){   
     if ((!("".equals(CYL_r))&&!("".equals(SPH_r)))){
         sphr = Double.parseDouble(txtsphr.getText());
         cylr = Double.parseDouble(txtcylr.getText()); k_r = cylr + sphr;
              if (cylr < 0)txtaxr.setText("90");
         else if (cylr > 0)txtaxr.setText("180");}
         else if ("".equals(CYL_r)){sphr = Double.parseDouble(SPH_r); k_r = sphr;}
         else if ("".equals(SPH_r)){cylr = Double.parseDouble(CYL_r); k_r = cylr;
              if (cylr < 0)txtaxr.setText("90");
         else if (cylr > 0)txtaxr.setText("180");}   
         printright(e, v);
     }
    }
    private void Left()     {
       Diameter();
       getNum();
       lblLeft.setVisible(true);
        double k_l = 0;
        String CYL_l = txtcyll.getText();
        String SPH_l = txtsphl.getText();
        String AX_l = txtaxl.getText();
        double e = Double.parseDouble(txtct.getText());
   
            double v = sphl + cyll;
            
    if(!("".equals(txtaxl.getText()))&&(!"0".equals(txtaxl.getText()))){
             axl = Double.parseDouble(AX_l);
        
              if ("".equals(CYL_l)){sphl = Double.parseDouble(SPH_l); k_l = sphl;}
         else if ("".equals(SPH_l)){cyll = Double.parseDouble(CYL_l); k_l = cyll;}  
                 
        double cylxl = cyll;if (cylxl < 0) cylxl *= -1;
        double sphxl = sphl;if (sphxl < 0) sphxl *= -1;
        
            if ((sphl < 0)&&(cyll < 0)){
                     if (axl < 90){cyll *= axl/90;}
                else if (axl > 90){axl = 180 - axl; cyll *= axl/90;}
                else if (axl == 90){} k_l = cyll + sphl;
                printleft(e, v);}    
        else if ((sphl > 0)&&(cyll > 0)){ 
                     if (axl < 90){axl = 90 - axl; cyll *= axl/90;}
                else if (axl > 90){axl = axl - 90; cyll *= axl/90;}
                else if (axl == 90){k_l = sphl; cyll = 0;} k_l = cyll + sphl;
                printleft(e, v);}
        else if((((sphl < 0)&&(cyll > 0))||((sphl > 0)&&(cyll < 0)))&&(sphxl > cylxl)){
            sphl = sphl + cyll; 
            cyll *= -1;
                 if(axl > 90)  axl -= 90;   
            else if(axl <= 90) axl += 90;
     
                 if ((sphl < 0)&&(cyll < 0)){
                        if (axl < 90){cyll *= axl/90;}
                   else if (axl > 90){axl = 180 - axl; cyll *= axl/90;}
                   else if (axl == 90){} k_l = cyll + sphl;}    
                   else if ((sphl > 0)&&(cyll > 0)){ 
                        if (axl < 90){axl = 90 - axl; cyll *= axl/90;}
                   else if (axl > 90){axl = axl - 90; cyll *= axl/90;}
                   else if (axl == 90){k_l = sphl; cyll = 0;} k_l = cyll + sphl;}
                   printleft(e, v);
}
else if((((sphl < 0)&&(cyll > 0))||((sphl > 0)&&(cyll < 0)))&&(sphxl < cylxl)){
        
        if (cyll < 0){
                  if (axl < 90){cyll *= axl/90;}
             else if (axl > 90){axl = 180 - axl; cyll *= axl/90;}
             else if (axl == 90){} k_l = cyll + sphl;}    
   else if (cyll > 0){ 
                  if (axl < 90){axl = 90 - axl; cyll *= axl/90;}
             else if (axl > 90){axl = axl - 90; cyll *= axl/90;}
             else if (axl == 90){k_l = sphl; cyll = 0;} k_l = cyll + sphl;}
             printleft(0, v);
}
        }
else if(("".equals(AX_l))){   
     if ((!("".equals(CYL_l))&&!("".equals(SPH_l)))){
         sphl = Double.parseDouble(txtsphl.getText());
         cyll = Double.parseDouble(txtcyll.getText()); k_l = cyll + sphl;
              if (cyll < 0)txtaxl.setText("90");
         else if (cyll > 0)txtaxl.setText("180");}
         else if ("".equals(CYL_l)){sphl = Double.parseDouble(SPH_l); k_l = sphl;}
         else if ("".equals(SPH_l)){cyll = Double.parseDouble(CYL_l); k_l = cyll;
              if (cyll < 0)txtaxl.setText("90");
         else if (cyll > 0)txtaxl.setText("180");}   
         printleft(e, v);
     }
        }
    private void Thick()    {
     
    if("".equals(txtsphr.getText())){ Left(); }    
else if("".equals(txtsphl.getText())){ Right();}
else if (!("".equals(txtsphl.getText()))&&!("".equals(txtsphr.getText()))){ Right(); Left(); }
    
//t.ax(txtaxl); t.ax(txtaxr);
    }
    
    // Transposition
    private void right()    {
        sphr = Double.parseDouble(txtsphr.getText());
        cylr = Double.parseDouble(txtcylr.getText());
        axr = Integer.parseInt(txtaxr.getText());
            
            sphr += cylr;
            cylr *= -1;
            if(axr > 90) axr -= 90;  // Calculating Axis of the Transpostion in Right Eye \\
       else if(axr <= 90) axr += 90;
        
            lblsphR.setText(String.valueOf(String.format("%.2f", sphr)));
            lblcylR.setText(String.valueOf(String.format("%.2f", cylr)));
            lblaxR.setText(String.valueOf(String.format("%.0f",axr))); 
            }
    private void left()     {
        sphl = Double.parseDouble(txtsphl.getText()); 
        cyll = Double.parseDouble(txtcyll.getText());
        axl = Integer.parseInt(txtaxl.getText());
        
            sphl = sphl + cyll; 
            cyll *= -1;
            if(axl > 90)  axl -= 90;   // Calculating Axis of the Transpostion in Left Eye \\
            else if(axl <= 90) axl += 90; 
            
               lblsphL.setText(String.valueOf(String.format("%.2f", sphl))); 
               lblcylL.setText(String.valueOf(String.format("%.2f", cyll)));
               lblaxL.setText(String.valueOf(String.format("%.0f",axl))); 
               }
    public void plusSign()  {
    
    String sr [] = new String[4];
    sr[0] = lblsphR.getText();
    sr[1] = lblsphL.getText();
    sr[2] = lblcylR.getText();
    sr[3] = lblcylL.getText();
    if (!"".equals(sr[0])){double p = Double.parseDouble(sr[0]); char q = sr[0].charAt(0); if((p > 0)&&(q != '+')){lblsphR.setText("+"+ sr[0]);}}    
    if (!"".equals(sr[1])){double n = Double.parseDouble(sr[1]); char q = sr[1].charAt(0); if((n > 0)&&(q != '+')){lblsphL.setText("+"+ sr[1]);}}
    if (!"".equals(sr[2])){double m = Double.parseDouble(sr[2]); char q = sr[2].charAt(0); if((m > 0)&&(q != '+')){lblcylR.setText("+"+ sr[2]);}}
    if (!"".equals(sr[3])){double o = Double.parseDouble(sr[3]); char q = sr[3].charAt(0); if((o > 0)&&(q != '+')){lblcylL.setText("+"+ sr[3]);}}
    }
    private void trans()    {
    String spl = txtsphl.getText();String cyl = txtcyll.getText();
    String xl = txtaxl.getText();  String spr = txtsphr.getText();
    String cyr = txtcylr.getText();String xr = txtaxr.getText();


// Transposition \\
     if ( "".equals(spl)){right();}// Right Eye \\
else if ("".equals(spr)){left();}// Left Eye \\
else if (!("".equals(spr))&&!("".equals(spl))){right();left();}// Both \\

    plusSign();
     }
    
    // Addition
    private void add(double s, TextField st, Label sl){
    String addi = txtadd.getText(); s = Double.parseDouble(st.getText());
             
    if(!"".equals(addi)){ double add = Double.parseDouble(addi); s += add;}
    sl.setText(String.valueOf(String.format("%.2f", s)));}
    private void Add()                                {
    
        String spl = txtsphl.getText(); 
        String spr = txtsphr.getText();

     if (!("".equals(txtadd.getText()))&&("".equals(spl))){ // Add Right \\
        add(sphr, txtsphr, lblsphR);
        lblcylR.setText(txtcylr.getText());
        lblaxR.setText(txtaxr.getText());}

else if (!("".equals(txtadd.getText()))&&("".equals(spr))){ // Add Left \\
        add(sphl, txtsphl, lblsphL);
        lblcylL.setText(txtcyll.getText());
        lblaxL.setText(txtaxl.getText());}

else if (!("".equals(txtadd.getText()))&&!("".equals(spr))&&!("".equals(spl))){  // Add Both \\
        add(sphl, txtsphl, lblsphL);
        lblcylL.setText(txtcyll.getText());
        lblaxL.setText(txtaxl.getText());
        
        add(sphr, txtsphr, lblsphR);
        lblcylR.setText(txtcylr.getText());
        lblaxR.setText(txtaxr.getText());}
     
    plusSign(); 
    }
    
    // Contact Lenses
    private void sphr()  {
        
    double bvd = Double.parseDouble(txtbvd.getText());
    bvd *= 1/1000;
    sphcr = Double.parseDouble(txtsphr.getText());
    sphcr = sphcr/(1-(bvd*sphcr));
    int x = (int)sphcr;
       
        double n = sphcr - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
        if(e < 0){e*=-1;}
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblsphR.setText(String.format("%.2f",e));}
        
         if(sphcr > 0){lblsphR.setText(String.format("%.2f",e));}
         else{ e*= -1; lblsphR.setText(String.format("%.2f",e));}
         sphcr = e;
    }
    private void cylr()  {
    
    double bvd = Double.parseDouble(txtbvd.getText());
    
    bvd  = bvd * 1/1000;
    System.out.println(bvd);
    cylcr = Double.parseDouble(txtcylr.getText());    
    cylcr = cylcr/(1-(bvd*cylcr)); 
    int x = (int)cylcr;
       
        double n = cylcr - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
        if(e < 0){e*=-1;}
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblcylR.setText(String.format("%.2f",e));}
        
         if(cylcr > 0){lblcylR.setText(String.format("%.2f",e));}
         else{ e*= -1; lblcylR.setText(String.format("%.2f",e));}
         cylcr = e;
    }
    private void sphl()  {

    double bvd = Double.parseDouble(txtbvd.getText());
    bvd *= 1/1000;
    sphcl = Double.parseDouble(txtsphl.getText());
    sphcl = sphcl/(1-(bvd*sphcl));
    int x = (int)sphcl;    

        double n = sphcl - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
         if(e < 0){e*=-1;}
       
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblsphL.setText(String.format("%.2f",e));}
        
         if(sphcl > 0){lblsphL.setText(String.format("%.2f",e));}
         else{ e*= -1; lblsphL.setText(String.format("%.2f",e));}
         sphcl = e;
    }
    private void cyll()  {
        
    double bvd = Double.parseDouble(txtbvd.getText());
    bvd *= 1/1000;
    cylcl = Double.parseDouble(txtcyll.getText());    
    cylcl = cylcl/(1-(bvd*cylcl)); 
    int x = (int)cylcl;
       
            double n = cylcl - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
        if(e < 0){e*=-1;}
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblcylL.setText(String.format("%.2f",e));}
        
         if(cylcl > 0){lblcylL.setText(String.format("%.2f",e));}
         else{ e*= -1; lblcylL.setText(String.format("%.2f",e));}
         cylcl = e;
    }
    private void RightC(){
    lblaxR.setText(txtaxr.getText());             
     
         if("".equals(txtcylr.getText())){sphr();}
    else if("".equals(txtsphr.getText())){cylr();}
    else{sphr();cylr();}
    
         if("".equals(txtsphr.getText())){F = cylcr / 2;}
    else if("".equals(txtcylr.getText())){F = sphcr ;}
    else{ F = sphcr + cylcr/2; }     

         int x = (int)F;
         double n = F - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
        if(e < 0){e*=-1;}
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblcr.setText(String.format("%.2f",e));}
        
         if(F > 0){lblcr.setText(String.format("%.2f",e));}
         else{ e*= -1; lblcr.setText(String.format("%.2f",e));}
}
    private void LeftC() {
    lblaxL.setText(txtaxl.getText());             
    
         if("".equals(txtcyll.getText())){sphl();}
    else if ("".equals(txtsphl.getText())){cyll();}
    else {cyll();sphl();}
         if("".equals(txtsphl.getText())){F = cylcl / 2;}
    else if("".equals(txtcyll.getText())){F = sphcl ;}
    else{ F = sphcl + cylcl/2; }     
        
         int x = (int)F;
         double n = F - x; 
        n = Math.round(n*100.0)/100.0;
        if(n < 0){n*=-1;} 
        double e = (double)x;
        if(e < 0){e*=-1;}
         if((n > 0.12)&&(n < 0.25)){e += 0.25;}
    else if((n < 0.36)&&(n > 0.25)){e += 0.25;}
    else if((n > 0.36)&&(n < 0.50)){e += 0.50;}
    else if((n < 0.62)&&(n > 0.50)){e += 0.50;}
    else if((n > 0.62)&&(n < 0.75)){e += 0.75;}
    else if((n < 0.87)&&(n > 0.75)){e += 0.75;}
    else if(n > 0.87){e += 1.00;}
    else{lblcl.setText(String.format("%.2f",e));}
        
         if(F > 0){lblcl.setText(String.format("%.2f",e));}
         else{ e*= -1; lblcl.setText(String.format("%.2f",e));}

    }
    private void Cont()  {
         if(("".equals(txtsphl.getText()))&&("".equals(txtcyll.getText()))){RightC();}
    else if(("".equals(txtsphr.getText()))&&("".equals(txtcylr.getText()))){LeftC();}
    else{LeftC(); RightC();}}
    
    public void btnlens(ActionEvent event) throws IOException{
        try{
        if((("".equals(txtsphr.getText()))&&("".equals(txtsphl.getText())))){EmptyScene();}
        else{clearThick();TickAnim();Thick();}}catch(Exception ex){System.out.println(ex);}
    }
    public void Transposition(ActionEvent event) throws IOException, InterruptedException {
    if((("".equals(txtsphr.getText()))&&("".equals(txtsphl.getText())))){EmptyScene();}
    else{if((("".equals(txtcylr.getText()))||("".equals(txtaxr.getText())))&&(("".equals(txtcyll.getText()))||("".equals(txtaxl.getText())))){
        SceneOpen();
        if(ara.isSelected()){erlbl.setText("برجاء إدخال السيلندر و الأكس");}
        else {erlbl.setText("please Enter Cylinder and Axis");}}
        else{clearTAC();TACAnim();contp.setOpacity(0);trans();}}
    }
    public void Addition(ActionEvent event) throws IOException, InterruptedException {
    if((("".equals(txtsphr.getText()))&&("".equals(txtsphl.getText())))){EmptyScene();}
    else{if(("".equals(txtadd.getText()))){
      SceneOpen();if (ara.isSelected()){erlbl.setText("برجاء إدخال الإضافة");}else{
      erlbl.setText("Please Enter the Addition");}}
      else{clearTAC();TACAnim();contp.setOpacity(0);Add();}}
    }
    public void ContactLenses(ActionEvent event) throws IOException, InterruptedException {
    if((("".equals(txtsphr.getText()))&&("".equals(txtsphl.getText())))){EmptyScene();}
    else{clearTAC();TACAnim(); ContAnim();Cont();}
    }
    public void Abbe(ActionEvent event){
        i50.setText("58");
        i53.setText("45");
        i56.setText("38");
        i59.setText("30");
        i60.setText("42");
        i67.setText("32");
        i74.setText("33");
        i76.setText("30");
        i7.setText("35");
        i8.setText("35");
        i9.setText("35");
        if(ara.isSelected()){
        t1.setText("رقم آبى");
        t3.setText("رقم آبى");
        lblnote.setText("معامل آبى نسبة الى مكتشفه العالم الفيزيائى ارنست آبى \n"+"كلما قل رقم آبى كلما زادت التشوهات اللونية. \n"+"مقدار رقم آبى للعين البشرية من ٤٥ إلى ٥۰ \n"+"التشوهات اللونية: يتكون الضوء من سبعة ألوان أساسية\n"+"و لكل لون طول موجى مختلف عن الاخر, وعندما يمر الضوء\n"+"خلال وسط ما يحدث له انكسار حسب طوله الموجى.\n");
        }
        else{
        lblnote.setText("Low Abbe number value lenses will have\n " + " the higher chromatic aberration Abbe \n" + "value of human eye is about 45 to 50. \n" + "Chromatic aberration : The white light \n" + "consists of Spectrum Colors which all have \n " + "its specific medium it refracts according \n " + "to its wavelength");
        t1.setText("Abbe");
        t3.setText("Abbe");}
        DAIAnim();
    }
    public void Density(ActionEvent event){
        i50.setText("1.30");
        i53.setText("1.10");
        i56.setText("1.17");
        i59.setText("1.20");
        i60.setText("1.31");
        i67.setText("1.36");
        i74.setText("1.47");
        i76.setText("1.46");
        i7.setText("3.20");
        i8.setText("3.70");
        i9.setText("4.00");
        if(ara.isSelected()){
        lblnote.setText("كلما زادت كثافة العدسة كلما زاد وزنها");
        t1.setText("الكثافة");
        t3.setText("الكثافة");}
        else{
        lblnote.setText("More Increase in Density More in heavy lens");
        t1.setText("Density");
        t3.setText("Density");}
        DAIAnim();
    }
    public void Index(ActionEvent event){
        i50.setText("");
        i53.setText("");
        i56.setText("");
        i59.setText("");
        i60.setText("");
        i67.setText("");
        i74.setText("");
        i76.setText("");
        i7.setText("");
        i8.setText("");
        i9.setText("");
        if(ara.isSelected()){
        lblnote.setText("هو رقم يعبر عن مدى سمك أو نحافة العدسة. والعدسات ذات\n"+"معامل انكسار مرتفع تكون نحيفة.أرقام الكشف العالية \n"+" تحتاج إلى معامل انكسار مرتفع,على الكس من أرقام الكشف\n"+"المنخفضة فإنها تحتاج عدسات ذات معامل انكسار منخفض\n"+"و تحدد قيمة معامل الانكسار بناتج قسمة سرعة الضوء \n"+"فى الهواء على سرعته فى الوسط\n");
        }else{lblnote.setText("A number that describes how thick or thin\n" + "your lens are. The higher a lens' index is \n" + "Thinner it becomes. Higher prescriptions \n" + "require higher index lenses, while lower \n " + "prescritions require lower index lenses.");}
        t1.setText("");
        t3.setText("");
        DAIAnim();
    }
    public void Arabic(ActionEvent event){
        // Labels
        lbld.setStyle("-fx-font-family:Calibri;");
        lblct.setStyle("-fx-font-family:Calibri;");
        t1.setStyle("-fx-font-family:Calibri;");
        t2.setStyle("-fx-font-family:Calibri;");
        t3.setStyle("-fx-font-family:Calibri;");
        t4.setStyle("-fx-font-family:Calibri;");
        lblnote.setStyle("-fx-font-family:Calibri;");
        lbled.setStyle("-fx-font-family:Calibri;");
        lblipd.setStyle("-fx-font-family:Calibri;");
        lbladd.setStyle("-fx-font-family:Calibri;");
        lblfw.setStyle("-fx-font-family:Calibri;");
        lblbrid.setStyle("-fx-font-family:Calibri;");
        lblR.setStyle("-fx-font-family:Calibri;");
        lblL.setStyle("-fx-font-family:Calibri;");
        lblr1.setStyle("-fx-font-family:Calibri;");
        lblr3.setStyle("-fx-font-family:Calibri;");
        lblr4.setStyle("-fx-font-family:Calibri;");
        lbll1.setStyle("-fx-font-family:Calibri;");
        lbll3.setStyle("-fx-font-family:Calibri;");
        lbll4.setStyle("-fx-font-family:Calibri;");
        lbld.setText("القطر");
        lbled.setText("سمك القص");
        lblfw.setText("عرض العدسة");
        lblbrid.setText("(DBL)بريدج");
        lblR.setText("اليمين");
        lblL.setText("اليسار");
        lblct.setText("سمك المنتصف");
        lbladd.setText("الإضافة");
        lblr1.setText("اليمين");
        lblr3.setText("اليمين");
        lblr4.setText("اليمين");
        lbll1.setText("اليسار");
        lbll3.setText("اليسار");
        lbll4.setText("اليسار");
        t2.setText("معامل الانكسار");
        t4.setText("معامل الانكسار");
        // Buttons
        lens.setStyle("-fx-font-family:Calibri;");
        trans.setStyle("-fx-font-family:Calibri;");
        add.setStyle("-fx-font-family:Calibri;");
        abbe.setStyle("-fx-font-family:Calibri;");
        dens.setStyle("-fx-font-family:Calibri;");
        reset.setStyle("-fx-font-family:Calibri;");
        index.setStyle("-fx-font-family:Calibri;");
        cont.setStyle("-fx-font-family:Calibri;");
        lens.setText("سمك العدسة");
        trans.setText("التحوير");
        add.setText("الإضافة");
        cont.setText("العدسات اللاصقة");
        abbe.setText("رقم آبى");
        dens.setText("كثافة العدسة");
        reset.setText("إزالة");
        index.setText("معامل الانكسار");
        if("Abbe".equals(t1.getText())){
        t1.setText("رقم آبى");
        t3.setText("رقم آبى");
        lblnote.setText("معامل آبى نسبة الى مكتشفه العالم الفيزيائى ارنست آبى \n"+"كلما قل رقم آبى كلما زادت التشوهات اللونية. \n"+"مقدار رقم آبى للعين البشرية من ٤٥ إلى ٥۰ \n"+"التشوهات اللونية: يتكون الضوء من سبعة ألوان أساسية\n"+"و لكل لون طول موجى مختلف عن الاخر, وعندما يمر الضوء\n"+"خلال وسط ما يحدث له انكسار حسب طوله الموجى.\n");}
   else if("Density".equals(t1.getText())){
        lblnote.setText("كلما زادت كثافة العدسة كلما زاد وزنها");
        t1.setText("الكثافة");
        t3.setText("الكثافة");}     
   else{lblnote.setText("هو رقم يعبر عن مدى سمك أو نحافة العدسة. والعدسات ذات\n"+"معامل انكسار مرتفع تكون نحيفة.أرقام الكشف العالية \n"+" تحتاج إلى معامل انكسار مرتفع,على الكس من أرقام الكشف\n"+"المنخفضة فإنها تحتاج عدسات ذات معامل انكسار منخفض\n"+"و تحدد قيمة معامل الانكسار بناتج قسمة سرعة الضوء \n"+"فى الهواء على سرعته فى الوسط\n");}
        }
    public void English(ActionEvent event){
        // Labels
        t1.setStyle("-fx-font-family:Cambria;");
        t2.setStyle("-fx-font-family:Cambria;");
        t3.setStyle("-fx-font-family:Cambria;");
        t4.setStyle("-fx-font-family:Cambria;");
        lblnote.setStyle("-fx-font-family:Cambria;");
        lbld.setStyle("-fx-font-family:Cambria;");
        lblct.setStyle("-fx-font-family:Cambria;");
        lbled.setStyle("-fx-font-family:Cambria;");
        lblipd.setStyle("-fx-font-family:Cambria;");
        lbladd.setStyle("-fx-font-family:Cambria;");
        lblfw.setStyle("-fx-font-family:Cambria;");
        lblbrid.setStyle("-fx-font-family:Cambria;");
        lblR.setStyle("-fx-font-family:Cambria;");
        lblL.setStyle("-fx-font-family:Cambria;");
        lblr1.setStyle("-fx-font-family:Cambria;");
        lblr3.setStyle("-fx-font-family:Cambria;");
        lblr4.setStyle("-fx-font-family:Cambria;");
        lbll1.setStyle("-fx-font-family:Cambria;");
        lbll3.setStyle("-fx-font-family:Cambria;");
        lbll4.setStyle("-fx-font-family:Cambria;");
        lbld.setText("Dia");
        lbled.setText("Edging");
        lblfw.setText("Rim.Width");
        lblbrid.setText("Bridge(DBL)");
        lblR.setText("Right");
        lblL.setText("Left");
        lblct.setText("C.T");
        lbladd.setText("Add");
        lblr1.setText("Right");
        lblr3.setText("Right");
        lblr4.setText("Right");
        lbll1.setText("Left");
        lbll3.setText("Left");
        lbll4.setText("Left");
        t2.setText("Index");
        t4.setText("Index");
        // Buttons
        lens.setStyle("-fx-font-family:Myanmar Text;");
        trans.setStyle("-fx-font-family:Myanmar Text;");
        add.setStyle("-fx-font-family:Myanmar Text;");
        abbe.setStyle("-fx-font-family:Myanmar Text;");
        dens.setStyle("-fx-font-family:Myanmar Text;");
        reset.setStyle("-fx-font-family:Myanmar Text;");
        index.setStyle("-fx-font-family:Myanmar Text;");
        cont.setStyle("-fx-font-family:Myanmar Text;");
        lens.setText("Lens Thickness");
        trans.setText("Transposition");
        add.setText("Addition");
        cont.setText("Contact Lenses");
        abbe.setText("Abbe Number");
        dens.setText("Density");
        reset.setText("Reset");
        index.setText("Index");
        if("الكثافة".equals(t1.getText())){
        lblnote.setText("More Increase in Density More in heavy lens");
        t1.setText("Density");
        t3.setText("Density");}   
   else if("رقم آبى".equals(t1.getText())){
        lblnote.setText("Low Abbe number value lenses will have\n " + " the higher chromatic aberration Abbe \n" + "value of human eye is about 45 to 50. \n" + "Chromatic aberration : The white light \n" + "consists of Spectrum Colors which all have \n " + "its specific medium it refracts according \n " + "to its wavelength");
        t1.setText("Abbe");
        t3.setText("Abbe");}
   else{lblnote.setText("A number that describes how thick or thin\n" + "your lens are. The higher a lens' index is \n" + "Thinner it becomes. Higher prescriptions \n" + "require higher index lenses, while lower \n " + "prescritions require lower index lenses.");}
    }
    public void Clear(ActionEvent event) throws IOException {
        txtsphr.setText("");
        txtsphl.setText("");
        txtcylr.setText("");
        txtcyll.setText("");
        txtaxr.setText("");
        txtaxl.setText("");
        txtd.setText("");
        txtipd.setText("");
        txtfw.setText("");
        txtadd.setText("");
        txtbrid.setText("");
        txtct.setText("1.5");
        txted.setText("2");
        imgr.setVisible(false);
        imgl.setVisible(false);
        thick.setVisible(false);
        thick.setVisible(false);
        Bounds boundsInScene = pm.localToScene(pm.getBoundsInLocal());
        double x = boundsInScene.getMinY();
        if(x != 240){
        TranslateTransition slid = new TranslateTransition();
        slid.setDuration(Duration.millis(1000));
        slid.setToY(0);
        slid.setNode(pm);
        slid.play();}
        BlueDownAnim();
        if(al.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), al);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
        if(thick.getOpacity() != 0){
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), thick);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();}
    } 
    public void clos(ActionEvent event){
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.close();
    }
    public void min(ActionEvent event){
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.setIconified(true);
    }
    
    public void KeyTypedNoCharacters(KeyEvent event){
        String c = event.getCharacter();
    if (!("0".equals(c))&&!("1".equals(c))&&!("2".equals(c))&&!("3".equals(c))&&!("4".equals(c))&&!("5".equals(c))
      &&!("6".equals(c))&&!("7".equals(c))&&!("8".equals(c))&&!("9".equals(c))&&!("+".equals(c))&&!("-".equals(c))&&!(".".equals(c))){event.consume();}
    }
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        alll = al;
        thickk = thick;
        txtsphrr = txtsphr;
        txtsphll = txtsphl;
        txtcylll = txtcyll;
        txtcylrr = txtcylr;
        txtaxrr = txtaxr;
        txtaxll = txtaxl;
        txtipdd = txtipd;
        txtfww = txtfw;
        txtedd = txted;
        txtctt = txtct;
        txtdd = txtd;
        txtbridd = txtbrid;
        txtaddd = txtadd;
        araa = ara;
        engg = eng;
        lblRightt = lblRight;
        lblLeftt = lblLeft;
        final Tooltip BVD = new Tooltip();
        BVD.setText("BVD Stands for Back Vertex Distance \n or The distance between the eye and glass");
        lblbvd.setTooltip(BVD);
        txtbvd.setTooltip(BVD);
    }
}