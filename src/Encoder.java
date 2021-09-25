import java.util.ArrayList;
import java.util.HashMap;

public class Encoder {

    private final ArrayList<HashMap<Integer, Integer>> commutators = new ArrayList<>();
    private void setCommutators() {

        HashMap<Integer, Integer> commutatorTable1 = new HashMap<>();
        commutatorTable1.put((int)'a', (int)'e');
        commutatorTable1.put((int)'b', (int)'k');
        commutatorTable1.put((int)'c', (int)'m');
        commutatorTable1.put((int)'d', (int)'f');
        commutatorTable1.put((int)'e', (int)'l');
        commutatorTable1.put((int)'f', (int)'g');
        commutatorTable1.put((int)'g', (int)'d');
        commutatorTable1.put((int)'h', (int)'q');
        commutatorTable1.put((int)'i', (int)'v');
        commutatorTable1.put((int)'j', (int)'z');
        commutatorTable1.put((int)'k', (int)'n');
        commutatorTable1.put((int)'l', (int)'t');
        commutatorTable1.put((int)'m', (int)'o');
        commutatorTable1.put((int)'n', (int)'w');
        commutatorTable1.put((int)'o', (int)'y');
        commutatorTable1.put((int)'p', (int)'h');
        commutatorTable1.put((int)'q', (int)'x');
        commutatorTable1.put((int)'r', (int)'u');
        commutatorTable1.put((int)'s', (int)'s');
        commutatorTable1.put((int)'t', (int)'p');
        commutatorTable1.put((int)'u', (int)'a');
        commutatorTable1.put((int)'v', (int)'i');
        commutatorTable1.put((int)'w', (int)'b');
        commutatorTable1.put((int)'x', (int)'r');
        commutatorTable1.put((int)'y', (int)'c');
        commutatorTable1.put((int)'z', (int)'j');

        HashMap<Integer, Integer> commutatorTable2 = new HashMap<>();
        commutatorTable2.put((int)'a', (int)'a');
        commutatorTable2.put((int)'b', (int)'j');
        commutatorTable2.put((int)'c', (int)'d');
        commutatorTable2.put((int)'d', (int)'k');
        commutatorTable2.put((int)'e', (int)'s');
        commutatorTable2.put((int)'f', (int)'i');
        commutatorTable2.put((int)'g', (int)'r');
        commutatorTable2.put((int)'h', (int)'u');
        commutatorTable2.put((int)'i', (int)'x');
        commutatorTable2.put((int)'j', (int)'b');
        commutatorTable2.put((int)'k', (int)'l');
        commutatorTable2.put((int)'l', (int)'h');
        commutatorTable2.put((int)'m', (int)'w');
        commutatorTable2.put((int)'n', (int)'t');
        commutatorTable2.put((int)'o', (int)'m');
        commutatorTable2.put((int)'p', (int)'c');
        commutatorTable2.put((int)'q', (int)'q');
        commutatorTable2.put((int)'r', (int)'g');
        commutatorTable2.put((int)'s', (int)'z');
        commutatorTable2.put((int)'t', (int)'n');
        commutatorTable2.put((int)'u', (int)'p');
        commutatorTable2.put((int)'v', (int)'y');
        commutatorTable2.put((int)'w', (int)'f');
        commutatorTable2.put((int)'x', (int)'v');
        commutatorTable2.put((int)'y', (int)'o');
        commutatorTable2.put((int)'z', (int)'e');

        HashMap<Integer, Integer> commutatorTable3 = new HashMap<>();
        commutatorTable3.put((int)'a', (int)'b');
        commutatorTable3.put((int)'b', (int)'d');
        commutatorTable3.put((int)'c', (int)'f');
        commutatorTable3.put((int)'d', (int)'h');
        commutatorTable3.put((int)'e', (int)'j');
        commutatorTable3.put((int)'f', (int)'l');
        commutatorTable3.put((int)'g', (int)'c');
        commutatorTable3.put((int)'h', (int)'p');
        commutatorTable3.put((int)'i', (int)'r');
        commutatorTable3.put((int)'j', (int)'t');
        commutatorTable3.put((int)'k', (int)'x');
        commutatorTable3.put((int)'l', (int)'v');
        commutatorTable3.put((int)'m', (int)'z');
        commutatorTable3.put((int)'n', (int)'n');
        commutatorTable3.put((int)'o', (int)'y');
        commutatorTable3.put((int)'p', (int)'e');
        commutatorTable3.put((int)'q', (int)'i');
        commutatorTable3.put((int)'r', (int)'w');
        commutatorTable3.put((int)'s', (int)'g');
        commutatorTable3.put((int)'t', (int)'a');
        commutatorTable3.put((int)'u', (int)'k');
        commutatorTable3.put((int)'v', (int)'m');
        commutatorTable3.put((int)'w', (int)'u');
        commutatorTable3.put((int)'x', (int)'s');
        commutatorTable3.put((int)'y', (int)'q');
        commutatorTable3.put((int)'z', (int)'o');

        HashMap<Integer, Integer> commutatorTable4 = new HashMap<>();
        commutatorTable4.put((int)'a', (int)'y');
        commutatorTable4.put((int)'b', (int)'r');
        commutatorTable4.put((int)'c', (int)'u');
        commutatorTable4.put((int)'d', (int)'h');
        commutatorTable4.put((int)'e', (int)'q');
        commutatorTable4.put((int)'f', (int)'s');
        commutatorTable4.put((int)'g', (int)'l');
        commutatorTable4.put((int)'h', (int)'d');
        commutatorTable4.put((int)'i', (int)'p');
        commutatorTable4.put((int)'j', (int)'x');
        commutatorTable4.put((int)'k', (int)'n');
        commutatorTable4.put((int)'l', (int)'g');
        commutatorTable4.put((int)'m', (int)'o');
        commutatorTable4.put((int)'n', (int)'k');
        commutatorTable4.put((int)'o', (int)'m');
        commutatorTable4.put((int)'p', (int)'i');
        commutatorTable4.put((int)'q', (int)'e');
        commutatorTable4.put((int)'r', (int)'b');
        commutatorTable4.put((int)'s', (int)'f');
        commutatorTable4.put((int)'t', (int)'z');
        commutatorTable4.put((int)'u', (int)'c');
        commutatorTable4.put((int)'v', (int)'w');
        commutatorTable4.put((int)'w', (int)'v');
        commutatorTable4.put((int)'x', (int)'j');
        commutatorTable4.put((int)'y', (int)'a');
        commutatorTable4.put((int)'z', (int)'t');

        commutators.add(commutatorTable1);
        commutators.add(commutatorTable2);
        commutators.add(commutatorTable3);
        commutators.add(commutatorTable4);
    }

