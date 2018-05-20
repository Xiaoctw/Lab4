package src.vertex;

public class Movie extends MovieVertex {
    private int year;
    private String country;
    private double IMDb;
    public Movie(String label) {
        super(label);
    }

    @Override
    public void fillVertexInfo(String[] args) {
        if (args.length!=3){
            System.out.println("输入格式错误！");
            return;
        }
        try {
            year=Integer.parseInt(args[0]);
            country=args[1];
            IMDb=Double.parseDouble(args[2]);
        }catch (Exception e){
            System.out.println("输入格式错误！");
            return;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie)){
            return false;
        }
        obj=(Movie)obj;
        boolean result1=((Movie) obj).getLabel().equals(this.getLabel());
        boolean result2=(this.year==((Movie) obj).year);
        boolean result3=this.country.equals(((Movie) obj).country);
        boolean result4=(this.IMDb==((Movie) obj).IMDb);
        return result1&&result2&&result3&&result4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("电影名称："+getLabel());
        stringBuilder.append(" 上映年份:"+year);
        stringBuilder.append(" 国家:"+country);
        stringBuilder.append(" IMDb："+IMDb);
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return this.getLabel().length()+year+country.length();
    }
}
