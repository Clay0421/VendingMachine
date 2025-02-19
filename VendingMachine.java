import java.util.Scanner;
class VendingMachine {
   public static void main(String args[]) {
      int snackAmount[] = new int[] {5,5,5,5,5,5,5,5,5};
      String snackName[] = new String[] {"Snickers", "Twix", "MnM", "Gummy Bears", "Sour Worms", "Licorish", "Chips", "Popcorn", "Corn chips"};
      String snacks[] = new String[] {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};
      double snackPrice[] = new double[] {1.50, 1.50, 1.25, 2.00, 2.50, 1.75, 1.00, 1.75, 1.00};
      int index = 0;
      int doneWithOrder = 0;
      //int snackBAmount[] = new int[] {5,5,5};
      //String snackBF[] = new String[] {"Gummy Bears", "Sour Worms", "Licorish"};
      //String snackB[] = new String[] {"B1", "B2", "B3"};
      //double snackBPrice[] = new double[] {2.00, 2.50, 1.75};
      
      //String snackCF[] = new String[] {"Chips", "Popcorn", "Corn chips"};
      //String snackC[] = new String[] {"C1", "C2", "C3"};
      //double snackCPrice[] = new double[] {1.00, 1.75, 1.00};
      
      
      
      Scanner s = new Scanner(System.in);
      //System.out.println();
      /*
      for (String x: snackA) {
         System.out.print(x);
      }
      */
      /*
      for (int x = 0; x < 3; x++) {
         //System.out.print(snackAF[x]+" ");
         //System.out.println("");
         System.out.print(snackA[x]+" ");
      }
      */
      
      
      //userChoice != "Shut Down"
      while (doneWithOrder != 1) {
        
         System.out.print("Amount: ");
         double userMoney = s.nextDouble();
         System.out.print("Product code: ");
         String userChoice = s.nextLine().trim();
         userChoice = s.nextLine().trim();
         if (userChoice.equals("X")) {
            System.out.println("Shutting Down");
            break;
         }
         for (String x: snacks) {
            //System.out.print(x);
            /*
            if (userMoney < snackPrice[index]) {
               while (snackPrice[index] - userMoney > 0) {
                  userMoney += s.nextDouble();
                  System.out.print("Amount Left");
                  System.out.println(snackPrice[index] - userMoney);
               }
               System.out.println(userMoney - snackPrice[index]);
               
            }
            */
            if (userChoice.equals(x) && userMoney >= snackPrice[index]) {
               if (snackAmount[index] < 1) {
                  System.out.println("Not available");
               } else {
                  System.out.print("Your Change: ");
                  System.out.println(userMoney - snackPrice[index]);
                  System.out.println(snackName[index]+" dropped");
                  snackAmount[index] -= 1;
                  doneWithOrder = 1;
                  if (doneWithOrder == 1) {
                     System.out.println("Thank you!");
                     break;
                  }
               }
            } else {
               while (snackPrice[index] - userMoney > 0) {
                  System.out.print("Amount Left: ");
                  System.out.println(snackPrice[index] - userMoney);
                  System.out.print("Your amount: ");
                  userMoney += s.nextDouble();
                  //System.out.print("Balance");
                  
               }
               
               //System.out.println(userMoney - snackPrice[index]);
               
            }
            /*
            if (userChoice.equals(x) && userMoney >= snackPrice[index]) {
               if (snackAmount[index] < 1) {
                  System.out.println("Not available");
               } else {
                  System.out.print("Your change: ");
                  System.out.println(userMoney - snackPrice[index]);
                  System.out.println(snackName[index]+" dropped");
                  snackAmount[index] -= 1;
                  doneWithOrder = 1;
                  if (doneWithOrder == 1) {
                     System.out.println("Thank you!");
                     break;
                  }
               }
            }
            */
            index += 1;
         }
         //System.out.print("The end of code");
         index = 0;
         doneWithOrder = 0;
         userMoney = 0;
         //break;
         /*
         System.out.print("Amount: ");
         userMoney = 2.00;//s.nextDouble();
         System.out.print("");
         System.out.print("Choose your snack: ");
         userChoice = s.nextLine().trim();
         */
         
      }
      
   }
}