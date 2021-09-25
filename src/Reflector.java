import java.util.HashMap;

public class Reflector {
    private final HashMap<Integer, Integer> commutationTable;

    public Reflector(HashMap<Integer, Integer> commutationTable) {
        this.commutationTable = commutationTable;
    }

    public int transformedSymbol(int symbol) {
        int difference;
        if ((symbol - 97) >= Rotor.rotorsPosition[2]) {
            difference = (symbol - 97) - Rotor.rotorsPosition[2] + 97;
        }
        else {
            difference = 26 + ((symbol - 97) - Rotor.rotorsPosition[2]) + 97;
        }
        return commutationTable.get(difference);
    }
}
