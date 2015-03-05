package nyc.c4q.gmsyrimis;

public class Main {
        public static void main(String[] args) {

            int[] anArrayOfints = new int[100];
            for(int i = 0;i< anArrayOfints.length; i++){
                anArrayOfints[i] = i*3;
            }

            for(int i = 0;i< anArrayOfints.length; i++) {
                System.out.println(anArrayOfints[i]);
            }
        }
    }
