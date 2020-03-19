import baron.MainApp;
import org.junit.*;
import baron.MainApp.*;

public class MainAppTest1 {
    private MainApp app;

    @Before
    public void prepare(){
        app = new MainApp();
        System.out.println("prepare");
    }

    @Test
    public void testCut1(){
        int[] enterArray1 = new int[]{1, 6, 3, 4, 3, 1, 8, 5};
        int[] answerArray1 = new int[]{3, 1, 8, 5};
        Assert.assertArrayEquals(answerArray1, app.cutBeforeFour(enterArray1));
    }

    @Test
    public void testCut2(){
        int[] enterArray1 = new int[]{1, 6, 3, 4, 3, 4, 8, 5};
        int[] answerArray1 = new int[]{ 8, 5};
        Assert.assertArrayEquals(answerArray1, app.cutBeforeFour(enterArray1));
    }

    @Test
    public void testCut3(){
        int[] enterArray1 = new int[]{1, 4, 5};
        int[] answerArray1 = new int[]{ 5};
        Assert.assertArrayEquals(answerArray1, app.cutBeforeFour(enterArray1));
    }

    @Test(expected = RuntimeException.class)
    public void testCut4(){
        int[] enterArray1 = new int[]{1, 1, 5};
        app.cutBeforeFour(enterArray1);
    }

}