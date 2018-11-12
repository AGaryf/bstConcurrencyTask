import com.greendislike.WordsToDigitConverter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void trimTest() {
        Assert.assertEquals(1054, WordsToDigitConverter.convert("   one   thousand   fifty   four   "));
    }

    @Test
    public void digitTest() {
        Assert.assertEquals(1, WordsToDigitConverter.convert("one"));
        Assert.assertEquals(2, WordsToDigitConverter.convert("two"));
        Assert.assertEquals(3, WordsToDigitConverter.convert("three"));
        Assert.assertEquals(4, WordsToDigitConverter.convert("four"));
        Assert.assertEquals(5, WordsToDigitConverter.convert("five"));
        Assert.assertEquals(6, WordsToDigitConverter.convert("six"));
        Assert.assertEquals(7, WordsToDigitConverter.convert("seven"));
        Assert.assertEquals(8, WordsToDigitConverter.convert("eight"));
        Assert.assertEquals(9, WordsToDigitConverter.convert("nine"));
    }

    @Test
    public void tensTest() {
        Assert.assertEquals(10, WordsToDigitConverter.convert("ten"));
        Assert.assertEquals(20, WordsToDigitConverter.convert("twenty"));
        Assert.assertEquals(30, WordsToDigitConverter.convert("thirty"));
        Assert.assertEquals(40, WordsToDigitConverter.convert("forty"));
        Assert.assertEquals(50, WordsToDigitConverter.convert("fifty"));
        Assert.assertEquals(60, WordsToDigitConverter.convert("sixty"));
        Assert.assertEquals(70, WordsToDigitConverter.convert("seventy"));
        Assert.assertEquals(80, WordsToDigitConverter.convert("eighty"));
        Assert.assertEquals(90, WordsToDigitConverter.convert("ninety"));
    }

    @Test
    public void teensTest() {
        Assert.assertEquals(11, WordsToDigitConverter.convert("eleven"));
        Assert.assertEquals(12, WordsToDigitConverter.convert("twelve"));
        Assert.assertEquals(13, WordsToDigitConverter.convert("thirteen"));
        Assert.assertEquals(14, WordsToDigitConverter.convert("fourteen"));
        Assert.assertEquals(15, WordsToDigitConverter.convert("fifteen"));
        Assert.assertEquals(16, WordsToDigitConverter.convert("sixteen"));
        Assert.assertEquals(17, WordsToDigitConverter.convert("seventeen"));
        Assert.assertEquals(18, WordsToDigitConverter.convert("eighteen"));
        Assert.assertEquals(19, WordsToDigitConverter.convert("eighteen"));
    }

    @Test
    public void bigNumberTest() {
        Assert.assertEquals(1111, WordsToDigitConverter.convert("one thousand one hundred eleven"));
        Assert.assertEquals(2222, WordsToDigitConverter.convert("two thousand two hundred twenty two"));
        Assert.assertEquals(3333, WordsToDigitConverter.convert("three thousand three hundred thirty three"));
        Assert.assertEquals(4444, WordsToDigitConverter.convert("four thousand four hundred forty four"));
        Assert.assertEquals(5555, WordsToDigitConverter.convert("five thousand five hundred fifty five"));
        Assert.assertEquals(6666, WordsToDigitConverter.convert("six thousand six hundred sixty six"));
        Assert.assertEquals(7777, WordsToDigitConverter.convert("seven thousand seven hundred seventy seven"));
        Assert.assertEquals(8888, WordsToDigitConverter.convert("eight thousand eight hundred eighty eight"));
        Assert.assertEquals(9999, WordsToDigitConverter.convert("nine thousand nine hundred ninety nine"));
    }

    @Test
    public void keyTest() {
        Assert.assertEquals(100, WordsToDigitConverter.convert("one hundred"));
        Assert.assertEquals(1000, WordsToDigitConverter.convert("one thousand"));
    }

}
