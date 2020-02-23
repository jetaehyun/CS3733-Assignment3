/**
 * Tests for your observer pattern; make sure your code works!
 * Test-driven development is a good idea here.
 */

import edu.wpi.cs3733.CipherController;
import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.Message;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import java.io.IOException;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.api.FxAssert.*;

import static org.junit.Assert.assertEquals;
import static org.testfx.api.FxAssert.verifyThat;


public class ObserverTests extends ApplicationTest {

    @Test
    public void ObserverTest1(){
        Message message = new Message();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.setMessage(message);
        message.setText("Hello");
        assertEquals(elbonianCipher.getText(), "0805121215");
    }

    @Test
    public void ObserverTest2(){
        Message message = new Message();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.setMessage(message);
        message.setText("Hi");
        assertEquals(elbonianCipher.getText(), "0809");
    }

    @Test
    public void ObserverTest3(){
        Message message = new Message();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.setMessage(message);
        message.setText("Thanks");
        assertEquals(elbonianCipher.getText(), "200801141119");
    }

    @Test
    public void ObserverTest4(){
        Message message = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.setMessage(message);
        message.setText("Hello");
        assertEquals(caesarCipher.getText(), "Czggj");
    }


    @Test
    public void ObserverTest5(){
        Message message = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.setMessage(message);
        message.setText("Hi");
        assertEquals(caesarCipher.getText(), "Cd");
    }

    @Test
    public void ObserverTest6(){
        Message message = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.setMessage(message);
        message.setText("Thanks");
        assertEquals(caesarCipher.getText(), "Ocvifn");
    }




}
