public class Gate {
    public boolean evaluate(boolean a, boolean b) {
        return false;
    }

    public void table() {
        System.out.println(getClass().getSimpleName());
        System.out.println("a\tb\t" + "Result");
        for (boolean aVal : new boolean[] { false, true }) {
            for (boolean bVal : new boolean[] { false, true }) {
                int resultInt = 1;
                int aInt = 1;
                int bInt = 1;

                boolean result = evaluate(aVal, bVal);
                
                if (result == false) {
                    resultInt = 0;
                }
                if (aVal == false) {
                    aInt = 0;
                }
                if (bVal == false) {
                    bInt = 0;
                }

                System.out.println(aInt + "\t" + bInt + "\t" + resultInt);
            }
        }
        System.out.println();
    }

    
}
