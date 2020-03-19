import baron.MainApp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainAppTest2 {
    private MainApp app;

    @Before
    public void prepare(){
        app = new MainApp();
        System.out.println("prepare");
    }

    @Test
    public void testCut1(){
        int[] enterArray1 = new int[]{4, 3, 4, 4, 4, 4, 4, 4};
        Assert.assertFalse(app.entryOneAndFour(enterArray1));
    }

    @Test
    public void testCut2(){
        int[] enterArray1 = new int[]{4, 4, 4, 4, 4, 4, 4, 4};
        Assert.assertFalse(app.entryOneAndFour(enterArray1));
    }

    @Test
    public void testCut3(){
        int[] enterArray1 = new int[]{1, 3, 4, 5, 4, 4, 4, 4};
        Assert.assertFalse(app.entryOneAndFour(enterArray1));
    }

    @Test
    public void testCut4(){
        int[] enterArray1 = new int[]{1, 1, 4, 1, 4, 4, 4, 4};
        Assert.assertTrue(app.entryOneAndFour(enterArray1));
    }
}
