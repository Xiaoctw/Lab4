package src.vertex;

public class Director extends MovieVertex {
    private int age;
    private String sex;
    public Director(String label) {
        super(label);
    }
    @Override
    public void fillVertexInfo(String[] args) {
        //  super.fillVertexInfo(args);
        if (args.length!=2){
            System.out.println("输入格式错误！");
        }
        try {
            age = Integer.parseInt(args[0]);
            sex = args[1];
        }catch (Exception e){
            System.out.println("输入格式错误！");
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("导演姓名："+getLabel());
        stringBuilder.append(" 年龄："+age);
        stringBuilder.append(" 性别:"+sex);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Director)){
            return false;
        }
        obj=(Director)obj;
        boolean result1=this.getLabel().equals(((Director) obj).getLabel());
        boolean result2=(this.age==((Director) obj).age);
        boolean result3=this.sex.equals(((Director) obj).sex);
        return result1&&result2&&result3;
    }

    @Override
    public int hashCode() {
        return getLabel().length()+age+sex.length();
    }
}

