
public class Main {
    public static void main(String[] args) {
        Gate gate = new Gate();
        NotGate notGate = new NotGate();
        AndGate andGate = new AndGate();
        OrGate orGate = new OrGate();
        XorGate xorGate = new XorGate();
        HalfAdder halfAdder = new HalfAdder();
        
        gate.table();
        notGate.table();
        andGate.table();
        orGate.table();
        xorGate.table();
        halfAdder.info();

        
    }
}
