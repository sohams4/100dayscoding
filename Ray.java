public class Ray {
    public static int linearSearch(int numbers[], int Key){
        for(int i=0; i<numbers.length; i++ ){
        if(numbers[i] == Key){
            return i;
        }
    }
    return -1;
    }
public static void main(String[] args) {
    int numbers [] = {2, 4, 6, 8, 10, 12, 14, 16 };
    int Key = 10;

    int index = linearSearch(numbers, Key);
    if(index ==-1){
        System.out.println("Not Found");
    } else{
        System.out.println("Key is a index :" + index);

    }
}

}
