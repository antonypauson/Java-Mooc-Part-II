import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member member) {
        return this.height - member.getHeight();
    }

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("mikael", 182));
        members.add(new Member("matti", 187));
        members.add(new Member("ada", 184));

        members.stream()
                .forEach(m -> System.out.println(m));
        System.out.println();

        members.stream()
                .sorted()
                .forEach(m -> System.out.println(m));

        Collections.sort(members);
        members.stream().forEach(m -> System.out.println(m));

    }
}
