
import java.util.*;

public class Test{

	
 
    public static void main(String[] args) {
        int choose = -1;
        boolean exit = false;
        Bussiness bussiness = new Bussiness();
        // show menu
        showMenu();
        //Scanner scanner = new Scanner(System.in);
        business.readFromFile("yourFileName.txt");
        while (true) {
        	
            choose = scanner.nextInt();
            switch (choose) {
            case 1:
            System.out.println("Enter info Staff");
                bussiness.themNhanVien();
                break;
            case 2:
            	System.out.println("Enter id");
            	Scanner kb = new Scanner(System.in);
            	int id = kb.nextInt();
                bussiness.edit(id);
                //kb.close();
                break;
            case 3:
            	System.out.println("Enter id");
            	Scanner kb1 = new Scanner(System.in);
            	int id1 = kb1.nextInt();
            	//kb1.close();
                bussiness.delete(id1);
                break;
            case 4:           	
                bussiness.sortStudentByID();
                break;
            case 5:
                bussiness.sortStudentByName();
                break;
            case 6:
                bussiness.output();
                break;
            case 0:
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
            	scanner.close();
                break;
            }
            // show menu
            showMenu();
            //choose = scanner.nextLine();
            
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println(" ");
        System.out.println("-----------menu------------");
        System.out.println("1. Add Staff.");
        System.out.println("2. Edit Staff by id.");
        System.out.println("3. Delete Staff by id.");
        System.out.println("4. Sort Staff by id.");
        System.out.println("5. Sort Staff by name.");
        System.out.println("6. Show Staff.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

}