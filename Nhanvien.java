
import java.util.Scanner;

public class Nhanvien extends Human {
    protected int id;
    protected String phongban;
    public Nhanvien()
    {
    	Scanner kb = new Scanner(System.in);
    	try 
    	{
    	System.out.println("Nhap vao ten: ");
    	String name = kb.nextLine();
    	if(name == "")
        {
        	throw new Exception("Invalid name!");
        }
        else 
        {
        	super.name = name;
        }
        
        
        System.out.println("Nhap vao tuoi: ");
        int age = kb.nextInt();
        if(age < 0 && age >100)
        {
        	throw new Exception("Invalid Age! Input Age again: ");
        }
        else 
        {
            super.age = age;
        }

    	System.out.println("Staff ID: ");
        int id = kb.nextInt();
        if(id>100000)
        {
        	throw new Exception("Invalid ID!");
        }
        else 
        {
            this.id = id;
        }
        System.out.println("Enter Department: ");
        
        String pb;
        kb.nextLine();  
        pb = kb.nextLine();
        if(pb == "")
        {
        	throw new Exception("Invalid Department!");
        }
        else 
        {
            this.phongban = pb;
        }
    	}
        catch (Exception e)
        {	
        	System.out.println(e.getMessage());
        	System.out.println("Invalid Input");
        	//kb.close();
        }
        //kb.close();
    }
    //file
    // public void parseDataFromLine(String line) {
    //     String[] data = line.split(",");
    //     if (data.length == 4) {
    //         try {
    //             this.id = Integer.parseInt(data[0].trim());
    //             this.name = data[1].trim();
    //             this.age = Integer.parseInt(data[2].trim());
    //             this.phongban = data[3].trim();
    //         } catch (NumberFormatException e) {
    //             System.out.println("Error parsing data from line: " + line);
    //         }
    //     } else {
    //         System.out.println("Invalid data format in line: " + line);
    //     }
    // }

    public void edit (String name, int age, int id, String phongban)
    {
        super.name = name;
        super.age = age;
        this.id = id;
        this.phongban = phongban;
    }
    public int getId()
    {
    	return this.id;
    }
    public String getPhongban()
    {
    	return this.phongban;
    }
    
    
    
    @Override
    public String toString()
    {
        return "Name: " + super.name + "Age: " + super.age + "ID: " + this.id
        		+ "Department: " + this.phongban ;
    }
}
