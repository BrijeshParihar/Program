public class Myexception {
    public static void main(String[] args) {
        try {
            isvalid(10);
        }
        catch (CustomException e)
        {
            System.out.println("in valid");
            System.out.println(e.getMessage());
        }

    }

    private static void isvalid(int age)
    {
        if(age<18){
            throw new CustomException("your age is less than 18 yeas :");
        }
        else
        {
            System.out.println("valid");
        }
    }
}
