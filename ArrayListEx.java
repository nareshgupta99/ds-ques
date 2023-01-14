public class ArrayListEx<T> {

    int size=10;
    Object[]arr=new Object[size];
    int index=0;
    public void add(int e){
        arr[index++]=e;
    }

    public void add(int e,int index){
        if(index<=size){
            arr[index]=e;
        }
        else{
            int temp=size/2;
            size+=temp;
        }
    }

    public String getArrayString(){
        String data="[";
        for(int i:arr){
            data=data+" "+i;
        }
        data=data+"]";
        return data;
    }

    private void isFull(){

    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getArrayString() ;
    }
}
