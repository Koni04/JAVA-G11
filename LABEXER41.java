class LABEXER41 
{
    public static void main(String [] args){
        int [] MyArray = {20, 15, 37};
        int product = 1;
        
        // IMPORTANT NOTE THAT AN ARRAY STARTS WITH THE VALUE 0 UPWARDS ALWAYS -1 FROM TOTAL COUNT
        
        for(int x = 0; x < MyArray.length; x++){
            product *= MyArray[x];
        }
        System.out.println(product);
    }
}