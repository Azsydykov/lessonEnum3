package enums;

public enum Elements {
    HELIUM("Гелий", "He", 2),
    BORUM("Бор","B",5),
    NEON("Неон", "Ne", 10),
    LITHIUM("Литий", "Li", 3),
    NATRIUM("Натрий", "Na",11),
    ARGON("Аргон", "Ar",18),
    ZINCUM("Цинк", "Zn",30),
    RHODIUM("Родий", "Rh",45),
    ARGENTUM("Серебро", "Ag",47),
    CHLORUM("Хлор", "Cl",17);


    private String name;
    private String symbol;
    private int atomNumber;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomNumber() {
        return atomNumber;
    }

    public void setAtomNumber(int atomNumber) {
        this.atomNumber = atomNumber;
    }

    Elements(String name,String symbol, int atomNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomNumber = atomNumber;
    }

    @Override
    public String toString() {
        return "Elements[" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomNumber=" + atomNumber +
                ']';
    }
}
