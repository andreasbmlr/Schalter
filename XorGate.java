public class XorGate extends Gate{
    AndGate andGate = new AndGate();
    OrGate orGate = new OrGate();
    NotGate notGate = new NotGate();
    

    @Override
    //(!a & b) | (a & !b)
    public boolean evaluate(boolean a, boolean b) {
        return orGate.evaluate(andGate.evaluate(notGate.evaluate(a, b), b), andGate.evaluate(a, notGate.evaluate(b, a)));
    }
}
