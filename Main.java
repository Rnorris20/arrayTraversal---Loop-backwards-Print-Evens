class Main {
  public static void main(String[] args) {

    int[] numbers = {3,6,9,12,15,18,21,24,27,30};

    for(int i=9; i>=0; i--){
      if(numbers[i] % 2==0){


        System.out.println(numbers[i]);
      }
    }
  }
}