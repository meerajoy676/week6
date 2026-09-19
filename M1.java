class M1 {
    String studentName;
    String company;
    double packageLpa;

    M1(String n, String c, double p) {
        studentName = n;
        company = c;
        packageLpa = p;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        M1[] records = {
            new M1("Ravi", "TCS", 4.5),
            new M1("Anitha", "Zoho", 6.2),
            new M1("Karthik", "Infosys", 4.0)
        };

        for (int i = 0; i < records.length; i++)
            records[i].printRecord();
    }
}