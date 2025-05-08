public class SameDate {
    private int day;
    private int month;
    private int year;

    public SameDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args) {
        SameDate d = new SameDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SameDate(5,2,2012)));
        System.out.println(d.equals(new SameDate(1,2,2000)));

        //both will have same hashCodes
        System.out.println(d.hashCode());
        System.out.println(new SameDate(1,2,2000).hashCode());
    }

    public int hashCode() {
       int hash = 17;
       hash = 31 * hash + day;
       hash = 31 * hash + month;
       hash = 31 * hash + year;
       return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SameDate)) {
            return false;
        }

        SameDate dateObj = (SameDate) obj;

        if (this.year == dateObj.year &&
        this.month == dateObj.month &&
        this.day == dateObj.day) {
            return true;
        }
        return false;
    }
}
