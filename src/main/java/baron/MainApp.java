package baron;

public class MainApp {
    public int[] cutBeforeFour(int[] arr1) {
        int numLastFour = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 4) {
                numLastFour = i + 1;
            }
        }
        int[] arrayAnswer = new int[arr1.length - numLastFour];
        if (numLastFour != 0) {
            for (int i = numLastFour, j = 0; i < arr1.length; i++, j++) {
                arrayAnswer[j] = arr1[i];
            }

        } else {
            throw new RuntimeException("Числа 4 не содержится в массиве");
        }
        return arrayAnswer;
    }

    public boolean entryOneAndFour(int[] arr2) {
        boolean entryOne = false;
        boolean entryFour = false;
        boolean entryAnyNums = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 1) {
                entryOne = true;
            } else if (arr2[i] == 4) {
                entryFour = true;
            } else {
                entryAnyNums = true;
            }
        }
        return !entryAnyNums && (entryOne && entryFour);

    }
}
