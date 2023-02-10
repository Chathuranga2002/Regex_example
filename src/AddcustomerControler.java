import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddcustomerControler {

    public JFXTextField txtEmail;
    public Label emaillbl;


    public static void main(String[] args) {
        Pattern AgePattern = Pattern.compile("^([0-9]{1,3})$");
        Matcher agematcher = AgePattern.matcher("100");
        boolean isAgeMatches = agematcher.matches();
        if (!isAgeMatches){
            System.err.println("not mach age");
        }

    }



    public  void check() {
        String text ="helow how are you danuja 12";
        String pattern =".*[0-9]{2,}.*";
        boolean matches = Pattern.matches(pattern, text);
        System.out.println(matches);

        Pattern AgePattern = Pattern.compile("^[1-9]{2,3}$");
        Matcher agematcher = AgePattern.matcher("23");
        boolean isAgeMatches = agematcher.matches();
        if (!isAgeMatches){
            System.err.println("not mach age");
        }


    }

    public void SaveOnAction(ActionEvent actionEvent) {
//
//        Pattern emailPattern = Pattern.compile("^([a-z0-9]{2,})([@])([a-z]{4,})([.])([a-z]{2,})$");
//        Matcher matcher = emailPattern.matcher(txtEmail.getText());
//        boolean isMached = matcher.matches();
//
//        if (!isMached){
//            emaillbl.setText("invalid email");
//            txtEmail.requestFocus();
//            txtEmail.setFocusColor(Paint.valueOf("red"));
//        }else {
//            emaillbl.setText("");
//        }
    }

    public void Chheckonaction(KeyEvent keyEvent) {
        Pattern emailPattern = Pattern.compile("^([a-z0-9]{2,})([@])([a-z]{4,})([.])([a-z]{2,})$");
        Matcher matcher = emailPattern.matcher(txtEmail.getText());
        boolean isMached = matcher.matches();

        if (!isMached){
            emaillbl.setText("invalid email");
            txtEmail.requestFocus();
            txtEmail.setFocusColor(Paint.valueOf("red"));
        }else {
            emaillbl.setText("");
            txtEmail.setFocusColor(Paint.valueOf("white"));
        }
    }
}










