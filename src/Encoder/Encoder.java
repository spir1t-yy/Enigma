package Encoder;

import java.util.ArrayList;
import java.util.HashMap;

public class Encoder {

    private final ArrayList<HashMap<Integer, Integer>> commutators = new ArrayList<>() {{
        add(new HashMap<>() {{
            put((int)'a', (int)'e');
            put((int)'b', (int)'k');
            put((int)'c', (int)'m');
            put((int)'d', (int)'f');
            put((int)'e', (int)'l');
            put((int)'f', (int)'g');
            put((int)'g', (int)'d');
            put((int)'h', (int)'q');
            put((int)'i', (int)'v');
            put((int)'j', (int)'z');
            put((int)'k', (int)'n');
            put((int)'l', (int)'t');
            put((int)'m', (int)'o');
            put((int)'n', (int)'w');
            put((int)'o', (int)'y');
            put((int)'p', (int)'h');
            put((int)'q', (int)'x');
            put((int)'r', (int)'u');
            put((int)'s', (int)'s');
            put((int)'t', (int)'p');
            put((int)'u', (int)'a');
            put((int)'v', (int)'i');
            put((int)'w', (int)'b');
            put((int)'x', (int)'r');
            put((int)'y', (int)'c');
            put((int)'z', (int)'j');
        }});
        add(new HashMap<>() {{
            put((int)'a', (int)'a');
            put((int)'b', (int)'j');
            put((int)'c', (int)'d');
            put((int)'d', (int)'k');
            put((int)'e', (int)'s');
            put((int)'f', (int)'i');
            put((int)'g', (int)'r');
            put((int)'h', (int)'u');
            put((int)'i', (int)'x');
            put((int)'j', (int)'b');
            put((int)'k', (int)'l');
            put((int)'l', (int)'h');
            put((int)'m', (int)'w');
            put((int)'n', (int)'t');
            put((int)'o', (int)'m');
            put((int)'p', (int)'c');
            put((int)'q', (int)'q');
            put((int)'r', (int)'g');
            put((int)'s', (int)'z');
            put((int)'t', (int)'n');
            put((int)'u', (int)'p');
            put((int)'v', (int)'y');
            put((int)'w', (int)'f');
            put((int)'x', (int)'v');
            put((int)'y', (int)'o');
            put((int)'z', (int)'e');
        }});
        add(new HashMap<>() {{
            put((int)'a', (int)'b');
            put((int)'b', (int)'d');
            put((int)'c', (int)'f');
            put((int)'d', (int)'h');
            put((int)'e', (int)'j');
            put((int)'f', (int)'l');
            put((int)'g', (int)'c');
            put((int)'h', (int)'p');
            put((int)'i', (int)'r');
            put((int)'j', (int)'t');
            put((int)'k', (int)'x');
            put((int)'l', (int)'v');
            put((int)'m', (int)'z');
            put((int)'n', (int)'n');
            put((int)'o', (int)'y');
            put((int)'p', (int)'e');
            put((int)'q', (int)'i');
            put((int)'r', (int)'w');
            put((int)'s', (int)'g');
            put((int)'t', (int)'a');
            put((int)'u', (int)'k');
            put((int)'v', (int)'m');
            put((int)'w', (int)'u');
            put((int)'x', (int)'s');
            put((int)'y', (int)'q');
            put((int)'z', (int)'o');
        }});
        add(new HashMap<>() {{
            put((int)'a', (int)'y');
            put((int)'b', (int)'r');
            put((int)'c', (int)'u');
            put((int)'d', (int)'h');
            put((int)'e', (int)'q');
            put((int)'f', (int)'s');
            put((int)'g', (int)'l');
            put((int)'h', (int)'d');
            put((int)'i', (int)'p');
            put((int)'j', (int)'x');
            put((int)'k', (int)'n');
            put((int)'l', (int)'g');
            put((int)'m', (int)'o');
            put((int)'n', (int)'k');
            put((int)'o', (int)'m');
            put((int)'p', (int)'i');
            put((int)'q', (int)'e');
            put((int)'r', (int)'b');
            put((int)'s', (int)'f');
            put((int)'t', (int)'z');
            put((int)'u', (int)'c');
            put((int)'v', (int)'w');
            put((int)'w', (int)'v');
            put((int)'x', (int)'j');
            put((int)'y', (int)'a');
            put((int)'z', (int)'t');
        }});
    }};

    private final RotorI rotor1;
    private final RotorII rotor2;
    private final RotorIII rotor3;

    private final Reflector reflector;

    public Encoder(int[] params) {
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
