class M3 {
    String code;
    String title;
    int credits;
    int labCredits;

    public M3(String c, String t, int cr, int lab) {
        code = c;
        title = t;
        credits = cr;
        labCredits = lab;
    }

    public M3(String c, String t, int cr) {
        this(c, t, cr, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        M3 c1 = new M3("21CSC201J", "Data Structures", 4);
        M3 c2 = new M3("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(c1.code + " total credits: " + c1.totalCredits());
        System.out.println(c2.code + " total credits: " + c2.totalCredits());
    }
}