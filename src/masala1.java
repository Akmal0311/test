public class masala1 {

    public static void main(String[] args) {

        int arr[][] ={{0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0},
                      {1,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0}};
        int res = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr[i].length-1; j++){
                if(arr[i][j] == 1) {
                    System.out.println("ok");
                    res = Math.abs(3 - i) + Math.abs(3 - j);
                }
            }
        }
        System.out.println(res);
    }
}
