
class DuplicateNumberException extends Exception {
    private final int number;

    public DuplicateNumberException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }}