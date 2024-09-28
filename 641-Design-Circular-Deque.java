class MyCircularDeque {
int l;
int h;
int k;
int arr[];
    public MyCircularDeque(int m) {
        arr=new int[m];
        l=-1;
        h=-1;
        k=m;

    }
    
    public boolean insertFront(int value) {
        

        int m=(l-1);
        if(m<0){
            m=k-1;
        }
        if(m==h){
            return false;
        }
        if(l==-1 && h==-1){
            arr[0]=value;
            l++;
            h++;
            return true;
        }
        else{
        arr[m]=value;
        l=m;
        }
        return true;
    }
    
    public boolean insertLast(int value) {
        int m=(h+1)%k;
        if(m==l){
            return false;
        }

        if(l==-1 && h==-1){
             arr[0]=value;
            l++;
            h++; 
            return true;
        }

        else{

        arr[m]=value;
        h=m;
        return true;
        }
    }
    
    public boolean deleteFront() {
        
        if(l==-1 && h==-1){
            return false;
        }
        if(l==h){
           l=-1;
           h=-1;
        }
        else{
            l=(l+1)%k;
        }

        return true;
    }
    
    public boolean deleteLast() {
        if(l==-1 && h==-1){
            return false;

        }

        if(l==h){
            l=-1;
            h=-1;
        }
        else{

        h=h-1;
        if(h<0){
            h=k-1;
        }

        }

        return true;


    }
    
    public int getFront() {
        if(l!=-1){
           
            return arr[l];
        }
        return -1;
    }
    
    public int getRear() {
        if(h!=-1){
            return arr[h];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(l==-1 &&h==-1){
            return true;
        }

        return false;
    }
    
    public boolean isFull() {

        if(isEmpty()){
            return false;
        }

        int m=(h+1)%k;
        if(m==l){
            return true;
        }

        return false;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */