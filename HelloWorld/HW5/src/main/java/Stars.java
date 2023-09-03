public class Stars{
    private int count;

    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    @Override
    public String toString(){
        String res = "";
        int th = 0;
        int hundr = 0;
        int ten = 0;
        int one = 0;
        th = (getCount()/1000)%10;
        hundr = (getCount()/100)%10;
        ten = (getCount()/10)%10;
        one = getCount() %10;

        for(int i = 0; i<(getCount()/1000)%10; i++){
            res+="X";
        }
        for(int i = 0; i<hundr; i++){
            res=res.concat("Y");
        }
        for(int i = 0; i<ten; i++){
            res +="Z";
        }
        for(int i = 0; i<one; i++){
            res +="*";
        }
        return res;
    }
}