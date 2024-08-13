public class Check {

    // args can only be String!
    public static void main(String[] args) {

        String[] branches = { "Atlanta", "Boston", "Chicago", "Detroit" };

        if (args.length <= 0) System.out.println("Invalid Input");

        for (int i = 0; i < args.length; i++) {

            boolean found = false;

            for (String branch : branches) {
                // System.out.println(i);
                // System.out.println(args[i]);
                // System.out.println(branch);

                // (args[i] == branch) won't working correctly for non-primatives data
                // == check memory allocation not value 
                if (args[i].equals(branch)) {
                    found = true;
                    System.out.printf("We have a branch at %s! 🎉\n", args[i]);
                    break; 
                } 
            }

            if (!found) System.out.println("Sorry, we do not have this branch 🙁");
            // System.out.println("Sorry, we do not have this branch 🙁");
        }
    }
}