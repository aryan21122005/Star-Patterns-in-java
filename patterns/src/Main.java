import java.util.Scanner;

public class Main {
    public static void hollowTriangle(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }System.out.println();

        }
    }
    public static void invertedAndRotatedHalfPyramid(int rows){
        for(int i=1 ;i<=rows ;i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int rows){
        for(int i=1 ;i<=rows ;i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramidWithNumber(int rows){
        for(int i=1; i<=rows; i++){
            for (int j=1; j<=rows-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int rows){
        int counter=1;
        for(int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void butterfly(int rows){
        for(int i=1; i<=rows;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for (int j=0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for (int j=0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamond(int rows){
        for (int i=1; i<=rows; i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=rows-1; i>=1; i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=1;

        for(int i=1 ;i>0; ){
            System.out.println("\n\n\nChoose the type of pattern you want to draw: ");
            System.out.println("0.''To exit'' \n1.Hollow Rectangle. \n2.Inverted and rotated half pyramid. \n3.Parallelogram. \n4.Inverted half pyramid with number.");
            System.out.println("5.Floyd's Triangle. \n6.Butterfly. \n7.Diamond");

            choice = sc.nextInt();
            if(choice==0){
                System.out.print("Thankyou for using");
                break;
            }
            System.out.print("Enter number of rows:");
            int rowNum = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter number of columns:");
                    int colNum = sc.nextInt();
                    hollowTriangle(rowNum, colNum);
                    break;
                case 2:
                    invertedAndRotatedHalfPyramid(rowNum);
                    break;
                case 3:
                    solidRhombus(rowNum);
                    break;
                case 4:
                    invertedHalfPyramidWithNumber(rowNum);
                    break;
                case 5:
                    floydTriangle(rowNum);
                    break;
                case 6:
                    butterfly(rowNum);
                    break;
                case 7:
                    diamond(rowNum);
                    break;
                default:
                    System.out.print("Enter number in the given list.");
            }
        }

    }
}