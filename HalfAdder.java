public class HalfAdder {
    Gate[] gates = new Gate[2];
    
    public HalfAdder() {
        
        gates[0] = new XorGate();
        gates[1] = new AndGate();
    }
    
    public boolean[] add(boolean a, boolean b) {
        boolean[] result = new boolean[2];
        result[0] = gates[0].evaluate(a, b);
        result[1] = gates[1].evaluate(a, b);
        return result;
    }

    void info() {
        System.out.println(getClass().getSimpleName());
        System.out.println("a\tb\tSum\tCarry");
        for (boolean aVal : new boolean[] { false, true }) {
            for (boolean bVal : new boolean[] { false, true }) {
                int sum = 1;
                int carry = 1;
                int aInt = 1;
                int bInt = 1;

                boolean[] result = add(aVal, bVal);
                
                if (result[0] == false) {
                    sum = 0;
                }
                if (result[1] == false) {
                    carry = 0;
                }
                if (aVal == false) {
                    aInt = 0;
                }
                if (bVal == false) {
                    bInt = 0;
                }

                System.out.println(aInt + "\t" + bInt + "\t" + sum + "\t" + carry);
            }
        }
        System.out.println();
    }
}
