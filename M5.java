class M5 {
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    M5(String n, double a) {
        name = n;
        attendance = a;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {
        M5 s1 = new M5("Ravi", 85);
        M5 s2 = new M5("Anitha", 90);

        M5.printCollegeInfo();
    }
}