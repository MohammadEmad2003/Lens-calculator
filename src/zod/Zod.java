/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zod;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.ImageIcon;
import static zod.ZodController.alll;
import static zod.ZodController.araa;
import static zod.ZodController.lblLeftt;
import static zod.ZodController.lblRightt;
import static zod.ZodController.thickk;
import static zod.ZodController.txtaxll;
import static zod.ZodController.txtaxrr;
import static zod.ZodController.txtbridd;
import static zod.ZodController.txtcylll;
import static zod.ZodController.txtcylrr;
import static zod.ZodController.txtdd;
import static zod.ZodController.txtfww;
import static zod.ZodController.txtipdd;
import static zod.ZodController.txtsphll;
import static zod.ZodController.txtsphrr;
import static zod.err.erlbl;


/**
 *
 * @author Mohammad Emad
 */
public class Zod extends Application {
  
    private void SceneOpen() throws IOException{
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
        if(araa.isSelected()){erlbl.setStyle("-fx-font-family:Calibri;");}
        else{erlbl.setStyle("-fx-font-family:Cambria;");}
        }
    private void DiaExceptions() throws IOException     {        
        String IPD = txtipdd.getText();
        String Brid = txtbridd.getText();
        String FW = txtfww.getText();
        String D = txtdd.getText();
        if(araa.isSelected()){       
        if(!("".equals(D))&&!("".equals(FW))&&!("".equals(Brid))&&!("".equals(IPD))){ txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد تغير القطر\n"+"إذاً قم بإفراغ حقل ال I.P.D \n"+"و عرض العدسة و البريدج");}
   else if(!("".equals(FW))&&!("".equals(Brid))&&!("".equals(IPD))){ txtbridd.requestFocus();SceneOpen();     
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل ال I.P.D \n"+"وعرض العدسة و البريدج");}
   else if(!("".equals(FW))&&!("".equals(IPD))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل ال I.P.D \n"+"و عرض العدسة"); }
   else if(!("".equals(IPD))&&!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل ال I.P.D \n"+"و البريدج"); }
   else if(!("".equals(FW))&&!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل البريدج\n"+" و عرض العدسة"); }
   else if(!("".equals(IPD))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل ال I.P.D "); }
   else if(!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل البريدج "); }
   else if(!("".equals(FW))){ txtbridd.requestFocus();SceneOpen();
        erlbl.setText("إذا كنت تريد إدخال القطر\n"+"إذاً قم بإفراغ حقل عرض العدسة \n");}}
        else{
        if(!("".equals(D))&&!("".equals(FW))&&!("".equals(Brid))&&!("".equals(IPD))){ txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to change the\n"+"diameter please clear I.P.D, \n"+"Bridge and Frame Width fields");}
   else if(!("".equals(FW))&&!("".equals(Brid))&&!("".equals(IPD))){ txtbridd.requestFocus();SceneOpen();     
        erlbl.setText("If you want to Enter the\n"+"diameter please clear I.P.D,\n"+" Bridge and Frame Width fields");}
   else if(!("".equals(FW))&&!("".equals(IPD))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear I.P.D \n"+"and Frame Width fields"); }
   else if(!("".equals(IPD))&&!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear I.P.D \n"+"and Bridge fields"); }
   else if(!("".equals(FW))&&!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear Bridge\n"+"and Frame Width fields"); }
   else if(!("".equals(IPD))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear I.P.D\n"+" field"); }
   else if(!("".equals(Brid))){txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear Bridge\n"+"field"); }
   else if(!("".equals(FW))){ txtbridd.requestFocus();SceneOpen();
        erlbl.setText("If you want to Enter the\n"+"diameter please clear Frame Width\n"+"field");}}
    }
    private void plus(TextField t) throws IOException   {
       String x = t.getText();
       if (!"".equals(x)){
       double mx = Double.parseDouble(x);
       if ( (mx % 0.25 != 0)){ SceneOpen();
       if(araa.isSelected()){erlbl.setText("برجاء إدخال رقم يقبل\n"+"القسمة على 0.25");}else{
       erlbl.setText("You can't enter number not\n"+"divisible by 0.25");}
       t.requestFocus();}
       if ( (mx > 20)||(mx < -20)){ SceneOpen();
       if(araa.isSelected()){erlbl.setText("أنت لا تستطيع إدخال رقم أكبر\n"+"من 20 أو أصغر من -20");}else{
       erlbl.setText("You can't enter number more\n"+"than 20 or less than -20");}
       t.requestFocus();}
       x = String.format("%.2f", mx);
       char y = x.charAt(0);
       if (!(y == '-')&&!(y == '+')){t.setText("+" + x);}
       else{t.setText(x);}}} 
    private void ax(TextField l) throws IOException     {
        if ("".equals(l.getText())){}
   else if (Integer.parseInt(l.getText()) > 180){ 
        l.requestFocus();SceneOpen();
        if(araa.isSelected()){erlbl.setText("قيمة الأكس لا يجب أن تكون أكثر من 180 درجة");}
        else{erlbl.setText("Axis can't be more than 180 degree");
        }}
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Zod.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        Rectangle rect = new Rectangle(1210,612);
        rect.setArcHeight(30.0);
        rect.setArcWidth(30.0);
        root.setClip(rect);
        Scene scene = new Scene(root, 1210, 612);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);  
        scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        thickk.setVisible(false);thickk.setOpacity(0);
        alll.setVisible(false);alll.setOpacity(0);
        lblRightt.setVisible(false);lblLeftt.setVisible(false);
        txtsphrr.requestFocus();
        
      
        txtdd.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue)
        {try{DiaExceptions();}catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}
        else{}}});
        
        txtsphrr.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {plus(txtsphrr);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
        txtsphll.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {plus(txtsphll);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
        txtcylll.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {plus(txtcylll);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
        txtcylrr.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {plus(txtcylrr);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
        txtaxrr.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {ax(txtaxrr);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
        txtaxll.focusedProperty().addListener(new ChangeListener<Boolean>(){
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
        {if (newPropertyValue){}
         else{try {ax(txtaxll);} catch (IOException ex) {Logger.getLogger(Zod.class.getName()).log(Level.SEVERE, null, ex);}}}});
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        launch(args);}catch(Exception ex){System.out.println(ex);}
    }
    
}
