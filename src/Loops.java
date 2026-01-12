public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();

    }//main method

    public Loops(){
        countUp();
        countByThrees();
        countDown();
        nestedLoop();

    }

    public void countUp(){

        for (int x=1; x<6; x++) {
            System.out.println(x);
        }

    }

    public void countByThrees(){
        for(int x = 3; x<16; x = x+3) {
            System.out.print(" "+x);

        }
        System.out.println("");
    }

    public void countDown(){

        for(int x=10; x>0; x--){
            System.out.print(x+",");

        }
        System.out.println("Happy Loop Year");
    }

    public void nestedLoop(){

        for(int x= 1; x<=5; x++){
            for(int y=1; y<=x; y++){
                System.out.print(x);
            }
            System.out.println();
            }
        }

    }

