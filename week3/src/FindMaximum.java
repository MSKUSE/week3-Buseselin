public class FindMaximum {


    public static void main(String[] args) {

        if(args.length ==2 ) {

            int firstelement = Integer.parseInt(args[0]);
            int secondelement = Integer.parseInt(args[1]);
            if (args.length == 2) {


                if (firstelement > secondelement) {

                    System.out.println(firstelement);
                }
            } else {
                System.out.println(secondelement);
            }
        }else{
                System.out.println("Two integer expected");
            }
        }
    }
}