import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bussiness {
    List<Nhanvien> Nhanvien;
    // public static Scanner scanner = new Scanner(System.in);



    // public Bussiness()
    // {
    //     Nhanvien = new ArrayList<Nhanvien>();
    // }

    public void readFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Assuming each line in the file represents a Nhanvien's data
                Nhanvien nv = new Nhanvien();
                nv.parseDataFromLine(line); // You need to implement this method in your Nhanvien class
                Nhanvien.add(nv);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public void themNhanVien() {
		Nhanvien nv = new Nhanvien();
		Nhanvien.add(nv);
    }

    //check same id
    // public void themNhanVien() {
    //     try {
    //         Nhanvien nv = new Nhanvien();

    //         // Check for duplicate ID
    //         if (isDuplicateId(nv.getId())) {
    //             throw new DuplicateIdException("Duplicate ID found: " + nv.getId());
    //         }

    //         Nhanvien.add(nv);
    //     } catch (DuplicateIdException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    // private boolean isDuplicateId(int newId) {
    //     for (Nhanvien nv : Nhanvien) {
    //         if (nv.getId() == newId) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // check size

    // public void themNhanVien() {
    //     try {
    //         if (Nhanvien.size() < MAX_EMPLOYEES) {
    //             Nhanvien nv = new Nhanvien();
    //             Nhanvien.add(nv);
    //         } else {
    //             throw new MaxEmployeesReachedException("Maximum number of employees reached (500). Cannot add more employees.");
    //         }
    //     } catch (MaxEmployeesReachedException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }


    public void output() {
		int i = 0;
		for (Nhanvien nv: Nhanvien) {
			i++;
			System.out.println("Staff " + i);
			System.out.println(nv.toString());
		}
    }
    public void edit(int id) {
        boolean isExisted = false;
        int size = Nhanvien.size();
        for (int i = 0; i < size; i++) {
            if (Nhanvien.get(i).getId() == id) {
                isExisted = true;
                Scanner kb = new Scanner(System.in);
                try
                {
            	System.out.println("Nhap vao ten: ");
            	String name = kb.nextLine();
            	if(name == "")
                {
                	throw new Exception("Invalid name!");
                }               
                System.out.println("Nhap vao tuoi: ");
                int age = kb.nextInt();
                if(age < 0 && age >100)
                {
                	throw new Exception("Invalid Age! Input Age again: ");
                }
                System.out.println("Staff ID: ");
                int _id = kb.nextInt();
                if(_id>100000)
                {
                	throw new Exception("Invalid ID!");
                }
                System.out.println("Enter Department: ");
                String pb;
                kb.nextLine();  
                pb = kb.nextLine();
                if(pb == "")
                {
                	throw new Exception("Invalid Department!");
                }
                              
                Nhanvien.get(i).edit(name, age, _id, pb);
                //kb.close();
                }
                catch (Exception e)
                {
                	System.out.println(e.getMessage());
                }
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
     /**
     * sort staff by department name
     */
    public void sortStudentByName() {
        Collections.sort(Nhanvien, new SortEmployeeByDepartmentName());
    }
 
    /**
     * sort staff by id
     */
    public void sortStudentByID() {
        Collections.sort(Nhanvien, new SortStudentByID());
    }
    public void delete(int id) {
        Nhanvien nv = null;
        int size = Nhanvien.size();
        for (int i = 0; i < size; i++) {
            if (Nhanvien.get(i).getId() == id) {
                nv = Nhanvien.get(i);
                break;
            }
        }
        if (nv != null) {
            Nhanvien.remove(nv);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
    static class MaxEmployeesReachedException extends Exception {
        public MaxEmployeesReachedException(String message) {
            super(message);
        }
    }

    public static class DuplicateIdException extends Exception {
        public DuplicateIdException(String message) {
            super(message);
        }
    }

    
}
