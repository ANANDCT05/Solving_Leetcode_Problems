class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        StringBuilder s=new StringBuilder();
        for(int i=0;i<arr.length;i++){

            int e=Integer.parseInt(arr[i]);
            s.append(Integer.toBinaryString(e));
            s.append("-");
        }
        s.deleteCharAt(s.length()-1);
        return s.toString();
    }
}