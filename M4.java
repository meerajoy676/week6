class M4 {
    String name;
    int booksIssued;

    M4(String n, int b) {
        name = n;
        booksIssued = b;
    }

    public static void main(String[] args) {
        M4 ravi = new M4("Ravi", 0);

        M4 duplicate = ravi;

        duplicate.booksIssued = 3;

        M4 separate = new M4("Ravi", 3);

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}