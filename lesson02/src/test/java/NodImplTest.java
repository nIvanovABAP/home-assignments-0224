import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.NodImpl;

public class NodImplTest {
    NodImpl nod = new NodImpl();

    @Test
    public void testWithZero(){
        Assert.assertEquals(15, nod.calculate(15,0));
    }

    @Test
    public void testSimpleDigits(){
        Assert.assertEquals(1, nod.calculate(251,163));
    }

    @Test
    public void testCasualCase(){
        Assert.assertEquals(3, nod.calculate(186,351));
    }
}
