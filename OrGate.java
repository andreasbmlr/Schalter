public class OrGate extends Gate {
    @Override
    public boolean evaluate(boolean a, boolean b) {
        return a | b;
    }
}