    private final RotorI rotor1;
    private final RotorII rotor2;
    private final RotorIII rotor3;

    private final Reflector reflector;

    public Encoder(int[] params) {

        setCommutators();

        rotor1 = new RotorI(0, params[0], commutators.get(0));
        rotor2 = new RotorII(1, params[1], commutators.get(1));
        rotor3 = new RotorIII(2, params[2], commutators.get(2));

        reflector = new Reflector(commutators.get(3));
    }

    public int Encrypt(int symbol) {

        int interimResult1 = rotor1.straightTransformSymbol(symbol);
        int interimResult2 = rotor2.straightTransformSymbol(interimResult1);
        int interimResult3 = rotor3.straightTransformSymbol(interimResult2);
        int interimResult4 = reflector.transformedSymbol(interimResult3);
        int interimResult5 = rotor3.backTransformSymbol(interimResult4);
        int interimResult6 = rotor2.backTransformSymbol(interimResult5);
        int interimResult7 = rotor1.backTransformSymbol(interimResult6);

        int result;
        if ((interimResult7 - 97) >= Rotor.rotorsPosition[0]) {
            result = (interimResult7 - 97) - Rotor.rotorsPosition[0] + 97;
        }
        else {
            result = 26 + ((interimResult7 - 97) - Rotor.rotorsPosition[0]) + 97;
        }

        return result;
    }
}
