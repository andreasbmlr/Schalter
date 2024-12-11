public class NotGate extends Gate {
    @Override
    public boolean evaluate(boolean a, boolean b) {
        return !a;
    }
    
}
