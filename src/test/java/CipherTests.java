/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */

import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.CaesarCipher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CipherTests {

    @Test
    public void caeserCipherlowerCaseTest1() {
         CaesarCipher caesarCipher = new CaesarCipher();
         caesarCipher.notify("a");
         assertEquals(caesarCipher.getText(), "v");
    }

    @Test
    public void caeserCipherlowerCaseTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("sandwhich");
        assertEquals(caesarCipher.getText(), "nviyrcdxc");
    }

    @Test
    public void caeserCipherlowerCaseTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("chicken");
        assertEquals(caesarCipher.getText(), "xcdxfzi");
    }

    @Test
    public void caeserCipherUpperCaseTest1() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("Y");
        assertEquals(caesarCipher.getText(), "T");
    }

    @Test
    public void caeserCipherUpperCaseTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("UPPERCASE");
        assertEquals(caesarCipher.getText(), "PKKZMXVNZ");
    }

    @Test
    public void caeserCipherUpperCaseTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("PEANUTS");
        assertEquals(caesarCipher.getText(), "KZVIPON");
    }

    @Test
    public void caeserCipherUpperandLowerCaseTest1() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("Cookies");
        assertEquals(caesarCipher.getText(), "Xjjfdzn");
    }

    @Test
    public void caeserCipherUpperandLowerCaseTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("IceCream");
        assertEquals(caesarCipher.getText(), "DxzXmzvh");
    }

    @Test
    public void caeserCipherUpperandLowerCaseTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("ChocLate");
        assertEquals(caesarCipher.getText(), "XcjxGvoz");
    }

    @Test
    public void caeserCipherSpaceCaseTest1() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("Cookies Cream");
        assertEquals(caesarCipher.getText(), "Xjjfdzn Xmzvh");
    }

    @Test
    public void caeserCipherSpaceTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("Choclate IceCream");
        assertEquals(caesarCipher.getText(), "Xcjxgvoz DxzXmzvh");
    }

    @Test
    public void caeserCipherSpaceCaseTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.notify("ChocLate Chip Cookie");
        assertEquals(caesarCipher.getText(), "XcjxGvoz Xcdk Xjjfdz");
    }

    @Test
    public void ElbonianCipherlowerCaseTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("a");
        assertEquals(elbonianCipher.getText(), "01");
    }

    @Test
    public void ElbonianCipherlowerCaseTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("sandwhich");
        assertEquals(elbonianCipher.getText(), "190114042308090308");
    }

    @Test
    public void ElbonianCipherlowerCaseTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("chicken");
        assertEquals(elbonianCipher.getText(), "03080903110514");
    }

    @Test
    public void ElbonianCipherUpperCaseTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("Y");
        assertEquals(elbonianCipher.getText(), "25");
    }

    @Test
    public void ElbonianCipherUpperCaseTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("UPPERCASE");
        assertEquals(elbonianCipher.getText(), "211616051803011905");
    }

    @Test
    public void ElbonianCipherUpperCaseTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("PEANUTS");
        assertEquals(elbonianCipher.getText(), "16050114212019");
    }

    @Test
    public void ElbonianCipherUpperandLowerCaseTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("Cookies");
        assertEquals(elbonianCipher.getText(), "03151511090519");
    }

    @Test
    public void ElbonianCipherUpperandLowerCaseTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("IceCream");
        assertEquals(elbonianCipher.getText(), "0903050318050113");
    }

    @Test
    public void ElbonianCipherUpperandLowerCaseTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("ChocLate");
        assertEquals(elbonianCipher.getText(), "0308150312012005");
    }

    @Test
    public void ElbonianCipherSpaceCaseTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("Cookies Cream");
        assertEquals(elbonianCipher.getText(), "03151511090519S0318050113");
    }

    @Test
    public void ElbonianCipherSpaceTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("Choclate IceCream");
        assertEquals(elbonianCipher.getText(), "0308150312012005S0903050318050113");
    }

    @Test
    public void ElbonianCipherSpaceCaseTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        elbonianCipher.notify("ChocLate Chip Cookie");
        assertEquals(elbonianCipher.getText(), "0308150312012005S03080916S031515110905");
    }



}
