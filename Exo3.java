// package Exo3;
import java.util.Scanner;

class product {
    public int code;
    public String category;
    public String name;
    public double unitPrice;
    public int quantity;

    product(int code, String category, String name, double unitPrice, int quantity) {
        this.code = code;
        this.category = category;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
}

public class Exo3 {
	public static void showProductList(product[] products) {
		for(int i = 0; i<products.length; i++) {
			System.out.println("Code : "+products[i].code);
			System.out.println("category : "+products[i].category);
			System.out.println("name : "+products[i].name);
			System.out.println("Unit Price : "+products[i].unitPrice);
			System.out.println("quantity : "+products[i].quantity+"\n");
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
	}
	
	public static void showProductListCategory(String scan, product[] products) {
		for(int i = 0; i<products.length; i++) {
			if(products[i].category.contains(scan)) {
				System.out.println("Code : "+products[i].code);
				System.out.println("category : "+products[i].category);
				System.out.println("name : "+products[i].name);
				System.out.println("Unit Price : "+products[i].unitPrice);
				System.out.println("quantity : "+products[i].quantity+"\n");
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
		}
	}
	
	public static void showProductWhitCode(int scan, product[] products) {
		for(int i = 0; i<products.length; i++) {
			if(products[i].code != scan) {
				System.out.println("Code : "+products[i].code);
				System.out.println("category : "+products[i].category);
				System.out.println("name : "+products[i].name);
				System.out.println("Unit Price : "+products[i].unitPrice);
				System.out.println("quantity : "+products[i].quantity+"\n");
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
		}
	}
	
	public static void increasePrice(product[] products) {
		for(int i = 0; i<products.length; i++) {
			if(products[i].unitPrice < 60) {
				products[i].unitPrice = (products[i].unitPrice * 0.5) + products[i].unitPrice;
			}
		}
		
		for(int i = 0; i<products.length; i++) {
			System.out.println("Code : "+products[i].code);
			System.out.println("category : "+products[i].category);
			System.out.println("name : "+products[i].name);
			System.out.println("Unit Price: "+products[i].unitPrice);
			System.out.println("quantity : "+products[i].quantity+"\n");
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
	}
	
	public static void decreasePrice(String cat, product[] products) {
		for(int i = 0; i<products.length;i++) {
			if(products[i].category.contains(cat) &&  (products[i].quantity >=500 || products[i].quantity<=1000)) {
				products[i].unitPrice = products[i].unitPrice - 50;
			}
		
		}
	
		for(int i = 0; i<products.length; i++) {
			System.out.println("Code : "+products[i].code);
			System.out.println("category : "+products[i].category);
			System.out.println("name : "+products[i].name);
			System.out.println("Unit Price : "+products[i].unitPrice);
			System.out.println("quantity : "+products[i].quantity+"\n");
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
	}
	
	public static void supprimerproductParCode(int cd, product[] products) {
		for(int i = 0; i<products.length; i++) {
			if(products[i].code == cd) {
				for(int j = i; j<products.length-1; j++) {
					products[i].code = products[i+1].code;
					products[i].category = products[i+1].category;
					products[i].name = products[i+1].name;
					products[i].unitPrice = products[i+1].unitPrice;
					products[i].quantity = products[i+1].quantity;
					i++;
				}
			}
		}
		
		for(int i = 0; i<products.length; i++) {
			System.out.println("Code : "+products[i].code);
			System.out.println("category : "+products[i].category);
			System.out.println("name : "+products[i].name);
			System.out.println("Unit Price : "+products[i].unitPrice);
			System.out.println("quantity : "+products[i].quantity);
			// Hacspill ajoute yon foncsyon pou netwaye a chak fwa
		}
	}
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        product[] products;

        System.out.print("Input the quantity of the products: ");
        int n = scan.nextInt();
        products = new product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Details of the product number " + (i + 1));
            System.out.print("Code: ");
            int code = scan.nextInt();
            scan.nextLine();
            System.out.print("category: ");
            String category = scan.nextLine();
            System.out.print("name: ");
            String name = scan.nextLine();
            System.out.print("Unit Price: ");
            double unitPrice = scan.nextDouble();
            System.out.print("quantity: ");
            int quantity = scan.nextInt();
            products[i] = new product(code, category, name, unitPrice, quantity);
        }

        while (true) {
            System.out.println("-------------------------------Menu-------------------------------");
            System.out.println("[1]. All products");
            System.out.println("[2]. All products by category");
            System.out.println("[3]. Products by category name");
            System.out.println("[4]. Increase price 50%");
            System.out.println("[5]. Decrease price 50%  with category are in this interval 500 et 1000");
            System.out.println("[6]. Remove product by code");
            System.out.println("[7]. Exit");
			System.out.println("-------------------------------------------------------------------");

            System.out.println("Input your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                	showProductList(products);
                    break;
                case 2:
                {
                	System.out.print("Category name:");
                	Scanner sc = new Scanner(System.in);
                	String category = sc.nextLine();
                    showProductListCategory(category, products);
                    System.out.print("\n");
                }
                    break;
                case 3:
                {
                	System.out.print("Input the code :");
                	Scanner sc = new Scanner(System.in);
                	int code = sc.nextInt();
                	showProductWhitCode(code, products);
                }
                    break;
                case 4:
                    increasePrice(products);
                    break;
                case 5:
                {
                	System.out.print("Input the category of the product :");
                	Scanner sc = new Scanner(System.in);
                	String scn = sc.nextLine();
                    decreasePrice(scn, products);
                }
                    break;
                case 6:
                {
                	System.out.print("Input the code of the product :");
                	Scanner sc = new Scanner(System.in);
                	int cd = sc.nextInt();
                	supprimerproductParCode(cd, products);
                }
                    break;
                case 7:
                    System.out.println("Leave the programe");
                    return;
                default:
                    System.out.println("Invalid option!!!!");
                    break;
            }
        }
    }
}