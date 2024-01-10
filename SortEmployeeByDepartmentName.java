import java.util.Comparator;

public class SortEmployeeByDepartmentName implements Comparator<Nhanvien> {
    @Override
    public int compare(Nhanvien nv1, Nhanvien nv2) {
        return nv1.getPhongban().compareTo(nv2.getPhongban());
    }
}