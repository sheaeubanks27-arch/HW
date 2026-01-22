public class Conditionals {
    public String WillIGetAnAOnThis;
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }//main method

    public Conditionals(){
       int randomInt = (int)(Math.random()*10);
       randomInt = (int)(Math.random() *10);  // 0 to 5
        System.out.println("Will I get an A on this?");
        if (randomInt == 0){
            System.out.println("Very doubtful");
        }
        else if (randomInt == 1){
            System.out.println("Signs point to yes");

            }
        else if (randomInt == 2){
            System.out.println("You can count on it");
        }

        else if (randomInt == 3){
            System.out.println("My sources say no");
        }
        else if (randomInt == 4){
            System.out.println("It is not likely");
        }

        else if (randomInt >= 5){
            System.out.println("Ask again later");
        }



    }//constructor method
}

