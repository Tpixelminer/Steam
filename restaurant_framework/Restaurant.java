import java.util.Scanner;
public class Restaurant{

    final static String COLOR_ITEM = "\u001B[100m";
    final static String COLOR_PRICE = "\u001B[40m";
    final static String COLOR_ALLOWANCE = "\u001B[40m";
    final static String COLOR_FAILURE = "\u001B[41m";
    final static String COLOR_RESET = "\u001B[0m";

    public static void printMenu(){
        int i = 1;
        String amt;
        for(Menu item: Menu.values()){
            amt = String.format("%.2f",item.price());
            System.out.print(COLOR_ITEM + i + ") " + item + ":\t " + amt + COLOR_RESET + "\n");
            ++i;
        }

        System.out.print(COLOR_ITEM + i + ") EXIT" + COLOR_RESET + "\n");
    }

    public static void printAllowance(double allowance){
        String amt = String.format("%.2f", allowance);
        System.out.print(COLOR_ALLOWANCE + "You have $" + amt + " remaining. See additional info at https://www.google.com/search?q=shake+shack+menu&ie=utf-8&oe=utf-8. Thank You for shopping at SHAKE SHACK!" + COLOR_RESET + "\n");
    }

    public static void printFailure(String item){
        System.out.print(COLOR_FAILURE + "Sorry but you do not have enough money" + COLOR_RESET +"\n" + COLOR_FAILURE + "remaining to purchase " + item + COLOR_RESET + "\n");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        double allowance = 10.00;
        double ShackBurgerSinglePrice = 4.55;
        double ShackBurgerDoublePrice = 7.10;
        double HamburgerPlainPrice = 3.55;
	double HamburgerDoublePlainPrice = 5.60;
        double AddCheeseToPlainHamburger = 0.50;
	double AddBaconToPlainHamburger = 1.25;
	





		


	while(allowance>=0){ /* FIX WHILE CONDITION */
            printAllowance(allowance);
            printMenu();

            input = scan.nextInt();
           
           if(input==1) {
               
               
               if(allowance < ShackBurgerSinglePrice) { 
                   printFailure(" A Shack Burger Single");
               }
               
               else{
                   allowance = allowance - ShackBurgerSinglePrice;
                } 
               
           }
           
           
           else if (input == 2) {
           
           
           if (allowance < ShackBurgerDoublePrice){


           printFailure("A Shack Burger Double");
           
           }
            
                
                
                
                
             else{
                 allowance = allowance - ShackBurgerDoublePrice;
           }
           }
           
           else if (input == 3){
               
               if (allowance < HamburgerPlainPrice) {
                   printFailure("a Plain Hamburger");
           }
               else {allowance= allowance- HamburgerPlainPrice;
           }
           }
           
	   else if (input== 4) {

		if (allowance < HamburgerDoublePlainPrice) {
		
           printFailure( "a Double Plain Hamburger");

		} 
		else {allowance = allowance- HamburgerDoublePlainPrice;
		}
		

		else if (input == 5) {

		if (allowance < AddCheeseToPlainHamburger) {

		printFailure (" cheese to your plain hamburger");

		}


		else { allowance=allowance-AddCheeseToPlainHamburger;}
		
		}


		 
		else if (input == 6) {

		if (allowance < AddBaconToPlainHamburger) {

		printFailure ("Bacon for your plain hamburger");
		

		}


		else {allowance=allowance-AddBaconToPlainHamburger;}

		}
		








		
           else if (input == 7) {
               System.out.println("Thank You For Ordering With Us :) YAY");
           break;}        

            
        }

    }
}
