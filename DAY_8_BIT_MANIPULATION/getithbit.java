package DAY_8_BIT_MANIPULATION;

public class getithbit {
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
           return 0;
        }
        return 1;
    }
     public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
     }
     public static int clearIthBit(int n,int i){
        int bitmask=1<<i;
        return (n & ~bitmask);
    }
    public static int updateIthBit(int n,int i,int set){
        int bitmask=1<<i;
        if(set==1){
            return n | bitmask;
        }
        return n & ~bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(4, 1, 1));
    }
}
