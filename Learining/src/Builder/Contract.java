package Builder;

public class Contract {
    private String name;
    private boolean valid;

    private Contract() {}

    public String getName() {
        return name;
    }

    public boolean isValid() {
        return valid;
    }

    public static ContractBuilder builder() {
        return new ContractBuilder();
    }
    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", valid=" + valid +
                '}';
    }

    public static class ContractBuilder implements IBuilder {
        private Contract contract;

        public ContractBuilder() {
            this.contract = new Contract();
        }

        public ContractBuilder setName(String name) {
            this.contract.name = name;
            return this;
        }
        public ContractBuilder setValid(boolean valid) {
            this.contract.valid = valid;
            return this;
        }

        @Override
        public Contract build() {
            return this.contract;
        }
    }
}
