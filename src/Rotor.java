import java.util.HashMap;
import java.util.Map;

class Rotor {
    public static int[] rotorsPosition = new int[3];

    private final int checkpoint;
    public int getCheckpoint() {
        return checkpoint;
    }

    private final HashMap<Integer, Integer> straightCommutationTable;
    public int getStraightTransformedChar(int symbol) {
        return straightCommutationTable.get(symbol);
    }

    private final HashMap<Integer, Integer> backCommutationTable;
    public int getBackTransformedChar(int symbol) {
        return backCommutationTable.get(symbol);
    }

    public Rotor(int ID, int startPosition, HashMap<Integer, Integer> commutationTable) {
        rotorsPosition[ID] = startPosition;

        checkpoint = startPosition;

        this.straightCommutationTable = commutationTable;

        backCommutationTable = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : commutationTable.entrySet()) {
            backCommutationTable.put(entry.getValue(), entry.getKey());
        }
    }
}

class RotorI extends Rotor {
    public RotorI(int ID, int startPosition, HashMap<Integer, Integer> commutationTable) {
        super(ID, startPosition, commutationTable);
    }

    public int straightTransformSymbol(int symbol) {
        rotorsPosition[0] += 1;
        if (rotorsPosition[0] == 26) {
            rotorsPosition[0] = 0;
        }
        if (rotorsPosition[0] == getCheckpoint()) {
            rotorsPosition[1] += 1;
        }
        int interimResult = ((symbol - 97) + rotorsPosition[0]) % 26 + 97;
        return getStraightTransformedChar(interimResult);
    }

    public int backTransformSymbol(int symbol) {
        int difference;
        if (rotorsPosition[1] >= rotorsPosition[0]) {
            difference = rotorsPosition[1] - rotorsPosition[0];
        }
        else {
            difference = 26 + (rotorsPosition[1] - rotorsPosition[0]);
        }

        int result;
        if ((symbol - 97) >= difference) {
            result = ((symbol - 97) - difference) % 26 + 97;
        }
        else {
            result = (26 + ((symbol - 97) - difference)) % 26 + 97;
        }
        return getBackTransformedChar(result);
    }
}

class RotorII extends Rotor {
    boolean checkpointFlag;

    public RotorII(int ID, int startPosition, HashMap<Integer, Integer> commutationTable) {
        super(ID, startPosition, commutationTable);
        checkpointFlag = true;
    }

    public int straightTransformSymbol(int symbol) {
        if (rotorsPosition[1] == 26) {
            rotorsPosition[1] = 0;
        }
        if (rotorsPosition[1] == getCheckpoint()) {
            if (!checkpointFlag) {
                rotorsPosition[2] += 1;
                checkpointFlag = true;
            }
        } else {
            checkpointFlag = false;
        }

        int difference;
        if (rotorsPosition[1] >= rotorsPosition[0]) {
            difference = rotorsPosition[1] - rotorsPosition[0];
        }
        else {
            difference = 26 + (rotorsPosition[1] - rotorsPosition[0]);
        }
        int interimResult = ((symbol - 97) + difference) % 26 + 97;
        return getStraightTransformedChar(interimResult);
    }

    public int backTransformSymbol(int symbol) {
        int difference;
        if (rotorsPosition[2] >= rotorsPosition[1]) {
            difference = rotorsPosition[2] - rotorsPosition[1];
        }
        else {
            difference = 26 + (rotorsPosition[2] - rotorsPosition[1]);
        }

        int result;
        if ((symbol - 97) >= difference) {
            result = ((symbol - 97) - difference) + 97;
        }
        else {
            result = (26 + ((symbol - 97) - difference)) + 97;
        }
        return getBackTransformedChar(result);
    }
}

class RotorIII extends Rotor {
    public RotorIII(int ID, int startPosition, HashMap<Integer, Integer> commutationTable) {
        super(ID, startPosition, commutationTable);
    }

    public int straightTransformSymbol(int symbol) {
        if (rotorsPosition[2] == 26) {
            rotorsPosition[2] = 0;
        }

        int difference;
        if (rotorsPosition[2] >= rotorsPosition[1]) {
            difference = rotorsPosition[2] - rotorsPosition[1];
        }
        else {
            difference = 26 + (rotorsPosition[2] - rotorsPosition[1]);
        }
        int interimResult = ((symbol - 97) + difference) % 26 + 97;
        return getStraightTransformedChar(interimResult);
    }

    public int backTransformSymbol(int symbol) {
        int interimResult = ((symbol - 97) + rotorsPosition[2]) % 26 + 97;
        return getBackTransformedChar(interimResult);
    }
}
