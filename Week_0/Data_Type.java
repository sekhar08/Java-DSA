package Java_DSA.Week_0;

// https://www.naukri.com/code360/problems/data-type_8357232?leftPanelTabValue=PROBLEM

public class Data_Type {
    public static void main(String[] args) {
       int ans =  dataTypes("Integer");
        System.out.println(ans);
    }
    public static int dataTypes(String type) {
        // Write your code here
        switch(type){
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
            default:
                return -1;
        }
    }
}

