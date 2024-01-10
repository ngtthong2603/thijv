import java.util.Comparator;

public class SortStudentByID implements Comparator<Nhanvien> {
    @Override
    public int compare(Nhanvien nv1, Nhanvien nv2) {
        if (nv1.getId() > nv2.getId()) {
            return 1;
        }
        return -1;
    }
}
