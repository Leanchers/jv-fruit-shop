package core.basesyntax.model;

public class FruitTransaction {
    private Operation operation;
    private String fruit;
    private int quantity;

    public FruitTransaction(Operation operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private String code;

        Operation(String code) {
            this.code = code;
        }

        public static Operation getValue (String code) {
            for (Operation o : values()) {
                if (o.code.equals(code)) {
                    return o;
                }
            }
        }

        public String getCode() {
            return code;
        }
    }
}