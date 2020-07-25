package practice;

public class TestMyException {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        People p=new People();
        try {
            p.setSex("Male");
        } catch (MyException e) {
            e.printStackTrace();//输出异常信息
        }
    }
}
class MyException extends Exception{
    public MyException(String message) {
        super("出现异常："+message);
    }
}

class People {
    String name="";
    int age=0;
    String sex;
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex) throws MyException{
        if("男".equals(sex) || "女".equals(sex))
        {
            this.sex=sex;
        }
        else {
            throw new MyException("性别必须是男或者女");
        }
    }
}
