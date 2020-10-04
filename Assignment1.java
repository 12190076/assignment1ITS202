import java.util.*;
public class Assignment1{
    int arr[];
    int size;
    int count = 0;
    int seven_full;
    int two_full;

	public Assignment1(int len)
	{
        size = len;
        arr = new int[size];
        seven_full=(75*size)/100;
        two_full=(25*size)/100;
	}
	public void add(int ele)
	{
		if (count==0){
            arr[count]=ele;

        }
        else{
            arr[count]=ele;
        }
        count++;
	}
	public void pop()
	{
		if (count>0){
            arr[count-1]=0;
        }
        count--;
	}
	public void resize(int length)
	{
		if(count==seven_full){
            int tem[]= new int[size*2];
            for(int i=0; i<count;i++){
                tem[i]=arr[i];

            }
            size=size*2;
            arr=tem;
        }
        if(count==two_full){
            int tem[]= new int[size/2];
            for(int i=0; i<count;i++){
                tem[i]=arr[i];

            }
            size=size/2;
            arr=tem;
        }
        
	}
	public int size()
	{
		return size;
        
	}
	public String toString()
	{
        String str= Arrays.toString(arr);
        return str;
	}
	public static void main(String[] args) {
		Assignment1 object = new Assignment1(8);
        object.add(10);
        object.add(20);
        object.add(30);
        object.add(40);
        object.add(50);
        object.add(70);
        
        // System.out.println("fjdsahf;l:"+object.size());
        // System.out.println("fjdsahf;l:"+object.toString());
        assert(object.size() == 8);
        assert(object.toString() == "[10,20,30,40,50,70,0]");
        System.out.println("Successfull");
		System.out.print("You Nailed it!! All Testcase passed");
	}
}