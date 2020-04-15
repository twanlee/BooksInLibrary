package booklist;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectBooks {
    public static void main(String[] args) {
        Book[] shelf = new Book[10];
        Scanner sc = new Scanner(System.in);

        shelf[0] = new ProgramingBook("Java Basic",100000,"Tuan Le","English","Web framework");
        shelf[1] = new ProgramingBook("Java Basic 2",900000,"Tuan Le","English","Web framework");
        shelf[2] = new ProgramingBook("Java Middle",800000,"Tuan Le","English","Web framework");
        shelf[3] = new ProgramingBook("Java Advance",200000,"Tuan Le","English","Web framework");
        shelf[4] = new ProgramingBook("Java Master",300000,"Tuan Le","English","Web framework");
        shelf[5] = new FictionBook("Beyond the Universe", 30000, "Best Seller", "Tuan Le");
        shelf[6] = new FictionBook("Beyond your Imagination", 20000, "Best Seller", "Tuan Le");
        shelf[7] = new FictionBook("Beyond your Soul", 35000, "Best Seller", "Tuan Le");
        shelf[8] = new FictionBook("Beyond your Love", 40000, "Best Seller", "Tuan Le");
        shelf[9] = new FictionBook("Beyond Life", 30000, "Best Seller", "Tuan Le");

        setCode(shelf);
        sortBook(shelf);
        disPlayInfo(shelf);
        System.out.println("===============");
        System.out.println("Total Price of Library is: "+ sumPrice(shelf));
        System.out.println("===============");

        int choice = 1;
        boolean flag = false;
        while (choice !=0){
            System.out.println("Find the Book");
            System.out.println("1. Find by code");
            System.out.println("2. Find by Name");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter your code: ");
                    int code = sc.nextInt();
                    for (int i=0; i<shelf.length; i++){
                        if (shelf[i].getCode() == code){
                            if(shelf[i] instanceof ProgramingBook){
                                shelf[i] = (ProgramingBook) shelf[i];
                                System.out.println(shelf[i].display());
                            }else if(shelf[i] instanceof FictionBook){
                                shelf[i] = (FictionBook) shelf[i];
                                System.out.println(shelf[i].display());
                            }
                            flag = true;
                        }
                    }
                    if (flag == false) System.out.println("Code not found");
                    break;
                case 2:
                    System.out.println("Enter your Book: ");
                    String bookName = sc.nextLine();
                    sc.nextLine();
                    for (int i=0; i<shelf.length; i++){
                        if(shelf[i].getName().replaceAll("\\s+","").equals(bookName.replaceAll("\\s+",""))){
                            if (shelf[i] instanceof ProgramingBook){
                                shelf[i] = (ProgramingBook) shelf[i];
                                System.out.println(shelf[i].display());
                            }else if(shelf[i] instanceof FictionBook){
                                shelf[i] = (FictionBook) shelf[i];
                                System.out.println(shelf[i].display());
                            }
                            flag = true;
                        }
                    }
                    if (flag == false) System.out.println("Book not found");
                    break;
                case 0:
                    System.exit(0);
            }
        }


    }
    public static void setCode(Book arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i].setCode();
        }
    }
    public static void sortBook(Book arr[]){
        Book temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].getPrice()>arr[j].getPrice()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }public static void disPlayInfo(Book arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].display());
        }
    }
    public static double sumPrice(Book arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i].getPrice();
        }
        return sum;
    }
}
