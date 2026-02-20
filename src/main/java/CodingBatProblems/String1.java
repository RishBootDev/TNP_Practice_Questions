package CodingBatProblems;

public class String1 {

    public String helloName(String name) {
        return "Hello "+name+"!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">" + word+"</"+tag+">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String temp = str.substring(str.length()-2);

        return temp + temp + temp;
    }

    public String firstTwo(String str) {
        if(str.length()<2)  return str;
        return str.substring(0,2);
    }
    public String firstHalf(String str) {

        int mid = str.length()/2;

        return str.substring(0,mid);
    }
    public String withoutEnd(String str) {

        return str.substring(1,str.length()-1);
    }
    public String comboString(String a, String b) {

        String temp = a.length()>b.length()?a:b;

        String bemp;
        if(temp.equals(a)) bemp = b;
        else bemp = a;
        return bemp + temp + bemp;
    }
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
    public String right2(String str) {
        int len = str.length();
        return str.substring(len - 2) + str.substring(0, len - 2);
    }





}
